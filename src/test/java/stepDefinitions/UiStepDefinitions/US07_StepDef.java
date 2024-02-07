package stepDefinitions.UiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DeanPage;
import utilities.ReusableMethods;

public class US07_StepDef {
    DeanPage deanPage=new DeanPage();

    @And("Menu butonuna tiklanilir.")
    public void menuButonunaTiklanilir() {
        deanPage.deanMenuButonKI.click();
    }

    @Then("{string} a tiklanilir.")
    public void aTiklanilir(String arg0) {
        deanPage.contactAllMessageButonKI.click();
    }

    @Then("Basligin {string} icerdgi kontrol edilir.")
    public void basliginIcerdgiKontrolEdilir(String arg0) {
        Assert.assertEquals("Contact Message",deanPage.contactMessageBasligiKI.getText());
    }
    @Given("Olusturulan Name bilgilerinin görüntülendiğini doğrula.")
    public void olusturulanNameBilgilerininGörüntülendiğiniDoğrula() {
        Assert.assertTrue(deanPage.contactNameKI.isDisplayed());
    }

    @And("Olusturulan Email bilgilerinin görüntülendiğini doğrula.")
    public void olusturulanEmailBilgilerininGörüntülendiğiniDoğrula() {
        Assert.assertTrue(deanPage.contactEmailKI.isDisplayed());
    }

    @Then("Olusturulan Date bilgilerinin görüntülendiğini doğrula.")
    public void olusturulanDateBilgilerininGörüntülendiğiniDoğrula() {
        Assert.assertTrue(deanPage.contactDateKI.isDisplayed());
    }

    @And("Olusturulan Subject bilgilerinin görüntülendiğini doğrula.")
    public void olusturulanSubjectBilgilerininGörüntülendiğiniDoğrula() {
        Assert.assertTrue(deanPage.contactSubjectKI.isDisplayed());
    }

    @And("Olusturulan Message bilgilerinin görüntülendiğini doğrula.")
    public void olusturulanMessageBilgilerininGörüntülendiğiniDoğrula() {
        Assert.assertTrue(deanPage.contactMessageKI.isDisplayed());
    }

}
