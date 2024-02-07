package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TeacherPage {
    public TeacherPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }








    //Sena 20-100
    @FindBy(xpath = "(//a)[40]")
    public WebElement teacherManagementSA;
    @FindBy(xpath = "(//a)[35]")
    public WebElement teacherManagementAdminSA;
    @FindBy(xpath = "(//input)[1]")
    public WebElement chooseLessonsSA;
    @FindBy(xpath = "(//input)[14]")
    public WebElement editChooseLessonsSA;
    @FindBy(xpath = "(//input)[2]")
    public WebElement nameSA;
    @FindBy(xpath = "(//input)[7]")
    public WebElement isAdvisorTeacherSA;
    @FindBy(xpath = "(//*[@class='form-check-input'])[4]")
    public WebElement editIsAdvisorTeacherSA;
    @FindBy(xpath = "(//input)[8]")
    public WebElement genderFemaleSA;
    @FindBy(xpath = "(//input)[23]")
    public WebElement editGenderFemaleSA;
    @FindBy(xpath = "(//button)[7]")
    public WebElement submitSA;
    @FindBy(xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement onaySA;
    @FindBy(xpath = "(//input)[11]")
    public WebElement ssnSA;
    @FindBy(xpath = "(//input)[13]")
    public WebElement passwordSA;
    @FindBy(xpath = "(//h5)[2]")
    public WebElement scrollSA;
    @FindBy(xpath = "(//*[@class='page-link'])[5]")
    public WebElement sonSayfaSA;
    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[15]")
    public WebElement editSA;
    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[15]")
    public WebElement editDateOfBirthSA;
    @FindBy(xpath = "(//input)[26]")
    public WebElement editPasswordSA;
    @FindBy(xpath = "(//input)[15]")
    public WebElement editNameSA;
    @FindBy(xpath = "(//*[@id='username'])[2]")
    public WebElement editUserNameSA;
    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement editSubmitSA;
    @FindBy(xpath = "(//tbody[@class='table-group-divider']//tr[last()]//td[1])[1]")
    public WebElement tableSonNameSA;
    @FindBy(xpath = "(//tbody[@class='table-group-divider']//tr[last()]//td[2])[1]")
    public WebElement tableSonPhoneNumberSA;
    @FindBy(xpath = "(//tbody[@class='table-group-divider']//tr[last()]//td[3])[1]")
    public WebElement tableSonSSNSA;
    @FindBy(xpath = "(//tbody[@class='table-group-divider']//tr[last()]//td[4])[1]")
    public WebElement tableSonUsernameSA;






























//Emre 101-200
@FindBy(xpath = "(//*[@role='button'])[11]")
public WebElement meetManagementButtonEp;
@FindBy(xpath = "//*[@class=' css-19bb58m']")
public WebElement chooseStudentsDdmEp;
@FindBy(xpath = "//*[@id='date']")
public WebElement dateOfMeetBoxEp;
@FindBy(xpath = "//*[@id='startTime']")
public WebElement startTimeBoxEp;
@FindBy(xpath = "//*[@id='stopTime']")
public WebElement stopTimeBoxEp;
@FindBy(xpath = "(//*[@type='text'])[2]")
public WebElement descriptionBoxEp;
@FindBy(xpath = "//*[text()='Submit']")
public WebElement submitButtonEp;
//@FindBy(xpath = "(//*[text()='Meet Saved Successfully'])[1]")
//public WebElement meetSavedVerifyEp;
@FindBy(xpath = "(//div[@class='Toastify__toast-container Toastify__toast-container--top-center']")
public WebElement meetSavedVerify1Ep;
@FindBy(xpath = "(//div[text()='Meet Saved Successfully'])")
public WebElement meetSavedVerifyEp;
@FindBy(xpath = "//*[@class='Toastify__toast-body']")
public WebElement errorTimeEp;
@FindBy(xpath = "//*[@class='Toastify__toast-body']")
public WebElement alertChooseStudentsEp;
@FindBy(xpath = "//*[text()='Required']")
public WebElement descriptionRequiredVerifyEp;
@FindBy(xpath = "(//h5)[2]")
public WebElement meetListVerifyEp;
@FindBy(xpath = "(//td//span)[1]")
public WebElement stundentsBilgisiVerifyEp;
@FindBy(xpath = "(//td//span)[2]")
public WebElement dateBilgisiVerifyEp;
@FindBy(xpath = "(//td//span)[3]")
public WebElement startTimeBilgisiVerifyEp;
@FindBy(xpath = "(//td//span)[4]")
public WebElement stopTimeBilgisiVerifyEp;
@FindBy(xpath = "(//td//span)[5]")
public WebElement descriptionBilgisiVerifyEp;
@FindBy(xpath = "(//td//span)[6]")
public WebElement editButtonVerifyEp;
@FindBy(xpath = "(//td//span)[7]")
public WebElement deleteButtonVerifyEp;
@FindBy(xpath = "(//td//span//button)[1]")
public WebElement editButtonEp;
@FindBy(xpath = "(//*[@id='date'])[2]")
public WebElement editDateOfMeetEp;
@FindBy(xpath = "(//div//input)[8]")
public WebElement editStartTimeEp;
@FindBy(xpath = "(//div//input)[9]")
public WebElement editStopTimeEp;
@FindBy(xpath = "(//div//input)[10]")
public WebElement editDescriptionEp;
@FindBy(xpath = "(//*[text()='Submit'])[2]")
public WebElement editSubmitButtonEp;
@FindBy(xpath = "(//*[@aria-label='Close'])[3]")
public WebElement editCloseButtonEp;
@FindBy(xpath = "//*[@class='Toastify__toast-body']")
public WebElement editSubmitVerifyEp;
@FindBy(xpath = "//*[@class='Toastify__toast-body']")
public WebElement editErrorDateEp;
@FindBy(xpath = "(//td//span//button)[2]")
public WebElement deleteButtonEp;
@FindBy(xpath = "(//*[@class='Toastify__toast-container Toastify__toast-container--top-center'])[1]")
public WebElement deleteVerifyEp;





























































































// Ibrahim 201-300
    @FindBy(xpath = "//*[@*='header_link ms-2']")
    public WebElement loginLinki_IO;
    @FindBy(css = "#username")
    public WebElement userNameKutusu_IO;
    @FindBy(css = "#password")
    public WebElement passwordKutusu_IO;
    @FindBy(xpath = "//button[.='Login']")
    public WebElement logonButonu_IO;
    @FindBy(xpath = "//h3[.='Student Info Management']")
    public WebElement studentInfoManagementYazisi_IO;
    @FindBy(xpath = "(//select[@class='form-select'])[1]")
    public WebElement chooseLessonDDM_IO;
    @FindBy(xpath = "(//select[@class='form-select'])[2]")
    public WebElement chooseStudentDDM_IO;
    @FindBy(xpath = "(//select[@class='form-select'])[3]")
    public WebElement chooseEducationTermDDM_IO;
    @FindBy(css = "#absentee")
    public WebElement absenteeKutusu_IO;
    @FindBy(css = "#midtermExam")
    public WebElement midtermExamKutusu_IO;
    @FindBy(css = "#finalExam")
    public WebElement finalExamKutusu_IO;
    @FindBy(css = "#infoNote")
    public WebElement infoNoteKutusu_IO;
    @FindBy(xpath = "(//*[.='Submit'])[3]")
    public WebElement submitButonu_IO;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement absenteeRequiredUyari_IO;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement midtermRequiredUyari_IO;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement finalRequiredUyari_IO;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement infoNoteRequiredUyari_IO;

    @FindBy(xpath = "(//*[.=\"'100.0' değerinden küçük yada eşit olmalı\"])[5]")
    public WebElement yuzdenKucukVeEsitUyariYazisi_IO;

    @FindBy(xpath = "(//*[.=\"'0.0' değerinden büyük yada eşit olmalı\"])[5]")
    public WebElement sifirdanBuyukVeEsitUyariYazisi_IO;

    @FindBy(xpath = "(//*[.='Student Info saved Successfully'])[5]")
    public WebElement studentInfoSavedSuccessfullyYazisi_IO;

    @FindBy(xpath = "(//*[.='Student Info deleted Successfully'])[5]")
    public WebElement studentInfoDeletedSuccessfullyYazisi_IO;

    @FindBy(xpath = "(//*[@id='absentee'])[2]")
    public WebElement absenteeKutusuUpdate_IO;

    @FindBy(xpath = "(//*[@id='midtermExam'])[2]")
    public WebElement midtermExamKutusuUpdate_IO;

    @FindBy(xpath = "(//*[@id='finalExam'])[2]")
    public WebElement finalExamKutusuUpdate_IO;

    @FindBy(xpath = "(//*[@id='infoNote'])[2]")
    public WebElement infoNoteKutusuUpdate_IO;

    @FindBy(xpath = "//button[@class='text-dark btn btn-outline-info']")
    public WebElement editButonuInfoList_IO;

    @FindBy(xpath = "//i[@class='fa-solid fa-trash']")
    public WebElement deleteButonuInfoList_IO;

    @FindBy(xpath = "(//div[@role='alert']/*[.='Error: Student Info with lesson name JavaScript already register'])[1]")
    public WebElement dersZatenAtanmis_IO;

    @FindBy(xpath = "//tbody//td[10]")
    public List<WebElement> studentInfoDeleteButtonsList_IO;

    @FindBy(xpath = "(//div[@class='Toastify__toast-body'])[1]")
    public WebElement studentInfoUpdatedSuccesfullyYazisi_IO;

    @FindBy(xpath = "(//*[.='Submit'])[5]")
    public WebElement submitButonuUpdate_IO;






























































































}
