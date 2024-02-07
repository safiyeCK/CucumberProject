package stepDefinitions.DataBaseStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ReusableMethods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static stepDefinitions.ApiStepDefinitions.US05_StepDefination.payload1;
import static stepDefinitions.ApiStepDefinitions.US05_StepDefination.userIdEsi;
import static stepDefinitions.UiStepDefinitions.US04_StepDef.*;
import static stepDefinitions.UiStepDefinitions.US04_StepDef.userNameEsi;

public class US05_StepDef {
    ResultSet resultSet;
    List<Object> names;
    List<Object> gender;
    List<Object> phonenumbers;
    List<Object> ssnNumbers;
    List<Object> usernames;
    List<Object> userIds;

    @When("Deanlerin Name, Gender, Phone Number, SSN, User Name bilgilerini gormek icin query gonderir")
    public void deanlerinNameGenderPhoneNumberSSNUserNameBilgileriniGormekIcinQuerGonderir() throws SQLException {
        names=  ReusableMethods.getColumnList("dean","name");
        gender= ReusableMethods.getColumnList("dean","gender");
        phonenumbers= ReusableMethods.getColumnList("dean","phone_number");
        ssnNumbers= ReusableMethods.getColumnList("dean","ssn");
        usernames= ReusableMethods.getColumnList("dean","username");

        //     List<Object> names = new ArrayList<>();
        //     String query = "select name from dean " ;
//
        //   resultSet = executeQuery(query);
        //     while (resultSet.next()) {
        //        names.add(resultSet.getObject("name"));
        //     }
        //    assertTrue(names.contains(nameEsi));
    }

    @Then("Olusturulan dean bilgisinin Name, Gender, Phone Number, SSN, User Name bilgilerinin kayitli oldugu dogrulanir")
    public void olusturulanDeanBilgisininNameGenderPhoneNumberSSNUserNameBilgilerininKayitliOlduguDogrulanir() {
        assertTrue(names.contains(nameEsi));
        assertTrue(gender.contains(0));
        assertTrue(phonenumbers.contains(phoneNummerEsi));
        assertTrue(ssnNumbers.contains(ssnEsi));
        assertTrue(usernames.contains(userNameEsi));
    }

    @And("Connection kesilir")
    public void connectionKesilir() throws SQLException {
        ReusableMethods.closeConnection();
    }

    @When("userid si vererek bir query olusturulur")
    public void useridSiVererekBirQueryOlusturulur() throws SQLException {
        userIds= ReusableMethods.getColumnList("dean","id");
    }

    @And("kayitli kullanici bilgisinin olmadigi dogrulanmali")
    public void kayitliKullaniciBilgisininOlmadigiDogrulanmali() {
        assertFalse(userIds.contains(userIdEsi));
    }

    @And("kullanicinin guncellenmis bilgilerinin oldugu dogrulanir")
    public void kullanicininGuncellenmisBilgilerininOlduguDogrulanir() throws SQLException {
        resultSet.next();
        assertEquals(payload1.getBirthDay(), resultSet.getString("birth_day"));
        assertEquals(payload1.getBirthPlace(), resultSet.getString("birth_place"));
        assertEquals(1, resultSet.getInt("gender"));
        assertEquals(payload1.getName(), resultSet.getString("name"));
        assertEquals(payload1.getSsn(), resultSet.getString("ssn"));
        assertEquals(payload1.getPhoneNumber(), resultSet.getString("phone_number"));
        assertEquals(payload1.getSurname(), resultSet.getString("surname"));
        assertEquals(payload1.getUsername(), resultSet.getString("username"));

    }

    @And("userid si vererek bir Result set olusturulur")
    public void useridSiVererekBirResultSetOlusturulur() {
        resultSet=ReusableMethods.executeQuery("select * from dean where id='"+userIdEsi+"'");

    }
}
