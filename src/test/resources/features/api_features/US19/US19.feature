Feature: US0019_Teacher_öğrenciler_ile_toplantı_ekleyebilmeli
  Scenario: TC01_Teacher_toplanti_ekleyebilmeli
    Given Meet olusturmak icin URL duzenlenirEp
    And Meet olusturmak icin payload duzenlenirEp
    When Meet olusturmak icin Post Request gonderilirEp
    Then Status kodun 200 oldugu dogrulanirEp
    Then Meet olusturma icin gelen Response body dogrulanirEp