Feature: US_22 Admin Ekleme
  Background:
    Given kullanici "https://managementonschools.com/" sayfasina gider_IO
    Then kullanici login linkine tiklar_IO
    And kullanici acilan pencerede kayitli Admin "adminUserName_IO" ve "adminPassword_IO" bilgilerini girer_IO
    And kullanici login butonuna tiklar_IO
    And kullanici Admin Management sayfasina gecildigini dogrular_IO
    And kullanici sayfayi yeniler

  Scenario: TC_01 Admin Ekleme
    And kullanici Add Admin bolumundeki Name kutusuna isim girer
    And kullanici Surname kutusuna soyisim girer
    And kullanici Birth Place kutusuna dogum yeri girer
    And kullanici Gender radio butonundan cinsiyet secer
    And kullanici Date Of Birth kutusuna dogum tarihi girer
    And kullanici Phone kutusuna telefon no girer
    And kullanici Ssn kutusuna ssn no girer
    And kullanici User Name kutusuna kullanici adi girer
    And kullanici Password kutusuna gecerli bir password girer
    And kullanici Submit butonuna tiklar ve Admin List'e admin eklendigini dogrular_IO

  Scenario: TC_02 Name kutusu bos birakilarak Admin eklenememeli
    And kullanici Add Admin bolumundeki Name kutusunu bos birakir
    And kullanici Surname kutusuna soyisim girer
    And kullanici Birth Place kutusuna dogum yeri girer
    And kullanici Gender radio butonundan cinsiyet secer
    And kullanici Date Of Birth kutusuna dogum tarihi girer
    And kullanici Phone kutusuna telefon no girer
    And kullanici Ssn kutusuna ssn no girer
    And kullanici User Name kutusuna kullanici adi girer
    And kullanici Password kutusuna gecerli bir password girer
    And kullanici Name kutusu Required uyarisi aldigini dogrular_IO

  Scenario: TC_03 Surname kutusu bos birakilarak Admin eklenememeli
    And kullanici Add Admin bolumundeki Name kutusuna isim girer
    And kullanici Surname kutusunu bos birakir
    And kullanici Birth Place kutusuna dogum yeri girer
    And kullanici Gender radio butonundan cinsiyet secer
    And kullanici Date Of Birth kutusuna dogum tarihi girer
    And kullanici Phone kutusuna telefon no girer
    And kullanici Ssn kutusuna ssn no girer
    And kullanici User Name kutusuna kullanici adi girer
    And kullanici Password kutusuna gecerli bir password girer
    And kullanici Surname kutusu Required uyarisi aldigini dogrular_IO

  Scenario: TC_04 Birth Place kutusu bos birakilarak Admin eklenememeli
    And kullanici Add Admin bolumundeki Name kutusuna isim girer
    And kullanici Surname kutusuna soyisim girer
    And kullanici Birth Place kutusunu bos birakir
    And kullanici Gender radio butonundan cinsiyet secer
    And kullanici Date Of Birth kutusuna dogum tarihi girer
    And kullanici Phone kutusuna telefon no girer
    And kullanici Ssn kutusuna ssn no girer
    And kullanici User Name kutusuna kullanici adi girer
    And kullanici Password kutusuna gecerli bir password girer
    And kullanici Birth Place kutusu Required uyarisi aldigini dogrular_IO
    And kullanici sayfayi yeniler

  Scenario: TC_05 Gender alani bos birakilarak Admin eklenememeli
    And kullanici Add Admin bolumundeki Name kutusuna isim girer
    And kullanici Surname kutusuna soyisim girer
    And kullanici Birth Place kutusuna dogum yeri girer
    And kullanici Gender alanini bos birakir
    And kullanici Date Of Birth kutusuna dogum tarihi girer
    And kullanici Phone kutusuna telefon no girer
    And kullanici Ssn kutusuna ssn no girer
    And kullanici User Name kutusuna kullanici adi girer
    And kullanici Password kutusuna gecerli bir password girer
    And kullanici Submit butonuna tiklar ve admin eklenemedigini dogrular_IO

  Scenario: TC_06 Date Of Birth kutusu bos birakilarak Admin eklenememeli
    And kullanici Add Admin bolumundeki Name kutusuna isim girer
    And kullanici Surname kutusuna soyisim girer
    And kullanici Birth Place kutusuna dogum yeri girer
    And kullanici Gender radio butonundan cinsiyet secer
    And kullanici Date Of Birth kutusunu bos birakir
    And kullanici Phone kutusuna telefon no girer
    And kullanici Ssn kutusuna ssn no girer
    And kullanici User Name kutusuna kullanici adi girer
    And kullanici Password kutusuna gecerli bir password girer
    And kullanici Date Of Birth kutusu Required uyarisi aldigini dogrular_IO

  Scenario: TC_07 Phone kutusu bos birakilarak Admin eklenememeli
    And kullanici Add Admin bolumundeki Name kutusuna isim girer
    And kullanici Surname kutusuna soyisim girer
    And kullanici Birth Place kutusuna dogum yeri girer
    And kullanici Gender radio butonundan cinsiyet secer
    And kullanici Date Of Birth kutusuna dogum tarihi girer
    And kullanici Phone kutusunu bos birakir
    And kullanici Ssn kutusuna ssn no girer
    And kullanici User Name kutusuna kullanici adi girer
    And kullanici Password kutusuna gecerli bir password girer
    And kullanici Phone kutusu Required uyarisi aldigini dogrular_IO

  Scenario: TC_08 Ssn kutusu bos birakilarak Admin eklenememeli
    And kullanici Add Admin bolumundeki Name kutusuna isim girer
    And kullanici Surname kutusuna soyisim girer
    And kullanici Birth Place kutusuna dogum yeri girer
    And kullanici Gender radio butonundan cinsiyet secer
    And kullanici Date Of Birth kutusuna dogum tarihi girer
    And kullanici Phone kutusuna telefon no girer
    And kullanici Ssn kutusunu bos birakir
    And kullanici User Name kutusuna kullanici adi girer
    And kullanici Password kutusuna gecerli bir password girer
    And kullanici Ssn kutusu Required uyarisi aldigini dogrular_IO

  Scenario: TC_09 User Name kutusu bos birakilarak Admin eklenememeli
    And kullanici Add Admin bolumundeki Name kutusuna isim girer
    And kullanici Surname kutusuna soyisim girer
    And kullanici Birth Place kutusuna dogum yeri girer
    And kullanici Gender radio butonundan cinsiyet secer
    And kullanici Date Of Birth kutusuna dogum tarihi girer
    And kullanici Phone kutusuna telefon no girer
    And kullanici Ssn kutusuna ssn no girer
    And kullanici User Name kutusunu bos birakir
    And kullanici Password kutusuna gecerli bir password girer
    And kullanici User Name kutusu Required uyarisi aldigini dogrular_IO

  Scenario: TC_10 Password kutusu bos birakilarak Admin eklenememeli
    And kullanici Add Admin bolumundeki Name kutusuna isim girer
    And kullanici Surname kutusuna soyisim girer
    And kullanici Birth Place kutusuna dogum yeri girer
    And kullanici Gender radio butonundan cinsiyet secer
    And kullanici Date Of Birth kutusuna dogum tarihi girer
    And kullanici Phone kutusuna telefon no girer
    And kullanici Ssn kutusuna ssn no girer
    And kullanici User Name kutusuna kullanici adi girer
    And kullanici Password kutusunu bos birakir
    And kullanici Enter Your Password uyarisi aldigini dogrular_IO

  Scenario: TC_11 Ssn kutusuna patterne uygun olmayan bir numara girerek Admin eklenememeli
    And kullanici Add Admin bolumundeki Name kutusuna isim girer
    And kullanici Surname kutusuna soyisim girer
    And kullanici Birth Place kutusuna dogum yeri girer
    And kullanici Gender radio butonundan cinsiyet secer
    And kullanici Date Of Birth kutusuna dogum tarihi girer
    And kullanici Phone kutusuna telefon no girer
    And kullanici Ssn kutusuna gecersiz bir ssn no girer
    And kullanici User Name kutusuna kullanici adi girer
    And kullanici Password kutusuna gecerli bir password girer
    And kullanici Submit butonuna tiklar Please enter valid SSN number uyarisi aldigini dogrular_IO

  Scenario: TC_12 Password kutusuna 7 karakterli bir password girerek Admin eklenememeli
    And kullanici Add Admin bolumundeki Name kutusuna isim girer
    And kullanici Surname kutusuna soyisim girer
    And kullanici Birth Place kutusuna dogum yeri girer
    And kullanici Gender radio butonundan cinsiyet secer
    And kullanici Date Of Birth kutusuna dogum tarihi girer
    And kullanici Phone kutusuna telefon no girer
    And kullanici Ssn kutusuna ssn no girer
    And kullanici User Name kutusuna kullanici adi girer
    And kullanici Password kutusuna 7 karakterli bir password girer
    And kullanici At least 8 characters uyarisi aldigini dogrular_IO


