Feature: US10 Vice Dean ders programi olusturabilmeli
  Background: Vice Dean hesabi ile siteye giris yapilir ve menuden Lesson Management secilir
    Given kullanici "https://managementonschools.com/" sayfasina gider YD
    Then kullanici login butonuna tiklar YD
    Then kullanici username ve password datalarini girer ve enter'a tiklar YD
    Then kullanici menu butonuna tiklar YD
    Then acilan pencereden lesson management'i secer YD

  Scenario: TC01 Vice Dean ders programi olusturabilmeli
    Given Lesson Program secenegine tiklar YD
    Then Select Lessons menusune tiklar YD
    Then Acilan drop down menuden bir ders secer YD
    Then Choose Education Term menusune tiklar YD
    Then Acilan menuden bir donem secer YD
    Then Choose Day menusune tiklar YD
    Then Acilan menuden gun secer YD
    Then Start Time menusune tiklar ve gecerli bir saat girer YD
    Then Stop Time menusune tiklar ve gecerli bir saat girer YD
    Then Submit butonuna tiklar YD
    Then Lesson Program olusturuldugunu dogrular YD
    Then Required yazisini gorur YD
    And  kullanici sayfayi kapatir YD

  Scenario: TC02 Dersin bitis saati dersin baslama saatinden once olmamali
    Given Lesson Program secenegine tiklar YD
    Then Select Lessons menusune tiklar YD
    Then Acilan drop down menuden bir ders secer YD
    Then Choose Education Term menusune tiklar YD
    Then Acilan menuden bir donem secer YD
    Then Choose Day menusune tiklar YD
    Then Acilan menuden gun secer YD
    Then Start Time menusune tiklar ve gecerli bir data girer YD
    Then Stop Time menusune tikla, baslangic saatinde once bir data girer YD
    Then Submit butonuna tiklar YD
    Then Lesson Program olusturulamadigini dogrular YD
    And kullanici sayfayi kapatir YD

  Scenario: TC03 Education Term secilmeden Lesson Program olusturulamamali
    Given Lesson Program secenegine tiklar YD
    Then Select Lessons menusune tiklar YD
    Then Acilan drop down menuden bir ders secer YD
    Then Choose Day menusune tiklar YD
    Then Acilan menuden gun secer YD
    Then Start Time menusune tiklar ve gecerli bir saat girer YD
    Then Stop Time menusune tiklar ve gecerli bir saat girer YD
    Then Submit butonuna tiklar YD
    Then Education Term secilmedigin icin uyari yazisini gorur YD
    And kullanici sayfayi kapatir YD

  Scenario: TC04 Ders secilmeden Lesson Program olusturulamamali
    Given Lesson Program secenegine tiklar YD
    Then Choose Education Term menusune tiklar YD
    Then Acilan menuden bir donem secer YD
    Then Choose Day menusune tiklar YD
    Then Acilan menuden gun secer YD
    Then Start Time menusune tiklar ve gecerli bir saat girer YD
    Then Stop Time menusune tiklar ve gecerli bir saat girer YD
    Then Submit butonuna tiklar YD
    Then Ders secilmedigi icin uyari yazisi alir YD
    And  kullanici sayfayi kapatir YD

  Scenario: TC05 Gun secilmeden Lesson Program olusturulamamali
    Given Lesson Program secenegine tiklar YD
    Then Select Lessons menusune tiklar YD
    Then Acilan drop down menuden bir ders secer YD
    Then Choose Education Term menusune tiklar YD
    Then Acilan menuden bir donem secer YD
    Then Start Time menusune tiklar ve gecerli bir saat girer YD
    Then Stop Time menusune tiklar ve gecerli bir saat girer YD
    Then Submit butonuna tiklar YD
    Then Gun secilmedigi icin uyari yazisi alir YD
    And  kullanici sayfayi kapatir YD

  Scenario: TC06 Vice Dean ders secebilmeli
    Given Lesson Program secenegine tiklar YD
    Then Select Lessons menusune tiklar YD
    Then Acilan drop down menuden bir ders secer YD
    Then Ders secilebildigini dogrular YD
    And kullanici sayfayi kapatir YD

  Scenario: TC07 Vice Dean egitim donemi secebilmeli
    Given Lesson Program secenegine tiklar YD
    Then Choose Education Term menusune tiklar YD
    Then Acilan menuden bir donem secer YD
    Then Donem secilebildigini dogrular YD
    And kullanici sayfayi kapatir YD

  Scenario: TC08 Vice Dean ders icin baslama ve bitis tarihi secebilmeli
    Given Lesson Program secenegine tiklar YD
    Then Start Time menusune tiklar ve gecerli bir saat girer YD
    Then Stop Time menusune tiklar ve gecerli bir saat girer YD
    Then Baslama ve bitis tarihi secilebilirligini dogrular YD
    And kullanici sayfayi kapatir YD

  Scenario: TC09 Vice Dean ders icin gun secebilmeli
    Given Lesson Program secenegine tiklar YD
    Then Choose Day menusune tiklar YD
    Then Acilan menuden gun secer YD
    Then Gun secebildigini dogrular YD
    #And kullanici sayfayi kapatir YD









