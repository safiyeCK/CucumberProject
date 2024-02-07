Feature: US23

  Background: Managementon Schools sayfasinda Admin olarak login olunur.
    Given Kullanıcı Managementonschools adresine giderKI
    Then Kullanici Login butonuna basarKI
    And Kullanici Username ve Password girerKI
    And Kullanici Login oldugunu dogrularKI
    And Sayfa Basliginin "Admin Management" oldugu dogrulanirKI
    And Admin sayfasinda Menu butonuna tiklarKI
    And 2 saniye beklerKI
    Then Vice Dean secilirKI

  @us23
  Scenario: TC01 Admin, Vice Dean hesabı oluşturabilmelidir.
    Given Name, Surname, Birth Place, Date Of Birth, Phone Number, SSN, UserName, Password butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi yapılırKI
    * 1 saniye beklerKI
    Then Submit butonuna tiklanirKI
    Then Vice Dean Saved Islemi basariyla tamamlanirKI
    And Sayfa kapanirKI

 @us23
  Scenario: TC02 Admin, Vice Dean hesabı olusturabilmeli. Name bos birakilirsa kayit yapilamamali.
    Given Surname, Birth Place, Date Of Birth, Phone Number, SSN, UserName, Password butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi yapılırKI
    And Submit butonuna tiklanirKI
    And "Required" yazisi gorunerek kayit islemi yapilamaz
    And 2 saniye beklerKI
    And Sayfa kapanirKI
  @us23
  Scenario: TC03 Admin, Vice Dean hesabı olusturabilmeli. Surname bos birakilirsa kayit yapilamamali.
    Given Name, Birth Place, Date Of Birth, Phone Number, SSN, UserName, Password butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi yapılırKI
    And Submit butonuna tiklanirKI
    And "Required" yazisi gorunerek kayit islemi yapilamaz
    And 2 saniye beklerKI
    And Sayfa kapanirKI

  @us23
  Scenario: TC04 Admin, Vice Dean hesabı olusturabilmeli. Birth Place bos birakilirsa kayit yapilamamali.
    Given Name, Surname, Date Of Birth, Phone Number, SSN, UserName, Password butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi yapılırKI
    Then Submit butonuna tiklanirKI
    And "Required" yazisi gorunerek kayit islemi yapilamaz
    And 2 saniye beklerKI
    And Sayfa kapanirKI

  @us23
  Scenario: TC05 Admin, Vice Dean hesabı olusturabilmeli.Date Of Birth bos birakilirsa kayit yapilamamali.
    Given Name, Surname, Birth Place, Phone Number, SSN, UserName, Password butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi yapılırKI
    Then Submit butonuna tiklanirKI
    And "Required" yazisi gorunerek kayit islemi yapilamaz
    And 2 saniye beklerKI
    And Sayfa kapanirKI

  @us23
  Scenario: TC06 Admin, Vice Dean hesabı olusturabilmeli. Phone Number bos birakilirsa kayit yapilamamali.
    Given Name, Surname, Birth Place, Date Of Birth, SSN, UserName, Password butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi yapılırKI
    Then Submit butonuna tiklanirKI
    And "Required" yazisi gorunerek kayit islemi yapilamaz
    And 2 saniye beklerKI
    And Sayfa kapanirKI

  @us23
  Scenario: TC07 Admin, Vice Dean hesabı olusturabilmeli. SSN alani bos birakilirsa kayit yapilamamali.
    Given Name, Surname, Birth Place, Date Of Birth, Phone Number, UserName, Password butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi yapılırKI
    Then Submit butonuna tiklanirKI
    And "Required" yazisi gorunerek kayit islemi yapilamaz
    And 2 saniye beklerKI
    And Sayfa kapanirKI

  @us23
  Scenario: TC08 Admin, Vice Dean hesabı olusturabilmeli. UserName alani bos birakilirsa kayit yapilamamali.
    Given Name, Surname, Birth Place, Date Of Birth, Phone Number, SSN, Password butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi yapılırKI
    Then Submit butonuna tiklanirKI
    And "Required" yazisi gorunerek kayit islemi yapilamaz
    And 2 saniye beklerKI
    And Sayfa kapanirKI

  @us23
  Scenario: TC09 Admin, Vice Dean hesabı olusturabilmeli. Password alani bos birakilirsa kayit yapilamamali.
    Given Name, Surname, Birth Place, Date Of Birth, Phone Number, SSN, UserName butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi yapılırKI
    Then Submit butonuna tiklanirKI
    And "Enter your password" yazisi gorunerek kayit islemi yapilamaz
    And 2 saniye beklerKI
    And Sayfa kapanirKI

  @us23
  Scenario: TC10 Admin, Vice Dean hesabı olusturabilmeli. Gender cinsiyet bos birakilirsa kayit yapilamamali.
    Given Name, Surname, Birth Place, Date Of Birth, Phone Number, SSN, UserName, Password butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi bos birakilirKI
    Then Submit butonuna tiklanirKI
    And 2 saniye beklerKI
    And Sayfa kapanirKI

