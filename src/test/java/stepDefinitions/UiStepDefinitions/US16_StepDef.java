package stepDefinitions.UiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.ContactGetAllPage;
import pages.HomePage;
import pages.LessonPage;
import pages.ViceDeanPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US16_StepDef {
    LessonPage lessonPage = new LessonPage();
    HomePage homePage = new HomePage();

    @Given("Kullanici ana sayfaya gider.")
    public void kullaniciAnaSayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("schoolsUrl"));
        ReusableMethods.bekle(1);

    }

    @When("Kullanici Vice Dean hesabi ile giris yapar.")
    public void kullaniciViceDeanHesabiIleGirisYapar() {

        homePage.loginUsernameBox.sendKeys(ConfigReader.getProperty("AdminBatch17123"),
                Keys.TAB, ConfigReader.getProperty("Ma506209."), Keys.TAB, Keys.ENTER);



    }

    @And("Kullanici Menu ye  tiklar.")
    public void kullaniciMenuyeTiklar() {
        homePage.menu.click();

    }

    @Then("Kullanici  acilan pencereden Contact Get All yazisina  tiklar.")
    public void kullaniciAcilanPenceredenContactGetAllYazisinaTiklar() {

        ReusableMethods.click(ContactGetAllPage.ContactGetAll);
        ReusableMethods.bekle(2);

    }

    @And("Kullanici Name altinda gönderici isimlerini gordugunu dogrular.")
    public void kullaniciNameAltindaGondericiIsimleriniGordugunuDogrular() {
             Assert.assertTrue(ViceDeanPage.contactName.isDisplayed());

    }

    @And("Kullanici Email altinda gönderici Email adreslerini gordugunu dogrular.")
    public void kullaniciEmailAltindaGondericiEmailAdresleriniGordugunuDogrular() {
                Assert.assertTrue(ViceDeanPage.contactEmail.isDisplayed());

    }

    @And("Kullanici Date altinda mesaj tarihlerini gordugunu dogrular.")
    public void kullaniciDateAltindaMesajTarihleriniGordugunuDogrular() {
        Assert.assertTrue(ViceDeanPage.contactDate.isDisplayed());

    }

    @And("Kullanici Subject altindaki bilgileri gordugunu dogrular.")
    public void kullaniciSubjectAltindakiBilgileriGordugunuDogrular() {
        Assert.assertTrue(ViceDeanPage.contactSubject.isDisplayed());

    }

    @And("Kullanici Message altindaki mesajlari gordugunu dogrular.")
    public void kullaniciMessageAltindakiMesajlariGordugunuDogrular() {
        Assert.assertTrue(ViceDeanPage.contactMessage.isDisplayed());

    }



    @And("Kullanici silme buton  gordugunu dogrular.")
    public void kullaniciSilmeButonGordugunuDogrular() {
        assertTrue(ViceDeanPage.deleteButon.isDisplayed());



    }

    @And("Kullanici silme butona tiklar")
    public void kullaniciSilmeButonaTiklar() {
        ReusableMethods.click(ViceDeanPage.deleteButon);


    }
    @And("Kullanici sayfa kapatir.")
    public void kullaniciSayfaKapatir() {
        Driver.closeDriver();


    }

}
