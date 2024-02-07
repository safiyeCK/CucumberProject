package stepDefinitions.UiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DeanPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class US04_StepDef {
    HomePage homePage =new HomePage();
    public static Faker fakerEsi=new Faker();
    public static DeanPage deanPageEsi=new DeanPage();
    public static String nameEsi = fakerEsi.name().firstName();
    public static String surnameEsi = fakerEsi.name().lastName();
    public static String phoneNummerEsi = fakerEsi.number().numberBetween(100, 999) + "-" + fakerEsi.number().numberBetween(100, 999) + "-" + fakerEsi.number().numberBetween(1000, 9999);
    public static String ssnEsi = fakerEsi.number().numberBetween(100, 899) + "-" +fakerEsi.number().numberBetween(10,99)+"-" + fakerEsi.number().numberBetween(1000, 9999);
    public static String birthPlaceEsi = fakerEsi.address().city();
    public static Date dateEsi = fakerEsi.date().birthday(25, 60);
    static SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    static SimpleDateFormat fortmat2=new SimpleDateFormat("yyyy-MM-dd");
    public static String dateOfBirthEsi = format.format(dateEsi);
    public static String birthdayEsi=fortmat2.format(dateEsi);
    public static String userNameEsi = nameEsi + surnameEsi;

    public static String passwordEsi= fakerEsi.internet().password()+"Aa2";

    @Given("Kullanici Login butonuna basar Esi")
    public void kullaniciLoginButonunaBasar() {
      homePage.loginButonu.click();
    }

    @Then("Username ve password kutularını doldurarak enter tuşuna basar Esi")
    public void usernameVePasswordKutularınıDoldurarakEnterTuşunaBasar() {
        String username =ConfigReader.getProperty("adminNameEsi");
        String password = ConfigReader.getProperty("passwordEsi");
        homePage.loginUsernameBox.sendKeys(username, Keys.TAB,password,Keys.TAB,Keys.ENTER);
    }

    @Then("Açılan sayfadan menu tusuna basar Esi")
    public void açılanSayfadanMenuTusunaBasar() {
        homePage.menu.click();
    }

    @Then("Dashboard kısmından Dean Management seçilir Esi")
    public void dashboardKısmındanDeanManagementSeçilir() {
        deanPageEsi.deanManagementEsi.click();
        ReusableMethods.bekle(1);

    }

    @Given("Kullanıcı Managementonschools adresine gider Esi")
    public void kullanıcıManagementonschoolsAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("schoolsUrl"));
        ReusableMethods.bekle(1);
    }


    @Given("Admin add Dean bolumundeki name kismina bir veri girer Esi")
    public void adminAddDeanBolumundekiNameKisminaBirVeriGirer() {
        deanPageEsi.deanNameEsi.sendKeys(nameEsi);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki surname kismina bir verir girer Esi")
    public void adminAddDeanBolumundekiSurnameKisminaBirVerirGirer() {
        deanPageEsi.deanSurnameEsi.sendKeys(surnameEsi);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki birth place kismina bir verir girer Esi")
    public void adminAddDeanBolumundekiBirthPlaceKisminaBirVerirGirer() {
        deanPageEsi.deanBirthPlaceEsi.sendKeys(birthPlaceEsi);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi")
    public void adminAddDeanBolumundekiGenderKismindaCinsiyetiBelirler() {
        deanPageEsi.deanGenderMaleEsi.click();
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki Date of Birth kismina bir verir girer Esi")
    public void adminAddDeanBolumundekiDateOfBirthKisminaBirVerirGirer() {
        deanPageEsi.deanBirthdayEsi.sendKeys(dateOfBirthEsi);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki phone kismina bir verir girer Esi")
    public void adminAddDeanBolumundekiPhoneKisminaBirVerirGirer() {
        deanPageEsi.deanPhoneNumberEsi.sendKeys(phoneNummerEsi);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki Ssn kismina bir verir girer Esi")
    public void adminAddDeanBolumundekiSsnKisminaBirVerirGirer() {
        deanPageEsi.deanSsnNumberEsi.sendKeys(ssnEsi);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki username kismina bir verir girer Esi")
    public void adminAddDeanBolumundekiUsernameKisminaBirVerirGirer() {
        deanPageEsi.deanUserNameEsi.sendKeys(userNameEsi);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki password kismina bir verir girer Esi")
    public void adminAddDeanBolumundekiPasswordKisminaBirVerirGirer() {
        deanPageEsi.deanPasswordEsi.sendKeys(passwordEsi);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki submit butonuna tıklar Esi")
    public void adminAddDeanBolumundekiSubmitButonunaTıklar() {
        deanPageEsi.deanSubmitButonuEsi.click();
        ReusableMethods.bekle(1);

    }

    @Then("Dean eklenebildigini dogrula Esi")
    public void deanEklenebildiginiDogrula() {

        Assert.assertTrue(deanPageEsi.deanSavedEsi.getText().contains("Saved"));
    }

    @Then("sayfayi kapatir Esi")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Given("Admin add Dean bolumundeki name kismini bos birakir Esi")
    public void adminAddDeanBolumundekiNameKisminiBosBirakirEsi() {
        deanPageEsi.deanNameEsi.sendKeys("");
    }


    @Then("Admin add Dean bolumundeki name kutusunun altinda required yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiNameKutusununAltindaRequiredYazisininGeldiginiDogrularEsi() {
       Assert.assertTrue(deanPageEsi.nameRequiredEsi.getText().contains("Required"));
    }

    @Then("Admin add Dean bolumundeki Surname kutusunun altinda required yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiSurnameKutusununAltindaRequiredYazisininGeldiginiDogrularEsi() {
        Assert.assertTrue(deanPageEsi.surnameRequiredEsi.getText().contains("Required"));
    }

    @Then("Admin add Dean bolumundeki surname kismini bos birakir Esi")
    public void adminAddDeanBolumundekiSurnameKisminiBosBirakirEsi() {
        deanPageEsi.deanSurnameEsi.sendKeys("");
    }

    @Then("Admin add Dean bolumundeki birth place kismini bos birakir Esi")
    public void adminAddDeanBolumundekiBirthPlaceKisminiBosBirakirEsi() {
        deanPageEsi.deanBirthPlaceEsi.sendKeys("");
    }

    @Then("Admin add Dean bolumundeki birth place kutusunun altinda required yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiBirthPlaceKutusununAltindaRequiredYazisininGeldiginiDogrularEsi() {
        Assert.assertTrue(deanPageEsi.birthplaceRequiredEsi.getText().contains("Required"));

    }

    @Then("Admin add Dean bolumundeki gender kisminda cinsiyeti bos birakir Esi")
    public void adminAddDeanBolumundekiGenderKismindaCinsiyetiBosBirakirEsi() {

    }


    @Then("invalid value uyarisi alindigini dogrula Esi")
    public void invalidValueUyarisiAlindiginiDogrulaEsi() {
        Assert.assertTrue(deanPageEsi.deanSavedEsi.getText().contains("invalid"));
    }

    @Then("Admin add Dean bolumundeki Date of Birth kismini bos birakir Esi")
    public void adminAddDeanBolumundekiDateOfBirthKisminiBosBirakirEsi() {

    }

    @Then("Admin add Dean bolumundeki date of birth kutusunun altinda required yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiDateOfBirthKutusununAltindaRequiredYazisininGeldiginiDogrularEsi() {
        Assert.assertTrue(deanPageEsi.dateofbirthRequiredEsi.getText().contains("Required"));
    }

    @Then("Admin add Dean bolumundeki Date of Birth kismina gelecekten bir tarih girilir Esi")
    public void adminAddDeanBolumundekiDateOfBirthKisminaGelecektenBirTarihGirilirEsi() {
        deanPageEsi.deanBirthdayEsi.sendKeys(ConfigReader.getProperty("deangelecekTarihEsi"));
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki gecmis bir tarih olmali uyari yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiGecmisBirTarihOlmaliUyariYazisininGeldiginiDogrularEsi() {
        Assert.assertTrue(deanPageEsi.deanSavedEsi.getText().contains("geçmiş bir tarih olmalı"));
    }

    @Then("Admin add Dean bolumundeki phone kismini bos birakir Esi")
    public void adminAddDeanBolumundekiPhoneKisminiBosBirakirEsi() {

    }


    @Then("Admin add Dean bolumundeki phone kutusunun altinda required yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiPhoneKutusununAltindaRequiredYazisininGeldiginiDogrularEsi() {
        Assert.assertTrue(deanPageEsi.phoneRequiredEsi.getText().contains("Required"));
    }

    @Then("Admin add Dean bolumundeki Ssn kismini bos birakir Esi")
    public void adminAddDeanBolumundekiSsnKisminiBosBirakirEsi() {

    }

    @Then("Admin add Dean bolumundeki ssn kutusunun altinda required yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiSsnKutusununAltindaRequiredYazisininGeldiginiDogrularEsi() {
        Assert.assertTrue(deanPageEsi.ssnRequiredEsi.getText().contains("Required"));
    }

    @Then("Admin add Dean bolumundeki Ssn kismina gecersiz formatta veri girer Esi")
    public void adminAddDeanBolumundekiSsnKisminaGecersizFormattaVeriGirerEsi() {
        deanPageEsi.deanSsnNumberEsi.sendKeys(ConfigReader.getProperty("ssnTiresizEsi"));
    }




    @Then("Sistemden Please enter a valid SSN number yazisinin geldigini dogrula Esi")
    public void sistemdenPleaseEnterAValidSSNNumberYazisininGeldiginiDogrulaEsi() {
        Assert.assertTrue(deanPageEsi.deanSavedEsi.getText().contains("Please"));
    }

    @Then("Admin add Dean bolumundeki Ssn kismina dokuz rakamdan daha az rakamli bir veri girer Esi")
    public void adminAddDeanBolumundekiSsnKisminaDokuzRakamdanDahaAzRakamliBirVeriGirerEsi() {
        deanPageEsi.deanSsnNumberEsi.sendKeys(ConfigReader.getProperty("ssnSekizRakamEsi"));
    }


    @Then("Sistemden {string} yazisinin geldigini dogrula Esi")
    public void sistemdenYazisininGeldiginiDogrulaEsi(String text) {
        Assert.assertTrue(deanPageEsi.ssnRequiredEsi.getText().contains(text));
    }

    @Then("Admin add Dean bolumundeki Ssn kismina dokuz rakamdan daha fazla rakam ile bir veri girer Esi")
    public void adminAddDeanBolumundekiSsnKisminaDokuzRakamdanDahaFazlaRakamIleBirVeriGirerEsi() {
        deanPageEsi.deanSsnNumberEsi.sendKeys(ConfigReader.getProperty("ssnOnRakamEsi"));
    }

    @Then("Admin add Dean bolumundeki username kismina bos birakir Esi")
    public void adminAddDeanBolumundekiUsernameKisminaBosBirakirEsi() {

    }

    @Then("Admin add Dean bolumundeki username kutusunun altinda required yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiUsernameKutusununAltindaRequiredYazisininGeldiginiDogrularEsi() {
        Assert.assertTrue(deanPageEsi.usernameRequiredEsi.getText().contains("Required"));
    }

    @Then("Admin add Dean bolumundeki password kismini bos birakir Esi")
    public void adminAddDeanBolumundekiPasswordKisminiBosBirakirEsi() {

    }

    @Then("Admin add Dean bolumundeki password kutusunun altinda Enter your password yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiPasswordKutusununAltindaEnterYourPasswordYazisininGeldiginiDogrularEsi() {
        Assert.assertTrue(deanPageEsi.passwordEnterEsi.getText().contains("Enter your password"));
    }


    @Then("Admin add Dean bolumundeki password kismina sekiz karakterden az bir veri girer Esi")
    public void adminAddDeanBolumundekiPasswordKisminaSekizKarakterdenAzBirVeriGirerEsi() {
        deanPageEsi.deanPasswordEsi.sendKeys(ConfigReader.getProperty("passwordYediEsi"));
    }

    @Then("Admin add Dean bolumundeki password kutusunun altinda {string} yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiPasswordKutusununAltindaYazisininGeldiginiDogrularEsi(String text) {
        Assert.assertTrue(deanPageEsi.passwordEnterEsi.getText().contains(text));
    }

    @Then("Admin add Dean bolumundeki password kismina buyuk harf icermeyen bir veri girer Esi")
    public void adminAddDeanBolumundekiPasswordKisminaBuyukHarfIcermeyenBirVeriGirerEsi() {
        deanPageEsi.deanPasswordEsi.sendKeys(ConfigReader.getProperty("passwordBYokEsi"));
    }

    @Then("Admin add Dean bolumundeki password kismina kucuk harf icermeyen bir veri girer Esi")
    public void adminAddDeanBolumundekiPasswordKisminaKucukHarfIcermeyenBirVeriGirerEsi() {
        deanPageEsi.deanPasswordEsi.sendKeys(ConfigReader.getProperty("passwordkYokEsi"));

    }

    @Then("Admin add Dean bolumundeki password kismina rakam icermeyen bir veri girer Esi")
    public void adminAddDeanBolumundekiPasswordKisminaRakamIcermeyenBirVeriGirerEsi() {
        deanPageEsi.deanPasswordEsi.sendKeys(ConfigReader.getProperty("passwordRYokEsi"));
    }
}
