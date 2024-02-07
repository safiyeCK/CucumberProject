Feature: Dean Bilgisi Dogrulama
  Scenario: Kayitli Dean bilgisini dogrulama testi
    Given Database baglantisi kurulur
    And GetManagerById icin beklenen veriler duzenlenir Esi
    When Kayitli Dean bilgisini almak icin Query gonderilir
    Then Kayitli Dean bilgisi dogrulanir
    And Connection kesilir