Feature: US0021_Students_choose_lesson_grades_and_announcement
  Scenario: TC01_Student_ders_secebilmeli_ve_gorebilmeli
    Given Lesson eklemek icin Post request hazirligi yapilir
    And Lesson verileri hazirlanir
    When Kayitli lesson eklemek icin Post request verileri gonderilir
    Then Lesson bilgilerini dogrula

  Scenario: TC02_Student_sinav_notlarini_gorebilmeli
    Given Student info bilgilerini gorebilmek icin get request hazirligi yapilir
    When Kayitli student info list id ile cagrilir
    Then Student info bilgileri dogrulanir

  Scenario: TC03_Student_kendisi_adina_olusturulan_meetleri_gorebilmeli
    Given Meet bilgilerini gorebilmek icin get request hazirligi yapilir
    When Kayitli meet list id ile cagrilir
    Then Meet list bilgileri dogrulanir