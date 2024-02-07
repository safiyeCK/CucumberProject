Feature: Dean bilgileri okunabilmeli silinebilmeli guncellenebilmeli
  @apiEsi @e2eEsi @updateEsi @DBEsi
  Scenario: Admin kullanicisi ile olusturulan Dean hesabini dogrulama Testi
    Given "Admin" yetkisi ile giris yapilir Esi
    And Kayitli olan Dean hesap bilgisinin ID nosu alinir Esi
    And GetManagerById icin URL duzenlenir Esi
    When GetManagerById icin beklenen veriler duzenlenir Esi
    Then GetManagerById icin GET Request gonderilir ve Response body alinir Esi
    Then Dean hesabi dogrulamak icin Status code un 200 oldugu dogrulanir Esi
    And GetManagerById icin gelen Response body dogrulanir Esi
  @updateEsi
  Scenario: Admin kullanicisi ile olusturulan Dean hesabini guncelleme
    Given "Admin" yetkisi ile giris yapilir Esi
    And Kayitli olan Dean hesap bilgisinin ID nosu alinir Esi
    And Dean hesabini guncellemek icin URL duzenlenir Esi
    And Dean hesabi guncellemek icin payload duzenlenir Esi
    And Dean hesabi guncellemek icin PUT Request gonderilir ve Reponse alinir Esi
    And Dean hesabi guncellemek icin Status code un 200 oldugu dogrulanir Esi
    And Guncelenen response body dogrulanir Esi

  @updateEsi @deleteEsi
  Scenario: Kayitli Dean hesabi silme
    Given "Admin" yetkisi ile giris yapilir Esi
    And Kayitli olan Dean hesap bilgisinin ID nosu alinir Esi
    Then Dean delete icin URL duzenlenir Esi
    When Dean delete icin Request gonderilir ve Response alinir Esi
    Then Dean delete islemi icin status code un 200 oldugu dogrulanir Esi