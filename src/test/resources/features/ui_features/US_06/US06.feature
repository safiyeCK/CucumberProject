Feature: US06

  Background: Managementon Schools sayfasinda Vice Dean olarak login olunur.
    Given Kullanıcı Managementonschools adresine giderKI
    Then Kullanici Login butonuna basarKI
    And Kullanici username ve password girerKI
    And Kullanici Login oldugunu dogrularKI
    And Sayfa basliginin "Vice Dean Management" oldugu dogrulanirKI

  @us06
  Scenario: TC01 Dean, Vice Dean hesabı oluşturabilmelidir.
    Given Name, Surname, Birth Place, Date Of Birth, Phone Number, SSN, UserName, Password butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi yapılırKI
    * 1 saniye beklerKI
    Then Submit butonuna tiklanirKI
    Then Vice Dean islemi basariyla tamamlanirKI
    And Sayfa kapanirKI

  @us06
  Scenario: TC02 Dean, Vice Dean hesabı olustururken Name bos birakilirsa kayit yapilamamali.
    Given Surname, Birth Place, Date Of Birth, Phone Number, SSN, UserName, Password butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi yapılırKI
    And Submit butonuna tiklanirKI
    And "Required" yazisi gorunerek kayit islemi yapilamaz
    And 2 saniye beklerKI
    And Sayfa kapanirKI

  @us06
  Scenario: TC03 Dean, Vice Dean hesabı olustururken Surname bos birakilirsa kayit yapilamamali.
    Given Name, Birth Place, Date Of Birth, Phone Number, SSN, UserName, Password butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi yapılırKI
    And Submit butonuna tiklanirKI
    And "Required" yazisi gorunerek kayit islemi yapilamaz
    And 2 saniye beklerKI
    And Sayfa kapanirKI

  @us06
  Scenario: TC04 Dean, Vice Dean hesabı olustururken Birth Place bos birakilirsa kayit yapilamamali.
    Given Name, Surname, Date Of Birth, Phone Number, SSN, UserName, Password butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi yapılırKI
    Then Submit butonuna tiklanirKI
    And "Required" yazisi gorunerek kayit islemi yapilamaz
    And 2 saniye beklerKI
    And Sayfa kapanirKI

  @us06
  Scenario: TC05 Dean, Vice Dean hesabı olustururken Date Of Birth bos birakilirsa kayit yapilamamali.
    Given Name, Surname, Birth Place, Phone Number, SSN, UserName, Password butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi yapılırKI
    Then Submit butonuna tiklanirKI
    And "Required" yazisi gorunerek kayit islemi yapilamaz
    And 2 saniye beklerKI
    And Sayfa kapanirKI

  @us06
  Scenario: TC06 Dean, Vice Dean hesabı olustururken Phone Number bos birakilirsa kayit yapilamamali.
    Given Name, Surname, Birth Place, Date Of Birth, SSN, UserName, Password butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi yapılırKI
    Then Submit butonuna tiklanirKI
    And "Required" yazisi gorunerek kayit islemi yapilamaz
    And 2 saniye beklerKI
    And Sayfa kapanirKI

  @us06
  Scenario: TC07 Dean, Vice Dean hesabı olustururken SSN bos birakilirsa kayit yapilamamali.
    Given Name, Surname, Birth Place, Date Of Birth, Phone Number, UserName, Password butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi yapılırKI
    Then Submit butonuna tiklanirKI
    And "Required" yazisi gorunerek kayit islemi yapilamaz
    And 2 saniye beklerKI
    And Sayfa kapanirKI

  @us06
  Scenario: TC08 Dean, Vice Dean hesabı olustururken UserName bos birakilirsa kayit yapilamamali.
    Given Name, Surname, Birth Place, Date Of Birth, Phone Number, SSN, Password butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi yapılırKI
    Then Submit butonuna tiklanirKI
    And "Required" yazisi gorunerek kayit islemi yapilamaz
    And 2 saniye beklerKI
    And Sayfa kapanirKI

  @us06
  Scenario: TC09 Dean, Vice Dean hesabı olustururken Password bos birakilirsa kayit yapilamamali.
    Given Name, Surname, Birth Place, Date Of Birth, Phone Number, SSN, UserName butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi yapılırKI
    Then Submit butonuna tiklanirKI
    And "Enter your password" yazisi gorunerek kayit islemi yapilamaz
    And 2 saniye beklerKI
    And Sayfa kapanirKI

  @us06
  Scenario: TC10 Dean, Vice Dean hesabı olustururken Gender cinsiyet bos birakilirsa kayit yapilamamali.
    Given Name, Surname, Birth Place, Date Of Birth, Phone Number, SSN, UserName, Password butonuna veri girKI
    And 2 saniye beklerKI
    Then Gender cinsiyet seçimi bos birakilirKI
    Then Submit butonuna tiklanirKI
    And 2 saniye beklerKI
    And Sayfa kapanirKI

