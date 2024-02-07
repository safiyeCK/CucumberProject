Feature: Guest_User_Controller
#Post Islemi
  Scenario: Registerdan Guest_User kaydi olusturma testi
    Given Guest User Save icin URL duzenlenir_SK
    And Guest User Save icin payload duzenlenir_SK
    When Guest User Save icin POST Request gonderilir ve Reponse alinir_SK
    Then Status kodun 200 oldugu dogrulanir_SK
    And Guest User Save icin gelen Response body dogrulanir_SK