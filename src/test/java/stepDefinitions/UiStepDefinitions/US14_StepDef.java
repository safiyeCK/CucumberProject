package stepDefinitions.UiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.Date;

public class US14_StepDef {
    HomePage homePage=new HomePage();
    TeacherPage teacherPage= new TeacherPage();
    Actions actions= new Actions(Driver.getDriver());
    Faker faker=new Faker();
    public String name = faker.name().firstName();
    public String surname = faker.name().lastName();
    public String phoneNumber = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);
    public String ssn = faker.number().numberBetween(100, 999) + "-77-" + faker.number().numberBetween(1000, 9999);
    String birthPlace = faker.address().city();
    String email = faker.internet().emailAddress();
    String userName = name + surname;
    String password = (faker.internet().password(7, 13, true, false, true))+"a";
    Date dof = faker.date().birthday(25, 80);

    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    String dateOfBirth = format.format(dof);


    @Given("kullanici Managementon Schools sayfasina giderSA")
    public void kullaniciManagementonSchoolsSayfasinaGiderSA() {
        Driver.getDriver().get(ConfigReader.getProperty("schoolsUrl"));

    }

    @Then("kullanici anasayfadaki login butonuna tiklarSA")
    public void kullaniciAnasayfadakiLoginButonunaTiklarSA() {
        homePage.loginButonu.click();
    }

    @And("kullanici user name ve password ile login olurSA")
    public void kullaniciUserNameVePasswordIleLoginOlurSA() {
        homePage.loginUsernameBox.sendKeys(ConfigReader.getProperty("ViceDeanUserName"), Keys.TAB, ConfigReader.getProperty("ViceDeanPassword") , Keys.TAB, Keys.ENTER);
    }
    @And("kullanici Login oldugunu dogrularSA")
    public void kullaniciLoginOldugunuDogrularSA() {
        Assert.assertTrue(homePage.menu.isDisplayed());
    }


    @But("Menu butonuta tiklarSA")
    public void menuButonutaTiklarSA() {
        homePage.menu.click();
    }

    @And("Teacher Management sayfasina giderSA")
    public void teacherManagementSayfasinaGiderSA() {
        teacherPage.teacherManagementSA.click();
    }


    @Given("Sayfayi asagi kaydirarak Teacher List gorulur")
    public void sayfayiAsagiKaydirarakTeacherListGorulur() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(teacherPage.sonSayfaSA);
        ReusableMethods.click(teacherPage.sonSayfaSA);
        ReusableMethods.scroll(teacherPage.scrollSA);
        ReusableMethods.bekle(2);

    }


    @Then("Ogretmenin Name bilgisi gorulur")
    public void ogretmeninNameBilgisiGorulur() {
        System.out.println(name);
       Assert.assertTrue(teacherPage.tableSonNameSA.getText().contains(name));

    }

    @And("Ogretmenin Phone Number bilgisi gorulur")
    public void ogretmeninPhoneNumberBilgisiGorulur() {
       Assert.assertTrue(teacherPage.tableSonPhoneNumberSA.getText().contains(phoneNumber));
    }

    @And("Ogretmenin SSN bilgisi gorulur")
    public void ogretmeninSSNBilgisiGorulur() {
        Assert.assertTrue( teacherPage.tableSonSSNSA.getText().contains(ssn));
    }

    @And("Ogretmenin User Name bilgisi gorulur")
    public void ogretmeninUserNameBilgisiGorulur() {
        Assert.assertTrue( teacherPage.tableSonUsernameSA.getText().contains(userName));

    }


    @And("Degisiklik yapilacak ogretmein yanindaki Edit butonuna tiklanir")
    public void degisiklikYapilacakOgretmeinYanindakiEditButonunaTiklanir() {
        ReusableMethods.click(teacherPage.editSA);
    }

    @And("Password girilir")
    public void passwordGirilir() {
        teacherPage.editPasswordSA.sendKeys(password);
    }

    @And("Eski Name silinerek yeni bir Name girilir")
    public void eskiNameSilinerekYeniBirNameGirilir() {
    teacherPage.editChooseLessonsSA.sendKeys(Keys.TAB,name);
    }

    @And("Degisiklik ekranindaki Submit butonuna tiklanirSA")
    public void degisiklikEkranindakiSubmitButonunaTiklanirSA() {
        ReusableMethods.click(teacherPage.editSubmitSA);
    }

    @And("Eski Surname silinerek yeni bir Surame girilir")
    public void eskiSurnameSilinerekYeniBirSurameGirilir() {
        teacherPage.editNameSA.sendKeys(Keys.TAB,surname);
    }
    @And("Eski Birth Place silinerek yeni Birth Place girilir")
    public void eskiBirthPlaceSilinerekYeniBirthPlaceGirilir() {
        teacherPage.editNameSA.sendKeys(Keys.TAB,Keys.TAB,birthPlace);
    }

    @And("Eski e-mail silinerek yeni e-mail girilir")
    public void eskiEMailSilinerekYeniEMailGirilir() {
        teacherPage.editNameSA.sendKeys(Keys.TAB,Keys.TAB, Keys.TAB, email);
    }

    @And("Eski phone number silinerek yeni phone number girilir")
    public void eskiPhoneNumberSilinerekYeniPhoneNumberGirilir() {
        teacherPage.editNameSA.sendKeys(Keys.TAB,Keys.TAB, Keys.TAB,  Keys.TAB, phoneNumber);
    }
    @And("Eski SSN silinerek yeni SSN girilir")
    public void eskiSSNSilinerekYeniSSNGirilir() {
        teacherPage.editNameSA.sendKeys(Keys.TAB,Keys.TAB, Keys.TAB,  Keys.TAB,Keys.TAB, ssn);
    }
    @And("is Advisor Teacher secenegine tiklanir")
    public void isAdvisorTeacherSecenegineTiklanir() {
        teacherPage.editIsAdvisorTeacherSA.click();
    }

    @And("Yeni Date of Birth girilir")
    public void yeniDateOfBirthGirilir() {
        teacherPage.editGenderFemaleSA.sendKeys(Keys.TAB,dateOfBirth);
    }


    @And("Eski User Name silinerek yeni User Name girilir")
    public void eskiUserNameSilinerekYeniUserNameGirilir() {

    }



    @Then("Bosluklara Name ,Surname ,Birth Place ,E-mail ,Phone Number ,Date of Birth ,SSN ,User Name,Password girilirSA")
    public void bosluklaraNameSurnameBirthPlaceEMailPhoneNumberDateOfBirthSSNUserNamePasswordGirilirSA() {
            teacherPage.nameSA.sendKeys(name, Keys.TAB,
                    surname, Keys.TAB,
                    birthPlace, Keys.TAB,
                    email, Keys.TAB,
                    phoneNumber, Keys.TAB,
                    Keys.TAB, Keys.TAB, Keys.TAB,
                    dateOfBirth, Keys.TAB, Keys.TAB,
                    ssn, Keys.TAB,
                    userName, Keys.TAB,
                    password);
        }

    @And("Edit sayfasinda Cinsiyet secilirSA")
    public void editSayfasindaCinsiyetSecilirSA() {
        teacherPage.editGenderFemaleSA.click();
    }

    @Then("Edit sayfasinda Choose Lessons kismindan ders {string} secilirSA")
    public void editSayfasindaChooseLessonsKismindanDersSecilirSA(String ders) {
        ReusableMethods.bekle(2);
        teacherPage.editChooseLessonsSA.sendKeys(ders, Keys.ENTER);
    }

    @And("Degisiklik yapildigi dogrulanir")
    public void degisiklikYapildigiDogrulanir() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(teacherPage.onaySA.getText().contains("updated"));
    }



}

