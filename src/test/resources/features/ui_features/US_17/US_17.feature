Feature: US_17 Teacher, öğrencilere not verebilmelidir
  Background:
    Given kullanici "https://managementonschools.com/" sayfasina gider_IO
    Then kullanici login linkine tiklar_IO
    And kullanici acilan pencerede kayitli Teacher "teacherUserName_IO" ve "teacherPassword_IO" bilgilerini girer_IO
    And kullanici login butonuna tiklar_IO
    And kullanici Student Info Management sayfasina gecildigini dogrular_IO
    And kullanici Choose Lesson'dan ders secer ve secildigini dogrular_IO
    And kullanici Choose Student'den ogrenci secer ve secildigini dogrular_IO
    And kullanici Choose Education Term'den donem secer ve secildigini dogrular_IO
    And kullanici Absentee kutusuna devamsizlik girer ve girildigini dogrular_IO

  Scenario: TC_01 Teacher, öğrencilere not verebilmelidir
    And kullanici Midterm Exam kutusuna Midterm notu girer ve girildigini dogrular_IO
    And kullanici Final Exam kutusuna Final notu girer ve girildigini dogrular_IO
    And kullanici Info Note kutusuna Harf, Rakam ve ozel karakter iceren bilgi notu girer ve girildigini dogrular_IO

  Scenario: TC_02 Teacher, öğrencilere 0-100 Arasinda gecerli Midterm notu girmelidir
    And kullanici Midterm Exam kutusuna Sifirdan kucuk Midterm notu girer_IO
    And kullanici Final Exam kutusuna Final notu girer_IO
    And kullanici Info Note kutusuna Harf, Rakam ve ozel karakter iceren bilgi notu girer_IO
    And kullanici Midterm Exam kutusuna Sifirdan kucuk not girilemedigini dogrular_IO

  Scenario: TC_03 Teacher, öğrencilere 0-100 Arasinda gecerli Final notu girmelidir
    And kullanici Midterm Exam kutusuna Midterm notu girer_IO
    And kullanici Final Exam kutusuna Yuzden buyuk Final notu girer_IO
    And kullanici Info Note kutusuna Harf, Rakam ve ozel karakter iceren bilgi notu girer_IO
    And kullanici Final Exam kutusuna Yuzden buyuk not girilemedigini dogrular_IO
