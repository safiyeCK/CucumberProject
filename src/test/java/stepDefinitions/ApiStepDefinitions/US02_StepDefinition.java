package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;



public class US02_StepDefinition {
    Response response;
    JsonPath json;
    protected static int id;
    Map<String,String> expectedData_delete;
    Map<String ,String> actualData_delete;

    @Given("{string} yetkisi ile giris yapilir_SK")
    public void yetkisiIleGirisYapilir_SK(String admin) {
        setup(ConfigReader.getProperty("adminName_SK"),ConfigReader.getProperty("passwordName_SK"));
        System.out.println(admin+  "ile giris yapildi");

    }
    @And("Kayitli Guest User icin URL duzenlenir_SK")
    public void kayitliGuestUserIcinURLDuzenlenir_SK() {
        //https://managementonschools.com/app/guestUser/getAll?page=0&size=1000&sort=username&type=desc

        spec.pathParams("first", "guestUser", "second", "getAll").
                queryParams("size", "10000","sort","username");
    }
    @When("Kayitli Guest User icin GET Request gonderilir ve response alinir_SK")
    public void kayitliGuestUserIcinGETRequestGonderilirVeResponseAlinir_SK() {

        response = given(spec).when().get("{first}/{second}");
        response.prettyPrint();

        json = response.jsonPath();
       List<Integer>idList=json.getList("content.id");  //listten id alma
       id=idList.get(0);
        System.out.println("id = " + id);

        List<String> usernameList = json.getList("content.findAll { it.containsKey('username') }.username");
        Assert.assertTrue(usernameList.get(0).contains("  .011Merlin"));
        List<String> ssnList = json.getList("content.findAll { it.containsKey('ssn') }.ssn");
        Assert.assertTrue(ssnList.get(0).contains("125-37-8955"));
        List<String> nameList = json.getList("content.findAll { it.containsKey('name') }.name");
        Assert.assertTrue(nameList.get(0).contains("Selim"));
        List<String> surnameList = json.getList("content.findAll { it.containsKey('surname') }.surname");
        Assert.assertTrue(surnameList.get(0).contains("Karahan"));
        List<String> birthDayList = json.getList("content.findAll { it.containsKey('birthDay') }.birthDay");
        Assert.assertTrue(birthDayList.get(0).contains("1996-12-12"));
        List<String> birthPlaceList = json.getList("content.findAll { it.containsKey('birthPlace') }.birthPlace");
        Assert.assertTrue(birthPlaceList.get(0).contains("Ankara"));
        List<String> phoneNumberList = json.getList("content.findAll { it.containsKey('phoneNumber') }.phoneNumber");
        Assert.assertTrue(phoneNumberList.get(0).contains("137-547-8765"));
        List<String> genderList = json.getList("content.findAll { it.containsKey('gender') }.gender");
        Assert.assertTrue(genderList.get(0).contains("MALE"));

    }
    @Then("GetAll icin Status kodun {int} oldugu dogrulanir_SK")
    public void getallIcinStatusKodunOlduguDogrulanir_SK(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    //DELETE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    @And("Guest User kaydi DELETE islemi icin URL duzenlenir")
    public void guestUserKaydiDELETEIslemiIcinURLDuzenlenir() {
        //https://managementonschools.com/app/guestUser/delete/id

        spec.pathParams("first", "guestUser", "second", "delete","third", id);
        expectedData_delete = new HashMap<>();
        expectedData_delete.put("httpStatus","OK");
        expectedData_delete.put("message"," Guest User deleted Successful");

    }
    @When("Guest User kaydi silme islemi icin DELETE Request gonderilir ve Response alinir")
    public void guestUserKaydiSilmeIslemiIcinDELETERequestGonderilirVeResponseAlinir() {

        response = given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();

        actualData_delete = response.as(HashMap.class);
    }
    @Then("DELETE icin Status kodun {int} oldugu dogrulanir_SK")
    public void deleteIcinStatusKodunOlduguDogrulanir_SK(int statusCode) {
        assertEquals(statusCode, response.statusCode());
        assertEquals(expectedData_delete,actualData_delete);
    }
}
