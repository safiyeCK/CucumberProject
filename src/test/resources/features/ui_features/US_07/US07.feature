@ki
Feature: US07

  Background: Dean, kullanıcıların gönderdiği mesajları görebilmelidir.
   Given Kullanıcı Managementonschools adresine giderKI
    Given Kullanici Login butonuna basarKI
    * Kullanici username ve password girerKI
    * Kullanici Login oldugunu dogrularKI
    * 2 saniye beklerKI
    * Sayfa basliginin "Vice Dean Management" oldugu dogrulanirKI
    And Menu butonuna tiklanilir.
    Then "Contact Get All" a tiklanilir.
    * 1 saniye beklerKI
    Then Basligin "Contact Message" icerdgi kontrol edilir.


  Scenario: TC02 Dean, mesajları, yazarlarını, e-maillerini, gönderilme tarihi ve  subject bilgilerini görüntüleyebilmelidir
    Given Olusturulan Name bilgilerinin görüntülendiğini doğrula.
    * 2 saniye beklerKI
    And Olusturulan Email bilgilerinin görüntülendiğini doğrula.
    Then Olusturulan Date bilgilerinin görüntülendiğini doğrula.
    And Olusturulan Subject bilgilerinin görüntülendiğini doğrula.
    * 1 saniye beklerKI
    And Olusturulan Message bilgilerinin görüntülendiğini doğrula.
    *  Sayfa kapanirKI
    

