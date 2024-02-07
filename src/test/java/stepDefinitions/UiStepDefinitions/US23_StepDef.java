package stepDefinitions.UiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AdminPage;
import pages.HomePage;
import utilities.ConfigReader;

import javax.swing.*;

public class US23_StepDef {
    HomePage homePage=new HomePage();
    AdminPage adminPage=new AdminPage();
    @And("Kullanici Username ve Password girerKI")
    public void kullaniciUsernameVePasswordGirerKI() {
        homePage.loginUsernameBox.sendKeys(ConfigReader.getProperty("adminKenan"), Keys.TAB,
                ConfigReader.getProperty("kenanPas"),Keys.TAB, Keys.ENTER);

    }

    @And("Sayfa Basliginin {string} oldugu dogrulanirKI")
    public void sayfaBasligininOlduguDogrulanirKI(String arg0) {
        Assert.assertTrue(adminPage.adminBasligi.getText().contains(arg0));
    }

    @And("Admin sayfasinda Menu butonuna tiklarKI")
    public void adminSayfasindaMenuButonunaTiklarKI() {
        adminPage.adminMenuButonKI.click();
    }

    @Then("Vice Dean secilirKI")
    public void viceDeanSecilirKI() {
        adminPage.viceDeanSelectKI.click();
    }

    @Then("Vice Dean Saved Islemi basariyla tamamlanirKI")
    public void viceDeanSavedIslemiBasariylaTamamlanirKI() {
        Assert.assertTrue(adminPage.viceDeanSavedKI.getText().contains("Vice dean Saved"));

    }


}
