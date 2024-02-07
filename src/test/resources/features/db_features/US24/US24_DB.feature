@Sena_DB
Feature: Teacher Bilgisi Dogrulama
  Scenario: Kayitli Teacher bilgisini dogrulama testi
    Given Database baglantisi kurulurSA
    And   Teacher getSavedById icin beklenen veriler duzenlenirSA
    When Kayitli Teacher bilgisini almak icin Query gonderilirSA
    Then Kayitli Teacher bilgisi dogrulanirSA
    And  Baglanti kesilirSA
   