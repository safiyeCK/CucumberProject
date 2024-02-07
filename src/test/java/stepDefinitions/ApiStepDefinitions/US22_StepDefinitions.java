package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.adminManagement.US22_Pojo.AdminPayloadPojo_I;
import pojos.adminManagement.US22_Pojo.ResponsePojo_I;
import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;


public class US22_StepDefinitions {



    ResponsePojo_I actualData;
    AdminPayloadPojo_I payload_admin;
    Response response;

    @Given("Admin yetkisiyle giris yapilir_I")
    public void adminYetkisiyleGirisYapilir_I() {
        setup("AdminBatch171","Batch171+");
    }
    @And("Admin hesabi olusturmak icin url duzenlenir_I")
    public void adminHesabiOlusturmakIcinUrlDuzenlenir_I() {
        spec.pathParams("p1","admin","p2","save");
    }
    @And("Admin hesabi olusturmak icin payload duzenlenir_I")
    public void adminHesabiOlusturmakIcinPayloadDuzenlenir_I() {
        payload_admin = new AdminPayloadPojo_I("2000-01-01","Istanbul",true,"MALE","John","John171+","135-462-0087","285-47-3291","Black","JohnBlack+");
    }

    @When("Admin hesabi olusturmak icin request gonderilir ve response alinir_I")
    public void adminHesabiOlusturmakIcinRequestGonderilirVeResponseAlinir_I() {
        response = given(spec).body(payload_admin).when().post("{p1}/{p2}");
        response.prettyPrint();
        actualData = response.as(ResponsePojo_I.class);
    }
    @And("Admin save icin gelen response body dogrulanir_I")
    public void adminSaveIcinGelenResponseBodyDogrulanir_I() {
        assertEquals(payload_admin.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(payload_admin.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(payload_admin.getGender(),actualData.getObject().getGender());
        assertEquals(payload_admin.getName(),actualData.getObject().getName());
        assertEquals(payload_admin.getSsn(),actualData.getObject().getSsn());
        assertEquals(payload_admin.getSurname(),actualData.getObject().getSurname());
        assertEquals(payload_admin.getUsername(),actualData.getObject().getUsername());
        assertEquals(payload_admin.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals("Admin Saved",actualData.getMessage());
        assertEquals("CREATED",actualData.getHttpStatus());
    }
    @Then("Status kodun {int} oldugu dogrulanir_IO")
    public void statusKodunOlduguDogrulanir_IO(int statusCode) {
        assertEquals(statusCode,response.statusCode());
    }
}
