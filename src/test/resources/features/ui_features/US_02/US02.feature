Feature: US02 Admin Guest User List Bilgilerini Gorebilmeli_Silebilmeli

  Background:
    Given kullanici "https://managementonschools.com/" e gider_SK
    Then Admin olarak Login ikonunu tiklar_SK
    And Admin olarak username kutusununa "adminName_SK" girer_SK
    And Admin olarak password kutusuna "passwordName_SK" girer_SK
    And Admin olarak Login butonunu tiklar_SK
    And Admin olarak Menu butonuna basar_SK
    And Admin olarak Guest User linkini tiklar_SK

    Scenario: TC01 Admin, Guest User List bilgilerini gorebilmeli
      Given Admin Guest_User List'i gorur_SK
      And Admin Guest_User Name bilgilerini gorur_SK
      And Admin Guest_User Phone Number bilgilerini gorur_SK
      And Admin Guest_User SSN bilgilerini gorur_SK
      And Admin Guest_User User Name bilgilerini gorur_SK
      And Kullanici sayfayi kapatir_SK

    Scenario: TC02 Admin, Guest User List bilgilerini silebilmeli
      Given Admin Guest_User List'i gorur_SK
      Then Admin Guest_User Delete butonunu gorur_SK
      And Admin uyari mesajini gorerek silme isleminin tamamlandigini gorur_SK
      And Kullanici sayfayi kapatir_SK