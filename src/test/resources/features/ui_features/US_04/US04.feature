Feature: US04 Admin Dean Ekleyebilmeli
  Background: Admin olarak siteye giriş yapılır ve menü ye basılarak Dean Management seçilir
    Given Kullanıcı Managementonschools adresine gider Esi
    Then Kullanici Login butonuna basar Esi
    Then Username ve password kutularını doldurarak enter tuşuna basar Esi
    Then Açılan sayfadan menu tusuna basar Esi
    Then Dashboard kısmından Dean Management seçilir Esi

    Scenario: Admin Dean Ekleyebilmeli
      Given Admin add Dean bolumundeki name kismina bir veri girer Esi
      Then Admin add Dean bolumundeki surname kismina bir verir girer Esi
      Then Admin add Dean bolumundeki birth place kismina bir verir girer Esi
      Then Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi
      Then Admin add Dean bolumundeki Date of Birth kismina bir verir girer Esi
      Then Admin add Dean bolumundeki phone kismina bir verir girer Esi
      Then Admin add Dean bolumundeki Ssn kismina bir verir girer Esi
      Then Admin add Dean bolumundeki username kismina bir verir girer Esi
      Then Admin add Dean bolumundeki password kismina bir verir girer Esi
      Then Admin add Dean bolumundeki submit butonuna tıklar Esi
      Then Dean eklenebildigini dogrula Esi
      Then sayfayi kapatir Esi

      Scenario: Name kismi bos birakilamamali
        Given Admin add Dean bolumundeki name kismini bos birakir Esi
        Then Admin add Dean bolumundeki surname kismina bir verir girer Esi
        Then Admin add Dean bolumundeki birth place kismina bir verir girer Esi
        Then Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi
        Then Admin add Dean bolumundeki Date of Birth kismina bir verir girer Esi
        Then Admin add Dean bolumundeki phone kismina bir verir girer Esi
        Then Admin add Dean bolumundeki Ssn kismina bir verir girer Esi
        Then Admin add Dean bolumundeki username kismina bir verir girer Esi
        Then Admin add Dean bolumundeki password kismina bir verir girer Esi
        Then Admin add Dean bolumundeki submit butonuna tıklar Esi
        Then Admin add Dean bolumundeki name kutusunun altinda required yazisinin geldigini dogrular Esi
        Then sayfayi kapatir Esi

  Scenario: Surname kismi bos birakilamamali
    Given Admin add Dean bolumundeki name kismina bir veri girer Esi
    Then Admin add Dean bolumundeki surname kismini bos birakir Esi
    Then Admin add Dean bolumundeki birth place kismina bir verir girer Esi
    Then Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi
    Then Admin add Dean bolumundeki Date of Birth kismina bir verir girer Esi
    Then Admin add Dean bolumundeki phone kismina bir verir girer Esi
    Then Admin add Dean bolumundeki Ssn kismina bir verir girer Esi
    Then Admin add Dean bolumundeki username kismina bir verir girer Esi
    Then Admin add Dean bolumundeki password kismina bir verir girer Esi
    Then Admin add Dean bolumundeki submit butonuna tıklar Esi
    Then Admin add Dean bolumundeki Surname kutusunun altinda required yazisinin geldigini dogrular Esi
    Then sayfayi kapatir Esi

  Scenario: Birth Place kismi bos birakilamamali
    Given Admin add Dean bolumundeki name kismina bir veri girer Esi
    Then Admin add Dean bolumundeki surname kismina bir verir girer Esi
    Then Admin add Dean bolumundeki birth place kismini bos birakir Esi
    Then Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi
    Then Admin add Dean bolumundeki Date of Birth kismina bir verir girer Esi
    Then Admin add Dean bolumundeki phone kismina bir verir girer Esi
    Then Admin add Dean bolumundeki Ssn kismina bir verir girer Esi
    Then Admin add Dean bolumundeki username kismina bir verir girer Esi
    Then Admin add Dean bolumundeki password kismina bir verir girer Esi
    Then Admin add Dean bolumundeki submit butonuna tıklar Esi
    Then Admin add Dean bolumundeki birth place kutusunun altinda required yazisinin geldigini dogrular Esi
    Then sayfayi kapatir Esi

    Scenario: TC05 Gender kısmı boş bırakılamamalı
      Given Admin add Dean bolumundeki name kismina bir veri girer Esi
      Then Admin add Dean bolumundeki surname kismina bir verir girer Esi
      Then Admin add Dean bolumundeki birth place kismina bir verir girer Esi
      Then Admin add Dean bolumundeki gender kisminda cinsiyeti bos birakir Esi
      Then Admin add Dean bolumundeki Date of Birth kismina bir verir girer Esi
      Then Admin add Dean bolumundeki phone kismina bir verir girer Esi
      Then Admin add Dean bolumundeki Ssn kismina bir verir girer Esi
      Then Admin add Dean bolumundeki username kismina bir verir girer Esi
      Then Admin add Dean bolumundeki password kismina bir verir girer Esi
      Then Admin add Dean bolumundeki submit butonuna tıklar Esi
      Then invalid value uyarisi alindigini dogrula Esi
      Then sayfayi kapatir Esi

      Scenario: TC06 Date of Birthday kısmı boş bırakılamamalı
        Given Admin add Dean bolumundeki name kismina bir veri girer Esi
        Then Admin add Dean bolumundeki surname kismina bir verir girer Esi
        Then Admin add Dean bolumundeki birth place kismina bir verir girer Esi
        Then Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi
        Then Admin add Dean bolumundeki Date of Birth kismini bos birakir Esi
        Then Admin add Dean bolumundeki phone kismina bir verir girer Esi
        Then Admin add Dean bolumundeki Ssn kismina bir verir girer Esi
        Then Admin add Dean bolumundeki username kismina bir verir girer Esi
        Then Admin add Dean bolumundeki password kismina bir verir girer Esi
        Then Admin add Dean bolumundeki submit butonuna tıklar Esi
        Then Admin add Dean bolumundeki date of birth kutusunun altinda required yazisinin geldigini dogrular Esi
        Then sayfayi kapatir Esi

        Scenario: TC07 Date of birth kısmında gelecekteki bir tarihle kayıt olunamamalı
          Given Admin add Dean bolumundeki name kismina bir veri girer Esi
          Then Admin add Dean bolumundeki surname kismina bir verir girer Esi
          Then Admin add Dean bolumundeki birth place kismina bir verir girer Esi
          Then Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi
          Then Admin add Dean bolumundeki Date of Birth kismina gelecekten bir tarih girilir Esi
          Then Admin add Dean bolumundeki phone kismina bir verir girer Esi
          Then Admin add Dean bolumundeki Ssn kismina bir verir girer Esi
          Then Admin add Dean bolumundeki username kismina bir verir girer Esi
          Then Admin add Dean bolumundeki password kismina bir verir girer Esi
          Then Admin add Dean bolumundeki submit butonuna tıklar Esi
          Then Admin add Dean bolumundeki gecmis bir tarih olmali uyari yazisinin geldigini dogrular Esi
          Then sayfayi kapatir Esi

          Scenario: TC08 Phone kısmı boş bırakılamamalı

            Given Admin add Dean bolumundeki name kismina bir veri girer Esi
            Then Admin add Dean bolumundeki surname kismina bir verir girer Esi
            Then Admin add Dean bolumundeki birth place kismina bir verir girer Esi
            Then Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi
            Then Admin add Dean bolumundeki Date of Birth kismina bir verir girer Esi
            Then Admin add Dean bolumundeki phone kismini bos birakir Esi
            Then Admin add Dean bolumundeki Ssn kismina bir verir girer Esi
            Then Admin add Dean bolumundeki username kismina bir verir girer Esi
            Then Admin add Dean bolumundeki password kismina bir verir girer Esi
            Then Admin add Dean bolumundeki submit butonuna tıklar Esi
            Then Admin add Dean bolumundeki phone kutusunun altinda required yazisinin geldigini dogrular Esi
            Then sayfayi kapatir Esi


          Scenario: TC09 Ssn kısmı boş bırakılamamalı
            Given Admin add Dean bolumundeki name kismina bir veri girer Esi
            Then Admin add Dean bolumundeki surname kismina bir verir girer Esi
            Then Admin add Dean bolumundeki birth place kismina bir verir girer Esi
            Then Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi
            Then Admin add Dean bolumundeki Date of Birth kismina bir verir girer Esi
            Then Admin add Dean bolumundeki phone kismini bos birakir Esi
            Then Admin add Dean bolumundeki Ssn kismini bos birakir Esi
            Then Admin add Dean bolumundeki username kismina bir verir girer Esi
            Then Admin add Dean bolumundeki password kismina bir verir girer Esi
            Then Admin add Dean bolumundeki submit butonuna tıklar Esi
            Then Admin add Dean bolumundeki ssn kutusunun altinda required yazisinin geldigini dogrular Esi
            Then sayfayi kapatir Esi

          Scenario: TC10 Ssn kısmında 3. ve 5. rakamdan sonra - işareti yoksa kayıt olunamamalı
            Given Admin add Dean bolumundeki name kismina bir veri girer Esi
            Then Admin add Dean bolumundeki surname kismina bir verir girer Esi
            Then Admin add Dean bolumundeki birth place kismina bir verir girer Esi
            Then Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi
            Then Admin add Dean bolumundeki Date of Birth kismina bir verir girer Esi
            Then Admin add Dean bolumundeki phone kismina bir verir girer Esi
            Then Admin add Dean bolumundeki Ssn kismina gecersiz formatta veri girer Esi
            Then Admin add Dean bolumundeki username kismina bir verir girer Esi
            Then Admin add Dean bolumundeki password kismina bir verir girer Esi
            Then Admin add Dean bolumundeki submit butonuna tıklar Esi
            Then Sistemden Please enter a valid SSN number yazisinin geldigini dogrula Esi
            Then sayfayi kapatir Esi

          Scenario: TC11 Ssn kısmında geçerli formatta 9 rakamdan az rakam varsa kayıt olunamamalı
            Given Admin add Dean bolumundeki name kismina bir veri girer Esi
            Then Admin add Dean bolumundeki surname kismina bir verir girer Esi
            Then Admin add Dean bolumundeki birth place kismina bir verir girer Esi
            Then Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi
            Then Admin add Dean bolumundeki Date of Birth kismina bir verir girer Esi
            Then Admin add Dean bolumundeki phone kismina bir verir girer Esi
            Then Admin add Dean bolumundeki Ssn kismina dokuz rakamdan daha az rakamli bir veri girer Esi
            Then Admin add Dean bolumundeki username kismina bir verir girer Esi
            Then Admin add Dean bolumundeki password kismina bir verir girer Esi
            Then Admin add Dean bolumundeki submit butonuna tıklar Esi
            Then Sistemden "Minimum 11 character (XXX-XX-XXXX)" yazisinin geldigini dogrula Esi
            Then sayfayi kapatir Esi

          Scenario: TC12 Ssn kısmında geçerli formatta 9 rakamdan fazla rakam varsa kayıt olunamamalı
            Given Admin add Dean bolumundeki name kismina bir veri girer Esi
            Then Admin add Dean bolumundeki surname kismina bir verir girer Esi
            Then Admin add Dean bolumundeki birth place kismina bir verir girer Esi
            Then Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi
            Then Admin add Dean bolumundeki Date of Birth kismina bir verir girer Esi
            Then Admin add Dean bolumundeki phone kismina bir verir girer Esi
            Then Admin add Dean bolumundeki Ssn kismina dokuz rakamdan daha fazla rakam ile bir veri girer Esi
            Then Admin add Dean bolumundeki username kismina bir verir girer Esi
            Then Admin add Dean bolumundeki password kismina bir verir girer Esi
            Then Admin add Dean bolumundeki submit butonuna tıklar Esi
            Then Sistemden Please enter a valid SSN number yazisinin geldigini dogrula Esi
            Then sayfayi kapatir Esi

          Scenario: TC13 Username kısmı boş bırakılamamalı
            Given Admin add Dean bolumundeki name kismina bir veri girer Esi
            Then Admin add Dean bolumundeki surname kismina bir verir girer Esi
            Then Admin add Dean bolumundeki birth place kismina bir verir girer Esi
            Then Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi
            Then Admin add Dean bolumundeki Date of Birth kismina bir verir girer Esi
            Then Admin add Dean bolumundeki phone kismina bir verir girer Esi
            Then Admin add Dean bolumundeki Ssn kismina bir verir girer Esi
            Then Admin add Dean bolumundeki username kismina bos birakir Esi
            Then Admin add Dean bolumundeki password kismina bir verir girer Esi
            Then Admin add Dean bolumundeki submit butonuna tıklar Esi
            Then Admin add Dean bolumundeki username kutusunun altinda required yazisinin geldigini dogrular Esi
            Then sayfayi kapatir Esi


          Scenario: TC14 Password kısmı boş bırakılamamalı
            Given Admin add Dean bolumundeki name kismina bir veri girer Esi
            Then Admin add Dean bolumundeki surname kismina bir verir girer Esi
            Then Admin add Dean bolumundeki birth place kismina bir verir girer Esi
            Then Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi
            Then Admin add Dean bolumundeki Date of Birth kismina bir verir girer Esi
            Then Admin add Dean bolumundeki phone kismina bir verir girer Esi
            Then Admin add Dean bolumundeki Ssn kismina bir verir girer Esi
            Then Admin add Dean bolumundeki username kismina bir verir girer Esi
            Then Admin add Dean bolumundeki password kismini bos birakir Esi
            Then Admin add Dean bolumundeki submit butonuna tıklar Esi
            Then Admin add Dean bolumundeki password kutusunun altinda Enter your password yazisinin geldigini dogrular Esi
            Then sayfayi kapatir Esi

           Scenario: TC15 Password kısmı 8 karakterden az ise Dean hesabı olusturulamamalı
            Given Admin add Dean bolumundeki name kismina bir veri girer Esi
            Then Admin add Dean bolumundeki surname kismina bir verir girer Esi
            Then Admin add Dean bolumundeki birth place kismina bir verir girer Esi
            Then Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi
            Then Admin add Dean bolumundeki Date of Birth kismina bir verir girer Esi
            Then Admin add Dean bolumundeki phone kismina bir verir girer Esi
            Then Admin add Dean bolumundeki Ssn kismina bir verir girer Esi
            Then Admin add Dean bolumundeki username kismina bir verir girer Esi
            Then Admin add Dean bolumundeki password kismina sekiz karakterden az bir veri girer Esi
            Then Admin add Dean bolumundeki submit butonuna tıklar Esi
            Then Admin add Dean bolumundeki password kutusunun altinda "At least 8 characters" yazisinin geldigini dogrular Esi
            Then sayfayi kapatir Esi


 Scenario: TC16 Buyuk harf içermeyen bir password girildiginde Dean hesabı oluşturulamamalı
            Given Admin add Dean bolumundeki name kismina bir veri girer Esi
            Then Admin add Dean bolumundeki surname kismina bir verir girer Esi
            Then Admin add Dean bolumundeki birth place kismina bir verir girer Esi
            Then Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi
            Then Admin add Dean bolumundeki Date of Birth kismina bir verir girer Esi
            Then Admin add Dean bolumundeki phone kismina bir verir girer Esi
            Then Admin add Dean bolumundeki Ssn kismina bir verir girer Esi
            Then Admin add Dean bolumundeki username kismina bir verir girer Esi
            Then Admin add Dean bolumundeki password kismina buyuk harf icermeyen bir veri girer Esi
            Then Admin add Dean bolumundeki submit butonuna tıklar Esi
            Then Admin add Dean bolumundeki password kutusunun altinda "One uppercase character" yazisinin geldigini dogrular Esi
            Then sayfayi kapatir Esi

 Scenario: TC17 Kucuk harf içermeyen bir password girildiginde Dean hesabı oluşturulamamalı
            Given Admin add Dean bolumundeki name kismina bir veri girer Esi
            Then Admin add Dean bolumundeki surname kismina bir verir girer Esi
            Then Admin add Dean bolumundeki birth place kismina bir verir girer Esi
            Then Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi
            Then Admin add Dean bolumundeki Date of Birth kismina bir verir girer Esi
            Then Admin add Dean bolumundeki phone kismina bir verir girer Esi
            Then Admin add Dean bolumundeki Ssn kismina bir verir girer Esi
            Then Admin add Dean bolumundeki username kismina bir verir girer Esi
            Then Admin add Dean bolumundeki password kismina kucuk harf icermeyen bir veri girer Esi
            Then Admin add Dean bolumundeki submit butonuna tıklar Esi
            Then Admin add Dean bolumundeki password kutusunun altinda "One lowercase character" yazisinin geldigini dogrular Esi
            Then sayfayi kapatir Esi
Scenario: TC18 Rakam içermeyen bir password girildiginde Dean hesabı oluşturulamamalı
            Given Admin add Dean bolumundeki name kismina bir veri girer Esi
            Then Admin add Dean bolumundeki surname kismina bir verir girer Esi
            Then Admin add Dean bolumundeki birth place kismina bir verir girer Esi
            Then Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi
            Then Admin add Dean bolumundeki Date of Birth kismina bir verir girer Esi
            Then Admin add Dean bolumundeki phone kismina bir verir girer Esi
            Then Admin add Dean bolumundeki Ssn kismina bir verir girer Esi
            Then Admin add Dean bolumundeki username kismina bir verir girer Esi
            Then Admin add Dean bolumundeki password kismina rakam icermeyen bir veri girer Esi
            Then Admin add Dean bolumundeki submit butonuna tıklar Esi
            Then Admin add Dean bolumundeki password kutusunun altinda "One number" yazisinin geldigini dogrular Esi
            Then sayfayi kapatir Esi
