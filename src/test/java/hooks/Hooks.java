package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;


public class Hooks {
    /*
    Hooks class'i ile scenario'lardan önce veya sonra calismasini sitedigimiz kodlari
    (örn:Sceenario'lardan önce database baglantisi gibi yada Scevario'lardan sonra fail olan
    scenariolarin resmini rapora ekleme gibi) @before ve @after (io.cucumber) methodlari ile
    olusturabiliriz.Eger Hooks class'ini farkli bir package altinda olusturmak istersek
    Runner class'indaki glue parametresine bu package'i eklememiz gerekir. glue paametresinde
    stepDefinitions package'i yeraldigi icin fazladan package olusturmamak adina biz stepDefinition
    package altina Hooks class'ini olusturduk.Eger sadece istedigimiz bir scenario'dan önce calismasini
     istedigimiz bir kod olursa @before notasyonuna parametre olarak scenario'ya verdigimiz tag'i yazariz.
     Dolayisiyla sadece tag' i balirttigimiz @Before methodu scenario'dan önce devreye girer.
     */
    @Before
    public void setUp() {
        System.out.println("Scenario'lar Çalismaya Başladı");
    }


    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()){
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/png","scenario_"+scenario.getName());
            Driver.closeDriver();
        }
    }
}