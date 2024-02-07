package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.ConfigReader;

import java.util.List;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;

public class US25_ApiStepDefinition {
    Response response;
     int studentId;


    @Given("Stdudent olusturmak icin URL duzenlenir_DBB")
    public void stdudentOlusturmakIcinURLDuzenlenir_DBB() {
        setup(ConfigReader.getProperty("AdminUserName_DB"), ConfigReader.getProperty("AdminPassword_DB"));
        spec.pathParams("first", "students", "second", "save");
    }

    @Given("Kayitli Student bilgisinin ID nosu alinir_DBB")
    public void kayitliStudentBilgisininIDNosuAlinir_DBB() {
        setup(ConfigReader.getProperty("AdminUserName_DB"), ConfigReader.getProperty("AdminPassword_DB"));
        spec.pathParams("first","students", "second","getAll");
         response = given(spec).when().get("{first}/{second}");
        JsonPath json= response.jsonPath();
        List<Integer> studentIdList = json.getList("findAll{it.username=='durdukaya'}id");
        studentId = studentIdList.get(0);
    }

    @Given("Student Delete icin URL duzenlenir_DBB")
    public void studentDeleteIcinURLDuzenlenir_DBB() {
        setup(ConfigReader.getProperty("AdminUserName_DB"), ConfigReader.getProperty("AdminPassword_DB"));
        spec.pathParams("first","students","second","delete","third",studentId);
    }
}
