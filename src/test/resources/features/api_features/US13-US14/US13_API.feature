@SenaAPI_US13
Feature: Teacher Management
  Scenario:Vice Dean öğretmen oluşturabilmelidir.
    Given  Teacher olusturmak icin URL duzenlenirSA
    And    Teacher olusturmak icin payload duzenlenirSA
    When   Teacher olusturmak icin POST Request gonderilirSA
    Then   Status kodun 200 oldugu dogrulanirSA
    And    Teacher olusturma icin gelen Response body dogrulanirSA

  Scenario: Olusturulan Teacher hesap bilgisini alma testi.

    Given Kayitli Teacher bilgisinin ID nosu alinirSA
    And   Teacher getSavedById icin URL duzenlenirSA
    And   Teacher getSavedById icin beklenen veriler duzenlenirSA
    When  Teacher getSavedById icin GET Request gonderilir ve Response alinirSA
    Then  Status kodun 200 oldugu dogrulanirSA
    Then  Teacher getSavedById icin gelen Response dogrulanir

  Scenario: Olusturulan Teacher hesap bilgisini guncelleme testi.
    Given Kayitli Teacher bilgisinin ID nosu alinirSA
    And   Teacher update icin URL duzenlenirSA
    And   Teacher update icin beklenen veriler duzenlenirSA
    When  Teacher update icin PUT Request gonderilir ve Response alinirSA
    Then  Status kodun 200 oldugu dogrulanirSA
    Then  Teacher uptadete icin gelen Response dogrulanir


  Scenario: Olusturulan Teacher silme testi.
    Given Teacher Delete icin URL duzenlenir
    When  Teacher Delete icin DELETE Request gonderilir ve Response alinir
    Then  Status kodun 200 oldugu dogrulanirSA