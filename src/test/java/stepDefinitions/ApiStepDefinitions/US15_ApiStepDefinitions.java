package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.studentManagement.studentGetById.ResponseGetPojo;
import pojos.studentManagement.studentPost.ObjectPojo;
import pojos.studentManagement.studentPost.ResponsePojo;
import pojos.studentManagement.studentPost.StudentPostPojo;
import pojos.studentManagement.studentUpdate.ResponseStdUpdtPojo;
import utilities.ConfigReader;

import java.util.List;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US15_ApiStepDefinitions {
    StudentPostPojo payloadUpdt;
    ResponseGetPojo  actualDataGetById;
    ResponseGetPojo expectedData;
    public static StudentPostPojo payload;
    public static ResponsePojo actualData;
    ResponseStdUpdtPojo actualDataUpdt;
    public static Response response;

    public  static ObjectPojo object;
    private static int studentId;
    @Given("Stdudent olusturmak icin URL duzenlenir_DR")
    public void stdudentOlusturmakIcinURLDuzenlenir_DR() {
        setup(ConfigReader.getProperty("userName_DB"), ConfigReader.getProperty("password_DB"));
        spec.pathParams("first", "students", "second", "save");
    }

    @And("Stdudent olusturmak icin payload duzenlenir_DR")
    public void stdudentOlusturmakIcinPayloadDuzenlenir_DR() {
         payload = new StudentPostPojo(1339, "2002-09-09", "Balkan","balkan@gmail.com", "Ali","FEMALE","Ayse","Durdu","Balkan@2002","989-321-7654", "564-67-8967","Kaya","durdukaya");
    }

    @When("Stdudent olusturmak icin POST Request gonderili_DR")
    public void stdudentOlusturmakIcinPOSTRequestGonderili_DR() {
    response =  given(spec).body(payload).when().post("{first}/{second}");
    actualData = response.as(ResponsePojo.class);
    }
    @Then("Status kodun {int} oldugu dogrulanir_DR")
    public void statusKodunOlduguDogrulanir_DR(int statuscode) {
        assertEquals(statuscode, response.statusCode());
    }

    @And("Stdudent olusturma icin gelen Response body dogrulanir_DR")
    public void stdudentOlusturmaIcinGelenResponseBodyDogrulanir_DR() {
        assertEquals(payload.getAdvisorTeacherId(), actualData.getObject().getAdvisorTeacherId());
        assertEquals(payload.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(payload.getEmail(), actualData.getObject().getEmail());
        assertEquals(payload.getFatherName(), actualData.getObject().getFatherName());
        assertEquals(payload.getGender(), actualData.getObject().getGender());
        assertEquals(payload.getMotherName(), actualData.getObject().getMotherName());
        assertEquals(payload.getName(), actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(), actualData.getObject().getSsn());
        assertEquals(payload.getSurname(), actualData.getObject().getSurname());
        assertEquals(payload.getUsername(), actualData.getObject().getUsername());
    }

    @Given("Kayitli Student bilgisinin ID nosu alinir_DB")//2
    public void kayitliStudentBilgisininIDNosuAlinir_DB() {
        setup(ConfigReader.getProperty("userName_DB"), ConfigReader.getProperty("password_DB"));
        spec.pathParams("first","students", "second","getAll");
        response = given(spec).when().get("{first}/{second}");
        JsonPath json= response.jsonPath();
        List<Integer> studentIdList = json.getList("findAll{it.username=='durdukaya'}id");
        studentId = studentIdList.get(0);
    }
    @And("Student getStudentById icin URL duzenlenir_DB")
    public void studentGetStudentByIdIcinURLDuzenlenir_DB() {
        //https://managementonschools.com/app/students/getStudentById?id=1
        spec.pathParams("first","students", "second","getStudentById")
                .queryParam("id", studentId);
    }
    @And("Student getStudentById icin beklenen veriler duzenlenir_DB")
    public void studentGetStudentByIdIcinBeklenenVerilerDuzenlenir_DB() {
      expectedData = new ResponseGetPojo(false,"layten.vihaan@free2ducks.com",1339,"Jennet","Bahar","2002-09-09","Balkan","balkan@gmail.com","Ali","FEMALE","Ayse","Durdu","989-321-7654","564-67-8967",1542,"Kaya","durdukaya");

    }

    @When("Student getStudentById icin GET Request gonderilir ve Response alinir_DB")
    public void studentGetStudentByIdIcinGETRequestGonderilirVeResponseAlinir_DB() {
        response = given(spec).when().get("{first}/{second}");
        actualDataGetById = response.as(ResponseGetPojo.class);
    }

    @Then("Student getStudentById icin gelen Response dogrulanir_DB")
    public void studentGetStudentByIdIcinGelenResponseDogrulanir_DB() {
        assertEquals(expectedData.getUsername(), actualDataGetById.getUsername());
        assertEquals(expectedData.getSsn(), actualDataGetById.getSsn());
        assertEquals(expectedData.getName(), actualDataGetById.getName());
        assertEquals(expectedData.getSurname(), actualDataGetById.getSurname());
        assertEquals(expectedData.getBirthDay(), actualDataGetById.getBirthDay());
        assertEquals(expectedData.getBirthPlace(), actualDataGetById.getBirthPlace());
        assertEquals(expectedData.getPhoneNumber(), actualDataGetById.getPhoneNumber());
        assertEquals(expectedData.getGender(), actualDataGetById.getGender());
        assertEquals(expectedData.getMotherName(), actualDataGetById.getMotherName());
        assertEquals(expectedData.getFatherName(), actualDataGetById.getFatherName());
        assertEquals(expectedData.getAdvisorTeacherId(), actualDataGetById.getAdvisorTeacherId());
        assertEquals(expectedData.getAdvisorTeacherName(), actualDataGetById.getAdvisorTeacherName());
        assertEquals(expectedData.getAdvisorTeacherSurname(), actualDataGetById.getAdvisorTeacherSurname());
        assertEquals(expectedData.getAdvisorTeacherEmail(), actualDataGetById.getAdvisorTeacherEmail());
        assertEquals(expectedData.getEmail(), actualDataGetById.getEmail());
        assertEquals(expectedData.isActive(), actualDataGetById.isActive());


    }

    @And("Student update icin URL duzenlenir_DB")
    public void studentUpdateIcinURLDuzenlenir_DB() {
        //https://managementonschools.com/app/students/update/1
        setup(ConfigReader.getProperty("userName_DB"), ConfigReader.getProperty("password_DB"));
        spec.pathParams("first","students", "second","update","third",studentId);
    }

    @And("Student update icin beklenen veriler duzenlenir_DB")
    public void studentUpdateIcinBeklenenVerilerDuzenlenir_DB() {
        payloadUpdt = new StudentPostPojo(1339,"2002-09-09","Dubai","balkan@gmail.com","Ali","FEMALE", "Ayse","Durdu","Balkan@2002","989-321-7654", "564-67-8967","Kaya","durdukaya");


    }

    @When("Student update icin PUT Request gonderilir ve Response alinir_DB")
    public void studentUpdateIcinPUTRequestGonderilirVeResponseAlinir_DB() {
        response=given(spec).body(payloadUpdt).when().put("{first}/{second}/{third}");
        response.prettyPrint();
        actualDataUpdt =  response.as(ResponseStdUpdtPojo.class);

    }
    @Then("Student uptadete icin gelen Response dogrulanir_DB")
    public void studentUptadeteIcinGelenResponseDogrulanir_DB() {
        assertEquals(payloadUpdt.getAdvisorTeacherId(), actualDataUpdt.getObject().getAdvisorTeacherId());
        assertEquals(payloadUpdt.getBirthDay(), actualDataUpdt.getObject().getBirthDay());
        assertEquals(payloadUpdt.getBirthPlace(), actualDataUpdt.getObject().getBirthPlace());
        assertEquals(payloadUpdt.getEmail(), actualDataUpdt.getObject().getEmail());
        assertEquals(payloadUpdt.getGender(), actualDataUpdt.getObject().getGender());
        assertEquals(payloadUpdt.getFatherName(), actualDataUpdt.getObject().getFatherName());
        assertEquals(payloadUpdt.getMotherName(), actualDataUpdt.getObject().getMotherName());
        assertEquals(payloadUpdt.getName(), actualDataUpdt.getObject().getName());
        assertEquals(payloadUpdt.getPhoneNumber(), actualDataUpdt.getObject().getPhoneNumber());
        assertEquals(payloadUpdt.getSsn(), actualDataUpdt.getObject().getSsn());
        assertEquals(payloadUpdt.getUsername(), actualDataUpdt.getObject().getUsername());
        assertEquals(payloadUpdt.getSurname(), actualDataUpdt.getObject().getSurname());
        assertEquals("Student updated Successfully", actualDataUpdt.getMessage());
    }


    @Then("Status kodun {int} oldugu dogrulanir_DB")
    public void statusKodunOlduguDogrulanir_DB(int statusCode) {
            assertEquals(statusCode, response.statusCode());
    }

    @Given("Student Delete icin URL duzenlenir")
    public void studentDeleteIcinURLDuzenlenir() {
        setup(ConfigReader.getProperty("userName_DB"), ConfigReader.getProperty("password_DB"));
        spec.pathParams("first","students","second","delete","third",studentId);
    }

    @When("Student Delete icin DELETE Request gonderilir ve Response alinir")
    public void studentDeleteIcinDELETERequestGonderilirVeResponseAlinir() {
        response=given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
    }
}
