package stepDefinitions.ApiStepDefinitions;

import com.github.javafaker.Faker;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US11_StepDefinition {

    Response response;
    int id;



    @Given("vice dean sends getAll request for lesson program")
    public void viceDeanSendsGetAllRequestForLessonProgram() {
        //Hooks.spec.pathParams("first", "lessonPrograms","second","getAll");
        //response = given(Hooks.spec).when().get("/{first}/{second}");
        //response.prettyPrint();


    }

    @Then("vice dean gets the lesson program and assert")
    public void viceDeanGetsTheLessonProgramAndAssert() {

        String actualData= response.asString();
        assertTrue(actualData.contains("lessonName"));
        assertTrue(actualData.contains("startTime"));
        assertTrue(actualData.contains("startTime"));
        assertTrue(actualData.contains("day"));

    }

    @Given("vice dean sends put request for lesson program")
    public void viceDeanSendsPutRequestForLessonProgram() {

        spec.pathParams("first", "lessonPrograms","second","getAll");
        response = given(spec).when().get("/{first}/{second}");
        response.prettyPrint();

    }

    @Then("vice dean update the lesson program and assert")
    public void viceDeanUpdateTheLessonProgramAndAssert() {


    }

    @Given("vice dean sends delete request for lesson program")
    public void viceDeanSendsDeleteRequestForLessonProgram() {

        //https://school-management-v1.herokuapp.com/lessonPrograms/delete/1
        id= Faker.instance().number().numberBetween(1,333);
        spec.pathParams("first", "lessonPrograms","second","delete","third",id);
        response = given(spec).when().delete("/{first}/{second}/{third}");
        response.prettyPrint();

    }

    @Then("vice dean delete the lesson program from id and assert")
    public void viceDeanDeleteTheLessonProgramFromIdAndAssert() {
        //        {
//            "message": "Lesson Program Deleted",
//                "httpStatus": "OK"
//        }
        Map<String,String> expectedData=new HashMap<>();
        expectedData.put("message", "Lesson Program Deleted");
        expectedData.put("httpStatus", "OK");

        Map<String,String> actualData= response.as(HashMap.class);
        assertEquals(expectedData.get("message"),actualData.get("message"));
        assertEquals(expectedData.get("httpStatus"),actualData.get("httpStatus"));
    }
}
