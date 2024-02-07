package stepDefinitions.DataBaseStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US11_StepDef {
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("Send query to get lessonprogram by id {string} US11")
    public void send_query_to_get_lessonprogram_by_id_US11(String id) throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM lesson_program WHERE id = "+id+";");

        resultSet.next();
    }

    @Then("body should be like: id={string} day={string} start_time={string} stop_time={string} education_term_id={string} US11")
    public void body_should_be_like_id_day_start_time_stop_time_education_term_id_US11(String id, String day, String start_time, String stop_time, String education_term_id) throws SQLException {

        String actDay = resultSet.getString("day");
        String actStarttime = resultSet.getString("start_time");
        String actStoptime = resultSet.getString("stop_time");
        String actEducationtermId = resultSet.getString("education_term_id");

        assertEquals(actDay,day);
        assertEquals(actStarttime,start_time);
        assertEquals(actStoptime,stop_time);
        assertEquals(actEducationtermId,education_term_id);
    }

    @And("Kullanici Updade yapabilmelidir")
    public void kullaniciUpdadeYapabilmelidir() {

    }

    @Then("kullanici User Name boxa tıklar")
    public void kullaniciUserNameBoxaTiklar() {
    }

    @And("kullanici Password boxa tıklar")
    public void kullaniciPasswordBoxaTiklar() {
    }
}
