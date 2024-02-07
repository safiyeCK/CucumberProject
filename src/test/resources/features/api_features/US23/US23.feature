@APIKI23
  Feature: Admin Controller
    Scenario: Admin kullanici ile Vice Dean olusturma testi
      Given "Admin" yetkisi ile giris yapildiKI
      And Vice Dean hesabi olusturmak icin URL duzenlendiKI
      And  Vice Dean hesabi olusturmak icin payload duzenlendiKI
      When Vice Dean hesabi olusturmak icin POST Request gonderildi ve Reponse alindiKI
      Then Status code un 200 oldugu dogrulandiKI
      And Vice Dean Save icin gelen Response body dogrulandiKI

@ApiGetKI23
    Scenario:Admin kullanicisinin Vice Dean hesap bilgisini alma testi
      Given Kayitli Vice Dean hesap bilgisinin ID nosu alindiKI
      And Vice Dean GetManagerById icin URL duzenlendiKI
      And Vice Dean GetManagerById icin beklenen veriler duzenlendiKI
      When Vice Dean GetManagerById icin GET Request gonderilir ve Response alindiKI
      Then Status code un 200 oldugu dogrulandiKI
      And Vice Dean GetManagerById icin gelen Response body dogrulandiKI

@ApiDelKI23
Scenario: Admin kullanici olusturulan Vice Dean silme
  Given "Admin" yetkisi ile giris yapildiKI
  And Kayitli Vice Dean hesap bilgisinin ID nosu alindiKI
  Then Vice Dean silme icin URL duzenlenirKI
  When Vice Dean Delete icin Request gonderilir ve Response alindiKI
  Then Status code un 200 oldugu dogrulandiKI






