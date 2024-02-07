package stepDefinitions.UiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LessonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.PublicKey;
import java.util.List;

public class US09_StepDef {
    HomePage homePage = new HomePage();
    LessonPage lessonPage = new LessonPage();
   public static  Faker faker = new Faker();
    public static String randomDers = faker.lorem().characters(15, true, true);
    public static String randomDers2 = faker.lorem().characters(15, true, true);

    @Given("kullanici ManagementSchools sayfasina giderSo")
    public void kullaniciManagementSchoolsSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("schoolsUrl"));
    }

    @And("kullanici {int} saniye beklerSo")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }

    @Given("Login butonuna tiklarSo")
    public void loginIleGirisYapilir() {
        homePage.loginButonu.click();

    }

    @Then("Vice Dean olarak giris yaparSo")
    public void viceDeanOlarakGirisYaparso() {
        homePage.loginUsernameBox.sendKeys("Sare", Keys.TAB, "ViceDean171+", Keys.TAB, Keys.ENTER);
    }

    @And("Menü alanina tiklarSo")
    public void menüAlaninaTiklar() {
        homePage.menu.click();
    }

    @And("Cikan seceneklerden LessonManagement tiklanirSo")
    public void cikanSeceneklerdenLessonManagementTiklanir() {

        lessonPage.LessonManagementButonuSo.click();
        ReusableMethods.bekle(2);
    }

    @And("Acilan Sayfada Lesson alanina tiklanirSo")
    public void acilanSayfadaLessonAlaninaTiklanir() {
        ReusableMethods.scrollHome();
        ReusableMethods.bekle(5);
        lessonPage.LessonButonuSo.click();
        ReusableMethods.bekle(2);
    }


    @And("Kullanici ders listesini\\(LessonName,Compulsory,CreditScore) gordugunu dogrularSo")
    public void kullaniciDersListesiniLessonNameCompulsoryCreditScoreGordugunuDogrularSo() {
        Assert.assertTrue(lessonPage.lessonList.isDisplayed());
    }

    @And("kullanici sayfayi kapatirSo")
    public void kullaniciSayfayiKapatirSo() {
        Driver.closeDriver();
    }

    @And("kullanici ders listesinde ders silebilmeliSo")
    public void kullaniciDersListesindeDersSilebilmeliSo() {
        ReusableMethods.scroll(lessonPage.eklenenSonDers);
        lessonPage.lessonDelete.click();


    }


    @Then("kullanici ders listesinde ders eklerSo")
    public void kullaniciDersListesindeDersEklerSo() {

        lessonPage.lessonName.sendKeys(randomDers);
    }

    @And("kullanici Compulsory kutusuna tiklarSo")
    public void kullaniciCompulsoryKutusunaTiklarSo() {
        lessonPage.CompulsoryKutusuSo.click();
    }

    @And("kullanici CreditScore'a bir rakam girer ve submit yaparSo")
    public void kullaniciCreditScoreABirRakamGirerSo() {
        lessonPage.CreditScoreKutusuSo.sendKeys("15", Keys.TAB, Keys.ENTER);
        ReusableMethods.bekle(3);
    }


    @Then("kullanici Lesson Created uyarisinin alindigini dogrularSo")
    public void lesson_created_uyarisinin_alindigini_dogrular() {

        Assert.assertTrue(lessonPage.alert.isDisplayed());
        System.out.println(lessonPage.alert.getText());
        ReusableMethods.bekle(3);
    }

    @And("kullanici olusturulan dersin cop kovasina tiklar ve silerSo")
    public void kullaniciOlusturulanDersinCopKovasinaTiklarVeSiler() {
        //ReusableMethods.scroll(lessonPage.dersListesiIlerlemeButonuSo);
        //ReusableMethods.bekle(2);
        ReusableMethods.click(  lessonPage.dersListesiIlerlemeButonuSo);
        ReusableMethods.bekle(3);
        ReusableMethods.click(lessonPage.sonDersiSilmeButonu);
        ReusableMethods.bekle(2);

    }


  @And("kullanici dersin silindigini dogrularSo")
  public void kullaniciDersinSilindiginiDogrularSo() {
          Assert.assertTrue(lessonPage.lessonDeleted.isDisplayed());
          ReusableMethods.bekle(2);

      }
  }
