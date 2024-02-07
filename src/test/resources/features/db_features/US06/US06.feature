@DBKI06
  Feature: Vice Dean Bilgisi Dogrulama
    Scenario: Kayitli Vice Dean bilgisi dogrulanirKI
      Given Database baglantisi kurulurKI
      And Vice Dean GetManagerById icin beklenen veriler duzenlenirKI
      When Kayitli Vice Dean almak icni Query gonderilirKI
      Then Kayitli Vice Dean bilgisi dogrulanirKI
      And Baglanti kesilirKI
