Feature: US19 Teacher öğrenciler ile toplantı düzenleyebilmeli
  Background: Teacher hesabi ile siteye giris yapilir ve menuden Meet Management secilir
    Given kullanici "schoolsUrl" sayfasina properties ile gider_Ep
    Then kullanici login butonuna tiklar_Ep
    And kullanici user name ve password ile siteye giris yapar_Ep
    Then kullanici Login oldugunu dogrular_Ep
    And kullanici menu butonuna tiklar_Ep
    Then acilan pencereden meet management secilir_Ep


  Scenario: TC01 Teacher öğrenciler ile toplantı düzenleyebilmeli
    Given Choose Students menusunden ogrenci secilir_Ep
    Then Date of Meet tarihi belirlenir_Ep
    Then Meet baslangis saati secilir_Ep
    Then Meet bitis saati secilir_Ep
    And Description kutusu doldurulur_Ep
    Then Submit butonuna tiklanir_Ep
    Then Meet olustugu dogrulanir_Ep
    And sayfayi kapatir_Ep

  Scenario: TC02 Toplanti bitis saati baslangic saatinden once secildidinge, teacher toplanti olusturamaz
    Given Choose Students menusunden ogrenci secilir_Ep
    Then Date of Meet tarihi belirlenir_Ep
    Then Meet baslangis saati secilir_Ep
    Then Meetin bitis saati baslangic saatinden once bir veri secilir_Ep
    And Description kutusu doldurulur_Ep
    Then Submit butonuna tiklanir_Ep
    Then Meet olusturulamadigi dogrulanir_Ep
    And sayfayi kapatir_Ep

  Scenario: TC03 Ogrenci secilmediginde, teacher toplanti olusturamaz
    Given Choose Students menusu bos birakilir_Ep
    Then Date of Meet tarihi belirlenir_Ep
    Then Meet baslangis saati secilir_Ep
    Then Meet bitis saati secilir_Ep
    And Description kutusu doldurulur_Ep
    Then Submit butonuna tiklanir_Ep
    Then Ogrenci secilmedi icin uyari yazisi alir_Ep
    And sayfayi kapatir_Ep

  Scenario: TC04 Description kutusu bos birakildiginda, teacher toplanti olusturamaz
    Given Choose Students menusunden ogrenci secilir_Ep
    Then Date of Meet tarihi belirlenir_Ep
    Then Meet baslangis saati secilir_Ep
    Then Meet bitis saati secilir_Ep
    And Description kutusu bos birakilir_Ep
    Then Submit butonuna tiklanir_Ep
    Then Description kutusu bos birakildigi icin Required yazisi gorulur_Ep
    And sayfayi kapatir_Ep