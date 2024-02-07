package stepDefinitions.ApiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.lessonManagement.LessonsPojoS;
import pojos.lessonManagement.ResponseLessonPojoS;

import java.util.List;

import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepDefinitions.ApiStepDefinitions.US08_StepDefinition.lessonName;
import static stepDefinitions.UiStepDefinitions.US04_StepDef.nameEsi;
import static stepDefinitions.UiStepDefinitions.US09_StepDef.randomDers;
import static stepDefinitions.UiStepDefinitions.US09_StepDef.randomDers2;

public class US09_StepDefinition {

    LessonsPojoS payLoad;
    Response responseGet;
    Response responseDel;
    ResponseLessonPojoS actualData;
    int lessonId;

    @And("Kayitli dersin ID'si alinir")
    public void kayitliDersinIDSiAlinir() {
        spec.pathParams("first","lessons","second","getAll");
        responseGet=given(spec).when().get("{first}/{second}");
        responseGet.prettyPrint();
        System.out.println(lessonName);
        JsonPath json = responseGet.jsonPath();
        List<Integer> randomDersId= json.getList("findAll{it.lessonName=='"+lessonName+"'}.lessonId");
        lessonId = randomDersId.get(0);
        System.out.println(lessonId);
    }

    @And("Lesson List icin URL duzenlenirSo")
    public void lessonListIcinURLDuzenlenirSo() {
        //lessons/getAllLessonByLessonId?lessonId=1973
        spec.pathParams("first","lessons","second","getAllLessonByLessonId")
        .queryParams("lessonId","2973");
    }
   @And("Lessons List icin Get Request gonderilir ve Response alinirSo")
    public void lessonsListIcinGetRequestGonderilirVeResponseAlinirSo() {
        responseGet = given(spec).when().get("{first}/{second}");
        responseGet.prettyPrint();
    }

    @And("Status kodun {int} oldugu dogrulanirSoN")
    public void statusKodunOlduguDogrulanirSoN(int statusCodeS) {
        assertEquals(statusCodeS, responseGet.statusCode());
    }

   @And("Olustrulan dersin Id'si alinirSo")
   public void olustrulanDersinIdSiAlinirSo() {
       JsonPath json = responseGet.jsonPath();
       List<Integer> randomDersId= json.getList("findAll{it.lessonName=='"+lessonName+"'}.lessonId");
       System.out.println("ID: " + randomDersId);
       int lessonId = randomDersId.get(0);
       System.out.println(lessonId);
   }

    @And("Lesson silmek icin URL duzenlenirSo")
    public void lessonSilmekIcinURLDuzenlenirSo() {
        spec.pathParams("first","lessons","second","delete","third",lessonId);

    }

    @And("Lesson silmek request gonderilir")
    public void lessonSilmekRequestGonderilir() {
        responseDel=given(spec).when().delete("{first}/{second}/{third}");
    }



}
