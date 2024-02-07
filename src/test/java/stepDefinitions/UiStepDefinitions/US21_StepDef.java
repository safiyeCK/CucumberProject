package stepDefinitions.UiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.StudentPage;
import pages.TeacherPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US21_StepDef {

    StudentPage studentPage= new StudentPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Given("kullanici acilan pencereden choose lesson secer_Ep")
    public void kullaniciAcilanPenceredenChooseLessonSecer_Ep() {
        studentPage.chooseLessontButtonEp.click();
        ReusableMethods.bekle(2);
        ReusableMethods.scrollHome();
        ReusableMethods.bekle(2);
    }

    @Then("Kullanici ders secme kutucugunun tiklanabilirligini dogrular_Ep")
    public void kullaniciDersSecmeKutucugununTiklanabilirliginiDogrular_Ep() {
        assertTrue(studentPage.checkBoxBilgisiVerifyEp.isEnabled());
    }

    @Then("kullanici ders bilgisinin gorunurlugunu dogrular_Ep")
    public void kullaniciDersBilgisininGorunurlugunuDogrular_Ep() {
        assertTrue(studentPage.lessonBilgisiVerifyEp.isEnabled());

    }

    @Then("kullanici teacher bilgisinin gorunurlugunu dogrular_Ep")
    public void kullaniciTeacherBilgisininGorunurlugunuDogrular_Ep() {
        assertTrue(studentPage.teacherBilgisiVerifyEp.isEnabled());

    }

    @And("kullanici day bilgisinin gorunurlugunu dogrular_Ep")
    public void kullaniciDayBilgisininGorunurlugunuDogrular_Ep() {
        assertTrue(studentPage.dayBilgisiVerifyEp.isEnabled());

    }

    @And("kullanici start time bilgisinin gorunurlugunu dogrular_Ep")
    public void kullaniciStartTimeBilgisininGorunurlugunuDogrular_Ep() {
        assertTrue(studentPage.startTimeBilgisiVerifyEp.isEnabled());

    }

    @And("kullanici stop time bilgisinin gorunurlugunu dogrular_Ep")
    public void kullaniciStopTimeBilgisininGorunurlugunuDogrular_Ep() {
        assertTrue(studentPage.stopTimeBilgisiVerifyEp.isEnabled());
        ReusableMethods.bekle(2);
    }

    @Given("kullanici acilan pencerede Grades and Announcements secer_Ep")
    public void kullaniciAcilanPenceredeGradesAndAnnouncementsSecer_Ep() {
        studentPage.gradesAndAnnouncementEp.click();
        ReusableMethods.bekle(2);
    }

    @Then("kullanici Midterm Exam bilgisinin gorunurlugunu dogrular_Ep")
    public void kullaniciMidtermExamBilgisininGorunurlugunuDogrular_Ep() {
        assertTrue(studentPage.midtermExamEp.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("kullanici Final Exam bilgisinin gorunurlugunu dogrular_Ep")
    public void kullaniciFinalExamBilgisininGorunurlugunuDogrular_Ep() {
        assertTrue(studentPage.finalExamEp.isDisplayed());
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.bekle(2);

    }

    @And("kullanici Student Meet Listin gorunurlugunu dogrular_Ep")
    public void kullaniciStudentMeetListinGorunurlugunuDogrular_Ep() {
        assertTrue(studentPage.meetListVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
        js.executeScript("arguments[0].scrollIntoView();" , studentPage.dateBilgisiStudentVerifyEp);
        assertTrue(studentPage.dateBilgisiStudentVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
        assertTrue(studentPage.startTimeBilgisiStudentVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
        assertTrue(studentPage.stopTimeBilgisiStudentVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
        assertTrue(studentPage.descriptionBilgisiVerify2Ep.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("kullanici eklemek istedigi dersleri secer_Ep")
    public void kullaniciEklemekIstedigiDersleriSecer_Ep() {
        js.executeScript("arguments[0].click();", studentPage.dersBirEp);
        ReusableMethods.bekle(2);
        js.executeScript("arguments[0].click();", studentPage.dersIkiEp);
        ReusableMethods.bekle(2);


    }

    @Then("kullanici submit butonuna tiklar._Ep")
    public void kullaniciSubmitButonunaTiklar_Ep() {
        js.executeScript("arguments[0].click();", studentPage.studentSubmitEp);
        ReusableMethods.bekle(2);
    }

    @And("kullanci derslerin secildigini dogrular")
    public void kullanciDerslerinSecildiginiDogrular() {
        assertTrue(studentPage.mesageVerify1Ep.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("kullanici lesson program list bolumunde dersleri ve dogrular_Ep")
    public void kullaniciLessonProgramListBolumundeDersleriVeDogrular_Ep() {
        assertTrue(studentPage.meetListVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
        js.executeScript("arguments[0].scrollIntoView();" , studentPage.dateBilgisiStudentVerifyEp);
        assertTrue(studentPage.dateBilgisiStudentVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
        assertTrue(studentPage.startTimeBilgisiStudentVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
        assertTrue(studentPage.stopTimeBilgisiStudentVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
        assertTrue(studentPage.descriptionBilgisiVerify2Ep.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("kullanici ayni gun ve ayni saatte olan dersleri secer_Ep")
    public void kullaniciAyniGunVeAyniSaatteOlanDersleriSecer_Ep() {
        js.executeScript("arguments[0].click();", studentPage.ayniGunAyniSaatDersBirEp);
        ReusableMethods.bekle(2);
        js.executeScript("arguments[0].click();", studentPage.ayniGunAyniSaatDersIkiEp);
        ReusableMethods.bekle(2);

    }

    @And("kullanici derslerin secilemedigini dogrular_Ep")
    public void kullaniciDerslerinSecilemediginiDogrular_Ep() {
        assertTrue(studentPage.errorMessageDersVerifyEp.isDisplayed());

    }


}
