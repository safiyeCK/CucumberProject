@APIKI06
Feature: Vice Dean Controller

  Scenario: Dean kullanicisi ile Vice Dean olusturma testi
    Given "Dean" yetkisi ile giris yapilirKI
    And Vice Dean hesabi olusturmak icin URL duzenlenirKI
    And  Vice Dean hesabi olusturmak icin payload duzenlenirKI
    When Vice Dean hesabi olusturmak icin POST Request gonderilir ve Reponse alinirKI
    Then Status code un 200 oldugu dogrulanirKI
    And Vice Dean Save icin gelen Response body dogrulanirKI
    And Sayfayi kapatirKI
@ApiGetKI
    Scenario: Olusturlan Vice Dean hesap bilgisini alma testi
      Given Kayitli Vice Dean hesab bilgisinin ID nosu alinirKI
      And Vice Dean GetManagerById icin URL duzenlenirKI
      And Vice Dean GetManagerById icin beklenen veriler duzenlenirKI
      When Vice Dean GetManagerById icin GET Request gonderilir ve Response alinirKI
      Then Status code un 200 oldugu dogrulanirKI
      And Vice Dean GetManagerById icin gelen Response body dogrulanirKI
@ApiPutKI
  Scenario: Olusturulan Vice Dean hesap bilgisini guncelleme
    Given "Dean" yetkisi ile giris yapilirKI
    And Kayitli Vice Dean hesab bilgisinin ID nosu alinirKI
    And Vice Dean hesabini guncellemek icin URL duzenlenirKI
    And Vice Dean hesabi guncellemek icin payload duzenlenirKI
    And Vice Dean hesabi guncellemek icin PUT Request gonderilir ve Reponse alinirKI
    Then Status code un 200 oldugu dogrulanirKI
    And Guncelenen response body dogrulanirKI

@ApiDelKI
  Scenario: Olusturulan Vice Dean hesap bilgisini silme
    Given "Dean" yetkisi ile giris yapilirKI
    And Kayitli Vice Dean hesab bilgisinin ID nosu alinirKI
    Then Vice Dean delete icin URL duzenlenirKI
    When Vice Dean delete icin Request gonderilir ve Response alinirKI
    Then Status code un 200 oldugu dogrulanirKI



