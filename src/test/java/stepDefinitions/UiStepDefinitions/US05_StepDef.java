package stepDefinitions.UiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DeanPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Date;

import static stepDefinitions.UiStepDefinitions.US04_StepDef.*;

public class US05_StepDef {
    static Faker faker=new Faker();
    DeanPage deanPage=new DeanPage();
    public static String nameEsii = faker.name().firstName();
    public static String surnameEsii = faker.name().lastName();
    public static String phoneNummerEsii = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);
    public static String ssnEsii = faker.number().numberBetween(100, 899) + "-" +faker.number().numberBetween(10,99)+"-" + faker.number().numberBetween(1000, 9999);
    public static String birthPlaceEsii = faker.address().city();
    public static Date dateEsii = faker.date().birthday(25, 60);
    public static SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    public static SimpleDateFormat format3 = new SimpleDateFormat("yyyy-MM-dd");
    public static String dateOfBirthEsi = format.format(dateEsii);
    public static String birthdayEsii= format3.format(dateEsii);
    public static String userNameEsii = nameEsii + surnameEsii;

    public static String passwordEsii= faker.internet().password()+"Aa2";



    @Then("Dean'lerin Gender bilgilerinin goruldugunu dogrular Esi")
    public void deanLerinGenderBilgilerininGoruldugunuDogrularEsi() {
        Assert.assertEquals("MALE",deanPage.tableSonGender.getText());
    }

    @Given("Admin bir Dean hesabi olusturur Esi")
    public static void adminBirDeanHesabiOlustururEsi() {
        System.out.println(userNameEsi);
        deanPageEsi.deanNameEsi.sendKeys(nameEsi, Keys.TAB,
                                      surnameEsi,Keys.TAB,
                                       birthPlaceEsi,Keys.TAB,Keys.TAB,
                dateOfBirthEsi,Keys.TAB,
                phoneNummerEsi,Keys.TAB,
                ssnEsi,Keys.TAB,
                userNameEsi,Keys.TAB,
                passwordEsi,Keys.TAB

        );
        deanPageEsi.deanGenderMaleEsi.click();
        deanPageEsi.deanSubmitButonuEsi.click();

    }

    @Then("Dean'lerin Name bilgilerinin goruldugunu dogrular Esi")
    public void deanLerinNameBilgilerininGoruldugunuDogrularEsi() {
        ReusableMethods.bekle(3);
        Assert.assertTrue(deanPage.tableSonNames.getText().contains(nameEsi));
    }

    @Then("Dean'lerin Phone Number bilgilerinin goruldugunu dogrular Esi")
    public void deanLerinPhoneNumberBilgilerininGoruldugunuDogrularEsi() {
        Assert.assertEquals(phoneNummerEsi,deanPage.tableSonPhone.getText());
    }

    @Then("Dean'lerin Ssn bilgilerinin goruldugunu dogrular Esi")
    public void deanLerinSsnBilgilerininGoruldugunuDogrularEsi() {
        Assert.assertEquals(ssnEsi,deanPage.tableSonSsn.getText());
    }

    @Then("Dean'lerin username bilgilerinin goruldugunu dogrular Esi")
    public void deanLerinUsernameBilgilerininGoruldugunuDogrularEsi() {
        Assert.assertEquals(userNameEsi,deanPage.tableSonUsernames.getText());
    }

    @Then("Dean List bolumunun son sayfasina gider")
    public void deanListBolumununSonSayfasinaGider() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        ReusableMethods.click(deanPage.tableSonPage);

    }

    @Then("Dean List kismindan olusturulan Dean hesabi için edit butonuna tiklanir Esi")
    public void deanListKismindanOlusturulanDeanHesabiIçinEditButonunaTiklanirEsi() {
        ReusableMethods.click(deanPage.tableSonEdit);
    }

    @Then("Acilan pencereden name kismi güncellenir Esi")
    public void acilanPenceredenNameKismiGüncellenirEsi() {
        ReusableMethods.jsClear(deanPage.updateNameEsi);
        deanPage.updateNameEsi.sendKeys(nameEsi+"dean");
    }

    @Then("Gender kismi secilir Esi")
    public void genderKismiSecilirEsi() {
        deanPage.updateGenderEsi.click();
    }

    @Then("Password girilir Esi")
    public void passwordGirilirEsi() {
        deanPage.updatePasswordEsi.sendKeys(passwordEsi);
    }

    @Then("Submit butonuna tiklanir Esi")
    public void submitButonunaTiklanirEsi() {
        deanPage.updatePasswordEsi.sendKeys(Keys.TAB,Keys.ENTER);
        ReusableMethods.bekle(1);

    }

    @Then("Basarili bir sekilde guncellendigini dogrula Esi")
    public void basariliBirSekildeGuncellendiginiDogrulaEsi() {
        Assert.assertTrue(deanPage.deanSavedEsi.getText().contains("Successful"));
    }

    @Then("Surname kismi güncellenir Esi")
    public void surnameKismiGüncellenirEsi() {
        ReusableMethods.jsClear(deanPage.updateSurnameEsi);
        deanPage.updateSurnameEsi.sendKeys(surnameEsi+"dean");
    }

    @Then("Birth place kismi güncellenir Esi")
    public void birthPlaceKismiGüncellenirEsi() {
        ReusableMethods.jsClear(deanPage.updateBirtplaceEsi);
        deanPage.updateBirtplaceEsi.sendKeys(birthPlaceEsi+"Q");
    }

    @Then("Gender kismi güncellenir Esi")
    public void genderKismiGüncellenirEsi() {
        deanPage.updateGender2Esi.click();;
    }

    @Then("Date of birth kismi güncellenir Esi")
    public void dateOfBirthKismiGüncellenirEsi() {
        Date dateEsi = faker.date().birthday(25, 60);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        String dateOfBirthEsii = format.format(dateEsi);

        deanPage.updateBirtDayEsi.sendKeys(dateOfBirthEsii);
    }

    @Then("Phone kismi güncellenir Esi")
    public void phoneKismiGüncellenirEsi() {
        String phoneNummerEsii = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);
        ReusableMethods.jsClear(deanPage.updatePhoneEsi);
        deanPage.updatePhoneEsi.sendKeys(phoneNummerEsii);
    }

    @Then("Ssn kismi güncellenir Esi")
    public void ssnKismiGüncellenirEsi() {
        String ssnEsii = faker.number().numberBetween(100, 899) + "-" +faker.number().numberBetween(10,99)+"-" + faker.number().numberBetween(1000, 9999);

        ReusableMethods.jsClear(deanPage.updateSsnEsi);
        deanPage.updateSsnEsi.sendKeys(ssnEsii);
    }

    @Then("Username kismi guncellenir Esi")
    public void usernameKismiGuncellenirEsi() {

        ReusableMethods.jsClear(deanPage.updateUsernameEsi);
        deanPage.updateUsernameEsi.sendKeys(userNameEsi+"Us");
    }

    @Then("Password kismi guncellenir Esi")
    public void passwordKismiGuncellenirEsi() {
        ReusableMethods.jsClear(deanPage.updatePasswordEsi);
        deanPage.updatePasswordEsi.sendKeys("Admin123");
    }
}
