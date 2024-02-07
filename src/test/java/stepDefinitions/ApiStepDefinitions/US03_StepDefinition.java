package stepDefinitions.ApiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.contactGetAllManagement.*;

import java.util.List;

import static baseUrl.BaseUrl.spec;
import static baseUrl.RegisterBaseUrl.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class US03_StepDefinition {
    ContactPayloadPojo payload;
    Response response;
    ContactResponsePojo actuelData;
    JsonPath jsonPath;
    String expectedEmail;
    String expectedSubject;

    //POST+++++++++++++++++++++++++++++++++++++++++++++++++++++++++ calisiyor
    @Given("Contact mesaj Save icin URL duzenlenir_SK")
    public void contactMesajSaveIcinURLDuzenlenir_SK() {
        //https://managementonschools.com/app/contactMessages/save
        setupRegister();
        spec_1.pathParams("first", "contactMessages", "second", "save");
    }
    @And("Contact mesaj Save icin payload duzenlenir_SK")
    public void contactMesajSaveIcinPayloadDuzenlenir_SK() {
        payload=new ContactPayloadPojo("veta.schuppe@yahoo.com","Aliquam iure doloribus pariatur recusandae.",
                "Donald Bogisich","4v7oez");
    }
    @When("Contact mesaj Save icin POST Request gonderilir ve Reponse alinir_SK")
    public void contactMesajSaveIcinPOSTRequestGonderilirVeReponseAlinir_SK() {
        response = given(spec_1).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
    }
    @And("Contact mesaj Save icin gelen Response body dogrulanir_SK")
    public void contactMesajSaveIcinGelenResponseBodyDogrulanir_SK() {
        actuelData= response.as(ContactResponsePojo.class);

        assertEquals(payload.getEmail(),actuelData.getObject().getEmail());
        assertEquals(payload.getMessage(),actuelData.getObject().getMessage());
        assertEquals(payload.getName(),actuelData.getObject().getName());
        assertEquals(payload.getSubject(),actuelData.getObject().getSubject());
    }
    @Then("Mesaj gonderilince Status kodun {int} oldugu dogrulanir_SK")
    public void mesajGonderilinceStatusKodunOlduguDogrulanir_SK(int statuscode) {
        assertEquals(statuscode, response.statusCode());
    }
    //GETALL++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ calisiyor
    @And("Contact mesaj GetAll icin URL duzenlenir_SK")
    public void contactMesajGetAllIcinURLDuzenlenir_SK() {
        //https://managementonschools.com/app/contactMessages/getAll?page=0&size=10&sort=date&type=desc
       spec.pathParams("first", "contactMessages", "second", "getAll").
                queryParams("page",0,"size", "1000");
    }
    @When("Contact mesaj GetAll icin  Request gonderilir ve response alinir_SK")
    public void contactMesajGetAllIcinRequestGonderilirVeResponseAlinir_SK() {
        response = given(spec).when().get("{first}/{second}");
        response.prettyPrint();
    }
    @Then("Contact GetAll icin Status kodun {int} oldugu dogrulanir_SK")
    public void contactGetAllIcinStatusKodunOlduguDogrulanir_SK(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

 //search by email++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    @And("URL duzenlenir_SK")
    public void urlDuzenlenir_SK() {

        //https://managementonschools.com/app/contactMessages/searchByEmail?email=<string>&page=0&size=10&sort=date&type=desc
         expectedEmail="veta.schuppe@yahoo.com";
        spec.pathParams("first", "contactMessages","second","searchByEmail").
        queryParams("email",expectedEmail);
    }
    @Then("search by email  icin GET Request gonderilir ve Response body alinir")
    public void searchByEmailIcinGETRequestGonderilirVeResponseBodyAlinir() {

        response= given(spec).when().get("{first}/{second}");
        response.prettyPrint();


        JsonPath jsonPath = response.jsonPath();
        String actualEmail = jsonPath.getString("content[0].email");
        assertTrue(actualEmail.contains(expectedEmail));
    }
    @Then("search by email  icin Status code un {int} oldugu dogrulanir")
    public void searchByEmailIcinStatusCodeUnOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    //search by subject+++++++++++++++++++++++++++++++++++
    @And("Search subject icin URL duzenlenir_SK")
    public void searchSubjectIcinURLDuzenlenir_SK() {
        //https://managementonschools.com/app/contactMessages/searchBySubject?page=0&size=10&sort=date&subject=<string>&type=desc
        expectedSubject="4v7oez";
        spec.pathParams("first", "contactMessages", "second", "searchBySubject").
                queryParams("subject", expectedSubject);

    }
    @Then("GET Request gonderilir ve Response body alinir")
    public void getRequestGonderilirVeResponseBodyAlinir() {
        response= given(spec).when().get("{first}/{second}");
        response.prettyPrint();

        jsonPath = response.jsonPath();
        String actualSubject = jsonPath.getString("content[0].subject");
        assertTrue(actualSubject.contains(expectedSubject));
     }
    @Then("Status code un {int} oldugu dogrulanir")
    public void statusCodeUnOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }
}
