Feature: Teacher, öğrenciye verdiği notları, görebilmeli ve güncelleyebilmelidir.
  Scenario:
    Given kullanici "https://managementonschools.com/" sayfasina gider_IO
    Then kullanici login linkine tiklar_IO
    And kullanici acilan pencerede kayitli Teacher "teacherUserName_IO" ve "teacherPassword_IO" bilgilerini girer_IO
    And kullanici login butonuna tiklar_IO
    And kullanici Student Info Management sayfasina gecildigini dogrular_IO
    And kullanici Choose Lesson'dan ders secer_IO
    And kullanici Choose Student'den ogrenci secer_IO
    And kullanici Choose Education Term'den donem secer_IO
    And kullanici Absentee kutusuna devamsizlik girer_IO
    And kullanici Midterm Exam kutusuna Midterm notu girer_IO
    And kullanici Final Exam kutusuna Final notu girer_IO
    And kullanici Info Note kutusuna Harf, Rakam ve ozel karakter iceren bilgi notu girer_IO
    And kullanici Submit butonuna tiklar ve ogrenci bilgilerinin Student Info List'e eklendigini dogrular_IO
    And kulanici Edit butonuna tiklar_IO
    And kullanici Acilan pencerede Absentee kutusundan devamsizligi gunceller_IO
    And kullanici Midterm Exam kutusundan notu gunceller_IO
    And kullanici Final Exam kutusundan notu gunceller_IO
    And kullanici Info Note kutusundan Bilgi notunu gunceller_IO
    And kullanici Submit butonuna tiklar_IO
    And kullanici Devam Durumu, Midterm Exam Notu, Final Exam Notu ve Bilgi notunu gunceller ve guncellendiklerini dogrular_IO
    And kulanici Edit butonuna tiklar_IO
    And kullanici Delete simgesine tiklar Ogrenci bilgilerinin silindigini dogrular_IO



