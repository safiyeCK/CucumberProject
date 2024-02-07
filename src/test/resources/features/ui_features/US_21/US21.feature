Feature: US21 Students ders secebilmeli,notlarini ve danismaninin olusturdugu toplantilari gorebilmeli
  Background: Student hesabi ile siteye giris yapilir ve menuye tiklanir
    Given kullanici "schoolsUrl" sayfasina properties ile gider_Ep
    Then kullanici login butonuna tiklar_Ep
    And kullanici user name ve password ile siteye ogrenci olarak giris yapar_Ep
    Then kullanici Login oldugunu dogrular_Ep
    And kullanici menu butonuna tiklar_Ep

  Scenario: TC01 Student Choose Lesson listesinde dersleri ve ders bilgilerini gorebilmeli
    Given kullanici acilan pencereden choose lesson secer_Ep
    Then Kullanici ders secme kutucugunun tiklanabilirligini dogrular_Ep
    Then kullanici ders bilgisinin gorunurlugunu dogrular_Ep
    Then kullanici teacher bilgisinin gorunurlugunu dogrular_Ep
    And kullanici day bilgisinin gorunurlugunu dogrular_Ep
    And kullanici start time bilgisinin gorunurlugunu dogrular_Ep
    And kullanici stop time bilgisinin gorunurlugunu dogrular_Ep

  Scenario: TC02  Student,"Grades and Announcement" sayfasinda notlarini ve danismanin olusturdugu toplantilari gorebilmeli
    Given kullanici acilan pencerede Grades and Announcements secer_Ep
    Then kullanici Midterm Exam bilgisinin gorunurlugunu dogrular_Ep
    Then kullanici Final Exam bilgisinin gorunurlugunu dogrular_Ep
    And kullanici Student Meet Listin gorunurlugunu dogrular_Ep
    And sayfayi kapatir_Ep

  Scenario: TC03 Student,istedigi ders veya dersleri secebilmeli ve Lesson Program Listte gorebilmeli
    Given kullanici acilan pencereden choose lesson secer_Ep
    Then kullanici eklemek istedigi dersleri secer_Ep
    Then kullanici submit butonuna tiklar._Ep
    And kullanci derslerin secildigini dogrular
    And kullanici lesson program list bolumunde dersleri ve dogrular_Ep
  @a3
  Scenario: TC04 Student,ayni gun ve saatte dersler secememeli
    Given kullanici acilan pencereden choose lesson secer_Ep
    Then kullanici ayni gun ve ayni saatte olan dersleri secer_Ep
    Then kullanici submit butonuna tiklar._Ep
    And kullanici derslerin secilemedigini dogrular_Ep



