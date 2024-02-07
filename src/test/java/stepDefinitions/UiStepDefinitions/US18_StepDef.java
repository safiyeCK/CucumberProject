package stepDefinitions.UiStepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import static org.junit.Assert.*;

public class US18_StepDef {


    TeacherPage tPage = new TeacherPage();
    Actions actions = new Actions(Driver.getDriver());

    @And("kullanici Choose Lesson'dan ders secer_IO")
    public void kullaniciChooseLessonDanDersSecer_IO() {
        ReusableMethods.ddmIndex(tPage.chooseLessonDDM_IO,1);
        ReusableMethods.bekle(2);
    }

    @And("kullanici Choose Student'den ogrenci secer_IO")
    public void kullaniciChooseStudentDenOgrenciSecer_IO() {
        ReusableMethods.ddmIndex(tPage.chooseStudentDDM_IO, 25);
        ReusableMethods.bekle(2);
    }

    @And("kullanici Choose Education Term'den donem secer_IO")
    public void kullaniciChooseEducationTermDenDonemSecer_IO() {
        ReusableMethods.ddmIndex(tPage.chooseEducationTermDDM_IO, 1);
        ReusableMethods.bekle(2);
    }

    @And("kullanici Absentee kutusuna devamsizlik girer_IO")
    public void kullaniciAbsenteeKutusunaDevamsizlikGirer_IO() {
        tPage.absenteeKutusu_IO.sendKeys(ConfigReader.getProperty("absentee_IO"));
        ReusableMethods.bekle(2);
    }

    @And("kullanici Submit butonuna tiklar ve ogrenci bilgilerinin Student Info List'e eklendigini dogrular_IO")
    public void kullaniciSubmitButonunaTiklarVeOgrenciBilgilerininStudentInfoListEEklendiginiDogrular_IO() {

            tPage.submitButonu_IO.click();
            ReusableMethods.visibleWait(tPage.studentInfoSavedSuccessfullyYazisi_IO, 3);
            assertTrue(tPage.studentInfoSavedSuccessfullyYazisi_IO.isDisplayed());

    }
    @And("kulanici Edit butonuna tiklar_IO")
    public void kulaniciEditButonunaTiklar_IO() {
        ReusableMethods.click(tPage.editButonuInfoList_IO);
        ReusableMethods.bekle(2);
    }
    @And("kullanici Acilan pencerede Absentee kutusundan devamsizligi gunceller_IO")
    public void kullaniciAcilanPenceredeAbsenteeKutusundanDevamsizligiGunceller_IO() {
        ReusableMethods.jsClear(tPage.absenteeKutusuUpdate_IO);
        tPage.absenteeKutusuUpdate_IO.sendKeys(ConfigReader.getProperty("absentee1_IO"));
        ReusableMethods.bekle(2);
    }

    @And("kullanici Midterm Exam kutusundan notu gunceller_IO")
    public void kullaniciMidtermExamKutusundanNotuGunceller_IO() {
        ReusableMethods.click(tPage.midtermExamKutusuUpdate_IO);
        actions.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE).perform();
        tPage.midtermExamKutusuUpdate_IO.sendKeys(ConfigReader.getProperty("midtermNotu1_IO"));
        ReusableMethods.bekle(2);
    }
    @And("kullanici Final Exam kutusundan notu gunceller_IO")
    public void kullaniciFinalExamKutusundanNotuGunceller_IO() {
        ReusableMethods.click(tPage.finalExamKutusuUpdate_IO);
        ReusableMethods.jsClear(tPage.finalExamKutusuUpdate_IO);
        tPage.finalExamKutusuUpdate_IO.sendKeys(ConfigReader.getProperty("finalNotu1_IO"));
        ReusableMethods.bekle(2);
    }
    @And("kullanici Info Note kutusundan Bilgi notunu gunceller_IO")
    public void kullaniciInfoNoteKutusundanBilgiNotunuGunceller_IO() {
        ReusableMethods.click(tPage.infoNoteKutusuUpdate_IO);
        ReusableMethods.jsClear(tPage.infoNoteKutusuUpdate_IO);
        tPage.infoNoteKutusuUpdate_IO.sendKeys(ConfigReader.getProperty("bilgiNotu1_IO"));
        ReusableMethods.bekle(2);
    }

    @And("kullanici Submit butonuna tiklar_IO")
    public void kullaniciSubmitButonunaTiklar_IO() {
        tPage.submitButonuUpdate_IO.click();
        ReusableMethods.bekle(2);
    }

    @And("kullanici Devam Durumu, Midterm Exam Notu, Final Exam Notu ve Bilgi notunu gunceller ve guncellendiklerini dogrular_IO")
    public void kullaniciDevamDurumuMidtermExamNotuFinalExamNotuVeBilgiNotunuGuncellerVeGuncellendikleriniDogrular_IO() {
        ReusableMethods.visibleWait(tPage.studentInfoUpdatedSuccesfullyYazisi_IO, 3);
        assertTrue(tPage.studentInfoUpdatedSuccesfullyYazisi_IO.isDisplayed());
    }
    @And("kullanici Delete simgesine tiklar Ogrenci bilgilerinin silindigini dogrular_IO")
    public void kullaniciDeleteSimgesineTiklarOgrenciBilgilerininSilindiginiDogrular_IO() {
        Driver.getDriver().navigate().refresh();
        tPage.deleteButonuInfoList_IO.click();
        ReusableMethods.visibleWait(tPage.studentInfoDeletedSuccessfullyYazisi_IO,3);
        assertTrue(tPage.studentInfoDeletedSuccessfullyYazisi_IO.isDisplayed());
    }

    @And("kullanici Delete simgesine tiklar")
    public void kullaniciDeleteSimgesineTiklar() {
       // tPage.deleteButonuInfoList_IO.click();

    }
}
