package stepDefinitions.DataBaseStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ReusableMethods;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.ApiStepDefinitions.US05_StepDefination.object;
import static stepDefinitions.UiStepDefinitions.US04_StepDef.userNameEsi;
import static utilities.ReusableMethods.resultSet;

public class US04_StepDef {

    @Given("Database baglantisi kurulur")
    public void databaseBaglantisiKurulur() throws SQLException {
        ReusableMethods.connectToDatabase();
        //   connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");

    }

    @When("Kayitli Dean bilgisini almak icin Query gonderilir")
    public void kayitliDeanBilgisiniAlmakIcinQueryGonderilir() throws SQLException {
        //   statement = connection.createStatement();
        ReusableMethods.createStatement();

        //  resultSet = statement.executeQuery("select * from dean where username='"+userNameEsi+"'");
        ReusableMethods.executeQuery("select * from dean where username='"+userNameEsi+"'");

    }

    @Then("Kayitli Dean bilgisi dogrulanir")
    public void kayitliDeanBilgisiDogrulanir() throws SQLException {
        resultSet.next();
        assertEquals(object.getBirthDay(), resultSet.getString("birth_day"));
        assertEquals(object.getBirthPlace(), resultSet.getString("birth_place"));
        assertEquals(0, resultSet.getInt("gender"));
        assertEquals(object.getName(), resultSet.getString("name"));
        assertEquals(object.getSsn(), resultSet.getString("ssn"));
        assertEquals(object.getPhoneNumber(), resultSet.getString("phone_number"));
        assertEquals(object.getSurname(), resultSet.getString("surname"));
        assertEquals(object.getUsername(), resultSet.getString("username"));
    }


}
