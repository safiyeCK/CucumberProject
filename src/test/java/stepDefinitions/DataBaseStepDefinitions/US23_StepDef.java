package stepDefinitions.DataBaseStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.ApiStepDefinitions.US23_StepDef.objectPojo;

public class US23_StepDef {
    Connection connection;
    ResultSet resultSet;
    Statement statement;
    @Given("Database baglantisi kurulduKI")
    public void databaseBaglantisiKurulduKI() throws SQLException {
        connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management",
                "select_user", "43w5ijfso");
    }
    @When("Kayitli Vice Dean almak icni Query gonderildiKI")
    public void kayitliViceDeanAlmakIcniQueryGonderildiKI() throws SQLException {
        statement=connection.createStatement();
        resultSet=statement.executeQuery("select * from vice_dean where username='AhmetGanja'");

    }

    @Then("Kayitli Vice Dean bilgisi dogrulandiKI")
    public void kayitliViceDeanBilgisiDogrulandiKI() throws SQLException {
        resultSet.next();
        assertEquals(objectPojo.getBirthDay(),resultSet.getString("birth_day"));
        assertEquals(objectPojo.getBirthPlace(),resultSet.getString("birth_place"));
        assertEquals(0,resultSet.getInt("gender"));
        assertEquals(objectPojo.getName(),resultSet.getString("name"));
        assertEquals(objectPojo.getSsn(),resultSet.getString("ssn"));
        assertEquals(objectPojo.getPhoneNumber(),resultSet.getString("phone_number"));
        assertEquals(objectPojo.getSurname(),resultSet.getString("surname"));
        assertEquals(objectPojo.getUsername(),resultSet.getString("username"));
    }


    @And("Baglanti kesildiKI")
    public void baglantiKesildiKI() throws SQLException {
        connection.close();
        statement.close();
    }
}
