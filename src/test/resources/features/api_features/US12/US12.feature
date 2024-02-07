Feature: US12 Vice Dean Teacher Controller
@addyD
  Scenario: Vıce Dean teacher a ders atandıgını doğrular
    Given Vice Dean ders atamak icin Post Request hazirlanir YD
    Then Gonderilecek data bilgileri hazirlanir
    When Teacher a ders atamak icin Post Request gonderilir
    Then "Vicedean gelen body i dogrular
    And Status code nin 200 oldugu dogrulanir

    Scenario: Vice Dean in ders atadigi ogretmenin bilgilerini alma testi
    Given Vicedean ders dogrulamak icin Get islemi yapar
    Then Vicedean ders dogrulamak icin Get Request gonderir
    Then Viceden gelen get bodysini dogrular
