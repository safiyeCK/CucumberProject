package stepDefinitions.UiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US19_StepDef {

    public static String student;
    public static String date;
    public static String startTime;
    public static String stopTime;
    public static String tanim;

    HomePage homePage=new HomePage();
    TeacherPage teacherPage= new TeacherPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici {string} sayfasina properties ile gider_Ep")
    public void kullaniciSayfasinaPropertiesIleGider_Ep(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("kullanici login butonuna tiklar_Ep")
    public void kullaniciLoginButonunaTiklar_Ep() {
        homePage.loginButonu.click();
    }

    @And("kullanici user name ve password ile siteye giris yapar_Ep")
    public void kullaniciUserNameVePasswordIleSiteyeGirisYapar_Ep() {
        homePage.loginUsernameBox.sendKeys(ConfigReader.getProperty("userNameTeacher_Ep"), Keys.TAB,
                ConfigReader.getProperty("password_Ep") , Keys.TAB, Keys.ENTER);

    }
    @And("kullanici user name ve password ile siteye ogrenci olarak giris yapar_Ep")
    public void kullaniciUserNameVePasswordIleSiteyeOgrenciOlarakGirisYapar_Ep() {
        homePage.loginUsernameBox.sendKeys(ConfigReader.getProperty("userNameStudent_Ep"), Keys.TAB,
                ConfigReader.getProperty("password_Ep") , Keys.TAB, Keys.ENTER);
    }

    @Then("kullanici Login oldugunu dogrular_Ep")
    public void kullaniciLoginOldugunuDogrular_Ep() {
        Assert.assertTrue(homePage.menu.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("kullanici menu butonuna tiklar_Ep")
    public void kullaniciMenuButonunaTiklar_Ep() {
        homePage.menu.click();
        ReusableMethods.bekle(2);
    }

    @Then("acilan pencereden meet management secilir_Ep")
    public void acilanPenceredenMeetManagementSecilir_Ep() {
        teacherPage.meetManagementButtonEp.click();
        ReusableMethods.bekle(2);
        ReusableMethods.scrollHome();
        ReusableMethods.bekle(2);
    }

    @Given("Choose Students menusunden ogrenci secilir_Ep")
    public void chooseStudentsMenusundenOgrenciSecilir_Ep() {
        teacherPage.chooseStudentsDdmEp.click();
        ReusableMethods.bekle(2);
        student = "Student Akmer";
        actions.sendKeys(student);
        actions.sendKeys(Keys.ENTER).perform();
    }
    @Given("Choose Students menusu bos birakilir_Ep")
    public void chooseStudentsMenusuBosBirakilir_Ep() {
        teacherPage.chooseStudentsDdmEp.click();
        ReusableMethods.bekle(2);

    }

    @Then("Date of Meet tarihi belirlenir_Ep")
    public void dateOfMeetTarihiBelirlenir_Ep() {
        date ="20/11/2023";
        teacherPage.dateOfMeetBoxEp.sendKeys(date);
    }

    @Then("Meet baslangis saati secilir_Ep")
    public void meetBaslangisSaatiSecilir_Ep() {
        startTime="09:00PM";
        teacherPage.startTimeBoxEp.sendKeys(startTime);
    }

    @Then("Meet bitis saati secilir_Ep")
    public void meetBitisSaatiSecilir_Ep() {
        stopTime="09:30PM";
        teacherPage.stopTimeBoxEp.sendKeys(stopTime);
    }

    @Then("Meetin bitis saati baslangic saatinden once bir veri secilir_Ep")
    public void meetinBitisSaatiBaslangicSaatindenOnceBirVeriSecilir_Ep() {
        stopTime="08:30PM";
        teacherPage.stopTimeBoxEp.sendKeys(stopTime);
    }

    @And("Description kutusu doldurulur_Ep")
    public void descriptionKutusuDoldurulur_Ep() {
        tanim="Important";
        teacherPage.descriptionBoxEp.sendKeys(tanim);
    }
    @And("Description kutusu bos birakilir_Ep")
    public void descriptionKutusuBosBirakilir_Ep() {
        teacherPage.descriptionBoxEp.click();
    }

    @Then("Submit butonuna tiklanir_Ep")
    public void submitButonunaTiklanir_Ep() {
        teacherPage.submitButtonEp.click();
    }

    @Then("Meet olustugu dogrulanir_Ep")
    public void meetOlustuguDogrulanir_Ep() {
        ReusableMethods.visibleWait(teacherPage.meetSavedVerifyEp,2);
        Assert.assertTrue(teacherPage.meetSavedVerifyEp.getText().contains("Meet Saved Successfully"));
    }

    @Then("Meet olusturulamadigi dogrulanir_Ep")
    public void meetOlusturulamadigiDogrulanir_Ep() {
        ReusableMethods.visibleWait(teacherPage.errorTimeEp,2);
        Assert.assertTrue(teacherPage.errorTimeEp.isDisplayed());
    }

    @And("sayfayi kapatir_Ep")
    public void sayfayiKapatir_Ep() {

    }


    @Then("Ogrenci secilmedi icin uyari yazisi alir_Ep")
    public void ogrenciSecilmediIcinUyariYazisiAlir_Ep() {
        ReusableMethods.visibleWait(teacherPage.alertChooseStudentsEp,2);
        Assert.assertTrue(teacherPage.alertChooseStudentsEp.isDisplayed());
    }


    @Then("Description kutusu bos birakildigi icin Required yazisi gorulur_Ep")
    public void descriptionKutusuBosBirakildigiIcinRequiredYazisiGorulur_Ep() {
        Assert.assertTrue(teacherPage.descriptionRequiredVerifyEp.isDisplayed());
    }


}
