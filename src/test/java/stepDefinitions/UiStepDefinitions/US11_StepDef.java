package stepDefinitions.UiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LessonPage;
import pages.TeacherPage;
import pages.ViceDeanPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US11_StepDef {
    ViceDeanPage viceDeanPage = new ViceDeanPage();
    LessonPage viceDean = new LessonPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici managementonschools.com sayfasina gider")
    public void kullaniciManagementonschoolsComSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("schoolsUrl"));
        ReusableMethods.bekle(1);
        
    }

    @And("kullanici UserName boxa ve Password boxa tıklar")
    public void kullaniciPasswordBoxaTiklar() {

        String username = ConfigReader.getProperty("UserName");
        String password = ConfigReader.getProperty("Password");
        viceDeanPage.loginUserNameBox.sendKeys(username, Keys.TAB,password,Keys.TAB,Keys.ENTER);
        ReusableMethods.bekle(2);

        
    }
    @Then("kullanici UserName boxa tıklar")
    public void kullaniciUserNameBoxaTiklar() {


    }

    @When("Kullanici Login Butonuna tıklar")
    public void kullaniciLoginButonunaTiklar() {
        viceDeanPage.loginButton.click();
        ReusableMethods.bekle(2);
        
    }



    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
        
    }

    @And("kullanıcı Login butonuna tıklar")
    public void kullanciLoginButonunaTiklar() {
        HomePage homePage = new HomePage();
        homePage.loginButonu.click();

    }
    @And("kullanici menu butonuna tiklar")
    public void kullaniciMenuButonunaTiklar() {
        HomePage homePage = new HomePage();
        homePage.menu.click();
        ReusableMethods.bekle(2);
    }

    @And("kullanıcı Lesson Program sekmesini bulur")
    public void kullaniciLessonProgramSekmesiniBulur() {
        
    }

    @Given("Lesson Program secenegine tiklar")
    public void lessonProgramSecenegineTiklar() {
        ViceDeanPage lessonPage = new ViceDeanPage();
        lessonPage.lessonProgram.click();

    }

    @And("kullanici sayfayi kaydirir")
    public void kullaniciSayfayiKaydirir() {
        ReusableMethods.scroll(viceDeanPage.lessonProgramListTable);
        
    }

    @And("kullanici Lesson görebilmelidir.")
    public void kullaniciLessonGorebilmelidir() {
        System.out.println(viceDean.dersIsmiGorunur.getText());
        assertTrue(viceDean.dersIsmiGorunur.isDisplayed());
        
    }

    @And("kullanici Day görebilmelidir.")
    public void kullaniciDayGorebilmelidir() {
        System.out.println(viceDean.dayGorunur.getText());
        assertTrue(viceDean.dayGorunur.isDisplayed());
        
    }

    @And("kullanici Start Time görebilmelidir.")
    public void kullaniciStartTimeGorebilmelidir() {
        System.out.println(viceDean.startTimeGorunur.getText());
        assertTrue(viceDean.startTimeGorunur.isDisplayed());
        
    }

    @And("kullanici Stop Time görebilmelidir.")
    public void kullaniciStopTimeGorebilmelidir() {
        System.out.println(viceDean.stopTimeGorunur.getText());
        assertTrue(viceDean.stopTimeGorunur.isDisplayed());
        
    }

    @And("Kullanici Update yapabilmelidir")
    public void kullaniciUpdadeYapabilmelidir() {
        LessonPage LessonProgramList = new LessonPage();
        ReusableMethods.visibleWait(LessonProgramList.Update,2);
        Assert.assertTrue(LessonProgramList.Update.getText().contains("LessonProgramList Updated Successfully"));
        
    }

    @And("Kullanici Lesson Program listesinden olusturulan dersi silebilmelidir")
    public void kullaniciLessonProgramListesindenOlusturulanDersiSilebilmelidir() {
        ReusableMethods.scroll(viceDeanPage.lessonProgramList);
        LessonPage lessonProgramList = new LessonPage();
        lessonProgramList.lessonDelete.click();

    }
}
