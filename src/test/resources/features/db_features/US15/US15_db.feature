Feature: Student Bilgisi Dogrulama
  Scenario: Kayitli Student bilgisini dogrulama testi
    Given Database baglantisi kurulur_DB
    And   Student getStudentById icin beklenen veriler duzenlenir_DB
    When Kayitli Student bilgisini almak icin Query gonderilir_DB
    Then Kayitli Student bilgisi dogrulanir_DB
    And  Baglanti kesilir_DB