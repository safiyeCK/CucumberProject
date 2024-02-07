package stepDefinitions.UiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.LessonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US08_StepDef {
    HomePage homePage = new HomePage();
    LessonPage lessonPage = new LessonPage();

    @Given("kullanici ManagementSchools sayfasina giderso")
    public void kullaniciManagementSchoolsSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("schoolsUrl"));
    }
    @And("kullanici {int} saniye beklerso")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }

    @Given("Login butonuna tiklarso")
    public void loginIleGirisYapilir() {
        homePage.loginButonu.click();

    }
    @Then("Vice Dean olarak giris yaparso")
    public void viceDeanOlarakGirisYaparso() {
        homePage.loginUsernameBox.sendKeys("Karaca", Keys.TAB, "CevizAgaci12+", Keys.TAB, Keys.ENTER);
    }

    @And("Menü alanina tiklarso")
    public void menüAlaninaTiklar() {
        homePage.menu.click();
    }

    @And("Cikan seceneklerden LessonManagement tiklanirso")
    public void cikanSeceneklerdenLessonManagementTiklanir() {

        lessonPage.LessonManagementButonuSo.click();
        ReusableMethods.bekle(2);
    }

    @And("Acilan Sayfada Lesson alanina tiklanirso")
    public void acilanSayfadaLessonAlaninaTiklanir() {
        ReusableMethods.scrollHome();
        ReusableMethods.bekle(5);
        lessonPage.LessonButonuSo.click();
        ReusableMethods.bekle(2);
    }

    @And("Lesson Name kismina ders ismi yazilirso")
    public void lessonNameKisminaDersIsmiYazilir() {

        lessonPage.LessonNameKutusuSo.sendKeys("Theologe");
        ReusableMethods.bekle(2);
    }


    @And("Compulsory kutucugunu isaretlerso")
    public void compulsoryKutucugunuIsaretler() {
        lessonPage.CompulsoryKutusuSo.click();
        ReusableMethods.bekle(2);
    }

    @And("CreditScore alanina ders notu yazilir ve Submit butonuna tiklanirso")
    public void creditscoreAlaninaDersNotuYazilirveSubmitbutonunatiklanir() {
        lessonPage.CreditScoreKutusuSo.sendKeys("10",Keys.TAB,Keys.ENTER);
        ReusableMethods.bekle(2);

    }


    @And("sayfayi kapatirso")
    public void sayfayiKapatirso() {
        Driver.closeDriver();
    }



}