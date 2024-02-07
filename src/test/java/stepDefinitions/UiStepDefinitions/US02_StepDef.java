package stepDefinitions.UiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.GuestUserPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class US02_StepDef {

     HomePage page=new HomePage();
     Faker faker=new Faker();
     GuestUserPage guestUser=new GuestUserPage();

    @Then("Admin olarak Login ikonunu tiklar_SK")
    public void adminOlarakLoginIkonunuTiklar() {
        page.loginButonu.click();
        ReusableMethods.bekle(2);
    }
    @And("Admin olarak username kutusununa {string} girer_SK")
    public void adminOlarakUsernameKutusununaGirer(String username) {
       guestUser.adminUserName_SK.sendKeys(ConfigReader.getProperty(username));
    }
    @And("Admin olarak password kutusuna {string} girer_SK")
    public void adminOlarakPasswordKutusunaGirer(String password) {
        ReusableMethods.bekle(2);
        guestUser.adminPasswoord_SK.sendKeys(ConfigReader.getProperty(password),Keys.TAB,Keys.ENTER);
    }
    @And("Admin olarak Login butonunu tiklar_SK")
    public void adminOlarakLoginButonunuTiklar() {
        //bir ustteki adimda yapildi
    }
    @And("Admin olarak Menu butonuna basar_SK")
    public void adminOlarakMenuButonunaBasar() {
        ReusableMethods.bekle(2);
       ReusableMethods.click(page.menu);
    }

    @And("Admin olarak Guest User linkini tiklar_SK")
    public void adminOlarakGuestUserLinkiniTiklar() {
        ReusableMethods.bekle(2);
       ReusableMethods.click(guestUser.mainMenuGuestUser_SK);

    }
    @Given("Admin Guest_User List'i gorur_SK")
    public void adminGuest_UserListIGorur() {
        ReusableMethods.bekle(2);
        assertTrue(guestUser.guestUserListYazisi_SK.isDisplayed());
    }
    @And("Admin Guest_User Name bilgilerini gorur_SK")
    public void adminGuest_UserNameBilgileriniGorur() {
        ReusableMethods.bekle(2);

        List<WebElement> namesList=guestUser.names_SK;
        for (WebElement webElement : namesList) {
            System.out.println("namesList.get(i) = " + webElement.getText());
            assertTrue(webElement.isDisplayed());
        }

    }
    //WebTabledaki datalari getiriyor(Resauble method)
    public static void printDataSK(int satir, int sutun) {
        WebElement satirSutun = Driver.getDriver().findElement(By.xpath("//tbody//tr[" + satir + "]//td[" + sutun + "]"));
        System.out.println(satirSutun.getText());
    }

    @And("Admin Guest_User Phone Number bilgilerini gorur_SK")
    public void adminGuest_UserPhoneNumberBilgileriniGorur() {
        ReusableMethods.bekle(2);
        List<WebElement> phoneNumberList=guestUser.phoneNumbers_SK;
        for (WebElement webElement : phoneNumberList) {
            System.out.println("phoneNumberList = " + webElement.getText());
            assertTrue(webElement.isDisplayed());
        }
    }

    @And("Admin Guest_User SSN bilgilerini gorur_SK")
    public void adminGuest_UserSSNBilgileriniGorur() {
        ReusableMethods.bekle(2);
        List<WebElement> SsnList=guestUser.Ssn_SK;
        for (WebElement webElement : SsnList) {
            System.out.println("SsnList = " + webElement.getText());
            assertTrue(webElement.isDisplayed());
        }
    }
    @And("Admin Guest_User User Name bilgilerini gorur_SK")
    public void adminGuest_UserUserNameBilgileriniGorur() {
        ReusableMethods.bekle(2);
        List<WebElement> userNamesList=guestUser.userNames_SK;
        for (WebElement webElement : userNamesList) {
            System.out.println("usernamesList = " + webElement.getText());
            assertTrue(webElement.isDisplayed());
        }
    }
    @Given("Admin Guest_User Delete butonunu gorur_SK")
    public void adminGuest_UserDeleteButonunuGorur() {
        ReusableMethods.bekle(2);
        assertTrue(guestUser.deleteButton_SK.isDisplayed());
    }
    @And("Admin uyari mesajini gorerek silme isleminin tamamlandigini gorur_SK")
    public void adminUyariMesajiniGorerekSilmeIslemininTamamlandiginiGorur() {
        ReusableMethods.bekle(2);
        ReusableMethods.click(guestUser.deleteButton_SK);
        ReusableMethods.bekle(2);
        assertTrue(guestUser.deletesuccesfullYazisi_SK.getText().contains("Guest User deleted Successful"));
    }
}
