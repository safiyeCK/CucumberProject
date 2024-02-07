package stepDefinitions.DataBaseStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.*;

import static stepDefinitions.ApiStepDefinitions.US13_ApiStepDefinition.object;

public class US13_DBStepDefinition {
    Connection connection;
    ResultSet resultSet;
    Statement statement;
    @Given("Database baglantisi kurulurSA")
    public void databaseBaglantisiKurulurSA() throws SQLException {
        connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }

    @When("Kayitli Teacher bilgisini almak icin Query gonderilirSA")
    public void kayitliTeacherBilgisiniAlmakIcinQueryGonderilirSA() throws SQLException {
        statement=connection.createStatement();
        resultSet=statement.executeQuery("select * from teacher where username='AmanNil'");
    }

    @Then("Kayitli Teacher bilgisi dogrulanirSA")
    public void kayitliTeacherBilgisiDogrulanirSA() throws SQLException {
        resultSet.next();
        Assert.assertEquals(object.getBirthDay(),resultSet.getString("birth_day"));
        Assert.assertEquals(object.getBirthPlace(),resultSet.getString("birth_place"));
        Assert.assertEquals(1,resultSet.getInt("gender"));
        Assert.assertEquals(object.getName(),resultSet.getString("name"));
        Assert.assertEquals(object.getPhoneNumber(),resultSet.getString("phone_number"));
        Assert.assertEquals(object.getSsn(),resultSet.getString("ssn"));
        Assert.assertEquals(object.getSurname(),resultSet.getString("surname"));
        Assert.assertEquals(object.getUsername(),resultSet.getString("username"));
        Assert.assertEquals(object.getEmail(),resultSet.getString("email"));

    }

    @And("Baglanti kesilirSA")
    public void baglantiKesilirSA() throws SQLException {
        statement.close();
        connection.close();
    }
}
