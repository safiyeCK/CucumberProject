package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.studentInfoManagement.*;

import java.util.ArrayList;
import java.util.List;

import static baseUrl.BaseUrl.spec;
import static baseUrl.BaseUrl.setup;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US21_StepDefinition {

    public static ChooseLessonPojo expectedData;
    public static int userId;
    //public static ChooseLessonPostResponse actual;
    public static Response response;
    public static StudentInfoResponse actualData;
    public static StudentInfoResponse expectedDataGet;
    public static StudentResponse studentResponse;
    public static ObjectResponse expectedDataMeetGet;
    public static StudentMeetResponse actualDataMeet;

    @Given("Lesson eklemek icin Post request hazirligi yapilir")
    public void lessonEklemekIcinPostRequestHazirligiYapilir() {
        setup("userNameStudent_Ep" , "password_Ep");
        spec.pathParams("first" , "students" , "second" , "chooseLesson");
    }

    @And("Lesson verileri hazirlanir")
    public void lessonVerileriHazirlanir() {
        List<Integer> lessonList = new ArrayList<>();
        lessonList.add(545);
        expectedData = new ChooseLessonPojo(lessonList);
    }

    @When("Kayitli lesson eklemek icin Post request verileri gonderilir")
    public void kayitliLessonEklemekIcinPostRequestVerileriGonderilir() {
        response = given(spec).body(expectedData).when().post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Lesson bilgilerini dogrula")
    public void lessonBilgileriniDogrula() {
        assertEquals(200 , response.statusCode());
    }

    @Given("Student info bilgilerini gorebilmek icin get request hazirligi yapilir")
    public void studentInfoBilgileriniGorebilmekIcinGetRequestHazirligiYapilir() {
        setup("Student15" , "Student15");
        spec.pathParams("first" , "studentInfo" , "second" , "get" , "third" , 1750);

        studentResponse = new StudentResponse("2023-07-27" , "Ali" , "FEMALE" , 1021 , "Ayse" , true , 22 , "Kocaeli" , "258 552 4587" , "Proje" , "Student15" , "student15@gmail.com" , "Student15");

        expectedDataGet = new StudentInfoResponse(68.0 , "BA" , 8 , 13 , 5 , "Lesson15" , studentResponse , 70.0 , true , 90.0 , "Aferin akıllı çocuk" , 1750 , 1);
        System.out.println("expectedData = " + expectedDataGet);
    }

    @When("Kayitli student info list id ile cagrilir")
    public void kayitliStudentInfoListIdIleCagrilir() {
        response = given(spec).when().get("{first}/{second}/{third}");
        response.prettyPrint();

        actualData = response.as(StudentInfoResponse.class);
        System.out.println("actualData = " + actualData);
    }

    @Then("Student info bilgileri dogrulanir")
    public void studentInfoBilgileriDogrulanir() {
        assertEquals(200 , response.statusCode());
        assertEquals(expectedDataGet.getAverage() , actualData.getAverage());
        assertEquals(expectedDataGet.getNote() , actualData.getNote());
        assertEquals(expectedDataGet.getCreditScore() , actualData.getCreditScore());
        assertEquals(expectedDataGet.getLessonId() , actualData.getLessonId());
        assertEquals(expectedDataGet.getAbsentee() , actualData.getAbsentee());
        assertEquals(expectedDataGet.getLessonName() , actualData.getLessonName());
        assertEquals(expectedDataGet.getMidtermExam() , actualData.getMidtermExam());
        assertEquals(expectedDataGet.isCompulsory() , actualData.isCompulsory());
        assertEquals(expectedDataGet.getFinalExam() , actualData.getFinalExam());
        assertEquals(expectedDataGet.getInfoNote() , actualData.getInfoNote());
        assertEquals(expectedDataGet.getId() , actualData.getId());
        assertEquals(expectedDataGet.getEducationTermId() , actualData.getEducationTermId());
    }

    @Given("Meet bilgilerini gorebilmek icin get request hazirligi yapilir")
    public void meetBilgileriniGorebilmekIcinGetRequestHazirligiYapilir() {
        setup("Teacher15" , "Teacher15");
        spec.pathParams("first" , "meet" , "second" , "getMeetById" , "third" , 873);
    }

    @When("Kayitli meet list id ile cagrilir")
    public void kayitliMeetListIdIleCagrilir() {
        expectedDataMeetGet = new ObjectResponse(494 , "Muhakkak Gel" , "2023-10-25" , "20:30:00" , "21:00:00" , 16 , "Teacher15" , "123-12-1236" , null);
        System.out.println("expectedDataMeetGet = " + expectedDataMeetGet);

        response = given(spec).when().get("{first}/{second}/{third}");
        response.prettyPrint();

        actualDataMeet = response.as(StudentMeetResponse.class);
        System.out.println("actualDataMeet = " + actualDataMeet);
    }

    @Then("Meet list bilgileri dogrulanir")
    public void meetListBilgileriDogrulanir() {
        assertEquals(200 , response.statusCode());

        assertEquals(expectedDataMeetGet.getDescription() , actualDataMeet.getObject().getDescription());
        assertEquals(expectedDataMeetGet.getDate() , actualDataMeet.getObject().getDate());
        assertEquals(expectedDataMeetGet.getStartTime() , actualDataMeet.getObject().getStartTime());
        assertEquals(expectedDataMeetGet.getStopTime() , actualDataMeet.getObject().getStopTime());
        assertEquals(expectedDataMeetGet.getAdvisorTeacherId() , actualDataMeet.getObject().getAdvisorTeacherId());
        assertEquals(expectedDataMeetGet.getTeacherName() , actualDataMeet.getObject().getTeacherName());
        assertEquals(expectedDataMeetGet.getTeacherSsn() , actualDataMeet.getObject().getTeacherSsn());
    }
}
