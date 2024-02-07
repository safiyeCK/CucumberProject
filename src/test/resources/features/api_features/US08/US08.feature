Feature: Lesson Controller
  @putso @deleteso
  Scenario: ViceDean kullanicisi ile Lesson olusturma testi
    Given ViceDean olarak giris yapilirSo
    And Lesson Controller icin URL duzenlenirSo
    And Lesson icin PayLoad duzenlenirSo
    When Lesson icin POST Request gonderilir ve Response alinirSo
    Then Status kodun 200 oldugu dogrulanirSo
    And Lesson icin gelen Response body dogrulanirSo


