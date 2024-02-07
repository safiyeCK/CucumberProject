@US16 @ALL
Feature: US16 Vice Dean, kullanıcıların gönderdiği mesajları görebilmelidir.

  @US16/TC01
  Scenario: TC01 - Vice Dean Kullanici Mesajlarini Görür

    Given Kullanici ana sayfaya gider.
    When Kullanici Vice Dean hesabi ile giris yapar.
    And Kullanici Menu ye  tiklar.
    Then Kullanici  acilan pencereden Contact Get All yazisina  tiklar.
    And Kullanici Name altinda gönderici isimlerini gordugunu dogrular.
    And Kullanici Email altinda gönderici Email adreslerini gordugunu dogrular.
    And Kullanici Date altinda mesaj tarihlerini gordugunu dogrular.
    And Kullanici Subject altindaki bilgileri gordugunu dogrular.
    And Kullanici Message altindaki mesajlari gordugunu dogrular.
    And Kullanici sayfa kapatir.

  @US16/TC02
  Scenario: TC02 - Vice Dean Kullanici Mesajlarini Siler

    Given Kullanici ana sayfaya gider.
    When Kullanici Vice Dean hesabi ile giris yapar.
    And Kullanici Menu ye  tiklar.
    Then Kullanici  acilan pencereden Contact Get All yazisina  tiklar.
    And Kullanici silme buton  gordugunu dogrular.
    And Kullanici silme butona tiklar
    And Kullanici sayfa kapatir.
