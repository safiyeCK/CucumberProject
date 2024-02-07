package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.meetManagement.MeetPojo;
import pojos.meetManagement.MeetResponse;
import utilities.ConfigReader;

import java.util.ArrayList;
import java.util.List;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US19_US20_StepDefinition {

    public static MeetPojo expectedData;
    public static Response response;
    public static MeetResponse actualData;
    public static String expectedDelete;
    public static int meetId;
    public static int idMeet;
    @Given("Meet olusturmak icin URL duzenlenirEp")
    public void meetOlusturmakIcinURLDuzenlenirEp() {
        setup(ConfigReader.getProperty("userNameTeacher_Ep"),ConfigReader.getProperty("password_Ep"));
        spec.pathParams("first","teachers","second","save");
    }

    @And("Meet olusturmak icin payload duzenlenirEp")
    public void meetOlusturmakIcinPayloadDuzenlenirEp() {
        List<Integer> studentList = new ArrayList<>();
        studentList.add(22);

        expectedData = new MeetPojo("2023-12-18", "Kesin Gel", "13:00", "14:30", studentList);

        System.out.println("expectedData = " + expectedData);
    }

    @When("Meet olusturmak icin Post Request gonderilirEp")
    public void meetOlusturmakIcinPostRequestGonderilirEp() {
        response = given(spec).body(expectedData).when().post("{first}/{second}");
        response.prettyPrint();

        actualData = response.as(MeetResponse.class);
        System.out.println("actualData = " + actualData);
        idMeet = actualData.getObject().getId();
        System.out.println(idMeet);
    }

    @Then("Status kodun {int} oldugu dogrulanirEp")
    public void statusKodunOlduguDogrulanirEp(int statusCode) {
        assertEquals(response.statusCode(),statusCode);
    }

    @Then("Meet olusturma icin gelen Response body dogrulanirEp")
    public void meetOlusturmaIcinGelenResponseBodyDogrulanirEp() {
        Assert.assertEquals(expectedData.getDate(), actualData.getObject().getDate());
        Assert.assertEquals(expectedData.getDescription(), actualData.getObject().getDescription());
        Assert.assertTrue(actualData.getObject().getStartTime().contains("13:00"));
        Assert.assertTrue(actualData.getObject().getStopTime().contains("14:30"));
        Assert.assertEquals(expectedData.getStudentIds().get(0), actualData.getObject().getStudents().get(0).getId());
    }

    @Given("Kayitli meet icin id numarasi alinir")
    public void kayitliMeetIcinIdNumarasiAlinir() {
        setup("userNameTeacher_Ep", "password_Ep");
        spec.pathParams("first", "meet", "second", "update", "third", idMeet);
    }

    @And("Duzenlenecek Meet bilgileri hazirlanir")
    public void duzenlenecekMeetBilgileriHazirlanir() {
        List<Integer> studentList = new ArrayList<>();
        studentList.add(22);
        expectedData = new MeetPojo("2023-10-11", "Muhakkak Gel", "14:30", "15:00", studentList);
        System.out.println("expectedData = " + expectedData);
    }

    @When("Kayitli meet id ile guncellenir")
    public void kayitliMeetIdIleGuncellenir() {
        response = given(spec).body(expectedData).when().put("{first}/{second}/{third}");
        response.prettyPrint();

        actualData = response.as(MeetResponse.class);
        System.out.println("actualData = " + actualData);
    }

    @Then("Meet bilgileri dogrula")
    public void meetBilgileriDogrula() {
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(expectedData.getDate(), actualData.getObject().getDate());
        Assert.assertEquals(expectedData.getDescription(), actualData.getObject().getDescription());
        Assert.assertTrue(actualData.getObject().getStartTime().contains("14:30"));
        Assert.assertTrue(actualData.getObject().getStopTime().contains("15:00"));
        Assert.assertEquals(expectedData.getStudentIds().get(0), actualData.getObject().getStudents().get(0).getId());
    }

    @Given("Meet silme islemi icin Delete hazirligi yapilir")
    public void meetSilmeIslemiIcinDeleteHazirligiYapilir() {
        setup("userNameTeacher_Ep", "password_Ep");
        spec.pathParams("first", "meet", "second", "delete", "third",idMeet);
    }

    @And("Kayitli meet id ile siler")
    public void kayitliMeetIdIleSiler() {
        expectedDelete = "Meet deleted successfully";
        response = given(spec).when().delete("{first}/{second}/{third}");
    }

    @Then("Meet'in silindigini dogrula")
    public void meetInSilindiginiDogrula() {
        assertEquals(200, response.statusCode());
        assertEquals(expectedDelete, response.jsonPath().getString("message"));
    }
}
