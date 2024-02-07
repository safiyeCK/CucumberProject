Feature:US21 Student ekledigi dersleri ve info bilgilerini gorebilmeli(DB)

  Scenario Outline: TC01 Ekledigi dersleri'i doğrula (DataBase)
    Given Lesson program list bilgilerini "<id>" ile al
    Then resultSet bodyi dogrula: id="<id>",day="<day>",start time ="<start time>", stop time="<stop time>", education_term_id="<education_term_id>"
    Examples:
      | id | day    | start time | stop time | education_term_id |
      | 34 | FRIDAY | 14:00:00   | 16:00:00  | 2                 |

  Scenario Outline: TC02 Info bilgilerini doğrula (DataBase)
    Given Info bilgilerini "<id>" ile al
    Then resultSet bodyi dogrula: id="<id>",absentee="<absentee>",exam_average="<exam_average>",final_exam ="<final_exam>", info_note="<info_note>", letter_grade="<letter_grade>" , midterm_exam="<midterm_exam>" , education_term_id="<education_term_id>" , lesson_lesson_id="<lesson_lesson_id>" , student_id="<student_id>" , teacher_id="<teacher_id>"
    Examples:
      | id  | absentee | exam_average | final_exam | info_note      | letter_grade | midterm_exam | education_term_id | lesson_lesson_id | student_id | teacher_id |
      | 143 | 3        | 68           | 80         | Basarili Gecti | CB           | 50           | 1              | 13               | 22         | 14         |

  Scenario Outline: TC03 Oluşan meet'listi doğrula (DataBase)
    Given Meet "<id>" ile meet al
    Then resultSet bodyi dogrula: id="<id>",date="<date>",description="<description>",start_time ="<start_time>", stop_time="<stop_time>", advisor_teacher_id="<advisor_teacher_id>"
    Examples:
      | id  | date       | description | start_time | stop_time | advisor_teacher_id |
      | 494 | 2023-10-29 | Kesin Gel   | 10:00:00   | 11:00:00  | 16                 |
      | 495 | 2023-10-28 | Kesin Gel   | 10:00:00   | 11:00:00  | 16                 |
      | 499 | 2023-10-31 | Kesin Gel   | 10:00:00   | 11:00:00  | 16                 |