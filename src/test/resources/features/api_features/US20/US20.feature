Feature: US0020_Teacher_öğrenciler_ile_toplantı_düzenleyebilmeli

  Scenario: TC01_Teacher_toplanti_duzenleyebilmeli
    Given Kayitli meet icin id numarasi alinir
    And Duzenlenecek Meet bilgileri hazirlanir
    When Kayitli meet id ile guncellenir
    Then Meet bilgileri dogrula

  Scenario: TC02_Teacher_toplanti_silebilmeli
    Given Meet silme islemi icin Delete hazirligi yapilir
    When Meet silme islemi icin Delete hazirligi yapilir
    And Kayitli meet id ile siler
    Then Meet'in silindigini dogrula