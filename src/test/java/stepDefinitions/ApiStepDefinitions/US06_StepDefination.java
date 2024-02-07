package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.viceDeanManagement.US06_ViceDean.ObjectPojo;
import pojos.viceDeanManagement.US06_ViceDean.PostPojo;
import pojos.viceDeanManagement.US06_ViceDean.ResponsePojo;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US06_StepDefination {

    Response response;
    Response responseput;

    ResponsePojo actualData;
    int userIdKI;
    PostPojo payload;

    public static ObjectPojo objectPojo;
    public static ResponsePojo expectedData;
    PostPojo payload1;



    @Given("{string} yetkisi ile giris yapilirKI")
    public void yetkisiIleGirisYapildiKI(String authority) {
        setup(ConfigReader.getProperty("deanKenan"),ConfigReader.getProperty("kenanPas"));
        System.out.println(authority+  " ile giris yapildi");
    }

    @And("Vice Dean hesabi olusturmak icin URL duzenlenirKI")
    public void viceDeanHesabiOlusturmakIcinURLDuzenlenirKI() {
        //https://managementonschools.com/app/vicedean/save
        spec.pathParams("first","vicedean","second","save");

    }

    @And("Vice Dean hesabi olusturmak icin payload duzenlenirKI")
    public void viceDeanHesabiOlusturmakIcinPayloadDuzenlenirKI() {
       payload=new PostPojo("1996-02-05","Baku",
                "MALE","Ahmet","Aa349712","524-965-2004",
                "545-85-2004","Agayev","AhmetBaka");
        /*
        {
  "birthDay": "1996-02-05",
  "birthPlace": "Baku",
  "gender": "MALE",
  "name": "Ahmet",
  "password": "Aa349712",
  "phoneNumber": "524-965-8570",
  "ssn": "545-85-9670",
  "surname": "Agayev",
  "username": "AhmetBakla"
}
         */
    }

    @When("Vice Dean hesabi olusturmak icin POST Request gonderilir ve Reponse alinirKI")
    public void viceDeanHesabiOlusturmakIcinPOSTRequestGonderilirVeReponseAlinirKI() {
      response=  given(spec).body(payload).when().post("{first}/{second}");
      response.prettyPrint();
      actualData=response.as(ResponsePojo.class);

    }

    @Then("Status code un {int} oldugu dogrulanirKI")
    public void viceDeanHesabiOlusturmakIcinStatusCodeUnOlduguDogrulanirKI(int statuscode) {
        assertEquals(statuscode,response.statusCode());
    }

    @And("Vice Dean Save icin gelen Response body dogrulanirKI")
    public void viceDeanSaveIcinGelenResponseBodyDogrulanirKI() {
        assertEquals(payload.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(payload.getGender(),actualData.getObject().getGender());
        assertEquals(payload.getName(),actualData.getObject().getName());
        assertEquals(payload.getSurname(),actualData.getObject().getSurname());
        assertEquals(payload.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(),actualData.getObject().getSsn());
        assertEquals(payload.getUsername(),actualData.getObject().getUsername());

    }

    @And("Sayfayi kapatirKI")
    public void sayfayiKapatirKI() {
        Driver.closeDriver();
    }

    @Given("Kayitli Vice Dean hesab bilgisinin ID nosu alinirKI")
    public void kayitliViceDeanHesabBilgisininIDNosuAlinirKI() {
        setup(ConfigReader.getProperty("deanKenan"),ConfigReader.getProperty("kenanPas"));
        //https://managementonschools.com/app/vicedean/getAll.
        spec.pathParams("first", "vicedean", "second", "getAll");
        response= given(spec).when().get("{first}/{second}");
        JsonPath json=response.jsonPath();
        List<Integer> userIdList = json.getList("findAll{it.username=='AhmetBaka'}.userId");
        userIdKI=userIdList.get(0);
        System.out.println(userIdKI);
    }

    @And("Vice Dean GetManagerById icin URL duzenlenirKI")
    public void viceDeanGetManagerByIdIcinURLDuzenlenirKI() {
        //https://managementonschools.com/app/vicedean/getViceDeanById/1
        spec.pathParams("first","vicedean","second","getViceDeanById","third",userIdKI);

    }
    @And("Vice Dean GetManagerById icin beklenen veriler duzenlenirKI")
    public void viceDeanGetManagerByIdIcinBeklenenVerilerDuzenlenirKI() {
        objectPojo=new ObjectPojo(userIdKI,"AhmetBaka","Ahmet",
                "Agayev","1996-02-05", "545-85-2004", "Baku",
                "524-965-2004", "MALE");
        expectedData=new ResponsePojo(objectPojo,"Vice dean successfully found", "OK");

     /*
        {
    "object": {
        "userId": 1973,
        "username": "AhmetBaku",
        "name": "Ahmet",
        "surname": "Agayev",
        "birthDay": "1996-02-05",
        "ssn": "545-85-9669",
        "birthPlace": "Baku",
        "phoneNumber": "524-965-8570",
        "gender":

    },
    "message": "Vice dean successfully found",
    "httpStatus": "OK"
}
         */
    }

    @When("Vice Dean GetManagerById icin GET Request gonderilir ve Response alinirKI")
    public void viceDeanGetManagerByIdIcinGETRequestGonderilirVeResponseAlinirKI() {
       response= given(spec).when().get("{first}/{second}/{third}");
      // response.prettyPrint();
       actualData=response.as(ResponsePojo.class);

    }

    @And("Vice Dean GetManagerById icin gelen Response body dogrulanirKI")
    public void viceDeanGetManagerByIdIcinGelenResponseBodyDogrulanirKI() {
        assertEquals(objectPojo.getUserId(),actualData.getObject().getUserId());
        assertEquals(objectPojo.getUsername(),actualData.getObject().getUsername());
        assertEquals(objectPojo.getName(),actualData.getObject().getName());
        assertEquals(objectPojo.getSurname(),actualData.getObject().getSurname());
        assertEquals(objectPojo.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(objectPojo.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(objectPojo.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(objectPojo.getSsn(),actualData.getObject().getSsn());
        assertEquals(objectPojo.getGender(),actualData.getObject().getGender());
        assertEquals(expectedData.getMessage(),actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());
    }

    @And("Vice Dean hesabini guncellemek icin URL duzenlenirKI")
    public void viceDeanHesabiniGuncellemekIcinURLDuzenlenirKI() {
        //https://managementonschools.com/app/vicedean/update/1
        spec.pathParams("first","vicedean","second","update","third",userIdKI);
    }

    @And("Vice Dean hesabi guncellemek icin payload duzenlenirKI")
    public void viceDeanHesabiGuncellemekIcinPayloadDuzenlenirKI() {
       payload=new PostPojo("1996-02-05","Baku","MALE","Ahmet",
                "Aa349712", "524-965-2004","545-85-2004","Agayev",
               "AhmetBaka");
        /*
      {
  "birthDay": "1996-02-05",
  "birthPlace": "Baku",
  "gender": "MALE",
  "name": "Ahmet",
  "password": "Aa349712",
  "phoneNumber": "524-965-8571",
  "ssn": "545-85-9670",
  "surname": "Agayev",
  "username": "AhmetBak"
}
         */
    }
    @And("Vice Dean hesabi guncellemek icin PUT Request gonderilir ve Reponse alinirKI")
    public void viceDeanHesabiGuncellemekIcinPUTRequestGonderilirVeReponseAlinirKI() {
     responseput= given(spec).when().body(payload).put("{first}/{second}/{third}");
       responseput.prettyPrint();
       actualData=responseput.as(ResponsePojo.class);
    }

    @And("Guncelenen response body dogrulanirKI")
    public void guncelenenResponseBodyDogrulanirKI() {
        assertEquals(payload.getUsername(),actualData.getObject().getUsername());
        assertEquals(payload.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(payload.getGender(),actualData.getObject().getGender());
        assertEquals(payload.getName(),actualData.getObject().getName());
        assertEquals(payload.getSurname(),actualData.getObject().getSurname());
        assertEquals(payload.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(),actualData.getObject().getSsn());
    }

    @Then("Vice Dean delete icin URL duzenlenirKI")
    public void viceDeanDeleteIcinURLDuzenlenirKI() {
        //https://managementonschools.com/app/vicedean/delete/1
        spec.pathParams("first","vicedean","second","delete","third",userIdKI);
    }


    @When("Vice Dean delete icin Request gonderilir ve Response alinirKI")
    public void viceDeanDeleteIcinRequestGonderilirVeResponseAlinirKI() {
        response=given(spec).when().delete("{first}/{second}/{third}");

    }
}
