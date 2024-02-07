package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.lessonManagement.saveLessonPorg.PostPojoYD;
import pojos.lessonManagement.saveLessonPorg.ResponseYDPojo;

import java.util.List;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US10_StepDefinition {
    List<Integer> dersler= List.of(1929,1930);
    PostPojoYD payload;
    Response response;
    ResponseYDPojo actualdata;
    public static Integer lessonProgramId;
    @Given("{string} ile giris yapilir YD")
    public void ile_giris_yapilir_yd(String string) {
      setup("Bella", "Batch171");
    }
    @Given("Kayitli Vıce Dean icin URL duzenlenir YD")
    public void kayitli_vıce_dean_icin_url_duzenlenir_yd() {
        //https://managementonschools.com/app/lessonPrograms/save
        spec.pathParams("first", "lessonPrograms","second","save");
    }
    @Then("Kayitli Vice Dean icin payload duzenlenir")
    public void kayitliViceDeanIcinPayloadDuzenlenir() {
         payload = new PostPojoYD("FRIDAY",17 , dersler ,"12:00", "14:00");
        /*{
  "day": "MONDAY",
  "educationTermId": 0,
  "lessonIdList": [
    0
  ],
  "startTime": "HH:mm",
  "stopTime": "HH:mm"}*/


    }
    @When("Kayitli Vıce Dean icin POST Request gonderilir ve response alinir YD")
    public void kayitli_vıce_dean_icin_post_request_gonderilir_ve_response_alinir_yd() {
        System.out.println(48);
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        actualdata = response.as(ResponseYDPojo.class);
        lessonProgramId = actualdata.getObject().getLessonProgramId();
        System.out.println(lessonProgramId);
    }
    @Then("Kayitli Vice Dean icin gelen response dogrulanir YD")
    public void kayitliViceDeanIcinGelenResponseDogrulanirYD() {
        assertEquals(payload.getDay(),actualdata.getObject().getDay());
        assertTrue(payload.getLessonIdList().contains(actualdata.getObject().getLessonName().get(0).getLessonId()));
        assertTrue(actualdata.getObject().getStartTime().contains(payload.getStartTime()));
        assertTrue(actualdata.getObject().getStopTime().contains(payload.getStopTime()));
//"message": "Created Lesson Program",
//    "httpStatus": "CREATED"
        assertEquals( "Created Lesson Program", actualdata.getMessage());
        assertEquals( "CREATED", actualdata.getHttpStatus());



    }
    @Then("GetAll icin Status kodun {int} oldugu dogrulanir YD")
    public void get_all_icin_status_kodun_oldugu_dogrulanir_yd(int statusCode) {
        assertEquals(statusCode, response.statusCode());

    }



}
