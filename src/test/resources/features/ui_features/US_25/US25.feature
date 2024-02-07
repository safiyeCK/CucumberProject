Feature: US_25 Admin, ogrenci olusturabilmelidir.

  Background: ortak adimlar
    Given kullanici  Managementon Schools sayfasina gider_DB
    Then kullanici login butonuna tiklar_DB
    Then kullanici kayitli User Name ve password ile Admin olarak giris yapar_DB
    Then kullanici menu butonuna tiklar_DB
    Then kullanici menu kismindan Student Management i secer_DB


  @TC01
  Scenario: TC_01 Admin, ogrenci olusturebilmelidir.
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
  Scenario: TC_02 Admin,"Name"  kismini bos birakilarak ogrenci oluşturamamalidir
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
  Scenario: TC_03 Admin, "Surname"  kismini bos birakarak ogrenci oluşturamamalidir
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
  Scenario: TC_04 Admin, "Birth Place"  kismini bos birakarak ogrenci oluşturamamalidir
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
  Scenario: TC_05 Admin, "E-mail"  kismini bos birakarak ogrenci oluşturamamalidir
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
  Scenario: TC_06 Admin, "Phone"  kismini bos birakarak ogrenci oluşturamamalidir
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
  Scenario: TC_07 Admin, "Gender" kismini bos birakarak ogrenci olusturamamalidir
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
  Scenario: TC_08 Admin, "Birth Date" alanı bos birakarak ogrenci oluşturamamalidir
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
  Scenario: TC_9 Admin, "SSN" alanina patterne uygun olmayan bir numara ile ogrenci olusturamamalidir
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
  Scenario: TC_10 Admin, "SSN" alanıni bos birakarak ogrenci olusturamamalidir
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
  Scenario: TC_11 Admin, "User Name" alanıni bos birakarak ogrenci olusturamamalidir
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
  Scenario: TC_12 Admin, "Father Name" alanini bos birakilarak ogrenci olusturamamalidir
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
  Scenario: TC_13 Admin, Mother Name alanini bos birakarak ogrenci olusturamamalidirVice Dean,
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
  Scenario: TC_14 Admin, Password alanini bos birakarak ogrenci olusturamamalidir
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
  Scenario: TC_15  Admin, 8 karakterden az sifre ile ogrenci olusturamamalidir
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
  Scenario: TC_16 Admin, sadece rakamlardan olusan bir sifre ile ogrenci olusturamamalidir
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
  Scenario: TC_17 Admin, sadece kucuk harflerden olusan bir sifre ile ogrenci olusturamamalidir
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
  Scenario: TC_18 Admin, sadece buyuk harflerden olusan bir sifre ile ogrenci olusturamamalidir
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
  Scenario: TC_19 Admin, sadece buyuk ve kucuk harflerden olusan bir sifre ile ogrenci olusturamamalidir
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
  Scenario: TC_20 Admin, sadece rakam ve buyuk harflerden olusan bir sifre ile ogrenci olusturamamalidir
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
  Scenario: TC_21 Admin, daha once kayitli bir SSN number ile ogrenci olusturamamalidir
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











