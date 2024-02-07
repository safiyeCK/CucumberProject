package stepDefinitions.UiStepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.TeacherPage;
import utilities.ConfigReader;

public class US24_StepDef {
    HomePage homePage=new HomePage();
    TeacherPage teacherPage= new TeacherPage();
    @And("kullanici user name ve password ile Admin olarak login olurSA")
    public void kullaniciUserNameVePasswordIleAdminOlarakLoginOlurSA() {
        homePage.loginUsernameBox.sendKeys(ConfigReader.getProperty("AdminUserNameSA"), Keys.TAB, ConfigReader.getProperty("AdminPasswordSA") , Keys.TAB, Keys.ENTER);
    }

    @And("Admin olarak Teacher Management sayfasina giderSA")
    public void adminOlarakTeacherManagementSayfasinaGiderSA() {
        teacherPage.teacherManagementAdminSA.click();
    }

}
