@vicedean @apiTestius16
Feature: ViceDean, kullanıcıların gönderdiği mesajları görebilmelidir.


  Scenario Outline: US16 Vice Dean in Mesaji Görebilmesi
    Given Mesaj eklemek icin Post request hazirligi yapilir
    And Gonderilecek mesaj bilgileri hazirlanir
    When Mesaj eklemek icin Post request gonderilir
    Then Mesaj bolumlerini dogrulama: name="<name>", email="<email>", subject="<subject>", message="<message>", date="<date>"

    Examples:
      | name    | email             | subject | message    | date       |
      | mustafa | mustafa@gmail.com | ders    | ders basi  | 2023-11-07 |

