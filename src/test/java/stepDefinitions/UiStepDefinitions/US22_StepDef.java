package stepDefinitions.UiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.text.DecimalFormat;
import java.util.Random;
import static org.junit.Assert.*;

public class US22_StepDef {
    Faker faker = new Faker();
    AdminPage aPage = new AdminPage();

    @And("kullanici acilan pencerede kayitli Admin {string} ve {string} bilgilerini girer_IO")
    public void kullaniciAcilanPenceredeKayitliAdminVeBilgileriniGirer_IO(String username, String password) {
        aPage.userNameKutusu_IO.sendKeys(ConfigReader.getProperty(username),
                Keys.TAB, ConfigReader.getProperty(password));
                ReusableMethods.bekle(2);
    }
    @And("kullanici Admin Management sayfasina gecildigini dogrular_IO")
    public void kullaniciAdminManagementSayfasinaGecildiginiDogrular_IO() {
        assertTrue(aPage.adminManagementYazisi_IO.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("kullanici Add Admin bolumundeki Name kutusuna isim girer")
    public void kullaniciAddAdminBolumundekiNameKutusunaIsimGirer() {
        aPage.nameKutusu_IO.sendKeys(ConfigReader.getProperty("name_IO"));
    }

    @And("kullanici Surname kutusuna soyisim girer")
    public void kullaniciSurnameKutusunaSoyisimGirer() {
        aPage.surnameKutusu_IO.sendKeys(ConfigReader.getProperty("surname_IO"));
    }

    @And("kullanici Birth Place kutusuna dogum yeri girer")
    public void kullaniciBirthPlaceKutusunaDogumYeriGirer() {
        aPage.birthPlaceKutusu_IO.sendKeys(ConfigReader.getProperty("birthPlace_IO"));
    }

    @And("kullanici Gender radio butonundan cinsiyet secer")
    public void kullaniciGenderRadioButonundanCinsiyetSecer() {
        aPage.maleRadioButonu_IO.click();
    }

    @And("kullanici Date Of Birth kutusuna dogum tarihi girer")
    public void kullaniciDateOfBirthKutusunaDogumTarihiGirer() {
        aPage.dateOfBirthKutusu_IO.sendKeys(ConfigReader.getProperty("birthDate_IO"));
    }

    @And("kullanici Phone kutusuna telefon no girer")
    public void kullaniciPhoneKutusunaTelefonNoGirer() {
        aPage.phoneNumberKutusu_IO.sendKeys(generateFakePhoneNumber());
    }

    @And("kullanici Ssn kutusuna ssn no girer")
    public void kullaniciSsnKutusunaSsnNoGirer() {
        aPage.ssnKutusu_IO.sendKeys(generateFakeSSN());
    }

    @And("kullanici User Name kutusuna kullanici adi girer")
    public void kullaniciUserNameKutusunaKullaniciAdiGirer() {
        aPage.userNameKutusu_IO.sendKeys(faker.name().username());
    }

    @And("kullanici Password kutusuna gecerli bir password girer")
    public void kullaniciPasswordKutusunaGecerliBirPasswordGirer() {
        aPage.passwordKutusu_IO.sendKeys(ConfigReader.getProperty("password_IO"));
    }

    @And("kullanici Submit butonuna tiklar ve Admin List'e admin eklendigini dogrular_IO")
    public void kullaniciSubmitButonunaTiklarVeAdminListEAdminEklendiginiDogrular_IO() {
        aPage.submitButonuAdmin_IO.click();
        ReusableMethods.visibleWait(aPage.adminSavedYazisi_IO, 5);
        assertTrue(aPage.adminSavedYazisi_IO.isDisplayed());

    }
    @And("kullanici Add Admin bolumundeki Name kutusunu bos birakir")
    public void kullaniciAddAdminBolumundekiNameKutusunuBosBirakir() {


    }
    @And("kullanici Name kutusu Required uyarisi aldigini dogrular_IO")
    public void kullaniciNameKutusuRequiredUyarisiAldiginiDogrular_IO() {
        assertTrue(aPage.nameKutusuRequiredUyari_IO.isDisplayed());
    }

    @And("kullanici Surname kutusunu bos birakir")
    public void kullaniciSurnameKutusunuBosBirakir() {
    }
    @And("kullanici Surname kutusu Required uyarisi aldigini dogrular_IO")
    public void kullaniciSurnameKutusuRequiredUyarisiAldiginiDogrular_IO() {
        assertTrue(aPage.surnameKutusuRequiredUyari_IO.isDisplayed());
    }

    @And("kullanici Birth Place kutusunu bos birakir")
    public void kullaniciBirthPlaceKutusunuBosBirakir() {
    }
    @And("kullanici Birth Place kutusu Required uyarisi aldigini dogrular_IO")
    public void kullaniciBirthPlaceKutusuRequiredUyarisiAldiginiDogrular_IO() {
        assertTrue(aPage.birthplaceKutusuRequiredUyari_IO.isDisplayed());
    }
    @And("kullanici Gender alanini bos birakir")
    public void kullaniciGenderAlaniniBosBirakir() {
    }
    @And("kullanici Submit butonuna tiklar ve admin eklenemedigini dogrular_IO")
    public void kullaniciSubmitButonunaTiklarVeAdminEklenemediginiDogrular_IO() {
        //Gender bos birakilip Submit'e tiklandiginda herhangi bir hata mesaji alinmiyor.
        ReusableMethods.click(aPage.submitButonuAdmin_IO);


    }
    @And("kullanici Date Of Birth kutusunu bos birakir")
    public void kullaniciDateOfBirthKutusunuBosBirakir() {
    }
    @And("kullanici Date Of Birth kutusu Required uyarisi aldigini dogrular_IO")
    public void kullaniciDateOfBirthKutusuRequiredUyarisiAldiginiDogrular_IO() {
        assertTrue(aPage.dateOfBirthKutusuRequiredUyari_IO.isDisplayed());
    }
    @And("kullanici Phone kutusunu bos birakir")
    public void kullaniciPhoneKutusunuBosBirakir() {
    }
    @And("kullanici Phone kutusu Required uyarisi aldigini dogrular_IO")
    public void kullaniciPhoneKutusuRequiredUyarisiAldiginiDogrular_IO() {
        assertTrue(aPage.phoneKutusuRequiredUyari_IO.isDisplayed());
    }
    @And("kullanici Ssn kutusunu bos birakir")
    public void kullaniciSsnKutusunuBosBirakir() {
    }
    @And("kullanici Ssn kutusu Required uyarisi aldigini dogrular_IO")
    public void kullaniciSsnKutusuRequiredUyarisiAldiginiDogrular_IO() {
        assertTrue(aPage.ssnKutusuRequiredUyari_IO.isDisplayed());
    }

    @And("kullanici User Name kutusunu bos birakir")
    public void kullaniciUserNameKutusunuBosBirakir() {
    }
    @And("kullanici User Name kutusu Required uyarisi aldigini dogrular_IO")
    public void kullaniciUserNameKutusuRequiredUyarisiAldiginiDogrular_IO() {
        assertTrue(aPage.usernameKutusuRequiredUyari_IO.isDisplayed());
    }

    @And("kullanici Password kutusunu bos birakir")
    public void kullaniciPasswordKutusunuBosBirakir() {
    }
    @And("kullanici Enter Your Password uyarisi aldigini dogrular_IO")
    public void kullaniciEnterYourPasswordUyarisiAldiginiDogrular_IO() {
        assertTrue(aPage.EnterYourPasswordUyari_IO.isDisplayed());
    }
    @And("kullanici Ssn kutusuna gecersiz bir ssn no girer")
    public void kullaniciSsnKutusunaGecersizBirSsnNoGirer() {
        aPage.ssnKutusu_IO.sendKeys(ConfigReader.getProperty("ssnNo1_IO"));
    }
    @And("kullanici Submit butonuna tiklar Please enter valid SSN number uyarisi aldigini dogrular_IO")
    public void kullaniciSubmitButonunaTiklarPleaseEnterValidSSNNumberUyarisiAldiginiDogrular_IO() {
        aPage.submitButonuAdmin_IO.click();
        ReusableMethods.visibleWait(aPage.pleaseEnterValidSsnNumberUyariYazisi_IO,5);
        assertTrue(aPage.pleaseEnterValidSsnNumberUyariYazisi_IO.isDisplayed());
    }
    @And("kullanici Password kutusuna 7 karakterli bir password girer")
    public void kullaniciPasswordKutusunaKarakterliBirPasswordGirer() {
        aPage.passwordKutusu_IO.sendKeys(ConfigReader.getProperty("password1_IO"));
    }
    @And("kullanici At least 8 characters uyarisi aldigini dogrular_IO")
    public void kullaniciAtLeastCharactersUyarisiAldiginiDogrular_IO() {
        assertTrue(aPage.atLeast8CharactersUyariYazisi_IO.isDisplayed());
    }
    @And("kullanici sayfayi yeniler")
    public void kullaniciSayfayiYeniler() {
        Driver.getDriver().navigate().refresh();
    }


    //FAKE phone number method
    public static String generateFakePhoneNumber() {
        Random random = new Random();
        int birinciBolum = 100 + random.nextInt(900); // 100 ile 999 arasında rastgele bir sayı
        int ikinciBolum = 100 + random.nextInt(999); // 100 ile 999 arasında rastgele bir sayı
        int ucuncuBolum = 1000 + random.nextInt(9999); // 1000 ile 9999 arasında rastgele bir sayı
        DecimalFormat decimalFormat = new DecimalFormat("000");
        String birinciBolumFormati = decimalFormat.format(birinciBolum);
        String ikinciBolumFormati = decimalFormat.format(ikinciBolum);
        DecimalFormat decimalFormatUcuncuBolum = new DecimalFormat("0000");
        String ucuncuBolumFormati= decimalFormatUcuncuBolum.format(ucuncuBolum);
        return birinciBolumFormati + "-" + ikinciBolumFormati + "-" + ucuncuBolumFormati;
    }
    //fake SSN number method
    public static String generateFakeSSN() {
        Random random = new Random();
        int ilkBolum = 100 + random.nextInt(900); // 100 ile 999 arasında rastgele bir sayı
        int ikinciBolum = 10 + random.nextInt(90); // 10 ile 99 arasında rastgele bir sayı
        int ucuncuBolum = 1000 + random.nextInt(9000); // 1000 ile 9999 arasında rastgele bir sayı
        DecimalFormat decimalFormatIlkBolum = new DecimalFormat("000");
        String ilkBolumFormati = decimalFormatIlkBolum.format(ilkBolum);
        DecimalFormat decimalFormat = new DecimalFormat("00");
        String ikinciBolumFormati = decimalFormat.format(ikinciBolum);
        DecimalFormat ucuncuBolumFormat = new DecimalFormat("0000");
        String ucuncuBolumFormati = ucuncuBolumFormat.format(ucuncuBolum);
        return ilkBolumFormati + "-" + ikinciBolumFormati + "-" + ucuncuBolumFormati;
    }
}
