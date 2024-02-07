package stepDefinitions.UiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.TeacherPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US20_StepDef {

    HomePage homePage=new HomePage();
    TeacherPage teacherPage= new TeacherPage();
    Actions actions = new Actions(Driver.getDriver());

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("kullanici sayfada meet list bolumune gider")
    public void kullaniciSayfadaMeetListBolumuneGider() {
        js.executeScript("arguments[0].scrollIntoView();" , teacherPage.meetListVerifyEp);
        assertTrue(teacherPage.meetListVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("kullanici students bilgisinin gorundugunu dogrular")
    public void kullaniciStudentsBilgisininGorundugunuDogrular() {
        assertTrue(teacherPage.stundentsBilgisiVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("kullanici date bilgisinin gorundugunu dogrular")
    public void kullaniciDateBilgisininGorundugunuDogrular() {
        assertTrue(teacherPage.dateBilgisiVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("kullanici start time bilgisinin gorundugunu dogrular")
    public void kullaniciStartTimeBilgisininGorundugunuDogrular() {
        assertTrue(teacherPage.startTimeBilgisiVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("kullanici stop time bilgisinin gorundugunu dogrular")
    public void kullaniciStopTimeBilgisininGorundugunuDogrular() {
        assertTrue(teacherPage.stopTimeBilgisiVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("kullanici description bilgisinin gorundugunu dogrular")
    public void kullaniciDescriptionBilgisininGorundugunuDogrular() {
        assertTrue(teacherPage.descriptionBilgisiVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
    }
    @Given("kullanici sayfada meet list bolumune gider ve edit butonuna tiklar_Ep")
    public void kullaniciSayfadaMeetListBolumuneGiderVeEditButonunaTiklar_Ep() {
        js.executeScript("arguments[0].click();" , teacherPage.editButtonEp);
        ReusableMethods.bekle(2);
    }

    @Then("kullanici Date,Start Time,Stop Time ve Description bilgilerini gunceller_Ep")
    public void kullaniciDateStartTimeStopTimeVeDescriptionBilgileriniGunceller_Ep() {
        teacherPage.editDateOfMeetEp.sendKeys("20/11/2023");
        ReusableMethods.bekle(2);
        //teacherPage.editStartTimeEp.sendKeys("08:00PM");
        //teacherPage.editStopTimeEp.sendKeys("09:00PM");
        //teacherPage.editDescriptionEp.clear();
        teacherPage.editDescriptionEp.sendKeys("1");
        ReusableMethods.bekle(2);

    }

    @And("kullanici submit butonuna tiklar_Ep")
    public void kullaniciSubmitButonunaTiklar_Ep() {
        teacherPage.editSubmitButtonEp.click();
        ReusableMethods.bekle(2);
    }

    @Then("kullanici meet bilgilerinin guncellendigini dogrular_Ep")
    public void kullaniciMeetBilgilerininGuncellendiginiDogrular_Ep() {
        ReusableMethods.visibleWait(teacherPage.editSubmitVerifyEp,2);
        Assert.assertTrue(teacherPage.editSubmitVerifyEp.getText().contains("Meet Updated Successfully"));
    }

    @Then("kullanici guncelleme sayfasini kapatir_Ep")
    public void kullaniciGuncellemeSayfasiniKapatir_Ep() {
        ReusableMethods.bekle(2);
        teacherPage.editCloseButtonEp.click();
    }

    @And("kullanici meet list bolumunde delete butonuna tiklar silindigini dogrular_Ep")
    public void kullaniciMeetListBolumundeDeleteButonunaTiklarSilindiginiDogrular_Ep() {
        js.executeScript("arguments[0].click();" , teacherPage.deleteButtonEp);
        ReusableMethods.bekle(2);
        assertTrue(teacherPage.deleteVerifyEp.isDisplayed());
    }


}
