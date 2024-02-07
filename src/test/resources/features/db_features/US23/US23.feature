@DBKI23
Feature: Admin Vice Dean Bilgisi Dogrulama
  Scenario: Admin Kayitli Vice Dean bilgisini dogrularKI
    Given Database baglantisi kurulduKI
    And Vice Dean GetManagerById icin beklenen veriler duzenlendiKI
    When Kayitli Vice Dean almak icni Query gonderildiKI
    Then Kayitli Vice Dean bilgisi dogrulandiKI
    And Baglanti kesildiKI