package stepDefinitions.DataBaseStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US21_StepDef {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("Lesson program list bilgilerini {string} ile al")
    public void lessonProgramListBilgileriniIleAl(String id) throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from lesson_program where id = " + id + " ; ");
        resultSet.next();
    }

    @Then("resultSet bodyi dogrula: id={string},day={string},start time ={string}, stop time={string}, education_term_id={string}")
    public void resultsetBodyiDogrulaIdDayStartTimeStopTimeEducation_term_id(String id, String day, String start_time, String stop_time, String education_term_id) throws SQLException {
        String actDay = resultSet.getString("day");
        String actStartTime = resultSet.getString("start_time");
        String actStopTime = resultSet.getString("stop_time");
        String actEducationTermId = resultSet.getString("education_term_id");

        assertEquals(day, actDay);
        assertEquals(start_time, actStartTime);
        assertEquals(stop_time, actStopTime);
        assertEquals(education_term_id, actEducationTermId);
    }


    @Given("Info bilgilerini {string} ile al")
    public void ınfoBilgileriniIleAl(String id) throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from student_info where id = " + id + " ; ");
        resultSet.next();
    }

    @Then("resultSet bodyi dogrula: id={string},absentee={string},exam_average={string},final_exam ={string}, info_note={string}, letter_grade={string} , midterm_exam={string} , education_term_id={string} , lesson_lesson_id={string} , student_id={string} , teacher_id={string}")
    public void resultsetBodyiDogrulaIdAbsenteeExam_averageFinal_examInfo_noteLetter_gradeMidterm_examEducation_term_idLesson_lesson_idStudent_idTeacher_id(String id, String absentee, String exam_average, String final_exam, String info_note, String letter_grade, String midterm_exam, String education_term_id, String lesson_lesson_id, String student_id, String teacher_id) throws SQLException {
        String actAbsentee = resultSet.getString("absentee");
        String actExamAverage = resultSet.getString("exam_average");
        String actFinalExam = resultSet.getString("final_exam");
        String actInfoNote = resultSet.getString("info_note");
        String actLetterGrade = resultSet.getString("letter_grade");
        String actMidtermExam = resultSet.getString("midterm_exam");
        String actEducationExam = resultSet.getString("education_term_id");
        String actLessonLessonId = resultSet.getString("lesson_lesson_id");
        String actStudentId = resultSet.getString("student_id");
        String actTeacherId = resultSet.getString("teacher_id");

        assertEquals(absentee, actAbsentee);
        assertEquals(exam_average, actExamAverage);
        assertEquals(final_exam, actFinalExam);
        assertEquals(info_note, actInfoNote);
        assertEquals(letter_grade, actLetterGrade);
        assertEquals(midterm_exam, actMidtermExam);
        assertEquals(education_term_id, actEducationExam);
        assertEquals(lesson_lesson_id, actLessonLessonId);
        assertEquals(student_id, actStudentId);
        assertEquals(teacher_id, actTeacherId);

    }
}
