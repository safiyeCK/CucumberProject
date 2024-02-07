package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import pojos.adminManagement.US23_ViceDean.ObjectPojo;
import pojos.adminManagement.US23_ViceDean.PostPojo;
import pojos.adminManagement.US23_ViceDean.ResponsePojo;
import utilities.ConfigReader;

import java.util.List;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US23_StepDef {
    PostPojo payload;
    Response response;
    ResponsePojo actualdata;
    int userIdKI23;
   public static ObjectPojo objectPojo;
   public static ResponsePojo responsePojo;
    @Given("{string} yetkisi ile giris yapildiKI")
    public void yetkisiIleGirisYapilirKI(String authority) {
        setup(ConfigReader.getProperty("adminKenan"),ConfigReader.getProperty("kenanPas"));
        System.out.println(authority+  " ile giris yapildi");
    }
    @And("Vice Dean hesabi olusturmak icin URL duzenlendiKI")
    public void viceDeanHesabiOlusturmakIcinURLDuzenlendiKI() {
        //https://managementonschools.com/app/vicedean/save
        spec.pathParams("first","vicedean","second","save");
    }
    @And("Vice Dean hesabi olusturmak icin payload duzenlendiKI")
    public void viceDeanHesabiOlusturmakIcinPayloadDuzenlendiKI() {
        payload=new PostPojo( "1996-02-05","Baku", "MALE", "Ahmet","Aa349712",
                "524-965-2027",
                "545-85-2027", "Agayev","AhmetGan");

        /*
 {
  "birthDay": "1996-02-05",
  "birthPlace": "Baku",
  "gender": "MALE",
  "name": "Ahmet",
  "password": "Aa349712",
  "phoneNumber": "524-965-2023",
  "ssn": "545-85-2023",
  "surname": "Agayev",
  "username": "AhmetGanja"
}
         */

    }

    @When("Vice Dean hesabi olusturmak icin POST Request gonderildi ve Reponse alindiKI")
    public void viceDeanHesabiOlusturmakIcinPOSTRequestGonderildiVeReponseAlindiKI() {
       response= given(spec).body(payload).when().post("{first}/{second}");
       response.prettyPrint();
       actualdata= response.as(ResponsePojo.class);
    }

    @And("Vice Dean Save icin gelen Response body dogrulandiKI")
    public void viceDeanSaveIcinGelenResponseBodyDogrulandiKI() {
        assertEquals(payload.getBirthDay(),actualdata.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(),actualdata.getObject().getBirthPlace());
        assertEquals(payload.getSurname(),actualdata.getObject().getSurname());
        assertEquals(payload.getUsername(),actualdata.getObject().getUsername());
        assertEquals(payload.getName(),actualdata.getObject().getName());
        assertEquals(payload.getSsn(),actualdata.getObject().getSsn());
        assertEquals(payload.getPhoneNumber(),actualdata.getObject().getPhoneNumber());
        assertEquals(payload.getGender(),actualdata.getObject().getGender());

    }
    @Then("Status code un {int} oldugu dogrulandiKI")
    public void statusCodeUnOlduguDogrulandiKI(int statuscode) {
        assertEquals(statuscode,response.statusCode());
    }

    @Given("Kayitli Vice Dean hesap bilgisinin ID nosu alindiKI")
    public void kayitliOlanViceDeanHesapBilgisininIDNosuAlinirKI() {
        setup(ConfigReader.getProperty("adminKenan"),ConfigReader.getProperty("kenanPas"));
        //https://managementonschools.com/app/vicedean/getAll
        spec.pathParams("first","vicedean","second","getAll");
        response= given(spec).when().get("{first}/{second}");
        JsonPath jsonPath=response.jsonPath();
        List<Integer> userList=jsonPath.getList("findAll{it.username=='AhmetGan'}.userId");
        userIdKI23= userList.get(0);
       // System.out.println("KKKKKKAKka "+ userIdKI);
    }

    @And("Vice Dean GetManagerById icin URL duzenlendiKI")
    public void viceDeanGetManagerByIdIcinURLDuzenlendiKI() {
        //https://managementonschools.com/app/vicedean/getViceDeanById/1
        spec.pathParams("first","vicedean","second","getViceDeanById","third",userIdKI23);
    }

    @And("Vice Dean GetManagerById icin beklenen veriler duzenlendiKI")
    public void viceDeanGetManagerByIdIcinBeklenenVerilerDuzenlendiKI() {
      objectPojo=new ObjectPojo(userIdKI23,"AhmetGan","Ahmet", "Agayev","1996-02-05",
                "545-85-2027", "Baku","524-965-2027","MALE" );
      responsePojo=new ResponsePojo(objectPojo,"Vice dean successfully found","OK");

                /*
                {
    "object": {
        "userId": 2151,
        "username": "AhmetGanja",
        "name": "Ahmet",
        "surname": "Agayev",
        "birthDay": "1996-02-05",
        "ssn": "545-85-2023",
        "birthPlace": "Baku",
        "phoneNumber": "524-965-2023",
        "gender": "MALE"
    },
    "message": "Vice dean Saved",
    "httpStatus": "CREATED"
}
                 */
    }

    @When("Vice Dean GetManagerById icin GET Request gonderilir ve Response alindiKI")
    public void viceDeanGetManagerByIdIcinGETRequestGonderilirVeResponseAlindiKI() {
        response= given(spec).when().get("{first}/{second}/{third}");
        // response.prettyPrint();
        actualdata=response.as(ResponsePojo.class);
    }

    @And("Vice Dean GetManagerById icin gelen Response body dogrulandiKI")
    public void viceDeanGetManagerByIdIcinGelenResponseBodyDogrulandiKI() {
        assertEquals(objectPojo.getUserId(),actualdata.getObject().getUserId());
        assertEquals(objectPojo.getUsername(),actualdata.getObject().getUsername());
        assertEquals(objectPojo.getName(),actualdata.getObject().getName());
        assertEquals(objectPojo.getSurname(),actualdata.getObject().getSurname());
        assertEquals(objectPojo.getBirthDay(),actualdata.getObject().getBirthDay());
        assertEquals(objectPojo.getBirthPlace(),actualdata.getObject().getBirthPlace());
        assertEquals(objectPojo.getPhoneNumber(),actualdata.getObject().getPhoneNumber());
        assertEquals(objectPojo.getSsn(),actualdata.getObject().getSsn());
        assertEquals(objectPojo.getGender(),actualdata.getObject().getGender());
        assertEquals(responsePojo.getMessage(),actualdata.getMessage());
        assertEquals(responsePojo.getHttpStatus(),actualdata.getHttpStatus());
    }

    @Then("Vice Dean silme icin URL duzenlenirKI")
    public void viceDeanSilmeIcinURLDuzenlenirKI() {
        //https://managementonschools.com/app/vicedean/delete/1
        spec.pathParams("first","vicedean","second","delete","third",userIdKI23);

    }

    @When("Vice Dean Delete icin Request gonderilir ve Response alindiKI")
    public void viceDeanDeleteIcinRequestGonderilirVeResponseAlindiKI() {
        response=given(spec).when().delete("{first}/{second}/{third}");
    }

    @Then("Vice Dean Delete icin status code un {int} oldugu dogrulanirKI")
    public void viceDeanDeleteIcinStatusCodeUnOlduguDogrulanirKI(int statuscode) {
        assertEquals(statuscode,response.statusCode());
    }


}
