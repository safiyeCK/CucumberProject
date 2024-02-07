Feature: US05 Admin Deanleri silebilmeli guncelleyebilmeli
  Background: Admin olarak siteye giriş yapılır ve menü ye basılarak Dean Management seçilir
    Given Kullanıcı Managementonschools adresine gider Esi
    Then Kullanici Login butonuna basar Esi
    Then Username ve password kutularını doldurarak enter tuşuna basar Esi
    Then Açılan sayfadan menu tusuna basar Esi
    Then Dashboard kısmından Dean Management seçilir Esi

    Scenario: Admin eklenen Dean hesaplarini gorebilmeli
      Given Admin bir Dean hesabi olusturur Esi
      Then Dean List bolumunun son sayfasina gider
      Then Dean'lerin Name bilgilerinin goruldugunu dogrular Esi
      Then Dean'lerin Gender bilgilerinin goruldugunu dogrular Esi
      Then Dean'lerin Phone Number bilgilerinin goruldugunu dogrular Esi
      Then Dean'lerin Ssn bilgilerinin goruldugunu dogrular Esi
      Then Dean'lerin username bilgilerinin goruldugunu dogrular Esi

      Scenario: Admin eklenen Dean hesaplarini guncelleyebilmeli
        Given Admin bir Dean hesabi olusturur Esi
        Then Dean List bolumunun son sayfasina gider
        Then Dean List kismindan olusturulan Dean hesabi için edit butonuna tiklanir Esi
        Then Acilan pencereden name kismi güncellenir Esi
        Then Gender kismi secilir Esi
        Then Password girilir Esi
        Then Submit butonuna tiklanir Esi
        Then Basarili bir sekilde guncellendigini dogrula Esi
        Then Surname kismi güncellenir Esi
        Then Submit butonuna tiklanir Esi
        Then Basarili bir sekilde guncellendigini dogrula Esi
        Then Birth place kismi güncellenir Esi
        Then Submit butonuna tiklanir Esi
        Then Basarili bir sekilde guncellendigini dogrula Esi
        Then Gender kismi güncellenir Esi
        Then Submit butonuna tiklanir Esi
        Then Basarili bir sekilde guncellendigini dogrula Esi
        Then Date of birth kismi güncellenir Esi
        Then Submit butonuna tiklanir Esi
        Then Basarili bir sekilde guncellendigini dogrula Esi
        Then Phone kismi güncellenir Esi
        Then Submit butonuna tiklanir Esi
        Then Basarili bir sekilde guncellendigini dogrula Esi
        Then Ssn kismi güncellenir Esi
        Then Submit butonuna tiklanir Esi
        Then Basarili bir sekilde guncellendigini dogrula Esi
        Then Username kismi guncellenir Esi
        Then Submit butonuna tiklanir Esi
        Then Basarili bir sekilde guncellendigini dogrula Esi
        Then Password kismi guncellenir Esi
        Then Submit butonuna tiklanir Esi
        Then Basarili bir sekilde guncellendigini dogrula Esi
        Then sayfayi kapatir Esi







