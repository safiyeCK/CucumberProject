Feature: US08 Vice Dean ders oluşturabilmelidir.(Lessons - Add Lesson)

  Background: Kullanici ManagementSchools sayfasina giderso
    Given kullanici ManagementSchools sayfasina giderso
    And kullanici 2 saniye beklerso
    Given Login butonuna tiklarso
    And Vice Dean olarak giris yaparso
    And kullanici 2 saniye beklerso
    And Menü alanina tiklarso
    And kullanici 2 saniye beklerso
    And Cikan seceneklerden LessonManagement tiklanirso
    And Acilan Sayfada Lesson alanina tiklanirso
@us8
  Scenario: Lesson alanina isim yazilabilmeliso
    And kullanici 2 saniye beklerso
    And Lesson Name kismina ders ismi yazilirso
    And sayfayi kapatirso

@us8
  Scenario: Dersin zorunlu Compulsory olup olmadigini isaretleyebilmelidir
    Given Lesson Name kismina ders ismi yazilirso
    And Compulsory kutucugunu isaretlerso
    And sayfayi kapatirso


@us8
  Scenario: Dersin zorunlu Compulsory olup olmadigini isaretleyebilmelidir
    Given Lesson Name kismina ders ismi yazilirso
    And Compulsory kutucugunu isaretlerso
    And CreditScore alanina ders notu yazilir ve Submit butonuna tiklanirso
    And sayfayi kapatirso







