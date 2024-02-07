package stepDefinitions.DataBaseStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.ApiStepDefinitions.US16_StepDefinition.expectedData;

public class US16_StepDef {

    Connection connection ;
    Statement statement ;
    ResultSet resultSet ;

    static String email;

    @Given("Find messages By ID US16")
    public void find_messages_by_id_us16() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM contact_message WHERE id = 1");
        resultSet.next();

        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");

        email="mustafa@gmail.com";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(" select * from contact_message where email='mustafa@gmail.com' order by id desc");
        resultSet.next();



    }
    @Then("Validate data US16")
    public void validate_data_us16() throws SQLException {

        assertEquals("mustafa@gmail.com",resultSet.getString("email"));
        assertEquals("2023-04-28",resultSet.getString("date"));
        assertEquals("ders basi",resultSet.getString("message"));
        assertEquals("ders",resultSet.getString("subject"));

        assertEquals(expectedData.getEmail(),resultSet.getString("email"));
        assertEquals(expectedData.getMessage(),resultSet.getString("message"));
        assertEquals(expectedData.getName(),resultSet.getString("name"));
        assertEquals(expectedData.getSubject(),resultSet.getString("subject"));





    }

}
