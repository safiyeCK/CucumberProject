package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.teacherManagement.TeacherGetSavedById.Objectpojo;
import pojos.teacherManagement.TeacherGetSavedById.ResponsePojo;
import pojos.teacherManagement.TeacherPost.PostResponsePojo;
import pojos.teacherManagement.TeacherPost.TeacherPostpojo;
import pojos.teacherManagement.TeacherUpdate.UpdateResponsePojo;
import utilities.ConfigReader;
import static org.junit.Assert.assertEquals;

import java.util.List;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;

public class US13_ApiStepDefinition {

    TeacherPostpojo payload;
    Response response;
    PostResponsePojo actualData;
    public static int userIDSA;
    public static int id;
    ResponsePojo actualDataById;
    ResponsePojo expectedData;
    List<Integer> dersler= List.of(1929,1930);
    UpdateResponsePojo actualDataUpdate;
    public static Objectpojo object;

    @Given("Teacher olusturmak icin URL duzenlenirSA")
    public void teacherOlusturmakIcinURLDuzenlenirSA() {
        setup(ConfigReader.getProperty("ViceDeanUserName"),ConfigReader.getProperty("ViceDeanPassword"));
        spec.pathParams("first","teachers","second","save");
    }

    @And("Teacher olusturmak icin payload duzenlenirSA")
    public void teacherOlusturmakIcinPayloadDuzenlenirSA() {
        payload= new TeacherPostpojo("1980-09-12","Oslo","teacherAmanda@gmail.com","FEMALE",true,dersler,"Amanda","Aa1234567","298-321-2235","234-51-2342","Nille","AmanNil");
    }

    @When("Teacher olusturmak icin POST Request gonderilirSA")
    public void teacherOlusturmakIcinPOSTRequestGonderilirSA() {
        response= given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        id=response.jsonPath().getInt("object.userId");
        System.out.println(id);
        actualData= response.as(PostResponsePojo.class);
    }


    @Then("Status kodun {int} oldugu dogrulanirSA")
    public void statusKodunOlduguDogrulanirSA(int statusCode) {
        assertEquals(response.statusCode(),statusCode);
    }

