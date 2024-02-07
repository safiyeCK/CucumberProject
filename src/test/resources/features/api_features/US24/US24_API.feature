@SenaAPI_US13
Feature: Admin Teacher Management
  Scenario:Admin öğretmen oluşturabilmelidir.
    Given  Admin olarak Teacher olusturmak icin URL duzenlenirSA
    And    Teacher olusturmak icin payload duzenlenirSA
    When   Teacher olusturmak icin POST Request gonderilirSA
    Then   Status kodun 200 oldugu dogrulanirSA
    And    Teacher olusturma icin gelen Response body dogrulanirSA

  Scenario: Admin olarak Olusturulan Teacher hesap bilgisini alma testi.
    Given Admin olarak Kayitli Teacher bilgisinin ID nosu alinirSA
    And   Admin olarak Teacher getSavedById icin URL duzenlenirSA
    And   Teacher getSavedById icin beklenen veriler duzenlenirSA
    When  Teacher getSavedById icin GET Request gonderilir ve Response alinirSA
    Then  Status kodun 200 oldugu dogrulanirSA
    Then  Teacher getSavedById icin gelen Response dogrulanir

  Scenario: Olusturulan Teacher hesap bilgisini guncelleme testi.
    Given Admin olarak Kayitli Teacher bilgisinin ID nosu alinirSA
    And   Admin Teacher update icin URL duzenlenirSA
    And   Teacher update icin beklenen veriler duzenlenirSA
    When  Teacher update icin PUT Request gonderilir ve Response alinirSA
    Then  Status kodun 200 oldugu dogrulanirSA
    Then  Teacher uptadete icin gelen Response dogrulanir

  Scenario:Admin öğretmen silebilmeli.
    Given Admin olarak Teacher Delete icin URL duzenlenir
    When  Teacher Delete icin DELETE Request gonderilir ve Response alinir
    Then  Status kodun 200 oldugu dogrulanirSA