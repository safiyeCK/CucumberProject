Feature: Dean Controller
  @apiEsi @updateEsi
  Scenario: Admin kullanicisi ile Dean hesabi olusturma testi
    Given "Admin" yetkisi ile giris yapilir Esi
    And Dean hesabi olusturmak icin URL duzenlenir Esi
    And Dean hesabi olusturmak icin icin payload duzenlenir Esi
    When Dean hesabi olusturmak icin POST Request gonderilir ve Reponse alinir Esi
    Then Dean hesabi olusturmak icin Status code un 200 oldugu dogrulanir Esi
    And Dean Save icin gelen Response body dogrulanir Esi