    @And("Teacher olusturma icin gelen Response body dogrulanirSA")
    public void teacherOlusturmaIcinGelenResponseBodyDogrulanirSA() {
        assertEquals(payload.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(payload.getName(),actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(payload.getGender(),actualData.getObject().getGender());
        assertEquals(payload.getSsn(),actualData.getObject().getSsn());
        assertEquals(payload.getSurname(),actualData.getObject().getSurname());
        assertEquals(payload.getUsername(),actualData.getObject().getUsername());
        assertEquals(payload.getEmail(),actualData.getObject().getEmail());
        assertEquals("Teacher saved successfully",actualData.getMessage());
        assertEquals("CREATED",actualData.getHttpStatus());
    }



    @Given("Kayitli Teacher bilgisinin ID nosu alinirSA")
    public void kayitliTeacherBilgisininIDNosuAlinirSA() {
        setup(ConfigReader.getProperty("ViceDeanUserName"),ConfigReader.getProperty("ViceDeanPassword"));
        spec.pathParams("first","teachers","second","getAll");
        response=given(spec).when().get("{first}/{second}");
        JsonPath json=response.jsonPath();
        List<Integer> userIdList=json.getList("findAll{it.username=='AmanNil'}.userId");
        userIDSA=userIdList.get(0);
        System.out.println(userIDSA);
    }

    @And("Teacher getSavedById icin URL duzenlenirSA")
    public void teacherGetSavedByIdIcinURLDuzenlenirSA() {
        setup(ConfigReader.getProperty("ViceDeanUserName"),ConfigReader.getProperty("ViceDeanPassword"));
        spec.pathParams("first","teachers","second","getSavedTeacherById","third",userIDSA);
    }

    @And("Teacher getSavedById icin beklenen veriler duzenlenirSA")
    public void teacherGetSavedByIdIcinBeklenenVerilerDuzenlenirSA() {
        object= new Objectpojo("AmanNil","Amanda","Nille","teacherAmanda@gmail.com","FEMALE","Oslo","298-321-2235", "234-51-2342", "1980-09-12", true);
        expectedData= new ResponsePojo(object,"Teacher successfully found","OK");
    }

    @When("Teacher getSavedById icin GET Request gonderilir ve Response alinirSA")
    public void teacherGetSavedByIdIcinGETRequestGonderilirVeResponseAlinirSA() {
       response=given(spec).when().get("{first}/{second}/{third}");
       actualDataById=response.as(ResponsePojo.class);
    }

    @Then("Teacher getSavedById icin gelen Response dogrulanir")
    public void teacherGetSavedByIdIcinGelenResponseDogrulanir() {
            assertEquals(expectedData.getObject().getBirthDay(),actualDataById.getObject().getBirthDay());
            assertEquals(expectedData.getObject().getBirthPlace(),actualDataById.getObject().getBirthPlace());
            assertEquals(expectedData.getObject().getName(),actualDataById.getObject().getName());
            assertEquals(expectedData.getObject().getPhoneNumber(),actualDataById.getObject().getPhoneNumber());
            assertEquals(expectedData.getObject().getGender(),actualDataById.getObject().getGender());
            assertEquals(expectedData.getObject().getSsn(),actualDataById.getObject().getSsn());
            assertEquals(expectedData.getObject().getSurname(),actualDataById.getObject().getSurname());
            assertEquals(expectedData.getObject().getUsername(),actualDataById.getObject().getUsername());
            assertEquals(expectedData.getObject().getEmail(),actualDataById.getObject().getEmail());
            assertEquals("Teacher successfully found",actualDataById.getMessage());
            assertEquals("OK",actualDataById.getHttpStatus());
        }

    @Given("Teacher Delete icin URL duzenlenir")
    public void teacherDeleteIcinURLDuzenlenir() {
        setup(ConfigReader.getProperty("ViceDeanUserName"),ConfigReader.getProperty("ViceDeanPassword"));
        spec.pathParams("first","teachers","second","delete","third",userIDSA);
    }

    @When("Teacher Delete icin DELETE Request gonderilir ve Response alinir")
    public void teacherDeleteIcinDELETERequestGonderilirVeResponseAlinir() {
        System.out.println(id);
        response=given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @And("Teacher update icin URL duzenlenirSA")
    public void teacherUpdateIcinURLDuzenlenirSA() {
        setup(ConfigReader.getProperty("ViceDeanUserName"),ConfigReader.getProperty("ViceDeanPassword"));
        spec.pathParams("first","teachers","second","update","third",userIDSA);

    }

    @And("Teacher update icin beklenen veriler duzenlenirSA")
    public void teacherUpdateIcinBeklenenVerilerDuzenlenirSA() {
        payload= new TeacherPostpojo("1980-09-12","Bergen","teacherAmanda@gmail.com","FEMALE",true,dersler,"Amanda","Aa1234567","298-321-2235","234-51-2342","Nille","AmanNil");
    }

    @When("Teacher update icin PUT Request gonderilir ve Response alinirSA")
    public void teacherUpdateIcinPUTRequestGonderilirVeResponseAlinirSA() {
        response=given(spec).body(payload).when().put("{first}/{second}/{third}");
        response.prettyPrint();
        actualDataUpdate= response.as(UpdateResponsePojo.class);
    }

    @Then("Teacher uptadete icin gelen Response dogrulanir")
    public void teacherUptadeteIcinGelenResponseDogrulanir() {
        System.out.println(payload);
        System.out.println(actualDataUpdate);
        assertEquals(payload.getUsername(),actualDataUpdate.getObject().getUsername());
        assertEquals("Teacher updated Successful",actualDataUpdate.getMessage());
        assertEquals("OK",actualDataUpdate.getHttpStatus());
        assertEquals(payload.getBirthPlace(),actualDataUpdate.getObject().getBirthPlace());

    }
}

