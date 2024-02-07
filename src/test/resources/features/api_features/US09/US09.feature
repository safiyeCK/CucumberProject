Feature: Lesson Controller
@listegorso @putso @deleteso
  Scenario: Vice Dean olarak Ders listesini görebilme Testi
    Given ViceDean olarak giris yapilirSo
    And Lesson List icin URL duzenlenirSo
    And Lessons List icin Get Request gonderilir ve Response alinirSo
    And Status kodun 200 oldugu dogrulanirSoN

  # Vice Dean olarak Ders listesinde guncelleme yapabilme Testi Basarisiz put secenegi olmadigindan yapilamiyor
  @deleteso
  Scenario: Vice Dean olarak olusturulan dersi silebilme Testi
    Given ViceDean olarak giris yapilirSo
    And Kayitli dersin ID'si alinir
    And Lesson silmek icin URL duzenlenirSo
    And Lesson silmek request gonderilir
    And Status kodun 200 oldugu dogrulanirSoN

   # And Alinan Id ile Delete  islemi yapilirSo



