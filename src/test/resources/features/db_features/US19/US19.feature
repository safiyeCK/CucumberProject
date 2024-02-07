Feature:US19 Teacher ogrencilerle meet olusturabilmeli(DB)

  Scenario Outline: TC01 Oluşan meet'i doğrula (DataBase)
    Given Meet "<id>" ile meet al
    Then resultSet bodyi dogrula: id="<id>",date="<date>",description="<description>",start_time ="<start_time>", stop_time="<stop_time>", advisor_teacher_id="<advisor_teacher_id>"
    Examples:
      | id  | date       | description | start_time | stop_time | advisor_teacher_id |
      | 494 | 2023-10-29 | Kesin Gel   | 10:00:00   | 11:00:00  | 16                 |
      | 495 | 2023-10-28 | Kesin Gel   | 10:00:00   | 11:00:00  | 16                 |