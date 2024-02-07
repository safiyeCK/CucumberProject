package pojos.studentInfoManagement.US17_US18_Pojo.postStudentInfo;

import java.io.Serializable;

public class AddStudentInfoPostPojo implements Serializable {
	private int absentee;
	private int educationTermId;
	private Object finalExam;
	private String infoNote;
	private int lessonId;
	private Object midtermExam;
	private int studentId;

	public AddStudentInfoPostPojo() {
	}

	public AddStudentInfoPostPojo(int absentee, int educationTermId, Object finalExam, String infoNote, int lessonId, Object midtermExam, int studentId) {
		this.absentee = absentee;
		this.educationTermId = educationTermId;
		this.finalExam = finalExam;
		this.infoNote = infoNote;
		this.lessonId = lessonId;
		this.midtermExam = midtermExam;
		this.studentId = studentId;
	}

	public void setAbsentee(int absentee){
		this.absentee = absentee;
	}

	public int getAbsentee(){
		return absentee;
	}

	public void setEducationTermId(int educationTermId){
		this.educationTermId = educationTermId;
	}

	public int getEducationTermId(){
		return educationTermId;
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

	public void setLessonId(int lessonId){
		this.lessonId = lessonId;
	}

	public int getLessonId(){
		return lessonId;
	}

	public void setMidtermExam(Object midtermExam){
		this.midtermExam = midtermExam;
	}

	public Object getMidtermExam(){
		return midtermExam;
	}

	public void setStudentId(int studentId){
		this.studentId = studentId;
	}

	public int getStudentId(){
		return studentId;
	}

	@Override
 	public String toString(){
		return 
			"AddStudentInfoPostPojo{" + 
			"absentee = '" + absentee + '\'' + 
			",educationTermId = '" + educationTermId + '\'' + 
			",finalExam = '" + finalExam + '\'' + 
			",infoNote = '" + infoNote + '\'' + 
			",lessonId = '" + lessonId + '\'' + 
			",midtermExam = '" + midtermExam + '\'' + 
			",studentId = '" + studentId + '\'' + 
			"}";
		}
}