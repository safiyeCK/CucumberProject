package stepDefinitions.DataBaseStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.ApiStepDefinitions.US15_ApiStepDefinitions.payload;

public class US15_StepDef {
    Statement statement;
    ResultSet resultSet;
    Connection connection;
    @Given("Database baglantisi kurulur_DB")
    public void databaseBaglantisiKurulur_DB() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
        
    }

    @When("Kayitli Student bilgisini almak icin Query gonderilir_DB")
    public void kayitliStudentBilgisiniAlmakIcinQueryGonderilir_DB() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from student where username ='durdukaya'");
    }

    @Then("Kayitli Student bilgisi dogrulanir_DB")
    public void kayitliStudentBilgisiDogrulanir_DB() throws SQLException {
        resultSet.next();
        assertEquals(payload.getBirthDay(), resultSet.getString("birth_day"));
        assertEquals( payload.getBirthPlace(), resultSet.getString("birth_place"));
        assertEquals( 1, resultSet.getInt("gender"));
        assertEquals( payload.getName(), resultSet.getString("name"));
        assertEquals(payload.getPassword() , resultSet.getString("password"));
        assertEquals( payload.getPhoneNumber(), resultSet.getString("phone_number"));
        assertEquals( payload.getSsn(), resultSet.getString("ssn"));
        assertEquals(payload.getSurname() , resultSet.getString("surname"));
        assertEquals( payload.getUsername(), resultSet.getString("username"));
        assertEquals(payload.getEmail() , resultSet.getString("email"));
        assertEquals( payload.getFatherName(), resultSet.getString("father_name"));
        assertEquals(payload.getMotherName() , resultSet.getString("mother_name"));
        assertEquals(payload.getAdvisorTeacherId() , resultSet.getInt("advisor_teacher_id"));
    }

    @And("Baglanti kesilir_DB")
    public void baglantiKesilir_DB() throws SQLException {
        statement.close();
        connection.close();
    }
}
