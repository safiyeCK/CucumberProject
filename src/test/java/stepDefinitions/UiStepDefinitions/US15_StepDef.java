package stepDefinitions.UiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.ViceDeanPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import static junit.framework.TestCase.assertTrue;

public class US15_StepDef {
    ViceDeanPage viceDeanPage = new ViceDeanPage();
    Faker faker=new Faker();

    String name_DB = faker.name().firstName();
    String surname_DB = faker.name().lastName() ;
    String phoneNumber_DB = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);
    String ssn_DB = faker.number().numberBetween(100, 899) + "-"+faker.number().numberBetween(10, 99)+"-" + faker.number().numberBetween(1000, 9999);
    String birthPlace_DB = faker.address().city();
    String email_DB = faker.internet().emailAddress();
    Date date_DB = faker.date().birthday(18, 60);
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    String dateOfBirth_DB = format.format(date_DB);
    String userName_DB = name_DB + surname_DB;

    String password_DB=faker.internet().password(8,13,true,false,true);

    @Given("kullanici  Managementon Schools sayfasina gider_DB")
    public void kullaniciManagementonSchoolsSayfasinaGider_DB() {
        Driver.getDriver().get(ConfigReader.getProperty("schoolsUrl"));
        ReusableMethods.bekle(2);
    }

    @Then("kullanici login butonuna tiklar_DB")
    public void kullaniciLoginButonunaTiklar_DB() {
        viceDeanPage.loginButton_DB.click();
        ReusableMethods.bekle(2);
    }

    @Then("kullanici kayitli User Name ve password ile Vise Dean olarak giris yapar_DB")
    public void kullaniciKayitliUserNameVePasswordIleViseDeanOlarakGirisYapar_DB() {
        String username = ConfigReader.getProperty("userName_DB");
        String password = ConfigReader.getProperty("password_DB");
        viceDeanPage.loginUserNameBox_DB.sendKeys(username, Keys.TAB,password,Keys.TAB,Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @Then("kullanici menu butonuna tiklar_DB")
    public void kullaniciMenuButonunaTiklar_DB() {
        viceDeanPage.menuButton_DB.click();
        ReusableMethods.bekle(2);
    }

    @Then("kullanici menu kismindan Student Management i secer_DB")
    public void kullaniciMenuKismindanStudentManagementISecer_DB() {
        viceDeanPage.studentManagement_DB.click();
        ReusableMethods.bekle(2);
    }

    @Given("kullanici Choose Advisor Teacher kismindan {string} secer")
    public void kullaniciChooseAdvisorTeacherKismindanSecer(String teacher) {
        viceDeanPage.chooseTeacher_DB.sendKeys(teacher, Keys.ENTER);
        ReusableMethods.bekle(1);
    }
    @Then("kullanici name alanina isim girer_DB")
    public void kullaniciNameAlaninaIsimGirer_DB() {
        viceDeanPage.nameBox_DB.sendKeys(name_DB);
        ReusableMethods.bekle(1);
    }
    @And("kullanici surname alanina soyisim girer_DB")
    public void kullaniciSurnameAlaninaSoyisimGirer_DB() {
        viceDeanPage.sunameBox_DB.sendKeys(surname_DB);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Birth Place alanina dogum yeri girer_DB")
    public void kullaniciBirthPlaceAlaninaDogumYeriGirer_DB() {
        viceDeanPage.birthPlaceBox_DB.sendKeys(birthPlace_DB);
        ReusableMethods.bekle(1);
    }

    @And("kullanci Email alanina email girer_DB")
    public void kullanciEmailAlaninaEmailGirer_DB() {
        viceDeanPage.emailBox_DB.sendKeys(email_DB);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Phone Number alanina telefonnumarasi girer_DB")
    public void kullaniciPhoneNumberAlaninaTelefonnumarasiGirer_DB() {
        viceDeanPage.phoneNumberBox_DB.sendKeys(phoneNumber_DB);
        ReusableMethods.bekle(1);

    }

    @And("kullanici Gender alanindan {string} secenegini secer_DB")
    public void kullaniciGenderAlanindanSeceneginiSecer_DB(String cinsiyet) {
        String gender = "";
        if (cinsiyet.equalsIgnoreCase("FEMALE")) {
            viceDeanPage.femaleRadioButton_DB.click();
            gender = "FEMALE";
        } else if (cinsiyet.equalsIgnoreCase("MALE")) {
            viceDeanPage.femaleRadioButton_DB.click();
            gender = "MALE";
        } else {
            System.out.println("Hatalı veri girdiniz.");
        }
        ReusableMethods.bekle(1);
    }

    @And("kullanici Birth Date alanina dogum gunu girer_DB")
    public void kullaniciBirthDateAlaninaDogumGunuGirer_DB() {
        viceDeanPage.birthDayBox_DB.sendKeys(dateOfBirth_DB);
        ReusableMethods.bekle(1);
    }

    @And("kullanici SSN alanina ssn girer_DB")
    public void kullaniciSSNAlaninaSsnGirer_DB() {
        viceDeanPage.ssnBox_DB.sendKeys(ssn_DB);
        ReusableMethods.bekle(1);
    }

    @And("kullanici User Name alanina username girer_DB")
    public void kullaniciUserNameAlaninaUsernameGirer_DB() {
        viceDeanPage.usernameBox_DB.sendKeys(userName_DB);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Father Name alanina baba adi girer_DB")
    public void kullaniciFatherNameAlaninaBabaAdiGirer_DB() {
        viceDeanPage.fatherNameBox_DB.sendKeys(name_DB);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Mother Name alanina anne adi girer_DB")
    public void kullaniciMotherNameAlaninaAnneAdiGirer_DB() {
        viceDeanPage.motherNameBox_DB.sendKeys(name_DB);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Password alanina password girer_DB")
    public void kullaniciPasswordAlaninaPasswordGirer_DB() {
        viceDeanPage.passwordBox_DB.sendKeys(password_DB);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Submit dugmesine tiklar_DB")
    public void kullaniciSubmitDugmesineTiklar_DB() {
        viceDeanPage.submitButton_DB.click();
        ReusableMethods.bekle(1);
    }

    @And("kullanici Ogrenci olustugunu dogrular_DB")
    public void kullaniciOgrenciOlustugunuDogrular_DB() {
        Assert.assertTrue(viceDeanPage.studentVerify_DB.getText().contains("Student saved Successfully"));
        ReusableMethods.bekle(1);
    }

    @And("Kullanici sayfayi kapatir_DB")
    public void kullaniciSayfayiKapatir_DB() {
        ReusableMethods.bekle(1);
        Driver.closeDriver();//tc01
    }

    @Then("kullanici name alanini bos birakir_DB")
    public void kullaniciNameAlaniniBosBirakir_DB() {
        viceDeanPage.nameBox_DB.sendKeys("");
    }

    @And("Name kutusu bos olunca ogrencinin olusturulamadigini dogrular_DB")
    public void nameKutusuBosOluncaOgrencininOlusturulamadiginiDogrular_DB() {
        ReusableMethods.bekle(2);
        assertTrue(viceDeanPage.requiredName_DB.isDisplayed());//tc02
    }

    @And("kullanici surname alanini bos birakir_DB")
    public void kullaniciSurnameAlaniniBosBirakir_DB() {
        viceDeanPage.sunameBox_DB.sendKeys("");
        ReusableMethods.bekle(2);
    }

    @And("Surname kutusu bos olunca ogrencinin olusturulamadigini dogrular_DB")
    public void surnameKutusuBosOluncaOgrencininOlusturulamadiginiDogrular_DB() {
        ReusableMethods.bekle(2);
        assertTrue(viceDeanPage.requiredSurname_DB.isDisplayed());//tc03
    }
    @And("kullanici Birth Place alanini bos birakir_DB")
    public void kullaniciBirthPlaceAlaniniBosBirakir_DB() {
        viceDeanPage.birthPlaceBox_DB.sendKeys("");
        ReusableMethods.bekle(2);
    }
    @And("Birth Place kutusu bos olunca ogrencinin olusturulamadigini dogrular_DB")
    public void birthPlaceKutusuBosOluncaOgrencininOlusturulamadiginiDogrular_DB() {
        ReusableMethods.bekle(2);
        assertTrue(viceDeanPage.requiredBirthPlace_DB.isDisplayed());//tc04
    }

    @And("kullanci Email alanini bos birakir_DB")
    public void kullanciEmailAlaniniBosBirakir_DB() {
        viceDeanPage.emailBox_DB.sendKeys("");
        ReusableMethods.bekle(2);
    }
    @And("Email alani bos olunca ogrencinin olusturulamadigini dogrular_DB")
    public void emailAlaniBosOluncaOgrencininOlusturulamadiginiDogrular_DB() {
        ReusableMethods.bekle(2);
        assertTrue(viceDeanPage.requiredEmail_DB.isDisplayed());//tc05
    }

    @And("kullanici Phone Number alaninbos birakir_DB")
    public void kullaniciPhoneNumberAlaninbosBirakir_DB() {
        viceDeanPage.phoneNumberBox_DB.sendKeys("");
        ReusableMethods.bekle(2);
    }

    @And("phone Number kutusu bos olunca ogrencinin olusturulamadigini dogrular_DB")
    public void phoneNumberKutusuBosOluncaOgrencininOlusturulamadiginiDogrular_DB() {
        ReusableMethods.bekle(2);
        assertTrue(viceDeanPage.requiredPhone_DB.isDisplayed());//tc06
    }

    @And("kullanici Gender alaninni bos birakir_DB")
    public void kullaniciGenderAlaninniBosBirakir_DB() {
    }
    @And("Gender kismini bos birakarak ogrenci olusturulamadigini dogrular_DB")
    public void genderKisminiBosBirakarakOgrenciOlusturulamadiginiDogrular_DB() {
        assertTrue(viceDeanPage.assertGender_DB.isDisplayed());//tc07

    }

    @And("kullanici Birth Place alanini bos birakirDB")
    public void kullaniciBirthPlaceAlaniniBosBirakirDB() {
    }
    @And("Birth Date alanıni bos birakarak ogrenci olusturulamadigini dogrular_DB")
    public void birthDateAlanıniBosBirakarakOgrenciOlusturulamadiginiDogrular_DB() {
        ReusableMethods.bekle(2);
        assertTrue(viceDeanPage.requiredBirthPlace_DB.isDisplayed());//tc08
    }
    @And("kullanici SSN alanina patterne uygun olmayan bir numara girer_DB")
    public void kullaniciSSNAlaninaPatterneUygunOlmayanBirNumaraGirer_DB() {
        viceDeanPage.ssnBox_DB.sendKeys("123-432-1234");
        ReusableMethods.bekle(2);
    }
    @And("SSN alanina patterne uygun olmayan bir numara girildigi icin ogrencinin olusturulamadigini dogrular_DB")
    public void ssnAlaninaPatterneUygunOlmayanBirNumaraGirildigiIcinOgrencininOlusturulamadiginiDogrular_DB() {
        assertTrue(viceDeanPage.ssnHataYazisi_DB.isDisplayed());//tc09
    }

    @And("kullanici SSN alanini bos birakir_DB")
    public void kullaniciSSNAlaniniBosBirakir_DB() {
    }
    @And("ssn kutusu bos olunca ogrencinin olusturulamadigini dogrular_DB")
    public void ssnKutusuBosOluncaOgrencininOlusturulamadiginiDogrular_DB() {
        assertTrue(viceDeanPage.requiredSsn_DB.isDisplayed());//tc10
    }

    @And("kullanici User Name alanini bos birakir_DB")
    public void kullaniciUserNameAlaniniBosBirakir_DB() {
    }
    @And("User Name alani bos birakilarak ogrencinin olusturulamadigini dogrular_DB")
    public void userNameAlaniBosBirakilarakOgrencininOlusturulamadiginiDogrular_DB() {
        viceDeanPage.requiredUserName_DB.isDisplayed();//tc11
    }
    @And("kullanici Father Name alanini bos birakir_DB")
    public void kullaniciFatherNameAlaniniBosBirakir_DB() {
    }
    @And("Father Name alani bos birakilarak  ogrencinin olusturulamadigini dogrular_DB")
    public void fatherNameAlaniBosBirakilarakOgrencininOlusturulamadiginiDogrular_DB() {
        viceDeanPage.requiredFatherName_DB.isDisplayed();//tc12
    }
    @And("kullanici Mother Name alanini bos birakir_DB")
    public void kullaniciMotherNameAlaniniBosBirakir_DB() {
    }
    @And("Mother Name alani bos birakilarak ogrencinin olusturulamadigini dogrular_DB")
    public void motherNameAlaniBosBirakilarakOgrencininOlusturulamadiginiDogrular_DB() {
        viceDeanPage.requiredMotherName_DB.isDisplayed();//tc13
    }
    @And("kullanici Password alanini bois birakir_DB")
    public void kullaniciPasswordAlaniniBoisBirakir_DB() {
    }
    @And("Password alani bos birakilarak ogrencinin olusturulamadigini dogrular_DB")
    public void passwordAlaniBosBirakilarakOgrencininOlusturulamadiginiDogrular_DB() {
        viceDeanPage.requiredPassword_DB.isDisplayed();//tc14
    }

    @And("kullanici Password alanina yedi karakterli bir  {string} girer_DB")
    public void kullaniciPasswordAlaninaYediKarakterliBirGirer_DB(String sifre) {
        sifre = rasgeleSifreOlustur(7);
        viceDeanPage.passwordBox_DB.sendKeys(sifre);
    }
    // Belirli bir karakter sayısına sahip rasgele bir şifre oluşturan bir yardımcı method
    public String rasgeleSifreOlustur(int karakterSayisi) {
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
    @And("Sekiz karakterden daha az karakterli bir sifre ile ogrencinin olusturulamadigini dogrular_DB")
    public void sekizKarakterdenDahaAzKarakterliBirSifreIleOgrencininOlusturulamadiginiDogrular_DB() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(viceDeanPage.requiredPassword_DB.getText().contains("At least 8 characters"));//tc15
    }


    @And("kullanici Password alanina sadece rakamlardan olusan password girer_DB")
    public void kullaniciPasswordAlaninaSadeceRakamlardanOlusanPasswordGirer_DB() {
        ReusableMethods.bekle(2);
        viceDeanPage.passwordBox_DB.sendKeys("123456789");
    }

    @And("Ogrencinin olusturulamadigini dogrular_DB")
    public void ogrencininOlusturulamadiginiDogrular_DB() {
        Assert.assertTrue(viceDeanPage.requiredPassword_DB.getText().contains("One lowercase character"));//tc16
    }

    @And("kullanici Password alanina sadece kucuk harflerden olusan bir sifre girer_DB")
    public void kullaniciPasswordAlaninaSadeceKucukHarflerdenOlusanBirSifreGirer_DB() {
        ReusableMethods.bekle(2);
        viceDeanPage.passwordBox_DB.sendKeys("ascdgstejkl");
    }

    @And("kullanici sadece kucuk harflerden olusan bir sifre ile ogrencinin olusturulamadigini dogrular_DB")
    public void kullaniciSadeceKucukHarflerdenOlusanBirSifreIleOgrencininOlusturulamadiginiDogrular_DB() {
        Assert.assertTrue(viceDeanPage.requiredPassword_DB.getText().contains("One uppercase character"));//tc17
    }

    @And("kullanici Password alanina sadece buyuk harflerden olusan bir sifre girer_DB")
    public void kullaniciPasswordAlaninaSadeceBuyukHarflerdenOlusanBirSifreGirer_DB() {
        ReusableMethods.bekle(2);
        viceDeanPage.passwordBox_DB.sendKeys("ASDFGHJKL");
    }

    @And("kullanici sadece buyuk harflerden olusan bir sifre ile ogrencinin olusturulamadigini dogrular_DB")
    public void kullaniciSadeceBuyukHarflerdenOlusanBirSifreIleOgrencininOlusturulamadiginiDogrular_DB() {
        Assert.assertTrue(viceDeanPage.requiredPassword_DB.getText().contains("One lowercase character"));//tc18
    }

    @And("kullanici Password alanina sadece buyuk ve kucuk harflerden olusan password girer_DB")
    public void kullaniciPasswordAlaninaSadeceBuyukVeKucukHarflerdenOlusanPasswordGirer_DB() {
        ReusableMethods.bekle(2);
        viceDeanPage.passwordBox_DB.sendKeys("ASCDBEJDKFLacsbdnjdjd");
    }
    @And("kullanici sadece buyuk ve kucuk harflerden olusan bir sifre ile ogrencinin olusturulamadigini dogrular_DB")
    public void kullaniciSadeceBuyukVeKucukHarflerdenOlusanBirSifreIleOgrencininOlusturulamadiginiDogrular_DB() {
        Assert.assertTrue(viceDeanPage.requiredPassword_DB.getText().contains("One number"));//tc19
    }

    @And("kullanici Password alanina sadece rakam ve buyuk harflerden olusan bir password girer_DB")
    public void kullaniciPasswordAlaninaSadeceRakamVeBuyukHarflerdenOlusanBirPasswordGirer_DB() {
        ReusableMethods.bekle(2);
        viceDeanPage.passwordBox_DB.sendKeys("ASCDBEJDKFL123456");
    }
    @And("kullanici sadece rakam ve buyuk harflerden olusan bir sifre ile ogrencinin olusturulamadigini dogrular_DB")
    public void kullaniciSadeceRakamVeBuyukHarflerdenOlusanBirSifreIleOgrencininOlusturulamadiginiDogrular_DB() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(viceDeanPage.requiredPassword_DB.getText().contains("One lowercase character"));//tc20
    }

    @And("kullanici SSN alanina daha once kayitli bir SSN number girer_DB")
    public void kullaniciSSNAlaninaDahaOnceKayitliBirSSNNumberGirer_DB() {
        viceDeanPage.ssnBox_DB.sendKeys("230-475-1234");
    }
    @And("Daha once kayitli bir SSN ile ogrencinin olusturulamadigini dogrular_DB")
    public void dahaOnceKayitliBirSSNIleOgrencininOlusturulamadiginiDogrular_DB() {
        Assert.assertTrue(viceDeanPage.ssnAlreadyRegisterYazisi_DB.isDisplayed());
    }

    @Then("kullanici kayitli User Name ve password ile Admin olarak giris yapar_DB")
    public void kullaniciKayitliUserNameVePasswordIleAdminOlarakGirisYapar_DB() {
        String username = ConfigReader.getProperty("AdminUserName_DB");
        String password = ConfigReader.getProperty("AdminPassword_DB");
        viceDeanPage.loginUserNameBox_DB.sendKeys(username, Keys.TAB,password,Keys.TAB,Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @Then("kullanici name alanina {string} girer_DB")
    public void kullaniciNameAlaninaGirer_DB(String name) {
            viceDeanPage.nameBox_DB.sendKeys(name);
            ReusableMethods.bekle(1);
    }
    @And("kullanici surname alanina {string} girer_DB")
    public void kullaniciSurnameAlaninaGirer_DB(String surname) {
        viceDeanPage.sunameBox_DB.sendKeys(surname);
        ReusableMethods.bekle(1);
    }
    @And("kullanici Birth Place alanina {string} girer_DB")
    public void kullaniciBirthPlaceAlaninaGirer_DB(String bPlace) {
        viceDeanPage.birthPlaceBox_DB.sendKeys(bPlace);
        ReusableMethods.bekle(1);
    }
    @And("kullanci Email alanina {string} girer_DB")
    public void kullanciEmailAlaninaGirer_DB(String eMail) {
        viceDeanPage.emailBox_DB.sendKeys(eMail);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Phone Number alanina {string} girer_DB")
    public void kullaniciPhoneNumberAlaninaGirer_DB(String Pnumber) {
        viceDeanPage.phoneNumberBox_DB.sendKeys(Pnumber);
        ReusableMethods.bekle(1);
    }
    @And("kullanici Birth Date alanina {string} girer_DB")
    public void kullaniciBirthDateAlaninaGirer_DB(String Bdate) {
        viceDeanPage.birthDayBox_DB.sendKeys(Bdate);
        ReusableMethods.bekle(1);
    }

    @And("kullanici SSN alanina {string} girer_DB")
    public void kullaniciSSNAlaninaGirer_DB(String ssn) {
        viceDeanPage.ssnBox_DB.sendKeys(ssn);
        ReusableMethods.bekle(1);
    }
    @And("kullanici User Name alanina {string} girer_DB")
    public void kullaniciUserNameAlaninaGirer_DB(String userName) {
        viceDeanPage.usernameBox_DB.sendKeys(userName);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Father Name alanina {string} girer_DB")
    public void kullaniciFatherNameAlaninaGirer_DB(String Fname) {
        viceDeanPage.fatherNameBox_DB.sendKeys(Fname);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Mother Name alanina {string} girer_DB")
    public void kullaniciMotherNameAlaninaGirer_DB(String Mname) {
        viceDeanPage.motherNameBox_DB.sendKeys(Mname);
        ReusableMethods.bekle(1);
    }
    @And("kullanici Password alanina {string} girer_DB")
    public void kullaniciPasswordAlaninaGirer_DB(String password) {
        viceDeanPage.passwordBox_DB.sendKeys(password);
        ReusableMethods.bekle(1);

    }
}
