Feature: US_15 Vice Dean, ogrenci olusturabilmelidir.

  Background: ortak adimlar
    Given kullanici  Managementon Schools sayfasina gider_DB
    Then kullanici login butonuna tiklar_DB
    Then kullanici kayitli User Name ve password ile Vise Dean olarak giris yapar_DB
    Then kullanici menu butonuna tiklar_DB
    Then kullanici menu kismindan Student Management i secer_DB


  @TC01
    Scenario: TC_01 Vice Dean, ogrenci olusturebilmelidir.
      Given kullanici Choose Advisor Teacher kismindan "Teacher Murat" secer
      Then kullanici name alanina isim girer_DB
      And kullanici surname alanina soyisim girer_DB
      And kullanici Birth Place alanina dogum yeri girer_DB
      And kullanci Email alanina email girer_DB
      And kullanici Phone Number alanina telefonnumarasi girer_DB
      And kullanici Gender alanindan "male" secenegini secer_DB
      And kullanici Birth Date alanina dogum gunu girer_DB
      And kullanici SSN alanina ssn girer_DB
      And kullanici User Name alanina username girer_DB
      And kullanici Father Name alanina baba adi girer_DB
      And kullanici Mother Name alanina anne adi girer_DB
      And kullanici Password alanina password girer_DB
      And kullanici Submit dugmesine tiklar_DB
      And kullanici Ogrenci olustugunu dogrular_DB
      And Kullanici sayfayi kapatir_DB
@TC02
  Scenario: TC_02 Vice Dean,"Name"  kismini bos birakilarak ogrenci oluşturamamalidir
    Given kullanici Choose Advisor Teacher kismindan "Teacher Murat" secer
    Then kullanici name alanini bos birakir_DB
    And kullanici surname alanina soyisim girer_DB
    And kullanici Birth Place alanina dogum yeri girer_DB
    And kullanci Email alanina email girer_DB
    And kullanici Phone Number alanina telefonnumarasi girer_DB
    And kullanici Gender alanindan "female" secenegini secer_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanina ssn girer_DB
    And kullanici User Name alanina username girer_DB
    And kullanici Father Name alanina baba adi girer_DB
    And kullanici Mother Name alanina anne adi girer_DB
    And kullanici Password alanina password girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And Name kutusu bos olunca ogrencinin olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB
@TC03
  Scenario: TC_03 Vice Dean, "Surname"  kismini bos birakarak ogrenci oluşturamamalidir
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina isim girer_DB
    And kullanici surname alanini bos birakir_DB
    And kullanici Birth Place alanina dogum yeri girer_DB
    And kullanci Email alanina email girer_DB
    And kullanici Phone Number alanina telefonnumarasi girer_DB
    And kullanici Gender alanindan "female" secenegini secer_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanina ssn girer_DB
    And kullanici User Name alanina username girer_DB
    And kullanici Father Name alanina baba adi girer_DB
    And kullanici Mother Name alanina anne adi girer_DB
    And kullanici Password alanina password girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And Surname kutusu bos olunca ogrencinin olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB
@TC04
  Scenario: TC_04 Vice Dean, "Birth Place"  kismini bos birakarak ogrenci oluşturamamalidir
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina isim girer_DB
    And kullanici surname alanina soyisim girer_DB
    And kullanici Birth Place alanini bos birakir_DB
    And kullanci Email alanina email girer_DB
    And kullanici Phone Number alanina telefonnumarasi girer_DB
    And kullanici Gender alanindan "male" secenegini secer_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanina ssn girer_DB
    And kullanici User Name alanina username girer_DB
    And kullanici Father Name alanina baba adi girer_DB
    And kullanici Mother Name alanina anne adi girer_DB
    And kullanici Password alanina password girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And Birth Place kutusu bos olunca ogrencinin olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB
@TC05
  Scenario: TC_05 Vice Dean, "E-mail"  kismini bos birakarak ogrenci oluşturamamalidir
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina isim girer_DB
    And kullanici surname alanina soyisim girer_DB
    And kullanici Birth Place alanina dogum yeri girer_DB
    And kullanci Email alanini bos birakir_DB
    And kullanici Phone Number alanina telefonnumarasi girer_DB
    And kullanici Gender alanindan "female" secenegini secer_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanina ssn girer_DB
    And kullanici User Name alanina username girer_DB
    And kullanici Father Name alanina baba adi girer_DB
    And kullanici Mother Name alanina anne adi girer_DB
    And kullanici Password alanina password girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And Email alani bos olunca ogrencinin olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB
