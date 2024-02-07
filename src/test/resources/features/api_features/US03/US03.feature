Feature: US03_Contact Controller

  #post
  Scenario: Kullanici Contact bolumunden mesaj gonderir
    Given Contact mesaj Save icin URL duzenlenir_SK
    And Contact mesaj Save icin payload duzenlenir_SK
    When Contact mesaj Save icin POST Request gonderilir ve Reponse alinir_SK
    And Contact mesaj Save icin gelen Response body dogrulanir_SK
    Then Mesaj gonderilince Status kodun 200 oldugu dogrulanir_SK

#GetAll
  Scenario: Admin kullanicisi contact mesaj bilgilerini gorurur
    Given "Admin" yetkisi ile giris yapilir_SK
    And Contact mesaj GetAll icin URL duzenlenir_SK
    When Contact mesaj GetAll icin  Request gonderilir ve response alinir_SK
    Then Contact GetAll icin Status kodun 200 oldugu dogrulanir_SK

#Get searchbyemail
  Scenario:  kullanicisi  olusturulan contact mesajlari email ile dogrular
    Given "Admin" yetkisi ile giris yapilir_SK
    And  URL duzenlenir_SK
    Then search by email  icin GET Request gonderilir ve Response body alinir
    Then search by email  icin Status code un 200 oldugu dogrulanir

#Get searchbysubject
  Scenario: Admin kullanicisi olusturulan contact mesajlari subject ile dogrular
    Given "Admin" yetkisi ile giris yapilir_SK
    And Search subject icin URL duzenlenir_SK
    Then GET Request gonderilir ve Response body alinir
    Then Status code un 200 oldugu dogrulanir


