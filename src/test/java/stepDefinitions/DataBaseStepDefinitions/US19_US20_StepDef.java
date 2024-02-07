package stepDefinitions.DataBaseStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US19_US20_StepDef {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @Given("Meet {string} ile meet al")
    public void meetIleMeetAl(String id) throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from meet where id = " + id + " ; ");
        resultSet.next();
    }


    @Then("resultSet bodyi dogrula: id={string},date={string},description={string},start_time ={string}, stop_time={string}, advisor_teacher_id={string}")
    public void resultsetBodyiDogrulaIdDateDescriptionStart_timeStop_timeAdvisor_teacher_id(String id, String date, String description, String start_time, String stop_time, String advisor_teacher_id) throws SQLException {
        String actDate = resultSet.getString("date");
        String actDescription = resultSet.getString("description");
        String actStartTime = resultSet.getString("start_time");
        String actStopTime = resultSet.getString("stop_time");
        String actAdvisorTeacherId = resultSet.getString("advisor_teacher_id");

        assertEquals(date , actDate);
        assertEquals(description , actDescription);
        assertEquals(start_time , actStartTime);
        assertEquals(stop_time , actStopTime);
        assertEquals(actAdvisorTeacherId , actAdvisorTeacherId);
    }
}
