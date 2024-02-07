package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.deanManagement.DeanPostPojo;
import pojos.deanManagement.ObjectPojo;
import pojos.deanManagement.ResponsePojo;
import utilities.ConfigReader;
import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepDefinitions.UiStepDefinitions.US04_StepDef.*;


public class US04_StepDefinition {

    public DeanPostPojo payload;
    public  Response response;
    public ResponsePojo actualData;


    public static ResponsePojo expectedData;
    ResponsePojo actualData1;
    @Given("{string} yetkisi ile giris yapilir Esi")
    public void yetkisiIleGirisYapilir(String yetki) {
        setup(ConfigReader.getProperty("adminNameEsi"), ConfigReader.getProperty("passwordEsi"));
        System.out.println(yetki+"si ile giris yapildi");
    }

    @And("Dean hesabi olusturmak icin URL duzenlenir Esi")
    public void deanHesabiOlusturmakIcinURLDuzenlenir() {
        //https://managementonschools.com/app/dean/save
        spec.pathParams("first","dean","second","save");

    }

    @And("Dean hesabi olusturmak icin icin payload duzenlenir Esi")
    public void deanHesabiOlusturmakIcinIcinPayloadDuzenlenir() {
        payload =new DeanPostPojo(birthdayEsi,birthPlaceEsi,"MALE",nameEsi,passwordEsi,phoneNummerEsi,ssnEsi,surnameEsi,userNameEsi);
    }

    @When("Dean hesabi olusturmak icin POST Request gonderilir ve Reponse alinir Esi")
    public void deanHesabiOlusturmakIcinPOSTRequestGonderilirVeReponseAlinir() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        actualData=response.as(ResponsePojo.class);
    }

    @And("Dean Save icin gelen Response body dogrulanir Esi")
    public void deanSaveIcinGelenResponseBodyDogrulanir() {
        assertEquals(payload.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(payload.getGender(), actualData.getObject().getGender());
        assertEquals(payload.getName(), actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(), actualData.getObject().getSsn());
        assertEquals(payload.getSurname(), actualData.getObject().getSurname());
        assertEquals(payload.getUsername(), actualData.getObject().getUsername());

    }

    @Then("{string}daki Status code un {int} oldugu dogrulanir Esi")
    public void dakiStatusCodeUnOlduguDogrulanir(Response response, int statusCode) {

            assertEquals(statusCode,response.statusCode());

    }

    @Then("Dean hesabi olusturmak icin Status code un {int} oldugu dogrulanir Esi")
    public void deanHesabiOlusturmakIcinStatusCodeUnOlduguDogrulanir(int statuscode) {
        assertEquals(statuscode,response.statusCode());
    }


/*
    @And("Kayitli olan Dean hesap bilgisinin ID nosu alinir")
    public void kayitliOlanDeanHesapBilgisininIDNosuAlinir() {
        spec.pathParams("first","dean","second","getAll");
        response=given(spec).when().get("{first}/{second}");
        System.out.println(userNameEsi);

        JsonPath json =response.jsonPath();
        List<Integer>userIdListEsi= json.getList("findAll{it.username=='"+userNameEsi+"'}.userId");
        userIdEsi=userIdListEsi.get(0);
        System.out.println(userIdEsi);


    }

    @And("GetManagerById icin URL duzenlenir")
    public void getmanagerbyıdIcinURLDuzenlenir() {
//https://managementonschools.com/app/dean/getManagerById/2290

        spec.pathParams("first","dean","second","getManagerById","third",userIdEsi);

    }

    @When("GetManagerById icin beklenen veriler duzenlenir")
    public void getmanagerbyıdIcinBeklenenVerilerDuzenlenir() {
        System.out.println(userNameEsi);
        object=new ObjectPojo(userIdEsi,userNameEsi,nameEsi,surnameEsi,birthdayEsi,ssnEsi,birthPlaceEsi,phoneNummerEsi,"MALE");
        expectedData=new ResponsePojo(object,"Dean successfully found", "OK");
    }

    @Then("GetManagerById icin GET Request gonderilir ve Response body alinir")
    public void getmanagerbyıdIcinGETRequestGonderilirVeResponseBodyAlinir() {
        response=given(spec).when().get("{first}/{second}/{third}");
        actualData=response.as(ResponsePojo.class);
    }

    @Then("Status code un {int} oldugu dogrulanir")
    public void statusCodeUnOlduguDogrulanir(int statuscode) {
        assertEquals(statuscode,response.statusCode());
    }

    @And("GetManagerById icin gelen Response body dogrulanir")
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

    @And("Dean hesabini guncellemek icin URL duzenlenir")
    public void deanHesabiniGuncellemekIcinURLDuzenlenir() {
        //https://managementonschools.com/app/dean/update/2190
        spec.pathParams("first","dean","second","update","third",userIdEsi);

    }

    @And("Dean hesabi guncellemek icin payload duzenlenir")
    public void deanHesabiGuncellemekIcinPayloadDuzenlenir() {
       payload =new DeanPostPojo(birthdayEsii,birthPlaceEsii,"FEMALE",nameEsii,passwordEsii,phoneNummerEsii,ssnEsii,surnameEsii,userNameEsii);

    }

    @And("Dean hesabi guncellemek icin PUT Request gonderilir ve Reponse alinir")
    public void deanHesabiGuncellemekIcinPOSTRequestGonderilirVeReponseAlinir() {
        response=given(spec).body(payload).when().put("{first}/{second}/{third}");
        response.prettyPrint();
       actualData1=response.as(ResponsePojo.class);

    }

    @And("Guncelenen response body dogrulanir")
    public void guncelenenResponseBodyDogrulanir() {
        assertEquals(payload.getBirthDay(), actualData1.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(), actualData1.getObject().getBirthPlace());
        assertEquals(payload.getGender(), actualData1.getObject().getGender());
        assertEquals(payload.getName(), actualData1.getObject().getName());
        assertEquals(payload.getPhoneNumber(), actualData1.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(), actualData1.getObject().getSsn());
        assertEquals(payload.getSurname(), actualData1.getObject().getSurname());
        assertEquals(payload.getUsername(), actualData1.getObject().getUsername());

    }*/


}
