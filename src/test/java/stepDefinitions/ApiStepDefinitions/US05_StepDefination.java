package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.deanManagement.DeanPostPojo;
import pojos.deanManagement.ObjectPojo;
import pojos.deanManagement.ResponsePojo;


import java.util.List;

import static baseUrl.BaseUrl.spec;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepDefinitions.UiStepDefinitions.US04_StepDef.*;
import static stepDefinitions.UiStepDefinitions.US05_StepDef.*;

public class US05_StepDefination {
    public static DeanPostPojo payload1;
    public Response response1;
    ResponsePojo actualData1;

    public  Response response2;
    public  Response responseDelEsi;
    public  ResponsePojo actualData;
    public static int userIdEsi;
    public static ObjectPojo object;
    public static ResponsePojo expectedData;



    @And("Kayitli olan Dean hesap bilgisinin ID nosu alinir Esi")
    public void kayitliOlanDeanHesapBilgisininIDNosuAlinir() {
        spec.pathParams("first","dean","second","getAll");
        response2=given(spec).when().get("{first}/{second}");
        System.out.println(userNameEsi);

        JsonPath json =response2.jsonPath();
        List<Integer> userIdListEsi= json.getList("findAll{it.username=='"+userNameEsi+"'}.userId");
        userIdEsi=userIdListEsi.get(0);
        System.out.println(userIdEsi);


    }

    @And("GetManagerById icin URL duzenlenir Esi")
    public void getmanagerbyıdIcinURLDuzenlenir() {
//https://managementonschools.com/app/dean/getManagerById/2290

        spec.pathParams("first","dean","second","getManagerById","third",userIdEsi);

    }

    @When("GetManagerById icin beklenen veriler duzenlenir Esi")
    public void getmanagerbyıdIcinBeklenenVerilerDuzenlenir() {
        System.out.println(userNameEsi);
        object=new ObjectPojo(userIdEsi,userNameEsi,nameEsi,surnameEsi,birthdayEsi,ssnEsi,birthPlaceEsi,phoneNummerEsi,"MALE");
        expectedData=new ResponsePojo(object,"Dean successfully found", "OK");
    }

    @Then("GetManagerById icin GET Request gonderilir ve Response body alinir Esi")
    public void getmanagerbyıdIcinGETRequestGonderilirVeResponseBodyAlinir() {
        response2=given(spec).when().get("{first}/{second}/{third}");
        actualData=response2.as(ResponsePojo.class);
    }


    @And("GetManagerById icin gelen Response body dogrulanir Esi")
    public void getmanagerbyıdIcinGelenResponseBodyDogrulanir() {
        assertEquals(object.getUserId(), actualData.getObject().getUserId());
        assertEquals(object.getUsername(), actualData.getObject().getUsername());
        assertEquals(object.getName(), actualData.getObject().getName());
        assertEquals(object.getSurname(), actualData.getObject().getSurname());
        assertEquals(object.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(object.getSsn(), actualData.getObject().getSsn());
        assertEquals(object.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(object.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(object.getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getMessage(), actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(), actualData.getHttpStatus());
    }


    @And("Dean hesabini guncellemek icin URL duzenlenir Esi")
    public void deanHesabiniGuncellemekIcinURLDuzenlenir() {
        //https://managementonschools.com/app/dean/update/2190
        spec.pathParams("first","dean","second","update","third",userIdEsi);

    }

    @And("Dean hesabi guncellemek icin payload duzenlenir Esi")
    public void deanHesabiGuncellemekIcinPayloadDuzenlenir() {
        payload1 =new DeanPostPojo(birthdayEsii,birthPlaceEsii,"FEMALE",nameEsii,passwordEsii,phoneNummerEsii,ssnEsii,surnameEsii,userNameEsii);

    }

    @And("Dean hesabi guncellemek icin PUT Request gonderilir ve Reponse alinir Esi")
    public void deanHesabiGuncellemekIcinPOSTRequestGonderilirVeReponseAlinir() {
        response1=given(spec).body(payload1).when().put("{first}/{second}/{third}");
        response1.prettyPrint();
        actualData1=response1.as(ResponsePojo.class);

    }

    @And("Guncelenen response body dogrulanir Esi")
    public void guncelenenResponseBodyDogrulanir() {
        assertEquals(payload1.getBirthDay(), actualData1.getObject().getBirthDay());
        assertEquals(payload1.getBirthPlace(), actualData1.getObject().getBirthPlace());
        assertEquals(payload1.getGender(), actualData1.getObject().getGender());
        assertEquals(payload1.getName(), actualData1.getObject().getName());
        assertEquals(payload1.getPhoneNumber(), actualData1.getObject().getPhoneNumber());
        assertEquals(payload1.getSsn(), actualData1.getObject().getSsn());
        assertEquals(payload1.getSurname(), actualData1.getObject().getSurname());
        assertEquals(payload1.getUsername(), actualData1.getObject().getUsername());

    }

    @And("Dean hesabi guncellemek icin Status code un {int} oldugu dogrulanir Esi")
    public void deanHesabiGuncellemekIcinStatusCodeUnOlduguDogrulanir(int statuscode) {

            assertEquals(statuscode,response1.statusCode());


    }

    @Then("Dean hesabi dogrulamak icin Status code un {int} oldugu dogrulanir Esi")
    public void deanHesabiDogrulamakIcinStatusCodeUnOlduguDogrulanir(int statuscode) {
        assertEquals(statuscode,response2.statusCode());
    }


    @Then("Dean delete icin URL duzenlenir Esi")
    public void deanDeleteIcinURLDuzenlenirEsi() {
        //https://managementonschools.com/app/dean/delete/2190
        spec.pathParams("first","dean","second","delete","third",userIdEsi);
    }

    @When("Dean delete icin Request gonderilir ve Response alinir Esi")
    public void deanDeleteIcinRequestGonderilirVeResponseAlinirEsi() {
        responseDelEsi=given(spec).when().delete("{first}/{second}/{third}");

    }

    @Then("Dean delete islemi icin status code un {int} oldugu dogrulanir Esi")
    public void deanDeleteIslemiIcinStatusCodeUnOlduguDogrulanirEsi(int statuscode) {
        assertEquals(statuscode,responseDelEsi.statusCode());

    }

    @And("Guncellenmis olan Dean hesap bilgisinin ID nosu alinir Esi")
    public void guncellenmisOlanDeanHesapBilgisininIDNosuAlinirEsi() {

            spec.pathParams("first","dean","second","getAll");
            response2=given(spec).when().get("{first}/{second}");
            System.out.println(userNameEsi);

            JsonPath json =response2.jsonPath();
            List<Integer> userIdListEsi= json.getList("findAll{it.username=='"+userNameEsii+"'}.userId");
            userIdEsi=userIdListEsi.get(0);
            System.out.println(userIdEsi);



    }
}
