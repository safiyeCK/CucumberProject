@DB
Feature: Dean Bilgisi Dogrulama
  Scenario: Admin Dean'lerin Name, Gender, Phone Number, SSN, User Name bilgilerini görebilmeli
    Given Database baglantisi kurulur
    And GetManagerById icin beklenen veriler duzenlenir Esi
    When Deanlerin Name, Gender, Phone Number, SSN, User Name bilgilerini gormek icin query gonderir
    Then Olusturulan dean bilgisinin Name, Gender, Phone Number, SSN, User Name bilgilerinin kayitli oldugu dogrulanir
    And Connection kesilir
  @delete
  Scenario: Silinen Dean bilgisinin Db'den silindigi dogrulabilmeli
    Given Database baglantisi kurulur
    When userid si vererek bir query olusturulur
    And kayitli kullanici bilgisinin olmadigi dogrulanmali
    And Connection kesilir
  @update
  Scenario: Kayitli bir Dean bilgisini guncellenebilmeli
    Given Database baglantisi kurulur
    And userid si vererek bir Result set olusturulur
    And kullanicinin guncellenmis bilgilerinin oldugu dogrulanir
    And Connection kesilir