Feature: US14

  Background: Managementon Schools sayfasinda Vice Dean olarak login olup Teacher Management sayfasina gidilir
    Given kullanici Managementon Schools sayfasina giderSA
    Then  kullanici anasayfadaki login butonuna tiklarSA
    And   kullanici user name ve password ile login olurSA
    And   kullanici Login oldugunu dogrularSA
    But   Menu butonuta tiklarSA
    And   Teacher Management sayfasina giderSA

  @gorebilme
  Scenario: TC01 Vice Dean olusturdugu ogretmenin Name, Phone Number, SSN, User Name bilgileri görülebilmeli
    Given   Choose Lessons kismindan ders "Java" secilirSA
    Then    Bosluklara Name ,Surname ,Birth Place ,E-mail ,Phone Number ,Date of Birth ,SSN ,User Name,Password girilirSA
    And     is Advisor Teacher secenegi secilirSA
    Then    Cinsiyet secilirSA
    And     Submit butonuna tiklanirSA
    And     Teacher olustugu dogrulanirSA
    And     Sayfayi asagi kaydirarak Teacher List gorulur
    Then    Ogretmenin Name bilgisi gorulur
    And     Ogretmenin Phone Number bilgisi gorulur
    And     Ogretmenin SSN bilgisi gorulur
    And     Ogretmenin User Name bilgisi gorulur
    And     sayfayi kapatirSA


  Scenario: TC02 Vice Dean olusturdugu ogretmenin Name, Phone Number, SSN, User Name bilgileri görülebilmeli
    Given   Degisiklik yapilacak ogretmein yanindaki Edit butonuna tiklanir
    Then    Edit sayfasinda Choose Lessons kismindan ders "Java" secilirSA
    And     Edit sayfasinda Cinsiyet secilirSA
    And     Password girilir
    And     Eski Name silinerek yeni bir Name girilir
    And     Degisiklik ekranindaki Submit butonuna tiklanirSA
    And     Degisiklik yapildigi dogrulanir
    And     Eski Surname silinerek yeni bir Surame girilir
    And     Degisiklik ekranindaki Submit butonuna tiklanirSA
    And     Degisiklik yapildigi dogrulanir
    And     Eski Birth Place silinerek yeni Birth Place girilir
    And     Degisiklik ekranindaki Submit butonuna tiklanirSA
    And     Degisiklik yapildigi dogrulanir
    And     Eski e-mail silinerek yeni e-mail girilir
    And     Degisiklik ekranindaki Submit butonuna tiklanirSA
    And     Degisiklik yapildigi dogrulanir
    And     Eski phone number silinerek yeni phone number girilir
    And     Degisiklik ekranindaki Submit butonuna tiklanirSA
    And     Degisiklik yapildigi dogrulanir
    And     Eski SSN silinerek yeni SSN girilir
    And     Degisiklik ekranindaki Submit butonuna tiklanirSA
    And     Degisiklik yapildigi dogrulanir
    And     is Advisor Teacher secenegine tiklanir
    And     Degisiklik ekranindaki Submit butonuna tiklanirSA
    And     Degisiklik yapildigi dogrulanir
    And     Eski User Name silinerek yeni User Name girilir
    And     Degisiklik ekranindaki Submit butonuna tiklanirSA
    And     Degisiklik yapildigi dogrulanir
    And     Yeni Date of Birth girilir
    And     Degisiklik ekranindaki Submit butonuna tiklanirSA
    And     Degisiklik yapildigi dogrulanir
    And     sayfayi kapatirSA
