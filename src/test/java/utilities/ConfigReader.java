package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    /*
    .properties uzantili dosyadaki datalari test class'imizda o okuyabilmemiz icin return type'i
    String olan bir static method olustururuz ve bu method ve bu method un icinde Properties class'indan
    bir obje olustururuz.Sonra FileInputStream ile bu dosyayi akisa alir Properties class'indan
    olusturmus oldugumuz obje'ye load() methodu ile yükleriz. Son olarak olusturmus oldugumuz obje ile
    getProperty() methodunu kullanarak method icine parametre olarak girilen key'in degerini bize return eder.
     */

public static String getProperty (String key){
    Properties properties =new Properties();
    try {
        FileInputStream fis =new FileInputStream("configuration.properties");
        properties.load(fis);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    return properties.getProperty(key);
}

}
