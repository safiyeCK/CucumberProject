Feature: US01 Aday öğrenciler sisteme kayıt olabilmelidir.

Background:
  Given kullanici "https://managementonschools.com/" e gider_SK
  And kullanici Register butonuna tiklar_SK

Scenario: TC01 Web sitesine yeni bir kullanıcı kaydi yapma
  Then kullanici name alanina isim girer_SK
  And kullanici surname alanina soyisim girer_SK
  And kullanici Birth Place alanina dogum yeri girer_SK
  And kullanici Phone Number alanina telefonnumarasi girer_SK
  And kullanici Gender alanindan cinsiyet secer_SK
  And kullanici Birth Date alanina dogum gunu girer_SK
  And kullanici SSN alanina ssn girer_SK
  And kullanici User Name alanina username girer_SK
  And kullanici Password alanina password girer_SK
  And kullanici Register dugmesine tiklar_SK
  And Kayit islemi basariyla tamamlanir_SK
  And Kullanici sayfayi kapatir_SK

Scenario: TC02 Name Kutusu bos birakilarak sisteme kayit olunmaz
  Then kullanici surname alanina soyisim girer_SK
  And kullanici Birth Place alanina dogum yeri girer_SK
  And kullanici Phone Number alanina telefonnumarasi girer_SK
  And kullanici Gender alanindan cinsiyet secer_SK
  And kullanici Birth Date alanina dogum gunu girer_SK
  And kullanici SSN alanina ssn girer_SK
  And kullanici User Name alanina username girer_SK
  And kullanici Password alanina password girer_SK
  And kullanici Register dugmesine tiklar_SK
  And Name kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_SK
  And Kullanici sayfayi kapatir_SK

  Scenario: TC03 SurName Kutusu bos birakilarak sisteme kayit olunmaz_SK
    Then kullanici name alanina isim girer_SK
    And kullanici Birth Place alanina dogum yeri girer_SK
    And kullanici Phone Number alanina telefonnumarasi girer_SK
    And kullanici Gender alanindan cinsiyet secer_SK
    And kullanici Birth Date alanina dogum gunu girer_SK
    And kullanici SSN alanina ssn girer_SK
    And kullanici User Name alanina username girer_SK
    And kullanici Password alanina password girer_SK
    And kullanici Register dugmesine tiklar_SK
    And Surname kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_SK
    And Kullanici sayfayi kapatir_SK

    Scenario: TC04 "Birth Place" alani bos birakilarak sisteme kayit olunamamali_SK
      Then kullanici name alanina isim girer_SK
      And kullanici surname alanina soyisim girer_SK
      And kullanici Birth Place alanini bos birakir_SK
      And kullanici Phone Number alanina telefonnumarasi girer_SK
      And kullanici Gender alanindan cinsiyet secer_SK
      And kullanici Birth Date alanina dogum gunu girer_SK
      And kullanici SSN alanina ssn girer_SK
      And kullanici User Name alanina username girer_SK
      And kullanici Password alanina password girer_SK
      And kullanici Register dugmesine tiklar_SK
      And Birth Place kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_SK
      And Kullanici sayfayi kapatir_SK

      Scenario: TC05 "Phone Number" alani bos birakilarak sisteme kayit olunamamali
        Then kullanici name alanina isim girer_SK
        And kullanici surname alanina soyisim girer_SK
        And kullanici Birth Place alanina dogum yeri girer_SK
        And kullanici Phone Number alanini bos birak_SK
        And kullanici Gender alanindan cinsiyet secer_SK
        And kullanici Birth Date alanina dogum gunu girer_SK
        And kullanici SSN alanina ssn girer_SK
        And kullanici User Name alanina username girer_SK
        And kullanici Password alanina password girer_SK
        And kullanici Register dugmesine tiklar_SK
        And phone Number kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_SK
        And Kullanici sayfayi kapatir_SK

    Scenario: TC06 "Phone Number" alanina patterne uygun olmayan bir numara girerek kayit olunamamali
      Then kullanici name alanina isim girer_SK
      And kullanici surname alanina soyisim girer_SK
      And kullanici Birth Place alanina dogum yeri girer_SK
      And kullanici Phone Number alanina patterne uygun olmayan bir numara girer_SK
      And kullanici Gender alanindan cinsiyet secer_SK
      And kullanici Birth Date alanina dogum gunu girer_SK
      And kullanici SSN alanina ssn girer_SK
      And kullanici User Name alanina username girer_SK
      And kullanici Password alanina password girer_SK
      And kullanici Register dugmesine tiklar_SK
      And Phone Number alanina patterne uygun olmayan bir numara girildigi icin kayit isleminin tamamlanmadigini dogrular_SK
      And Kullanici sayfayi kapatir_SK

   Scenario: TC07 "SSN" alanina patterne uygun olmayan bir numara girerek kayit olunamamali_SK
     Then kullanici name alanina isim girer_SK
     And kullanici surname alanina soyisim girer_SK
     And kullanici Birth Place alanina dogum yeri girer_SK
     And kullanici Phone Number alanina telefonnumarasi girer_SK
     And kullanici Gender alanindan cinsiyet secer_SK
     And kullanici Birth Date alanina dogum gunu girer_SK
     And kullanici SSN alanina patterne uygun olmayan bir numara girer_SK
     And kullanici User Name alanina username girer_SK
     And kullanici Password alanina password girer_SK
     And kullanici Register dugmesine tiklar_SK
     And SSN alanina patterne uygun olmayan bir numara girildigi icin kayit isleminin tamamlanmadigini dogrular_SK
     And Kullanici sayfayi kapatir_SK

     Scenario: TC08 "SSN" alanina bos birakilarak kayit olunamamali_SK
       Then kullanici name alanina isim girer_SK
       And kullanici surname alanina soyisim girer_SK
       And kullanici Birth Place alanina dogum yeri girer_SK
       And kullanici Phone Number alanina telefonnumarasi girer_SK
       And kullanici Gender alanindan cinsiyet secer_SK
       And kullanici Birth Date alanina dogum gunu girer_SK
       And kullanici SSN alanini bos birakir_SK
       And kullanici User Name alanina username girer_SK
       And kullanici Password alanina password girer_SK
       And kullanici Register dugmesine tiklar_SK
       And  ssn kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_SK
       And Kullanici sayfayi kapatir_SK

       Scenario: TC09 "Birth Date" alani bos birakilarak kayit olunamaz
         Then kullanici name alanina isim girer_SK
         And kullanici surname alanina soyisim girer_SK
         And kullanici Birth Place alanina dogum yeri girer_SK
         And kullanici Phone Number alanina telefonnumarasi girer_SK
         And kullanici Gender alanindan cinsiyet secer_SK
         And kullanici Birth Date alanini bos birakir_SK
         And kullanici SSN alanina ssn girer_SK
         And kullanici User Name alanina username girer_SK
         And kullanici Password alanina password girer_SK
         And kullanici Register dugmesine tiklar_SK
         And Birth Date alanini bos birakinca kayit olunamadigini dogrular_SK
         And Kullanici sayfayi kapatir_SK

     Scenario: TC10 "User Name" alani bos birakilarak kayit olunamamali
       Then kullanici name alanina isim girer_SK
       And kullanici surname alanina soyisim girer_SK
       And kullanici Birth Place alanina dogum yeri girer_SK
       And kullanici Phone Number alanina telefonnumarasi girer_SK
       And kullanici Gender alanindan cinsiyet secer_SK
       And kullanici Birth Date alanina dogum gunu girer_SK
       And kullanici SSN alanina ssn girer_SK
       And kullanici User Name alanini bos birakir_SK
       And kullanici Password alanina password girer_SK
       And kullanici Register dugmesine tiklar_SK
       And User Name alani bos birakilarak kayit olunamadigini dogrular_SK
       And Kullanici sayfayi kapatir_SK

    Scenario: TC11 "Password" alani bos birakilarak kayit olunamamali
      Then kullanici name alanina isim girer_SK
      And kullanici surname alanina soyisim girer_SK
      And kullanici Birth Place alanina dogum yeri girer_SK
      And kullanici Phone Number alanina telefonnumarasi girer_SK
      And kullanici Gender alanindan cinsiyet secer_SK
      And kullanici Birth Date alanina dogum gunu girer_SK
      And kullanici SSN alanina ssn girer_SK
      And kullanici User Name alanina username girer_SK
      And kullanici Password alanini bos birakir_SK
      And kullanici Register dugmesine tiklar_SK
      And Password alani bos birakilarak kayit olunamadigini dogrular_SK
      And Kullanici sayfayi kapatir_SK

    Scenario: TC12 Kullanici 8 karakterden az sifre ile kayit olamaz
      Then kullanici name alanina isim girer_SK
      And kullanici surname alanina soyisim girer_SK
      And kullanici Birth Place alanina dogum yeri girer_SK
      And kullanici Phone Number alanina telefonnumarasi girer_SK
      And kullanici Gender alanindan cinsiyet secer_SK
      And kullanici Birth Date alanina dogum gunu girer_SK
      And kullanici SSN alanina ssn girer_SK
      And kullanici User Name alanina username girer_SK
      And kullanici Password alanina yedi karakterli bir  "password" girer_SK
      And kullanici Register dugmesine tiklar_SK
      And Sekiz karakterden daha az karakterli bir sifre ile kayit olunamadigini dogrular_SK
      And Kullanici sayfayi kapatir_SK

    Scenario: TC13 Kullanici sadece rakamlardan olusan bir sifre ile kayit olamaz
      Then kullanici name alanina isim girer_SK
      And kullanici surname alanina soyisim girer_SK
      And kullanici Birth Place alanina dogum yeri girer_SK
      And kullanici Phone Number alanina telefonnumarasi girer_SK
      And kullanici Gender alanindan cinsiyet secer_SK
      And kullanici Birth Date alanina dogum gunu girer_SK
      And kullanici SSN alanina ssn girer_SK
      And kullanici User Name alanina username girer_SK
      And kullanici Password alanina sadece rakamlardan olusan bir sifre girer_SK
      And kullanici Register dugmesine tiklar_SK
      And Kayit isleminin tamamlanmadigini dogrular_SK
      And Kullanici sayfayi kapatir_SK

    Scenario: TC14 Kullanici sadece kucuk harflerden olusan bir sifre ile kayit olamaz
      Then kullanici name alanina isim girer_SK
      And kullanici surname alanina soyisim girer_SK
      And kullanici Birth Place alanina dogum yeri girer_SK
      And kullanici Phone Number alanina telefonnumarasi girer_SK
      And kullanici Gender alanindan cinsiyet secer_SK
      And kullanici Birth Date alanina dogum gunu girer_SK
      And kullanici SSN alanina ssn girer_SK
      And kullanici User Name alanina username girer_SK
      And kullanici Password alanina sadece kucuk harflerden olusan bir sifre girer_SK
      And kullanici Register dugmesine tiklar_SK
      And kullanici sadece kucuk harflerden olusan bir sifre ile kayit olamaz_SK
      And Kullanici sayfayi kapatir_SK

      Scenario: TC15 Kullanici sadece buyuk harflerden olusan bir sifre ile kayit olamaz
        Then kullanici name alanina isim girer_SK
        And kullanici surname alanina soyisim girer_SK
        And kullanici Birth Place alanina dogum yeri girer_SK
        And kullanici Phone Number alanina telefonnumarasi girer_SK
        And kullanici Gender alanindan cinsiyet secer_SK
        And kullanici Birth Date alanina dogum gunu girer_SK
        And kullanici SSN alanina ssn girer_SK
        And kullanici User Name alanina username girer_SK
        And kullanici Password alanina sadece buyuk harflerden olusan bir sifre girer_SK
        And kullanici Register dugmesine tiklar_SK
        And kullanici sadece buyuk harflerden olusan bir sifre ile kayit olamaz_SK
        And Kullanici sayfayi kapatir_SK

    Scenario: TC16 Kullanici sadece buyuk ve kucuk harflerden olusan bir sifre ile kayit olamaz
      Then kullanici name alanina isim girer_SK
      And kullanici surname alanina soyisim girer_SK
      And kullanici Birth Place alanina dogum yeri girer_SK
      And kullanici Phone Number alanina telefonnumarasi girer_SK
      And kullanici Gender alanindan cinsiyet secer_SK
      And kullanici Birth Date alanina dogum gunu girer_SK
      And kullanici SSN alanina ssn girer_SK
      And kullanici User Name alanina username girer_SK
      And kullanici Password alanina sadece buyuk ve kucuk harflerden olusan bir sifre girer_SK
      And kullanici Register dugmesine tiklar_SK
      And kullanici sadece buyuk ve kucuk harflerden olusan bir sifre ile kayit olamaz_SK
      And Kullanici sayfayi kapatir_SK

    Scenario: TC17 Kullanici sadece rakam ve buyuk harflerden olusan bir sifre ile kayit olamaz
      Then kullanici name alanina isim girer_SK
      And kullanici surname alanina soyisim girer_SK
      And kullanici Birth Place alanina dogum yeri girer_SK
      And kullanici Phone Number alanina telefonnumarasi girer_SK
      And kullanici Gender alanindan cinsiyet secer_SK
      And kullanici Birth Date alanina dogum gunu girer_SK
      And kullanici SSN alanina ssn girer_SK
      And kullanici User Name alanina username girer_SK
      And kullanici Password alanina sadece rakam ve buyuk harflerden olusan bir sifre girer_SK
      And kullanici Register dugmesine tiklar_SK
      And kullanici sadece rakam ve buyuk harflerden olusan bir sifre ile kayit olamaz_SK
      And Kullanici sayfayi kapatir_SK

    Scenario: TC18 Daha once kayitli bir SSN number ile kayit olunamamali
      Then kullanici name alanina isim girer_SK
      And kullanici surname alanina soyisim girer_SK
      And kullanici Birth Place alanina dogum yeri girer_SK
      And kullanici Phone Number alanina telefonnumarasi girer_SK
      And kullanici Gender alanindan cinsiyet secer_SK
      And kullanici Birth Date alanina dogum gunu girer_SK
      And kullanici SSN alanina kayitli bir ssn girer_SK
      And kullanici User Name alanina username girer_SK
      And kullanici Password alanina password girer_SK
      And kullanici Register dugmesine tiklar_SK
      And Daha once kayitli bir SSN ile kayit olunamadigini dogrular_SK
      And Kullanici sayfayi kapatir_SK









