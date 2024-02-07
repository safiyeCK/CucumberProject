package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.viceDeanManagement.MessagePojo;
import pojos.viceDeanManagement.ResponsePojo;
import utilities.ConfigReader;

import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US16_StepDefinition {

    public static MessagePojo expectedData;
    Response response;

    public static ResponsePojo actualData;


    @Given("Mesaj eklemek icin Post request hazirligi yapilir")
    public void mesajEklemekIcinPostRequestHazirligiYapilir() {
        spec.pathParams("first","contactMessages","second","save");
        
    }

    @And("Gonderilecek mesaj bilgileri hazirlanir")
    public void gonderilecekMesajBilgileriHazirlanir() {

        expectedData = new MessagePojo("mustafa@gmail.com", "ders basi?", "mustafa", "ders");


    }

    @When("Mesaj eklemek icin Post request gonderilir")
    public void mesajEklemekIcinPostRequestGonderilir() {
        response = given(spec).body(expectedData).when().post("{first}/{second}");
        actualData = response.as(ResponsePojo.class);
        
    }

    @Then("Mesaj bolumlerini dogrulama: name={string}, email={string}, subject={string}, message={string}, date={string}")
    public void mesajBolumleriniDogrulamaNameEmailSubjectMessageDate(String arg0, String arg1, String arg2, String arg3, String arg4) {

        assertEquals(ConfigReader.getProperty(arg0),actualData.getObject().getName());
        assertEquals(ConfigReader.getProperty(arg1),actualData.getObject().getEmail());
        assertEquals(ConfigReader.getProperty(arg2),actualData.getObject().getSubject());
        assertEquals(ConfigReader.getProperty(arg3),actualData.getObject().getMessage());
        assertEquals(ConfigReader.getProperty(arg4),actualData.getObject().getDate());
    }
}