@TC06
  Scenario: TC_06 Vice Dean, "Phone"  kismini bos birakarak ogrenci oluşturamamalidir
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina isim girer_DB
    And kullanici surname alanina soyisim girer_DB
    And kullanici Birth Place alanina dogum yeri girer_DB
    And kullanci Email alanina email girer_DB
    And kullanici Phone Number alaninbos birakir_DB
    And kullanici Gender alanindan "male" secenegini secer_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanina ssn girer_DB
    And kullanici User Name alanina username girer_DB
    And kullanici Father Name alanina baba adi girer_DB
    And kullanici Mother Name alanina anne adi girer_DB
    And kullanici Password alanina password girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And phone Number kutusu bos olunca ogrencinin olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB
  @TC07
  Scenario: TC_07 Vice Dean, "Gender" kismini bos birakarak ogrenci olusturamamalidir
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina isim girer_DB
    And kullanici surname alanina soyisim girer_DB
    And kullanici Birth Place alanina dogum yeri girer_DB
    And kullanci Email alanina email girer_DB
    And kullanici Phone Number alanina telefonnumarasi girer_DB
    And kullanici Gender alaninni bos birakir_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanina ssn girer_DB
    And kullanici User Name alanina username girer_DB
    And kullanici Father Name alanina baba adi girer_DB
    And kullanici Mother Name alanina anne adi girer_DB
    And kullanici Password alanina password girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And Gender kismini bos birakarak ogrenci olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB
  @TC08
  Scenario: TC_08 Vice Dean, "Birth Date" alanı bos birakarak ogrenci oluşturamamalidir
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina isim girer_DB
    And kullanici surname alanina soyisim girer_DB
    And kullanici Birth Place alanini bos birakirDB
    And kullanci Email alanina email girer_DB
    And kullanici Phone Number alanina telefonnumarasi girer_DB
    And kullanici Gender alanindan "male" secenegini secer_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanina ssn girer_DB
    And kullanici User Name alanina username girer_DB
    And kullanici Father Name alanina baba adi girer_DB
    And kullanici Mother Name alanina anne adi girer_DB
    And kullanici Password alanina password girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And Birth Date alanıni bos birakarak ogrenci olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB

  @TC09
  Scenario: TC_9 Vice Dean, "SSN" alanina patterne uygun olmayan bir numara ile ogrenci olusturamamalidir
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina isim girer_DB
    And kullanici surname alanina soyisim girer_DB
    And kullanici Birth Place alanina dogum yeri girer_DB
    And kullanci Email alanina email girer_DB
    And kullanici Phone Number alanina telefonnumarasi girer_DB
    And kullanici Gender alanindan "female" secenegini secer_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanina patterne uygun olmayan bir numara girer_DB
    And kullanici User Name alanina username girer_DB
    And kullanici Father Name alanina baba adi girer_DB
    And kullanici Mother Name alanina anne adi girer_DB
    And kullanici Password alanina password girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And SSN alanina patterne uygun olmayan bir numara girildigi icin ogrencinin olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB

  @TC10
  Scenario: TC_10 Vice Dean, "SSN" alanıni bos birakarak ogrenci olusturamamalidir
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina isim girer_DB
    And kullanici surname alanina soyisim girer_DB
    And kullanici Birth Place alanina dogum yeri girer_DB
    And kullanci Email alanina email girer_DB
    And kullanici Phone Number alanina telefonnumarasi girer_DB
    And kullanici Gender alanindan "male" secenegini secer_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanini bos birakir_DB
    And kullanici User Name alanina username girer_DB
    And kullanici Father Name alanina baba adi girer_DB
    And kullanici Mother Name alanina anne adi girer_DB
    And kullanici Password alanina password girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And ssn kutusu bos olunca ogrencinin olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB

  @TC11
  Scenario: TC_11 Vice Dean, "User Name" alanıni bos birakarak ogrenci olusturamamalidir
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina isim girer_DB
    And kullanici surname alanina soyisim girer_DB
    And kullanici Birth Place alanina dogum yeri girer_DB
    And kullanci Email alanina email girer_DB
    And kullanici Phone Number alanina telefonnumarasi girer_DB
    And kullanici Gender alanindan "male" secenegini secer_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanina ssn girer_DB
    And kullanici User Name alanini bos birakir_DB
    And kullanici Father Name alanina baba adi girer_DB
    And kullanici Mother Name alanina anne adi girer_DB
    And kullanici Password alanina password girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And User Name alani bos birakilarak ogrencinin olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB

  @TC12
  Scenario: TC_12 Vice Dean, "Father Name" alanini bos birakilarak ogrenci olusturamamalidir
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina isim girer_DB
    And kullanici surname alanina soyisim girer_DB
    And kullanici Birth Place alanina dogum yeri girer_DB
    And kullanci Email alanina email girer_DB
    And kullanici Phone Number alanina telefonnumarasi girer_DB
    And kullanici Gender alanindan "male" secenegini secer_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanina ssn girer_DB
    And kullanici User Name alanina username girer_DB
    And kullanici Father Name alanini bos birakir_DB
    And kullanici Mother Name alanina anne adi girer_DB
    And kullanici Password alanina password girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And Father Name alani bos birakilarak  ogrencinin olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB
  @TC13
  Scenario: TC_13 Vice Dean, Mother Name alanini bos birakarak ogrenci olusturamamalidirVice Dean,
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina isim girer_DB
    And kullanici surname alanina soyisim girer_DB
    And kullanici Birth Place alanina dogum yeri girer_DB
    And kullanci Email alanina email girer_DB
    And kullanici Phone Number alanina telefonnumarasi girer_DB
    And kullanici Gender alanindan "male" secenegini secer_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanina ssn girer_DB
    And kullanici User Name alanina username girer_DB
    And kullanici Father Name alanina baba adi girer_DB
    And kullanici Mother Name alanini bos birakir_DB
    And kullanici Password alanina password girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And Mother Name alani bos birakilarak ogrencinin olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB

  @TC14
  Scenario: TC_14 Vice Dean, Password alanini bos birakarak ogrenci olusturamamalidir
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina isim girer_DB
    And kullanici surname alanina soyisim girer_DB
    And kullanici Birth Place alanina dogum yeri girer_DB
    And kullanci Email alanina email girer_DB
    And kullanici Phone Number alanina telefonnumarasi girer_DB
    And kullanici Gender alanindan "male" secenegini secer_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanina ssn girer_DB
    And kullanici User Name alanina username girer_DB
    And kullanici Father Name alanina baba adi girer_DB
    And kullanici Mother Name alanina anne adi girer_DB
    And kullanici Password alanini bois birakir_DB
    And kullanici Submit dugmesine tiklar_DB
    And Password alani bos birakilarak ogrencinin olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB

  @TC15
  Scenario: TC_15  Vice Dean, 8 karakterden az sifre ile ogrenci olusturamamalidir
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina isim girer_DB
    And kullanici surname alanina soyisim girer_DB
    And kullanici Birth Place alanina dogum yeri girer_DB
    And kullanci Email alanina email girer_DB
    And kullanici Phone Number alanina telefonnumarasi girer_DB
    And kullanici Gender alanindan "male" secenegini secer_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanina ssn girer_DB
    And kullanici User Name alanina username girer_DB
    And kullanici Father Name alanina baba adi girer_DB
    And kullanici Mother Name alanina anne adi girer_DB
    And kullanici Password alanina yedi karakterli bir  "password" girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And Sekiz karakterden daha az karakterli bir sifre ile ogrencinin olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB

  @TC16
  Scenario: TC_16 Vice Dean, sadece rakamlardan olusan bir sifre ile ogrenci olusturamamalidir
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina isim girer_DB
    And kullanici surname alanina soyisim girer_DB
    And kullanici Birth Place alanina dogum yeri girer_DB
    And kullanci Email alanina email girer_DB
    And kullanici Phone Number alanina telefonnumarasi girer_DB
    And kullanici Gender alanindan "male" secenegini secer_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanina ssn girer_DB
    And kullanici User Name alanina username girer_DB
    And kullanici Father Name alanina baba adi girer_DB
    And kullanici Mother Name alanina anne adi girer_DB
    And kullanici Password alanina sadece rakamlardan olusan password girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And Ogrencinin olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB

  @TC17
  Scenario: TC_17 Vice Dean, sadece kucuk harflerden olusan bir sifre ile ogrenci olusturamamalidir
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina isim girer_DB
    And kullanici surname alanina soyisim girer_DB
    And kullanici Birth Place alanina dogum yeri girer_DB
    And kullanci Email alanina email girer_DB
    And kullanici Phone Number alanina telefonnumarasi girer_DB
    And kullanici Gender alanindan "female" secenegini secer_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanina ssn girer_DB
    And kullanici User Name alanina username girer_DB
    And kullanici Father Name alanina baba adi girer_DB
    And kullanici Mother Name alanina anne adi girer_DB
    And kullanici Password alanina sadece kucuk harflerden olusan bir sifre girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And kullanici sadece kucuk harflerden olusan bir sifre ile ogrencinin olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB

  @TC18
  Scenario: TC_18 Vice Dean, sadece buyuk harflerden olusan bir sifre ile ogrenci olusturamamalidir
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina isim girer_DB
    And kullanici surname alanina soyisim girer_DB
    And kullanici Birth Place alanina dogum yeri girer_DB
    And kullanci Email alanina email girer_DB
    And kullanici Phone Number alanina telefonnumarasi girer_DB
    And kullanici Gender alanindan "female" secenegini secer_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanina ssn girer_DB
    And kullanici User Name alanina username girer_DB
    And kullanici Father Name alanina baba adi girer_DB
    And kullanici Mother Name alanina anne adi girer_DB
    And kullanici Password alanina sadece buyuk harflerden olusan bir sifre girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And kullanici sadece buyuk harflerden olusan bir sifre ile ogrencinin olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB

  @TC19
  Scenario: TC_19 Vice Dean, sadece buyuk ve kucuk harflerden olusan bir sifre ile ogrenci olusturamamalidir
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina isim girer_DB
    And kullanici surname alanina soyisim girer_DB
    And kullanici Birth Place alanina dogum yeri girer_DB
    And kullanci Email alanina email girer_DB
    And kullanici Phone Number alanina telefonnumarasi girer_DB
    And kullanici Gender alanindan "male" secenegini secer_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanina ssn girer_DB
    And kullanici User Name alanina username girer_DB
    And kullanici Father Name alanina baba adi girer_DB
    And kullanici Mother Name alanina anne adi girer_DB
    And kullanici Password alanina sadece buyuk ve kucuk harflerden olusan password girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And kullanici sadece buyuk ve kucuk harflerden olusan bir sifre ile ogrencinin olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB

  @TC20
  Scenario: TC_20 Vice Dean, sadece rakam ve buyuk harflerden olusan bir sifre ile ogrenci olusturamamalidir
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina isim girer_DB
    And kullanici surname alanina soyisim girer_DB
    And kullanici Birth Place alanina dogum yeri girer_DB
    And kullanci Email alanina email girer_DB
    And kullanici Phone Number alanina telefonnumarasi girer_DB
    And kullanici Gender alanindan "female" secenegini secer_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanina ssn girer_DB
    And kullanici User Name alanina username girer_DB
    And kullanici Father Name alanina baba adi girer_DB
    And kullanici Mother Name alanina anne adi girer_DB
    And kullanici Password alanina sadece rakam ve buyuk harflerden olusan bir password girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And kullanici sadece rakam ve buyuk harflerden olusan bir sifre ile ogrencinin olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB

  @TC21
  Scenario: TC_21 Vice Dean, daha once kayitli bir SSN number ile ogrenci olusturamamalidir
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina isim girer_DB
    And kullanici surname alanina soyisim girer_DB
    And kullanici Birth Place alanina dogum yeri girer_DB
    And kullanci Email alanina email girer_DB
    And kullanici Phone Number alanina telefonnumarasi girer_DB
    And kullanici Gender alanindan "male" secenegini secer_DB
    And kullanici Birth Date alanina dogum gunu girer_DB
    And kullanici SSN alanina daha once kayitli bir SSN number girer_DB
    And kullanici User Name alanina username girer_DB
    And kullanici Father Name alanina baba adi girer_DB
    And kullanici Mother Name alanina anne adi girer_DB
    And kullanici Password alanina password girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And Daha once kayitli bir SSN ile ogrencinin olusturulamadigini dogrular_DB
    And Kullanici sayfayi kapatir_DB











