package stepDefinitions.ApiStepDefinitions;

import baseUrl.RegisterBaseUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.guestUserManagement.Guest_UserPayloadPojo;
import pojos.guestUserManagement.Guest_User_ResponsePojo;


import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class US01_StepDefinition  extends RegisterBaseUrl{

   public static  Guest_UserPayloadPojo payloadGuestUser;

    public static Guest_User_ResponsePojo actuelData;
    Response response;

    @Given("Guest User Save icin URL duzenlenir_SK")
    public void guestUserSaveIcinURLDuzenlenir_SK() {
        //https://managementonschools.com/app/guestUser/register
           setupRegister();
           spec_1.pathParams("first", "guestUser", "second", "register");

    }
    @And("Guest User Save icin payload duzenlenir_SK")
    public void guestUserSaveIcinPayloadDuzenlenir_SK() {

        payloadGuestUser=new Guest_UserPayloadPojo("1966-12-02","Ankara",
                "MALE","Selim","Selim01.","137-547-8765",
                "125-37-8955","Karahan","  .011Merlin");
    }
    @When("Guest User Save icin POST Request gonderilir ve Reponse alinir_SK")
    public void guestUserSaveIcinPOSTRequestGonderilirVeReponseAlinir_SK() {
        response = given(spec_1).body(payloadGuestUser).when().post("{first}/{second}");
        response.prettyPrint();

        actuelData=response.as(Guest_User_ResponsePojo.class);

    }
    @And("Guest User Save icin gelen Response body dogrulanir_SK")
    public void guestUserSaveIcinGelenResponseBodyDogrulanir_SK() {
        assertEquals(payloadGuestUser.getBirthDay(), actuelData.getObject().getBirthDay());
        assertEquals(payloadGuestUser.getBirthPlace(), actuelData.getObject().getBirthPlace());
        assertEquals(payloadGuestUser.getGender(), actuelData.getObject().getGender());
        assertEquals(payloadGuestUser.getName(), actuelData.getObject().getName());
        assertEquals(payloadGuestUser.getPhoneNumber(), actuelData.getObject().getPhoneNumber());
        assertEquals(payloadGuestUser.getSsn(), actuelData.getObject().getSsn());
        assertEquals(payloadGuestUser.getSurname(), actuelData.getObject().getSurname());
        assertEquals(payloadGuestUser.getUsername(), actuelData.getObject().getUsername());
        assertTrue(actuelData.getMessage().contains("Guest User registered."));
        assertTrue(actuelData.getHttpStatus().contains("CREATED"));
    }
    @Then("Status kodun {int} oldugu dogrulanir_SK")
    public void statusKodunOlduguDogrulanir_SK(int statuscode) {
        assertEquals(statuscode, response.statusCode());
    }


}
