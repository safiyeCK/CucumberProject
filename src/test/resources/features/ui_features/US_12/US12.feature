Feature: US12 Vice Dean ogretmene ders atayabilmeli
  Background: Vice Dean hesabi ile siteye giris yapilir ve menuden Lesson Management secilir
    Given kullanici "https://managementonschools.com/" sayfasina gider YD
    Then kullanici login butonuna tiklar YD
    Then kullanici username ve password datalarini girer ve enter'a tiklar YD
    Then kullanici menu butonuna tiklar YD
    Then acilan pencereden lesson management'i secer YD

  Scenario: TC01 Vice Dean ogretmene ders atayabilmeli
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
    Then Choose Lessons bolumunden olusturulan dersin geldigini dogrular YD
    #Then Choose Lessons bolumunden olusturulan derse tiklar YD
    #Then Choose Teacher menusune tiklar YD
    #Then Choose Teacher drop down menuden bir teacher secer YD
    #Then Ders icin ogretmen secilebilirligini dogrular YD
    #Then Submit butonuna tiklar YD
    #Then Lesson added to Teacher yazisinin gorunur oldugunu dogrular YD
    #And  kullanici sayfayi kapatir YD


  Scenario: TC02 Ayni ogretmene, ayni gun ve saatte baska bir ders daha atanamamali
    Given Lesson Program secenegine tiklar YD
    Then Select Lessons menusune tiklar YD
    Then Acilan drop down menuden iki ders secer YD
    Then Choose Education Term menusune tiklar YD
    Then Acilan menuden bir donem secer YD
    Then Choose Day menusune tiklar YD
    Then Acilan menuden gun secer YD
    Then Start Time menusune tiklar ve gecerli bir saat girer YD
    Then Stop Time menusune tiklar ve gecerli bir saat girer YD
    Then Submit butonuna tiklar YD
    Then Choose Lessons bolumunden olusturulan dersin geldigini dogrular YD
    Then Choose Lessons bolumunden ayni gun ve saate ait iki derse tiklar YD
    Then Choose Teacher menusune tiklar YD
    Then Choose Teacher drop down menuden onceden secilen teacher'i secer YD
    Then Ders icin ogretmen secilebilirligini dogrular YD
    Then Submit butonuna tiklar YD
    Then Ayni ogretmene ayni gun ve saatte baska bir ders atanamadigini dogrular YD
    #And  kullanici sayfayi kapatir YD

