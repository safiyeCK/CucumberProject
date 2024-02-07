package pojos.studentInfoManagement;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentInfoResponse implements Serializable {

    private Object average;
    private String note;
    private int creditScore;
    private int lessonId;
    private int absentee;
    private String lessonName;
    private StudentResponse studentResponse;
    private Object midtermExam;
    private boolean compulsory;
    private Object finalExam;
    private String infoNote;
    private int id;
    private int educationTermId;

    public StudentInfoResponse() {
    }

    public StudentInfoResponse(Object average, String note, int creditScore, int lessonId, int absentee, String lessonName, StudentResponse studentResponse, Object midtermExam, boolean compulsory, Object finalExam, String infoNote, int id, int educationTermId) {
        this.average = average;
        this.note = note;
        this.creditScore = creditScore;
        this.lessonId = lessonId;
        this.absentee = absentee;
        this.lessonName = lessonName;
        this.studentResponse = studentResponse;
        this.midtermExam = midtermExam;
        this.compulsory = compulsory;
        this.finalExam = finalExam;
        this.infoNote = infoNote;
        this.id = id;
        this.educationTermId = educationTermId;
    }

    public void setAverage(Object average){
        this.average = average;
    }

    public Object getAverage(){
        return average;
    }

    public void setNote(String note){
        this.note = note;
    }

    public String getNote(){
        return note;
    }

    public void setCreditScore(int creditScore){
        this.creditScore = creditScore;
    }

    public int getCreditScore(){
        return creditScore;
    }

    public void setLessonId(int lessonId){
        this.lessonId = lessonId;
    }

    public int getLessonId(){
        return lessonId;
    }

    public void setAbsentee(int absentee){
        this.absentee = absentee;
    }

    public int getAbsentee(){
        return absentee;
    }

    public void setLessonName(String lessonName){
        this.lessonName = lessonName;
    }

    public String getLessonName(){
        return lessonName;
    }

    public void setStudentResponse(StudentResponse studentResponse){
        this.studentResponse = studentResponse;
    }

    public StudentResponse getStudentResponse(){
        return studentResponse;
    }

    public void setMidtermExam(Object midtermExam){
        this.midtermExam = midtermExam;
    }

    public Object getMidtermExam(){
        return midtermExam;
    }

    public void setCompulsory(boolean compulsory){
        this.compulsory = compulsory;
    }

    public boolean isCompulsory(){
        return compulsory;
    }

    public void setFinalExam(Object finalExam){
        this.finalExam = finalExam;
    }

    public Object getFinalExam(){
        return finalExam;
    }

    public void setInfoNote(String infoNote){
        this.infoNote = infoNote;
    }

    public String getInfoNote(){
        return infoNote;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setEducationTermId(int educationTermId){
        this.educationTermId = educationTermId;
    }

    public int getEducationTermId(){
        return educationTermId;
    }

    @Override
    public String toString(){
        return
                "StudentInfoResponse{" +
                        "average = '" + average + '\'' +
                        ",note = '" + note + '\'' +
                        ",creditScore = '" + creditScore + '\'' +
                        ",lessonId = '" + lessonId + '\'' +
                        ",absentee = '" + absentee + '\'' +
                        ",lessonName = '" + lessonName + '\'' +
                        ",studentResponse = '" + studentResponse + '\'' +
                        ",midtermExam = '" + midtermExam + '\'' +
                        ",compulsory = '" + compulsory + '\'' +
                        ",finalExam = '" + finalExam + '\'' +
                        ",infoNote = '" + infoNote + '\'' +
                        ",id = '" + id + '\'' +
                        ",educationTermId = '" + educationTermId + '\'' +
                        "}";
    }

}
