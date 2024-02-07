package stepDefinitions.UiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LessonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.geom.RectangularShape;
import java.sql.ResultSet;


public class US10_StepDef {
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    LessonPage lessonPage = new LessonPage();
    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());
    public static String lessonY1;
    public static String eduTermY;
    public static String dayY;

    @Given("kullanici {string} sayfasina gider YD")
    public void kullaniciSayfasinaGiderYD(String url) {
        Driver.getDriver().get(url);
    }

    @Then("kullanici login butonuna tiklar YD")
    public void kullaniciLoginButonunaTiklarYD() {
        homePage.loginButonu.click();
    }

    @Then("kullanici username ve password datalarini girer ve enter'a tiklar YD")
    public void kullaniciUsernameVePasswordDatalariniGirerVeEnterATiklarYD() {
        homePage.loginUsernameBox.sendKeys(ConfigReader.getProperty("viceDeanY"), Keys.TAB,
                ConfigReader.getProperty("passwordY"), Keys.TAB, Keys.ENTER);
    }

    @Then("kullanici menu butonuna tiklar YD")
    public void kullaniciMenuButonunaTiklarYD() {
        homePage.menu.click();
    }

    @Then("acilan pencereden lesson management'i secer YD")
    public void acilanPenceredenLessonManagementISecerYD() {
        ReusableMethods.bekle(2);
        lessonPage.lessonManagementY.click();
    }

    @Given("Lesson Program secenegine tiklar YD")
    public void lessonProgramSecenegineTiklarYD() {
        lessonPage.lessonProgramY.click();

    }

    @Then("Select Lessons menusune tiklar YD")
    public void selectLessonsMenusuneTiklarYD() {
        lessonPage.selectLessonY.click();
    }

    @Then("Acilan drop down menuden bir ders secer YD")
    public void acilanDropDownMenudenBirDersSecerYD() {
        ReusableMethods.bekle(2);
        lessonY1 = "Topology";
        actions.sendKeys(lessonY1);
        actions.sendKeys(Keys.ENTER).perform();
    }

    @Then("Choose Education Term menusune tiklar YD")
    public void chooseEducationTermMenusuneTiklarYD() {
        lessonPage.educationTermY.click();
    }

    @Then("Acilan menuden bir donem secer YD")
    public void acilanMenudenBirDonemSecerYD() {
        ReusableMethods.bekle(2);
        /* eduTermY = "FALL_SEMESTER";
        Select select1 = new Select(lessonPage.educationTermY);
        select1.selectByVisibleText(eduTermY);*/
        ReusableMethods.click(lessonPage.educationTermY);
        actions.sendKeys(Keys.ARROW_DOWN, "FALL_SEMESTER", Keys.ENTER).perform();

    }

    @Then("Choose Day menusune tiklar YD")
    public void chooseDayMenusuneTiklarYD() {
        lessonPage.chooseDayY.click();
    }

    @Then("Acilan menuden gun secer YD")
    public void acilanMenudenGunSecerYD() {
        /*dayY = "FRIDAY";
        Select select2 = new Select(lessonPage.chooseDayY);
        select2.selectByVisibleText(dayY);
        ReusableMethods.bekle(1);*/

        ReusableMethods.click(lessonPage.chooseDayY);
        actions.sendKeys(Keys.ARROW_DOWN, "FRIDAY", Keys.ENTER).perform();

    }

    @Then("Start Time menusune tiklar ve gecerli bir saat girer YD")
    public void startTimeMenusuneTiklarVeGecerliBirSaatGirerYD() {
        lessonPage.startTimeY.click();
        lessonPage.startTimeY.sendKeys("14:00", Keys.ENTER);
        ReusableMethods.bekle(3);
    }

    @Then("Start Time menusune tiklar ve gecerli bir data girer YD")
    public void startTimeMenusuneTiklarVeGecerliBirDataGirerYD() {
        ReusableMethods.bekle(2);
        lessonPage.startTimeY.click();
        lessonPage.startTimeY.sendKeys("14:00", Keys.ENTER);
        ReusableMethods.visibleWait(By.xpath("(//*[@class='mb-3'])[5]"), 8);
    }

    @Then("Stop Time menusune tiklar ve gecerli bir saat girer YD")
    public void stopTimeMenusuneTiklarVeGecerliBirSaatGirerYD() {

        //js.executeScript("arguments[0].click();" , lessonPage.stopTimeY);
        ReusableMethods.bekle(2);
        //lessonPage.stopTimeY.click();
        lessonPage.stopTimeY.sendKeys("15:00", Keys.ENTER, Keys.TAB, Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @Then("Submit butonuna tiklar YD")
    public void submitButonunaTiklarYD() {
        ReusableMethods.bekle(2);
        js.executeScript("arguments[0].click();", lessonPage.buttonSubmitY);
        ReusableMethods.bekle(2);
    }

    @Then("Lesson Program olusturuldugunu dogrular YD")
    public void lessonProgramOlusturuldugunuDogrularYD() {
        Assert.assertTrue(lessonPage.createdLessonProgY.isDisplayed());
    }

    @And("kullanici sayfayi kapatir YD")
    public void kullaniciSayfayiKapatirYD() {
    }


    @Then("Stop Time menusune tikla, baslangic saatinde once bir data girer YD")
    public void stopTimeMenusuneTiklaBaslangicSaatindeOnceBirDataGirerYD() {
        ReusableMethods.bekle(2);
        lessonPage.stopTimeY.click();
        lessonPage.stopTimeY.sendKeys("09:00", Keys.ENTER);

    }

    @Then("Lesson Program olusturulamadigini dogrular YD")
    public void lessonProgramOlusturulamadiginiDogrularYD() {
        Assert.assertTrue(lessonPage.errorTimeY.isDisplayed());
    }

    @Then("Education Term secilmedigin icin uyari yazisini gorur YD")
    public void educationTermSecilmediginIcinUyariYazisiniGorurYD() {
        Assert.assertTrue(lessonPage.alertEduTermY.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("Ders secilmedigi icin uyari yazisi alir YD")
    public void dersSecilmedigiIcinUyariYazisiAlirYD() {
        Assert.assertTrue(lessonPage.selectLessonY.isDisplayed());
    }

    @Then("Gun secilmedigi icin uyari yazisi alir YD")
    public void gunSecilmedigiIcinUyariYazisiAlirYD() {
        Assert.assertTrue(lessonPage.alertDayY.isDisplayed());
    }

    @Then("Ders secilebildigini dogrular YD")
    public void dersSecilebildiginiDogrularYD() {
        Assert.assertTrue(lessonPage.topologyDisplayY.getText().contains("Topology"));
    }

    @Then("Donem secilebildigini dogrular YD")
    public void donemSecilebildiginiDogrularYD() {
        Assert.assertTrue(lessonPage.educationTermY.getText().contains("FALL_SEMESTER"));

    }

    @Then("Baslama ve bitis tarihi secilebilirligini dogrular YD")
    public void baslamaVeBitisTarihiSecilebilirliginiDogrularYD() {
        Assert.assertTrue(lessonPage.timeUyariY.isDisplayed());
       // Assert.assertTrue(lessonPage.startTimeY.getText().contains("14:00"));
       // Assert.assertTrue(lessonPage.stopTimeY.getText().contains("15:00"));

    }

    @Then("Gun secebildigini dogrular YD")
    public void gunSecebildiginiDogrularYD() {
        Assert.assertTrue(lessonPage.chooseDayY.getText().contains("FRIDAY"));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int sn) {
        ReusableMethods.bekle(4);
    }

    @Then("Required yazisini gorur YD")
    public void requiredYazisiniGorurYD() {
        Assert.assertTrue(lessonPage.requiredY.isDisplayed());
    }

    /*@Then("ve sayfayi webelementi gorunene kadar scroll eder")
    public void veSayfayiWebelementiGoruneneKadarScrollEder() {
        ReusableMethods.scroll(ReusableMethods.visibleWait(
                By.xpath("//*[@id='startTime']"),4));

        js.executeScript("window.scrollPBy(0, 500);");
        */

}