package stepDefinitions.UiStepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.LessonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.image.Kernel;
import java.security.Key;

import static org.junit.Assert.assertEquals;

public class US12_StepDef {
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    LessonPage lessonPage = new LessonPage();
    Actions actions = new Actions(Driver.getDriver());
    public static String lessonY2;
    public static String lessonY3;
    @Then("Choose Lessons bolumunden olusturulan dersin geldigini dogrular YD")
    public void chooseLessonsBolumundenOlusturulanDersinGeldiginiDogrularYD() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(lessonPage.lessonDisplayY.getText().contains("Topology"));
        ReusableMethods.scroll(lessonPage.lastChooseLessonButtonY);
    }

    @Then("Choose Lessons bolumunden olusturulan derse tiklar YD")
    public void chooseLessonsBolumundenOlusturulanDerseTiklarYD() {
        ReusableMethods.bekle(4);
        ReusableMethods.scroll(lessonPage.submitButtonSonY);
        ReusableMethods.bekle(5);
        //ReusableMethods.visibleWait(By.xpath("(//*[@class='form-check-input'])[48]"), 4);
        // ReusableMethods.scroll(ReusableMethods.visibleWait(By.xpath("//*[@id='teacherId']"), 4));
        //lessonPage.chooseButtonY.click();
        lessonPage.lastChooseLessonButtonY.click();
        ReusableMethods.bekle(2);


    }

    @Then("Choose Teacher menusune tiklar YD")
    public void chooseTeacherMenusuneTiklarYD() {
       //ReusableMethods.scroll(ReusableMethods.visibleWait(By.xpath("//*[@id='teacherId']"), 4));
       ReusableMethods.bekle(2);
       js.executeScript("arguments[0].click();" , lessonPage.teacherY);
       ReusableMethods.bekle(2);

    }

    @Then("Choose Teacher drop down menuden bir teacher secer YD")
    public void chooseTeacherDropDownMenudenBirTeacherSecerYD() {
        lessonPage.teacherY.sendKeys(ConfigReader.getProperty("John Doe"),
        Keys.TAB, Keys.ENTER);
        //WebElement ddmTeacher = lessonPage.teacherY;
        //ReusableMethods.ddmVisibleText(ddmTeacher, "John Doe");
        //ddmTeacher.submit();
    }

    @Then("Ders icin ogretmen secilebilirligini dogrular YD")
    public void dersIcinOgretmenSecilebilirliginiDogrularYD() {
        Assert.assertTrue(lessonPage.teacherY.getText().contains("John Doe"));
    }

    @Then("Lesson added to Teacher yazisinin gorunur oldugunu dogrular YD")
    public void lessonAddedToTeacherYazisininGorunurOldugunuDogrularYD() {
        Assert.assertTrue(lessonPage.addedTeacherY.isDisplayed());
    }

    @Then("Acilan drop down menuden iki ders secer YD")
    public void acilanDropDownMenudenIkiDersSecerYD() {
        lessonY2 = "Calculus 1";
        lessonY3 = "Calculus 2";
        actions.sendKeys(lessonY2);
        actions.sendKeys(lessonY3);
        actions.sendKeys(Keys.ENTER).perform();
    }

    @Then("Choose Lessons bolumunden ayni gun ve saate ait iki derse tiklar YD")
    public void chooseLessonsBolumundenAyniGunVeSaateAitIkiDerseTiklarYD() {
    }

    @Then("Choose Teacher drop down menuden onceden secilen teacher'i secer YD")
    public void chooseTeacherDropDownMenudenOncedenSecilenTeacherISecerYD() {
    }

    @Then("Ayni ogretmene ayni gun ve saatte baska bir ders atanamadigini dogrular YD")
    public void ayniOgretmeneAyniGunVeSaatteBaskaBirDersAtanamadiginiDogrularYD() {
    }
}
