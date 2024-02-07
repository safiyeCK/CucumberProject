package stepDefinitions.DataBaseStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.ApiStepDefinitions.US17_US18_StepDefinitions.payload;
import static utilities.ReusableMethods.statement;


public class US17_US18_StepDefinitions {



    Connection connection;
    ResultSet resultSet;
    Statement statement;


    @Given("Database baglantisi kurulur_I")
    public void databaseBaglantisiKurulur_I() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management",
       "select_user", "43w5ijfso");
    }

    @When("Student Info bilgisini almak icin query gonderilir_I")
    public void studentInfoBilgisiniAlmakIcinQueryGonderilir_I() throws SQLException {
        statement=connection.createStatement();
        resultSet=statement.executeQuery("select * from student_info where id=4812");
    }
    @Then("Kayitli student info bilgileri dogrulanir_I")
    public void kayitliStudentInfoBilgileriDogrulanir_I() throws SQLException {
        resultSet.next();
        assertEquals(payload.getStudentId(),resultSet.getString("student_id"));
        assertEquals(payload.getAbsentee(),resultSet.getString("absentee"));
        assertEquals(payload.getInfoNote(),resultSet.getString("info_note"));
        assertEquals(payload.getFinalExam(),resultSet.getString("final_exam"));
        assertEquals(payload.getMidtermExam(),resultSet.getString("midterm_exam"));
        assertEquals(payload.getLessonId(),resultSet.getString("lesson_id"));
        assertEquals(payload.getEducationTermId(),resultSet.getString("education_term_id"));
    }

    @And("Baglanti kesilir_I")
    public void baglantiKesilir_I() throws SQLException {
        connection.close();
        statement.close();
    }
}
