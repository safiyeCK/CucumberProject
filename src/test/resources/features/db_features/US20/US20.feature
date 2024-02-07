Feature:US20 Teacher ogrencilerle meet olusturabilmeli(DB)

  Scenario Outline: TC02 Oluşan meet'i doğrula (DataBase)
    Given Meet "<id>" ile meet al
    Then resultSet bodyi dogrula: id="<id>",date="<date>",description="<description>",start_time ="<start_time>", stop_time="<stop_time>", advisor_teacher_id="<advisor_teacher_id>"
    Examples:
      | id  | date                      | description | start_time               | stop_time                | advisor_teacher_id |
      | 495 | Oct 29, 2023, 12:00:00 AM | Kesin Gel   | Jan 1, 1970, 10:00:00 AM | Jan 1, 1970, 11:00:00 AM | 16                 |
