package stepDefinitions.UiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US03_StepDef {
    HomePage page=new HomePage();
    Faker faker=new Faker();

    @Then("Contact butonuna tiklar_SK")  //tc01
    public void contactButonunaTiklar_SK() {
        ReusableMethods.click(page.contactLinki_SK);
        ReusableMethods.bekle(2);
    }
    @And("Your name alanina herhangi bir karakter iceren isim girer_SK")
    public void yourNameAlaninaHerhangiBirKarakterIcerenIsimGirer_SK() {
        page.yournameKutusu_SK.sendKeys(faker.name().fullName());
        ReusableMethods.bekle(2);
    }
    @And("Your Email alanina icinde @ ve . karakterleri olan bir email adresi girer_SK")
    public void yourEmailAlaninaIcindeVeKarakterleriOlanBirEmailAdresiGirer_SK() {
        page.yourEmailKutusu_SK.sendKeys(faker.internet().emailAddress());
        ReusableMethods.bekle(2);
    }
    @And("Subject alanina mesaj hakkinda bir konu basligi girer_SK")
    public void subjectAlaninaMesajHakkindaBirKonuBasligiGirer_SK() {
        page.subjectKutusu_SK.sendKeys(faker.lorem().characters(5,10));

    }
    @And("Message alanina icinde harf,rakam ve ozel karakterler olan bir mesaj girer_SK")
    public void messageAlaninaIcindeHarfRakamVeOzelKarakterlerOlanBirMesajGirer_SK() {
        page.messageKutusu_SK.sendKeys(faker.lorem().sentence(5));
        ReusableMethods.bekle(2);
    }
    @And("Send Message butonuna tiklar_SK")
    public void sendMessageButonunaTiklar_SK() {
        ReusableMethods.click(page.sendMessageButton_SK);
        ReusableMethods.bekle(2);
    }

    @And("Mesajin gonderilebildigini dogrular_SK")
    public void mesajinGonderilebildiginiDogrular_SK() {
        assertTrue(page.contactMessageCreated_SK.getText().contains("Contact Message Created Successfully"));
        ReusableMethods.bekle(2);
    }
    @And("Your Name alanini bos birakir_SK")  //tc02
    public void yourNameAlaniniBosBirakir_SK() {
        page.yournameKutusu_SK.sendKeys("");
    }
    @And("YourName kutusu bos oldugu icin mesajin gonderilemedigini dogrular_SK")
    public void yournameKutusuBosOlduguIcinMesajinGonderilemediginiDogrular_SK() {
        assertTrue(page.yournameKutusuRequired_SK.isDisplayed());
        ReusableMethods.bekle(2);
    }
    @And("Your Email alanina icinde @ ve . karakterleri olmayan bir email adresi girer_SK") //tc03
    public void yourEmailAlaninaIcindeVeKarakterleriOlmayanBirEmailAdresiGirer_SK() {
        page.yourEmailKutusu_SK.sendKeys("aaaaaaaaa");
    }
    @And("Youremail kutusuna gecersiz bir email girildigi  icin mesajin gonderilemedigini dogrular_SK")
    public void youremailKutusunaGecersizBirEmailGirildigiIcinMesajinGonderilemediginiDogrular_SK() {
        assertTrue(page.pleaseEnterValidEmailYazisi_SK.getText().contains("Please enter valid email"));
        ReusableMethods.bekle(2);
    }

    @And("Subject alanini bos birakir_SK")
    public void subjectAlaniniBosBirakir_SK() {  //tc04
        page.subjectKutusu_SK.sendKeys("");

    }
    @And("Subject kutusu bos oldugu icin mesajin gonderilemedigini dogrular_SK")
    public void subjectKutusuBosOlduguIcinMesajinGonderilemediginiDogrular_SK() {
        ReusableMethods.bekle(2);
        assertTrue(page.subjectKutusuRequired_SK.isDisplayed());
        ReusableMethods.bekle(2);
    }
    @And("Message alanini bos birakir_SK")
    public void messageAlaniniBosBirakir_SK() {    //tc05
        page.messageKutusu_SK.sendKeys("");
    }
    @And("Message alani bos oldugu icin mesajin gonderilemedigini dogrular_SK")
    public void messageAlaniBosOlduguIcinMesajinGonderilemediginiDogrular_SK() {
        assertTrue(page.messageKutusuRequired_SK.isDisplayed());
        ReusableMethods.bekle(2);
    }
}
