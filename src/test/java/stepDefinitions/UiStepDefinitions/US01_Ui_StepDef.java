package stepDefinitions.UiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US01_Ui_StepDef {
    //e2e icin yeniden ui kisminin bu bolumunu tekrar olusturdum.Daha once yazdigin steplerde faker class kullanmistim buradaki datalar Api ve DataBase'ye gore yeniden duzenlendi
    RegisterPage registerPage=new RegisterPage();
    @Given("Kullanici web sitesine girer")
    public void kullaniciWebSitesineGirer() {
        Driver.getDriver().get(ConfigReader.getProperty("schoolsUrl"));
    }

    @When("Kullanici register e tiklar")
    public void kullaniciRegisterETiklar() {
        registerPage=new RegisterPage();
        ReusableMethods.click(registerPage.registerButton_SK);

    }

    @And("Name kutusuna {string} girer")
    public void nameKutusunaGirer(String name) {
        ReusableMethods.bekle(1);
        registerPage.nameKutusu_SK.sendKeys(name);
    }

    @And("SurName kutusuna {string} girer")
    public void surnameKutusunaGirer(String surname) {
        ReusableMethods.bekle(1);
        registerPage.surnameKutusu_SK.sendKeys(surname);
    }

    @And("BirthPlace kutusuna {string} girer")
    public void birthplaceKutusunaGirer(String birthplace) {
        ReusableMethods.bekle(1);
        registerPage.birthPlaceKutusu_SK.sendKeys(birthplace);
    }

    @And("Gender secenegini girer")
    public void genderSeceneginiGirer() {
        ReusableMethods.bekle(1);
        ReusableMethods.click(registerPage.getGenderMaleRadioButtun_SK);
    }

    @And("DateOfBirth kutusuna {string} girer")
    public void dateofbirthKutusunaGirer(String dateOfBirth) {
        ReusableMethods.bekle(1);
        registerPage.birthDayKutusu_SK.sendKeys(dateOfBirth);

    }

    @And("PhoneNumber kutusuna {string} girer")
    public void phonenumberKutusunaGirer(String phoneNumber) {
        ReusableMethods.bekle(1);
        registerPage.phoneNumberKutusu_SK.sendKeys(phoneNumber);
    }

    @And("SSN kutusuna SSNno girer")
    public void ssnKutusunaSSNnoGirer() {
        ReusableMethods.bekle(1);
        registerPage.ssnKutusu_SK.sendKeys("125-37-8955");
    }

    @And("UserName kutusuna {string} girer")
    public void usernameKutusunaGirer(String username) {
        ReusableMethods.bekle(1);
        registerPage.userNameKutusu_SK.sendKeys(username);
    }

    @And("Password kutusuna sifre girer")
    public void passwordKutusunaSifreGirer() {
        ReusableMethods.bekle(1);
        registerPage.passwordKutusu_SK.sendKeys("Selim01.");
    }

    @And("Register butonuna tiklar")
    public void registerButonunaTiklar() {
        ReusableMethods.bekle(1);
        ReusableMethods.click(registerPage.registerMaviButton_SK);
    }

    @Then("Kaydin yapildigi dogrulanir")
    public void kaydinYapildigiDogrulanir() {
        ReusableMethods.visibleWait(registerPage.guestUserRegisterYazisi_SK, 5);
        assertTrue(registerPage.guestUserRegisterYazisi_SK.getText().contains("Guest User registered."));
    }

}
