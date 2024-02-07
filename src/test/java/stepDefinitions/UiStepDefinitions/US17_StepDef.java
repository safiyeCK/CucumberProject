package stepDefinitions.UiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.*;


public class US17_StepDef {
    TeacherPage tPage = new TeacherPage();

    @Given("kullanici {string} sayfasina gider_IO")
    public void kullaniciSayfasinaGider_IO(String url) {
        Driver.getDriver().get(url);
    }
    @Then("kullanici login linkine tiklar_IO")
    public void kullaniciLoginLinkineTiklar_IO() {
        tPage.loginLinki_IO.click();
        ReusableMethods.bekle(3);
    }
    @And("kullanici acilan pencerede kayitli Teacher {string} ve {string} bilgilerini girer_IO")
    public void kullaniciAcilanPenceredeKayitliTeacherVeBilgileriniGirer_IO(String username, String password) {
        tPage.userNameKutusu_IO.sendKeys(ConfigReader.getProperty(username),
                Keys.TAB, ConfigReader.getProperty(password));
        ReusableMethods.bekle(2);
    }
    @And("kullanici login butonuna tiklar_IO")
    public void kullaniciLoginButonunaTiklar_IO() {
        tPage.logonButonu_IO.click();
    }
    @And("kullanici Student Info Management sayfasina gecildigini dogrular_IO")
    public void kullaniciStudentInfoManagementSayfasinaGecildiginiDogrular_IO() {
        assertTrue(tPage.studentInfoManagementYazisi_IO.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("kullanici Choose Lesson'dan ders secer ve secildigini dogrular_IO")
    public void kullaniciChooseLessonDanDersSecerVeSecildiginiDogrular_IO() {
        ReusableMethods.ddmIndex(tPage.chooseLessonDDM_IO, 1);
        ReusableMethods.bekle(2);
        assertTrue(tPage.chooseLessonDDM_IO.isDisplayed());
    }

    @And("kullanici Choose Student'den ogrenci secer ve secildigini dogrular_IO")
    public void kullaniciChooseStudentDenOgrenciSecerVeSecildiginiDogrular_IO() {
        ReusableMethods.ddmIndex(tPage.chooseStudentDDM_IO, 17);
        ReusableMethods.bekle(2);
        assertTrue(tPage.chooseStudentDDM_IO.isDisplayed());
    }

    @And("kullanici Choose Education Term'den donem secer ve secildigini dogrular_IO")
    public void kullaniciChooseEducationTermDenDonemSecerVeSecildiginiDogrular_IO() {
        ReusableMethods.ddmIndex(tPage.chooseEducationTermDDM_IO, 1);
        ReusableMethods.bekle(2);
        assertTrue(tPage.chooseEducationTermDDM_IO.isDisplayed());
    }

    @And("kullanici Absentee kutusuna devamsizlik girer ve girildigini dogrular_IO")
    public void kullaniciAbsenteeKutusunaDevamsizlikGirerVeGirildiginiDogrular_IO() {
        tPage.absenteeKutusu_IO.sendKeys(ConfigReader.getProperty("absentee_IO"));
        ReusableMethods.bekle(2);
        assertFalse(tPage.absenteeRequiredUyari_IO.isDisplayed());
    }
    @And("kullanici Midterm Exam kutusuna Midterm notu girer ve girildigini dogrular_IO")
    public void kullaniciMidtermExamKutusunaMidtermNotuGirerVeGirildiginiDogrular_IO() {
        tPage.midtermExamKutusu_IO.sendKeys(ConfigReader.getProperty("midtermNotu_IO"));
        ReusableMethods.bekle(2);
        assertFalse(tPage.midtermRequiredUyari_IO.isDisplayed());
    }
    @And("kullanici Final Exam kutusuna Final notu girer ve girildigini dogrular_IO")
    public void kullaniciFinalExamKutusunaFinalNotuGirerVeGirildiginiDogrular_IO() {
        tPage.finalExamKutusu_IO.sendKeys(ConfigReader.getProperty("finalNotu_IO"));
        ReusableMethods.bekle(2);
        assertFalse(tPage.finalRequiredUyari_IO.isDisplayed());
    }
    @And("kullanici Info Note kutusuna Harf, Rakam ve ozel karakter iceren bilgi notu girer ve girildigini dogrular_IO")
    public void kullaniciInfoNoteKutusunaHarfRakamVeOzelKarakterIcerenBilgiNotuGirerVeGirildiginiDogrular_IO() {
        tPage.infoNoteKutusu_IO.sendKeys(ConfigReader.getProperty("bilgiNotu_IO"));
        assertFalse(tPage.infoNoteRequiredUyari_IO.isDisplayed());
    }

    @And("kullanici Midterm Exam kutusuna Sifirdan kucuk Midterm notu girer_IO")
    public void kullaniciMidtermExamKutusunaSifirdanKucukMidtermNotuGirer_IO() {
        tPage.midtermExamKutusu_IO.sendKeys(ConfigReader.getProperty("midtermNotu2_IO"));
    }

    @And("kullanici Final Exam kutusuna Final notu girer_IO")
    public void kullaniciFinalExamKutusunaFinalNotuGirer_IO() {
        tPage.finalExamKutusu_IO.sendKeys(ConfigReader.getProperty("finalNotu_IO"));
    }

    @And("kullanici Info Note kutusuna Harf, Rakam ve ozel karakter iceren bilgi notu girer_IO")
    public void kullaniciInfoNoteKutusunaHarfRakamVeOzelKarakterIcerenBilgiNotuGirer_IO() {
        tPage.infoNoteKutusu_IO.sendKeys(ConfigReader.getProperty("bilgiNotu_IO"));
    }
    @And("kullanici Midterm Exam kutusuna Sifirdan kucuk not girilemedigini dogrular_IO")
    public void kullaniciMidtermExamKutusunaSifirdanKucukNotGirilemediginiDogrular_IO() {
        tPage.submitButonu_IO.click();
        ReusableMethods.visibleWait(tPage.sifirdanBuyukVeEsitUyariYazisi_IO, 3);
        assertTrue(tPage.sifirdanBuyukVeEsitUyariYazisi_IO.isDisplayed());
    }
    @And("kullanici Midterm Exam kutusuna Midterm notu girer_IO")
    public void kullaniciMidtermExamKutusunaMidtermNotuGirer_IO() {
        tPage.midtermExamKutusu_IO.sendKeys(ConfigReader.getProperty("midtermNotu_IO"));
    }
    @And("kullanici Final Exam kutusuna Yuzden buyuk Final notu girer_IO")
    public void kullaniciFinalExamKutusunaYuzdenBuyukFinalNotuGirer_IO() {
        tPage.finalExamKutusu_IO.sendKeys(ConfigReader.getProperty("finalNotu2_IO"));
    }
    @And("kullanici Info Note kutusuna Harf, Rakam ve ozel karakter iceren bilgi notu girer")
    public void kullaniciInfoNoteKutusunaHarfRakamVeOzelKarakterIcerenBilgiNotuGirer() {
        tPage.infoNoteKutusu_IO.sendKeys(ConfigReader.getProperty("bilgiNotu_IO"));
    }
    @And("kullanici Final Exam kutusuna Yuzden buyuk not girilemedigini dogrular_IO")
    public void kullaniciFinalExamKutusunaYuzdenBuyukNotGirilemediginiDogrular_IO() {
        tPage.submitButonu_IO.click();
        ReusableMethods.visibleWait(tPage.yuzdenKucukVeEsitUyariYazisi_IO, 3);
        assertTrue(tPage.yuzdenKucukVeEsitUyariYazisi_IO.isDisplayed());
    }



}


