Feature: Teacher ile Student info ekleme

  Scenario: Teacher Student info olusturma testi
    Given Add Student Info icin url duzenlenir_I
    And Add Student Info icin payload duzenlenir_I
    When Add Student Info post request gonderilir ve response alinir_I
    Then Status kodun 200 oldugu dogrulanir_I
    And Add Student Info icin gelen response dogrulanir_I

  Scenario: Kayitli Student info bilgisini alma testi
    Given Kayitli Student Info ID'si alinir_I
    And GetByStudentInfo icin url duzenlenir_I
    When Student Info expected data olusturulur_I
    When GetByStudentInfo icin request gonderilir Response alinir_I
    Then Status kodun 200 oldugu dogrulanir_I
    And GetByStudentInfo icin gelen response dogrulanir_I

  Scenario: Kayitli Student info bilgisini guncelleme testi
    Given Kayitli Student Info ID'si alinir_I
    And Kayitli Student Info bilgilerini guncellemek icin url duzenlenir_I
    And Kayitli Student Info bilgilerini guncellemek icin payload duzenlenir_I
    When Kayitli Student Info bilgilerini guncellemek icin request gonderilir Response alinir_I
    Then Status kodun 200 oldugu dogrulanir_I
    And Guncellenen response body dogrulanir_I

  Scenario: Kayitli Student info bilgisilerini silme testi
    Given Kayitli Student Info ID'si alinir_I
    And Kayitli Student Info bilgilerini silmek icin url duzenlenir_I
    When Kayitli Student Info bilgilerini silmek icin request gonderilir Response alinir_I
    Then Status kodun 200 oldugu dogrulanir_I

