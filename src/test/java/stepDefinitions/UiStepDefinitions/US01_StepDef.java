package stepDefinitions.UiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.DecimalFormat;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class US01_StepDef {

    RegisterPage registerPage=new RegisterPage();
    Faker faker=new Faker();

    @Given("kullanici {string} e gider_SK")
    public void kullaniciEGider(String url) {
        Driver.getDriver().get(url);

    }
    /*@Given("kullanici web sitesine gider")    //ilk yazdigimda bu sekilde yazmistim.
    public void verilenKullaniciWebSitesineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("schoolsUrl"));
    }*/
    @And("kullanici Register butonuna tiklar_SK")
    public void kullaniciRegisterButonunaTiklar() {
        registerPage=new RegisterPage();
        ReusableMethods.click(registerPage.registerButton_SK);
    }
    @And("kullanici name alanina isim girer_SK")
    public void kullaniciNameAlaninaIsimGirer() {
        ReusableMethods.bekle(1);
        registerPage.nameKutusu_SK.sendKeys(faker.name().firstName());

    }
    @And("kullanici surname alanina soyisim girer_SK")
    public void kullaniciSurnameAlaninaSoyisimGirer() {
        ReusableMethods.bekle(1);
        registerPage.surnameKutusu_SK.sendKeys(faker.name().lastName());
    }
    @And("kullanici Birth Place alanina dogum yeri girer_SK")
    public void kullaniciBirthPlaceAlaninaDogumYeriGirer() {
        ReusableMethods.bekle(1);
        registerPage.birthPlaceKutusu_SK.sendKeys(faker.country().name());
    }
    @And("kullanici Phone Number alanina telefonnumarasi girer_SK")
    public void kullaniciPhoneNumberAlaninaTelefonnumarasiGirer() {
        ReusableMethods.bekle(1);
        registerPage.phoneNumberKutusu_SK.sendKeys(generateFakePhoneNumber());
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
    @And("kullanici Gender alanindan cinsiyet secer_SK")
    public void kullaniciGenderAlanindanCinsiyetSecer() {
        ReusableMethods.bekle(1);
        ReusableMethods.click(registerPage.genderRadioButtun_SK);
    }
    @And("kullanici Birth Date alanina dogum gunu girer_SK")
    public void kullaniciBirthDateAlaninaDogumGunuGirer() {
        ReusableMethods.bekle(1);
        registerPage.birthDayKutusu_SK.sendKeys(generateRandomDate());
    }
    //Fake random birthday

    public static String generateRandomDate() {
        Random random = new Random();

        int day = 1 + random.nextInt(31); // 1 ile 31 arasında rastgele bir gun
        int month = 1 + random.nextInt(12); // 1 ile 12 arasında rastgele bir ay
        int year = 1990 + random.nextInt(33); // 1990 ile 2022 arasında rastgele bir yil(yil araligini degistirebiliriz)

        return day + "." + month + "." + year;
    }
    public static String generateRandomBirthDay() {
        Random random = new Random();

        int day = 1 + random.nextInt(31); // 1 ile 31 arasında rastgele bir gun
        int month = 1 + random.nextInt(12); // 1 ile 12 arasında rastgele bir ay
        int year = 1990 + random.nextInt(33); // 1990 ile 2022 arasında rastgele bir yil(yil araligini degistirebiliriz)

        return year + "." + month + "." + day;
    }

    @And("kullanici SSN alanina ssn girer_SK")
    public void kullaniciSSNAlaninaSsnGirer() {
        ReusableMethods.bekle(1);
        registerPage.ssnKutusu_SK.sendKeys(generateFakeSSN());
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
    @And("kullanici User Name alanina username girer_SK")
    public void kullaniciUserNameAlaninaUsernameGirer() {
        ReusableMethods.bekle(1);
        registerPage.userNameKutusu_SK.sendKeys(faker.name().username());
    }
    @And("kullanici Password alanina password girer_SK")
    public void kullaniciPasswordAlaninaPasswordGirer() {
        ReusableMethods.bekle(1);
        registerPage.passwordKutusu_SK.sendKeys("MErlin01");
    }
    @And("kullanici Register dugmesine tiklar_SK")
    public void kullaniciRegisterDugmesineTiklar() {
        ReusableMethods.bekle(1);
        ReusableMethods.click(registerPage.registerMaviButton_SK);
        ReusableMethods.bekle(2);
    }
    @And("Kayit islemi basariyla tamamlanir_SK")
    public void kayitIslemiBasariylaTamamlanir() {
        ReusableMethods.visibleWait(registerPage.guestUserRegisterYazisi_SK, 5);
        assertTrue(registerPage.guestUserRegisterYazisi_SK.getText().contains("Guest User registered."));
    }
    @And("Kullanici sayfayi kapatir_SK")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
    @And("Name kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_SK")  //TC02
    public void nameKutusuBosOluncaKayitIslemininTamamlanmadiginiDogrular() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.nameKutusu_SK);
        ReusableMethods.bekle(2);
        assertTrue(registerPage.nameRequried_SK.isDisplayed());
    }
    @And("Surname kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_SK")  //TC03
    public void surnameKutusuBosOluncaKayitIslemininTamamlanmadiginiDogrular() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.surnameKutusu_SK);
        ReusableMethods.bekle(2);
        assertTrue(registerPage.surnameRequried_SK.isDisplayed());
    }
    @And("kullanici Birth Place alanini bos birakir_SK")  //TC04
    public void kullaniciBirthPlaceAlaniniBosBirakir() {

       registerPage.birthPlaceKutusu_SK.sendKeys("");
    }
    @And("Birth Place kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_SK")
    public void birthPlaceKutusuBosOluncaKayitIslemininTamamlanmadiginiDogrular() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.birthPlaceKutusu_SK);
        ReusableMethods.bekle(2);
        assertTrue(registerPage.birthplaceRequried_SK.isDisplayed());
    }
    @And("kullanici Phone Number alanini bos birak_SK")     //TC05
    public void kullaniciPhoneNumberAlaniniBosBirak() {
        registerPage.phoneNumberKutusu_SK.sendKeys("");
    }
    @And("phone Number kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_SK")
    public void phoneNumberKutusuBosOluncaKayitIslemininTamamlanmadiginiDogrular() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.phoneNumberKutusu_SK);
        assertTrue(registerPage.phoneRequried_SK.isDisplayed());
    }
    @And("kullanici Phone Number alanina patterne uygun olmayan bir numara girer_SK")  //TC06
    public void kullaniciPhoneNumberAlaninaPatterneUygunOlmayanBirNumaraGirer() {

        registerPage.phoneNumberKutusu_SK.sendKeys("123-432-12347");
        ReusableMethods.bekle(2);

    }
    @And("Phone Number alanina patterne uygun olmayan bir numara girildigi icin kayit isleminin tamamlanmadigini dogrular_SK")
    public void phoneNumberAlaninaPatterneUygunOlmayanBirNumaraGirildigiIcinKayitIslemininTamamlanmadiginiDogrular() {
        assertTrue(registerPage.phoneNumberUyari_SK.getText().contains("Please enter valid phone number"));
    }
    @And("kullanici SSN alanina patterne uygun olmayan bir numara girer_SK")  //TC07
    public void kullaniciSSNAlaninaPatterneUygunOlmayanBirNumaraGirer() {
        registerPage.ssnKutusu_SK.sendKeys("123-432-1234");
        ReusableMethods.bekle(2);
    }
    @And("SSN alanina patterne uygun olmayan bir numara girildigi icin kayit isleminin tamamlanmadigini dogrular_SK")
    public void ssnAlaninaPatterneUygunOlmayanBirNumaraGirildigiIcinKayitIslemininTamamlanmadiginiDogrular() {
        assertTrue(registerPage.ssnHataYazisi_SK.isDisplayed());
    }
    @And("kullanici SSN alanini bos birakir_SK")  //TC08
    public void kullaniciSSNAlaniniBosBirakir() {
        registerPage.ssnKutusu_SK.sendKeys("");
    }
    @And("ssn kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_SK")
    public void ssnKutusuBosOluncaKayitIslemininTamamlanmadiginiDogrular() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.ssnKutusu_SK);
        assertTrue(registerPage.ssnRequried_SK.isDisplayed());
    }
    @And("kullanici Birth Date alanini bos birakir_SK")
    public void kullaniciBirthDateAlaniniBosBirakir() {  //TC09
        registerPage.birthDayKutusu_SK.sendKeys("");
    }
    @And("Birth Date alanini bos birakinca kayit olunamadigini dogrular_SK")
    public void birthDateAlaniniBosBirakincaKayitOlunamadiginiDogrular() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.birthDayKutusu_SK);
        assertTrue(registerPage.birthdayRequried_SK.isDisplayed());
    }
    @And("kullanici User Name alanini bos birakir_SK")     //TC19
    public void kullaniciUserNameAlaniniBosBirakir() {
        registerPage.userNameKutusu_SK.sendKeys("");
    }
    @And("User Name alani bos birakilarak kayit olunamadigini dogrular_SK")
    public void userNameAlaniBosBirakilarakKayitOlunamadiginiDogrular() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.userNameKutusu_SK);
        assertTrue(registerPage.usernameRequried_SK.isDisplayed());
    }
    @And("kullanici Password alanini bos birakir_SK")    //TC11
    public void kullaniciPasswordAlaniniBosBirakir() {
        registerPage.passwordKutusu_SK.sendKeys("");
    }
    @And("Password alani bos birakilarak kayit olunamadigini dogrular_SK")
    public void passwordAlaniBosBirakilarakKayitOlunamadiginiDogrular() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.passwordKutusu_SK);
        assertTrue(registerPage.passwordRequried_SK.isDisplayed());
    }
    @And("kullanici Password alanina yedi karakterli bir  {string} girer_SK")  //TC12
    public void kullaniciPasswordAlaninaYediKarakterliBirGirer(String sifre) {
         sifre = rasgeleSifreOlustur(7);
        registerPage.passwordKutusu_SK.sendKeys(sifre);
    }
    // Belirli bir karakter sayısına sahip rasgele bir şifre oluşturan bir yardımcı method
    public static String rasgeleSifreOlustur(int karakterSayisi) {
        String karakterler = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sifre = new StringBuilder();

        for (int i = 0; i < karakterSayisi; i++) {
            int rastgeleIndex = random.nextInt(karakterler.length());
            char rastgeleKarakter = karakterler.charAt(rastgeleIndex);
            sifre.append(rastgeleKarakter);
        }
        return sifre.toString();
    }
    @And("Sekiz karakterden daha az karakterli bir sifre ile kayit olunamadigini dogrular_SK")
    public void sekizKarakterdenDahaAzKarakterliBirSifreIleKayitOlunamadiginiDogrular() {
        ReusableMethods.bekle(2);
        //assertTrue(registerPage.passwordRequried_SK.isDisplayed());
        assertTrue(registerPage.passwordRequried_SK.getText().contains("At least 8 characters"));
    }
    @And("kullanici Password alanina sadece rakamlardan olusan bir sifre girer_SK")  //TC13
    public void kullaniciPasswordAlaninaSadeceRakamlardanOlusanBirSifreGirer() {
        ReusableMethods.bekle(2);
        registerPage.passwordKutusu_SK.sendKeys("123456789");
    }
    @And("Kayit isleminin tamamlanmadigini dogrular_SK")
    public void kayitIslemininTamamlanmadiginiDogrular() {
        assertTrue(registerPage.passwordRequried_SK.getText().contains("One lowercase character"));
    }
    @And("kullanici Password alanina sadece kucuk harflerden olusan bir sifre girer_SK")  //TC14
    public void kullaniciPasswordAlaninaSadeceKucukHarflerdenOlusanBirSifreGirer() {
        ReusableMethods.bekle(2);
        registerPage.passwordKutusu_SK.sendKeys("ascdgstejkl");
    }
    @And("kullanici sadece kucuk harflerden olusan bir sifre ile kayit olamaz_SK")
    public void kullaniciSadeceKucukHarflerdenOlusanBirSifreIleKayitOlamaz() {
        assertTrue(registerPage.passwordRequried_SK.getText().contains("One uppercase character"));
    }

    @And("kullanici Password alanina sadece buyuk harflerden olusan bir sifre girer_SK")  //TC15
    public void kullaniciPasswordAlaninaSadeceBuyukHarflerdenOlusanBirSifreGirer() {
        ReusableMethods.bekle(2);
        registerPage.passwordKutusu_SK.sendKeys("ASCDBEJDKFL");
    }
    @And("kullanici sadece buyuk harflerden olusan bir sifre ile kayit olamaz_SK")
    public void kullaniciSadeceBuyukHarflerdenOlusanBirSifreIleKayitOlamaz() {
        assertTrue(registerPage.passwordRequried_SK.getText().contains("One lowercase character"));
    }
    @And("kullanici Password alanina sadece buyuk ve kucuk harflerden olusan bir sifre girer_SK") //TC16
    public void kullaniciPasswordAlaninaSadeceBuyukVeKucukHarflerdenOlusanBirSifreGirer() {
        ReusableMethods.bekle(2);
        registerPage.passwordKutusu_SK.sendKeys("ASCDBEJDKFLacsbdnjdjd");

    }
    @And("kullanici sadece buyuk ve kucuk harflerden olusan bir sifre ile kayit olamaz_SK")
    public void kullaniciSadeceBuyukVeKucukHarflerdenOlusanBirSifreIleKayitOlamaz() {
        assertTrue(registerPage.passwordRequried_SK.getText().contains("One number"));
    }
    @And("kullanici Password alanina sadece rakam ve buyuk harflerden olusan bir sifre girer_SK")  //TC17
    public void kullaniciPasswordAlaninaSadeceRakamVeBuyukHarflerdenOlusanBirSifreGirer() {
        ReusableMethods.bekle(2);
        registerPage.passwordKutusu_SK.sendKeys("ASCDBEJDKFL123456");

    }
    @And("kullanici sadece rakam ve buyuk harflerden olusan bir sifre ile kayit olamaz_SK")
    public void kullaniciSadeceRakamVeBuyukHarflerdenOlusanBirSifreIleKayitOlamaz() {
        ReusableMethods.bekle(2);
        assertTrue(registerPage.passwordRequried_SK.getText().contains("One lowercase character"));

    }
    @And("kullanici SSN alanina kayitli bir ssn girer_SK")  //TC18
    public void kullaniciSSNAlaninaKayitliBirSsnGirer() {
        registerPage.ssnKutusu_SK.sendKeys("230-475-1234");

    }
    @And("Daha once kayitli bir SSN ile kayit olunamadigini dogrular_SK")
    public void dahaOnceKayitliBirSSNIleKayitOlunamadiginiDogrular() {
        assertTrue(registerPage.ssnAlreadyRegisterYazisi_SK.isDisplayed());
    }

























}
