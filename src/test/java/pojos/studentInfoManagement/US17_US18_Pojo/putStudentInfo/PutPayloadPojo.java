package pojos.studentInfoManagement.US17_US18_Pojo.putStudentInfo;

import java.io.Serializable;

public class PutPayloadPojo implements Serializable {
	private int absentee;
	private int educationTermId;
	private Object finalExam;
	private String infoNote;
	private int lessonId;
	private Object midtermExam;

	public PutPayloadPojo() {
	}

	public PutPayloadPojo(int absentee, int educationTermId, Object finalExam, String infoNote, int lessonId, Object midtermExam) {
		this.absentee = absentee;
		this.educationTermId = educationTermId;
		this.finalExam = finalExam;
		this.infoNote = infoNote;
		this.lessonId = lessonId;
		this.midtermExam = midtermExam;
	}

	public int getAbsentee() {
		return absentee;
	}

	public void setAbsentee(int absentee) {
		this.absentee = absentee;
	}

	public int getEducationTermId() {
		return educationTermId;
	}

	public void setEducationTermId(int educationTermId) {
		this.educationTermId = educationTermId;
	}

	public Object getFinalExam() {
		return finalExam;
	}

	public void setFinalExam(Object finalExam) {
		this.finalExam = finalExam;
	}

	public String getInfoNote() {
		return infoNote;
	}

	public void setInfoNote(String infoNote) {
		this.infoNote = infoNote;
	}

	public int getLessonId() {
		return lessonId;
	}

	public void setLessonId(int lessonId) {
		this.lessonId = lessonId;
	}

	public Object getMidtermExam() {
		return midtermExam;
	}

	public void setMidtermExam(Object midtermExam) {
		this.midtermExam = midtermExam;
	}

	@Override
	public String toString() {
		return "PutPayloadPojo{" +
				"absentee=" + absentee +
				", educationTermId=" + educationTermId +
				", finalExam=" + finalExam +
				", infoNote='" + infoNote + '\'' +
				", lessonId=" + lessonId +
				", midtermExam=" + midtermExam +
				'}';
	}
}