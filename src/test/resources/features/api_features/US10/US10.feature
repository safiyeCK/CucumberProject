Feature: US10 Lesson Programs Controller

  #Vıce Dean ile olusturulan  kayit listesi doğrulanır
  Scenario: Vıce Dean ders programi olusturabildigini doğrular
    Given "Vıce Dean" ile giris yapilir YD
    And Kayitli Vıce Dean icin URL duzenlenir YD
    Then Kayitli Vice Dean icin payload duzenlenir
    When Kayitli Vıce Dean icin POST Request gonderilir ve response alinir YD
    Then Kayitli Vice Dean icin gelen response dogrulanir YD
    Then GetAll icin Status kodun 200 oldugu dogrulanir YD
