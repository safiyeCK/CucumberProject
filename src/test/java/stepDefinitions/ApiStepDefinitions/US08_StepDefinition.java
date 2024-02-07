package stepDefinitions.ApiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.lessonManagement.LessonsPojoS;
import pojos.lessonManagement.ResponseLessonPojoS;
import utilities.ConfigReader;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepDefinitions.UiStepDefinitions.US04_StepDef.nameEsi;
import static stepDefinitions.UiStepDefinitions.US09_StepDef.randomDers;

public class US08_StepDefinition {
    static Faker fakerLesson = new Faker();
    public static String lessonName = fakerLesson.name().firstName();
    LessonsPojoS payLoad;
    Response responsePost;
    ResponseLessonPojoS actualData;

    @Given("ViceDean olarak giris yapilirSo")
    public void vicedeanOlarakGirisYapilir() {
        setup(ConfigReader.getProperty("usernameSo"), ConfigReader.getProperty("passwordSo"));
    }

    @And("Lesson Controller icin URL duzenlenirSo")
    public void vicedeanSaveIcinURLDuzenlenirSo() {
        //https://managementonschools.com/app/vicedean/getAll
        spec.pathParams("first","lessons","second","save");
    }

    @And("Lesson icin PayLoad duzenlenirSo")
    public void lessonIcinPayLoadDuzenlenirSo() {
        payLoad = new LessonsPojoS(true,10, lessonName);
        System.out.println("gelen ders" +lessonName);
    }

    @When("Lesson icin POST Request gonderilir ve Response alinirSo")
    public void lessonIcinPOSTRequestGonderilirVeResponseAlinirSo() {
      responsePost = given(spec).body(payLoad).when().post("{first}/{second}");
      actualData = responsePost.as(ResponseLessonPojoS.class);
      responsePost.prettyPrint();
    }

    @Then("Status kodun {int} oldugu dogrulanirSo")
    public void statusKodunOlduguDogrulanirSo(int statusCode) {
        assertEquals(statusCode, responsePost.statusCode());
    }

    @And("Lesson icin gelen Response body dogrulanirSo")
    public void lessonIcinGelenResponseBodyDogrulanirSo() {
        assertEquals(payLoad.isCompulsory(),actualData.getObject().isCompulsory());
        assertEquals(payLoad.getCreditScore(),actualData.getObject().getCreditScore());
        assertEquals(payLoad.getLessonName(),actualData.getObject().getLessonName());
    }


}
