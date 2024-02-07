package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.ConfigReader;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US07_StepDefination {
    Response response;
    @Given("Get request ile tum mesajlari al")
    public void getRequestIleTumMesajlariAl() {
        setup(ConfigReader.getProperty("deanKenan"),ConfigReader.getProperty("kenanPas"));
        //https://managementonschools.com/app/contactMessages/getAll
        spec.pathParams("first","contactMessages","second","getAll").
                queryParams("size","1000");
       response= given(spec).get("{first}/{second}");
    //   response.prettyPrint();


    }

    @Then("bodyi dogrula: name={string}, email={string}, subject={string}, message={string}, date={string}")
    public void bodyiDogrulaNameEmailSubjectMessageDate(String name, String email, String subject, String message, String date) {

        JsonPath json=response.jsonPath();
        String contactName=json.getList("content.findAll{it.email=='keenan.bey96@gmail.com'}.name").get(0).toString();
        String contactEmail=json.getList("content.findAll{it.email=='keenan.bey96@gmail.com'}.email").get(0).toString();
        String contactSubject=json.getList("content.findAll{it.email=='keenan.bey96@gmail.com'}.subject").get(0).toString();
        String contactMessage=json.getList("content.findAll{it.email=='keenan.bey96@gmail.com'}.message").get(0).toString();
        String contactDate=json.getList("content.findAll{it.email=='keenan.bey96@gmail.com'}.date").get(0).toString();


        assertEquals(200,response.statusCode());
        assertEquals(name,contactName);
        assertEquals(email,contactEmail);
        assertEquals(subject,contactSubject);
        assertEquals(message,contactMessage);
        assertEquals(date,contactDate);

    }
}
