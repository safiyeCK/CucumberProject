package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.studentInfoManagement.US17_US18_Pojo.postStudentInfo.AddStudentInfoPostPojo;
import pojos.studentInfoManagement.US17_US18_Pojo.postStudentInfo.ResponseAddStudentInfoPostPojo;
import pojos.studentInfoManagement.US17_US18_Pojo.getStudentInfo.ResponseStudentInfoGetPojo;
import pojos.studentInfoManagement.US17_US18_Pojo.putStudentInfo.PutPayloadPojo;
import pojos.studentInfoManagement.US17_US18_Pojo.putStudentInfo.ResponsePutPojo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class US17_US18_StepDefinitions {



    ResponsePutPojo actualData_put;
    PutPayloadPojo payload_put;
    ResponseStudentInfoGetPojo actualDataGetStudentInfo;
    AddStudentInfoPostPojo expectedData;
    ResponseAddStudentInfoPostPojo actualData;
    public static AddStudentInfoPostPojo payload;
    Response response;
    int studentId = 1856;
    int lessonId = 1848;
    static int studentInfoId;
    @Given("Add Student Info icin url duzenlenir_I")
    public void addStudentInfoIcinUrlDuzenlenir_I() {

        setup("Safiye46","Safiye46");
        spec.pathParams("p1","studentInfo","p2","save");
    }
    @And("Add Student Info icin payload duzenlenir_I")
    public void addStudentInfoIcinPayloadDuzenlenir_I() {
         payload = new AddStudentInfoPostPojo(7,26,95.0,"Basarili bir ogrenci",lessonId,95.0,studentId);
    }
    @When("Add Student Info post request gonderilir ve response alinir_I")
    public void addStudentInfoPostRequestGonderilirVeResponseAlinir_I() {
        response = given(spec).body(payload).when().post("{p1}/{p2}");
        response.prettyPrint();
        actualData = response.as(ResponseAddStudentInfoPostPojo.class);
        System.out.println("actualData = " + actualData);
    }
    @Then("Status kodun {int} oldugu dogrulanir_I")
    public void statusKodunOlduguDogrulanir_I(int statusCode) {
        assertEquals(statusCode,response.statusCode());
    }
    @And("Add Student Info icin gelen response dogrulanir_I")
    public void addStudentInfoIcinGelenResponseDogrulanir_I() {
        assertEquals(payload.getAbsentee(),actualData.getObject().getAbsentee());
        assertEquals(payload.getEducationTermId(),actualData.getObject().getEducationTermId());
        assertEquals(payload.getFinalExam(),actualData.getObject().getFinalExam());
        assertEquals(payload.getInfoNote(),actualData.getObject().getInfoNote());
        assertEquals(payload.getLessonId(),actualData.getObject().getLessonId());
        assertEquals(payload.getMidtermExam(),actualData.getObject().getMidtermExam());
        assertEquals(payload.getStudentId(),actualData.getObject().getStudentResponse().getUserId());
        assertEquals("Student Info saved Successfully",actualData.getMessage());
        assertEquals("CREATED",actualData.getHttpStatus());
    }
    @Given("Kayitli Student Info ID'si alinir_I")
    public void kayitliStudentInfoIDSiAlinir_I() {
        setup("Safiye46","Safiye46");
        spec.pathParams("p1","studentInfo","p2","getByStudentId","p3",studentId);
        response = given(spec).when().get("{p1}/{p2}/{p3}");
        response.prettyPrint();
        JsonPath jsP = response.jsonPath();
        List<Integer> studentIdList = jsP.getList("findAll{it.lessonId==1848}.id");
        studentInfoId = studentIdList.get(0);
        System.out.println("studentInfoId = " + studentInfoId);
    }
    @And("GetByStudentInfo icin url duzenlenir_I")
    public void getbystudentınfoIcinUrlDuzenlenir_I() {
        setup("Safiye46","Safiye46");
        spec.pathParams("p1","studentInfo","p2","get","p3",studentInfoId);
    }
    @When("Student Info expected data olusturulur_I")
    public void studentInfoExpectedDataOlusturulur_I() {
      expectedData = new AddStudentInfoPostPojo(7,26,95.0,"Basarili bir ogrenci",lessonId,95.0,studentId);
    }
    @When("GetByStudentInfo icin request gonderilir Response alinir_I")
    public void getbystudentınfoIcinRequestGonderilirResponseAlinir_I() {
        response = given(spec).get("{p1}/{p2}/{p3}");
         actualDataGetStudentInfo = response.as(ResponseStudentInfoGetPojo.class);
    }
    @And("GetByStudentInfo icin gelen response dogrulanir_I")
    public void getbystudentınfoIcinGelenResponseDogrulanir_I() {
        assertEquals(expectedData.getAbsentee(),actualDataGetStudentInfo.getAbsentee());
        assertEquals(expectedData.getEducationTermId(),actualDataGetStudentInfo.getEducationTermId());
        assertEquals(expectedData.getFinalExam(),actualDataGetStudentInfo.getFinalExam());
        assertEquals(expectedData.getInfoNote(),actualDataGetStudentInfo.getInfoNote());
        assertEquals(expectedData.getLessonId(),actualDataGetStudentInfo.getLessonId());
        assertEquals(expectedData.getMidtermExam(),actualDataGetStudentInfo.getMidtermExam());
        assertEquals(expectedData.getStudentId(),actualDataGetStudentInfo.getStudentResponse().getUserId());
    }
    @And("Kayitli Student Info bilgilerini guncellemek icin url duzenlenir_I")
    public void kayitliStudentInfoBilgileriniGuncellemekIcinUrlDuzenlenir_I() {
        setup("Safiye46","Safiye46");
        spec.pathParams("p1","studentInfo","p2","update","p3",studentInfoId);
    }
    @And("Kayitli Student Info bilgilerini guncellemek icin payload duzenlenir_I")
    public void kayitliStudentInfoBilgileriniGuncellemekIcinPayloadDuzenlenir_I() {
        payload_put = new PutPayloadPojo(5,27,97.5,"Cok acayip biri",1932,99.5);
    }
    @When("Kayitli Student Info bilgilerini guncellemek icin request gonderilir Response alinir_I")
    public void kayitliStudentInfoBilgileriniGuncellemekIcinRequestGonderilirResponseAlinir_I() {
        response = given(spec).body(payload_put).put("{p1}/{p2}/{p3}");
        actualData_put = response.as(ResponsePutPojo.class);
    }
    @And("Guncellenen response body dogrulanir_I")
    public void guncellenenResponseBodyDogrulanir_I() {
        assertEquals(payload_put.getAbsentee(),actualData_put.getObject().getAbsentee());
        assertEquals(payload_put.getEducationTermId(),actualData_put.getObject().getEducationTermId());
        assertEquals(payload_put.getInfoNote(),actualData_put.getObject().getInfoNote());
        assertEquals(payload_put.getLessonId(),actualData_put.getObject().getLessonId());
        assertEquals(payload_put.getMidtermExam(),actualData_put.getObject().getMidtermExam());
        assertEquals("Student Info updated Successfully",actualData_put.getMessage());
        assertEquals("CREATED",actualData_put.getHttpStatus());
   }
    @And("Kayitli Student Info bilgilerini silmek icin url duzenlenir_I")
    public void kayitliStudentInfoBilgileriniSilmekIcinUrlDuzenlenir_I() {
        setup("Safiye46","Safiye46");
        spec.pathParams("p1","studentInfo","p2","delete","p3",studentInfoId);
    }
    @When("Kayitli Student Info bilgilerini silmek icin request gonderilir Response alinir_I")
    public void kayitliStudentInfoBilgileriniSilmekIcinRequestGonderilirResponseAlinir_I() {
        response = given(spec).delete("{p1}/{p2}/{p3}");
        String actualData_delete = response.asString();
        System.out.println("actualData_delete = " + actualData_delete);




       /*
       {
  "httpStatus": "100 CONTINUE",
  "message": "string",
  "object": {}
}
        */
    }
}
