
Feature: Student Controller
  @ApiUs15
  Scenario: Admin Student oluşturabilmelidir
    Given  Stdudent olusturmak icin URL duzenlenir_DBB
    And    Stdudent olusturmak icin payload duzenlenir_DR
    When   Stdudent olusturmak icin POST Request gonderili_DR
    Then   Status kodun 200 oldugu dogrulanir_DB
    And    Stdudent olusturma icin gelen Response body dogrulanir_DR

  @ApiU
  Scenario: Olusturulan Student hesap bilgisini alma testi.
    Given Kayitli Student bilgisinin ID nosu alinir_DBB
    And   Student getStudentById icin URL duzenlenir_DB
    And   Student getStudentById icin beklenen veriler duzenlenir_DB
    When  Student getStudentById icin GET Request gonderilir ve Response alinir_DB
    Then  Status kodun 200 oldugu dogrulanir_DB
    Then  Student getStudentById icin gelen Response dogrulanir_DB

  Scenario: Olusturulan Student hesap bilgisini guncelleme testi.
    Given Kayitli Student bilgisinin ID nosu alinir_DB
    And   Student update icin URL duzenlenir_DB
    And   Student update icin beklenen veriler duzenlenir_DB
    When  Student update icin PUT Request gonderilir ve Response alinir_DB
    Then  Status kodun 200 oldugu dogrulanir_DB
    Then  Student uptadete icin gelen Response dogrulanir_DB

  Scenario: Olusturulan Student silme testi.
    Given Student Delete icin URL duzenlenir_DBB
    When  Student Delete icin DELETE Request gonderilir ve Response alinir
    Then  Status kodun 200 oldugu dogrulanir_DB
















