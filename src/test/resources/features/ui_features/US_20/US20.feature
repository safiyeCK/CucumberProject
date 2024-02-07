Feature: US20 Teacher toplantıları görebilmeli, güncelleyebilmeli ve silebilmelidir.
  Background: Teacher hesabi ile siteye giris yapilir ve menuden Meet Management secilir
    Given kullanici "schoolsUrl" sayfasina properties ile gider_Ep
    Then kullanici login butonuna tiklar_Ep
    And kullanici user name ve password ile siteye giris yapar_Ep
    Then kullanici Login oldugunu dogrular_Ep
    And kullanici menu butonuna tiklar_Ep
    Then acilan pencereden meet management secilir_Ep

  Scenario: TC01 Teacher toplantilari ve toplanti detaylarini gorebilmeli
    Given kullanici sayfada meet list bolumune gider
    Then kullanici students bilgisinin gorundugunu dogrular
    Then kullanici date bilgisinin gorundugunu dogrular
    And kullanici start time bilgisinin gorundugunu dogrular
    And kullanici stop time bilgisinin gorundugunu dogrular
    And kullanici description bilgisinin gorundugunu dogrular

  Scenario: TC02 Teacher toplantilari guncelleyebilmeli ve silebilmeli
    Given kullanici sayfada meet list bolumune gider ve edit butonuna tiklar_Ep
    Then kullanici Date,Start Time,Stop Time ve Description bilgilerini gunceller_Ep
    And kullanici submit butonuna tiklar_Ep
    Then kullanici meet bilgilerinin guncellendigini dogrular_Ep
    Then kullanici guncelleme sayfasini kapatir_Ep
    And kullanici meet list bolumunde delete butonuna tiklar silindigini dogrular_Ep