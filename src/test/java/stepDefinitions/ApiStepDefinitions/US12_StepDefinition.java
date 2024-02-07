package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.viceDeanManagement.US12.PayloadPojoYD;
import pojos.viceDeanManagement.US12.ResponseTeacherPojoYD;

import java.util.ArrayList;
import java.util.List;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepDefinitions.ApiStepDefinitions.US10_StepDefinition.lessonProgramId;

public class US12_StepDefinition {
    Response response;
    PayloadPojoYD payload;
    List<Integer> id = List.of(2558);
    ResponseTeacherPojoYD actualData;
    @Given("Vice Dean ders atamak icin Post Request hazirlanir YD")
    public void vice_dean_ders_atamak_icin_post_request_hazirlanir_YD() {
        setup("Bella", "Batch171");
        //https://managementonschools.com/app/teachers/chooseLesson
         spec.pathParams("first", "teachers", "second", "chooseLesson");
    }
    @Then("Gonderilecek data bilgileri hazirlanir")
    public void gonderilecek_data_bilgileri_hazirlanir() {
        //List<Integer> lessonProgramId = new ArrayList<>();
        //lessonProgramId.add(id);
        payload = new PayloadPojoYD(id, 3012);

    }
    @When("Teacher a ders atamak icin Post Request gonderilir")
    public void teacher_a_ders_atamak_icin_post_request_gonderilir() {
       response = given(spec).body(payload).post("{first}/{second}");
       response.prettyPrint();
       actualData = response.as(ResponseTeacherPojoYD.class);
    }
    @Then("\"Vicedean gelen body i dogrular")
    public void vicedean_gelen_body_i_dogrular() {
     assertEquals(payload.getTeacherId(),actualData.getObject().getUserId());
     assertEquals("Lesson added to Teacher", actualData.getMessage());
     assertEquals("CREATED", actualData.getHttpStatus());

    }
    @And("Status code nin {int} oldugu dogrulanir")
    public void statusCodeNinOlduguDogrulanir(int statusCode) {
    assertEquals(statusCode, response.statusCode());
    }
}