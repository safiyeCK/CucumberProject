Feature: US03 Kullanicilar "Contact" sayfasindan mesaj gonderebilmeli
  Background:
    Given kullanici "https://managementonschools.com/" e gider_SK
    Then Contact butonuna tiklar_SK

  Scenario:  TC01 Kullanicilar "Contact" sayfasindan mesaj gonderebilmeli
  And Your name alanina herhangi bir karakter iceren isim girer_SK
  And Your Email alanina icinde @ ve . karakterleri olan bir email adresi girer_SK
  And Subject alanina mesaj hakkinda bir konu basligi girer_SK
  And Message alanina icinde harf,rakam ve ozel karakterler olan bir mesaj girer_SK
  And Send Message butonuna tiklar_SK
  And Mesajin gonderilebildigini dogrular_SK
    And Kullanici sayfayi kapatir_SK

  Scenario: TC02 Your Name alani bos birakilarak mesaj gonderilmez
    And Your Name alanini bos birakir_SK
    And Your Email alanina icinde @ ve . karakterleri olan bir email adresi girer_SK
    And Subject alanina mesaj hakkinda bir konu basligi girer_SK
    And Message alanina icinde harf,rakam ve ozel karakterler olan bir mesaj girer_SK
    And Send Message butonuna tiklar_SK
    And YourName kutusu bos oldugu icin mesajin gonderilemedigini dogrular_SK
    And Kullanici sayfayi kapatir_SK

  Scenario: TC03 "Your Email" alanina icinde "@" ve "." karakterleri olmayan bir email ile mesaj gonderilmez
    And Your name alanina herhangi bir karakter iceren isim girer_SK
    And Your Email alanina icinde @ ve . karakterleri olmayan bir email adresi girer_SK
    And Subject alanina mesaj hakkinda bir konu basligi girer_SK
    And Message alanina icinde harf,rakam ve ozel karakterler olan bir mesaj girer_SK
    And Send Message butonuna tiklar_SK
    And Youremail kutusuna gecersiz bir email girildigi  icin mesajin gonderilemedigini dogrular_SK
    And Kullanici sayfayi kapatir_SK

  Scenario: TC04 "Subject " alani bos birakilarak mesaj gonderilemez
    And Your name alanina herhangi bir karakter iceren isim girer_SK
    And Your Email alanina icinde @ ve . karakterleri olan bir email adresi girer_SK
    And Subject alanini bos birakir_SK
    And Message alanina icinde harf,rakam ve ozel karakterler olan bir mesaj girer_SK
    And Send Message butonuna tiklar_SK
    And Subject kutusu bos oldugu icin mesajin gonderilemedigini dogrular_SK
    And Kullanici sayfayi kapatir_SK

  Scenario: TC05 "Message " alani bos birakilarak mesaj gonderilmez
    And Your name alanina herhangi bir karakter iceren isim girer_SK
    And Your Email alanina icinde @ ve . karakterleri olan bir email adresi girer_SK
    And Subject alanina mesaj hakkinda bir konu basligi girer_SK
    And Message alanini bos birakir_SK
    And Send Message butonuna tiklar_SK
    And Message alani bos oldugu icin mesajin gonderilemedigini dogrular_SK
    And Kullanici sayfayi kapatir_SK