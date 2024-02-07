Feature: Student Info bilgileri dogrulama
  Scenario: Kayitli Student Info bilgileri dogrulama testi
    Given Database baglantisi kurulur_I
    When Student Info bilgisini almak icin query gonderilir_I
    Then Kayitli student info bilgileri dogrulanir_I
    And Baglanti kesilir_I
