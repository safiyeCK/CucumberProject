Feature: Admin Controller
  Scenario: Admin kullanicisiyla Admin olusturma testi
    Given Admin yetkisiyle giris yapilir_I
    And Admin hesabi olusturmak icin url duzenlenir_I
    And Admin hesabi olusturmak icin payload duzenlenir_I
    When Admin hesabi olusturmak icin request gonderilir ve response alinir_I
    Then Status kodun 200 oldugu dogrulanir_IO
    And Admin save icin gelen response body dogrulanir_I