package stepDefinitions.DataBaseStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ReusableMethods;
import java.sql.*;
import static org.junit.Assert.assertEquals;
import static stepDefinitions.ApiStepDefinitions.US01_StepDefinition.payloadGuestUser;

public class US01_StepDef {
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @Given("Database baglantisi kurulur_SK")
    public void databaseBaglantisiKurulur_SK(){

        /*connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management",
                "select_user", "43w5ijfso");*/

        ReusableMethods.connectToDatabase();
    }
    @When("Aday ogrenci bilgisini almak icin Query gonderilir_SK")
    public void adayOgrenciBilgisiniAlmakIcinQueryGonderilir_SK()  {
       /*statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from guest_user where username='  .011Merlin';");*/
        ReusableMethods.createStatement();

        String sqlQuery = "select * from guest_user where username='  .011Merlin';";
        resultSet = ReusableMethods.executeQuery(sqlQuery);

    }
    @Then("Aday ogrenci icin dogrulama yapar_SK")
    public void adayOgrenciIcinDogrulamaYapar_SK() throws SQLException {
        resultSet.next();
        assertEquals("1996-12-12",resultSet.getString("birth_day"));
        assertEquals("Ankara", resultSet.getString("birth_place"));
        assertEquals(0, resultSet.getInt("gender"));
        assertEquals("Selim", resultSet.getString("name"));
        assertEquals("125-37-8955", resultSet.getString("ssn"));
        assertEquals("137-547-8765", resultSet.getString("phone_number"));
        assertEquals("Karahan", resultSet.getString("surname"));
        assertEquals("  .011Merlin", resultSet.getString("username"));

    }

    @And("Baglanti kesilir_SK")
    public void baglantiKesilir_SK() {
       /* statement.close();
        connection.close();*/

        ReusableMethods.closeConnection();

    }



}
