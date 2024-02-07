Feature: Guest User Bilgisi Dogrulama
  Scenario: Kayitli Guest User bilgisini dogrulama testi
    Given Database baglantisi kurulur_SK
    When Aday ogrenci bilgisini almak icin Query gonderilir_SK
    Then Aday ogrenci icin dogrulama yapar_SK
    And Baglanti kesilir_SK