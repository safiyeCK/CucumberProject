Feature: US02_Guest User Controller

  #Post Islemi(US01 Deki post isleminu buraya aldim,sirali olarak calistirmak icin.Post ve post ile gelen id ile silmek icin sirali calsitirmak gerekiyor)
  Scenario: Registerdan Guest_User kaydi olusturma testi
    Given Guest User Save icin URL duzenlenir_SK
    And Guest User Save icin payload duzenlenir_SK
    When Guest User Save icin POST Request gonderilir ve Reponse alinir_SK
    Then Status kodun 200 oldugu dogrulanir_SK
    And Guest User Save icin gelen Response body dogrulanir_SK

  #Register ile oluşturulan guest user kayit listesi doğrulanır
  Scenario: Admin Guest User List bilgilerini doğrular
    Given "Admin" yetkisi ile giris yapilir_SK
    And Kayitli Guest User icin URL duzenlenir_SK
    When Kayitli Guest User icin GET Request gonderilir ve response alinir_SK
    Then GetAll icin Status kodun 200 oldugu dogrulanir_SK

#guest_user kaydi silinir

  Scenario: Kayitli Guest_User hesabini silme
    Given "Admin" yetkisi ile giris yapilir_SK
    And Guest User kaydi DELETE islemi icin URL duzenlenir
    When Guest User kaydi silme islemi icin DELETE Request gonderilir ve Response alinir
    Then DELETE icin Status kodun 200 oldugu dogrulanir_SK


