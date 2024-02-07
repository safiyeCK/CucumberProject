Feature:

  Scenario: TC01 Kullanici Lesson, Day, Start Time, Stop Time görur
    Given  kullanici managementonschools.com sayfasina gider
    When Kullanici Login Butonuna tıklar
    Then kullanici User Name boxa tıklar
    And kullanici Password boxa tıklar
    And kullanici 3 saniye bekler
    And kullanıcı Login butonuna tıklar
    And kullanici 3 saniye bekler
    And kullanıcı Lesson Program sekmesini bulur
    And kullanici 3 saniye bekler
    And kullanici sayfayi kaydirir
    And kullanici Lesson görebilmelidir.
    And kullanici Day görebilmelidir.
    And kullanici Start Time görebilmelidir.
    And kullanici Stop Time görebilmelidir.



  Scenario:TC02 Kullanici Lesson Program List'ten güncelleme yapar
    And Kullanici Updade yapabilmelidir


  Scenario:TC03 Kullanici Lesson Program listesinden olusturulan dersi siler
    And Kullanici Lesson Program listesinden olusturulan dersi silebilmelidir


