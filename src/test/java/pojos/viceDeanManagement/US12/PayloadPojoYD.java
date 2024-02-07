package pojos.viceDeanManagement.US12;

import java.util.List;
import java.io.Serializable;

public class PayloadPojoYD implements Serializable {
	private List<Integer> lessonProgramId;
	private int teacherId;

	public PayloadPojoYD(List<Integer> lessonProgramId, int teacherId) {
		this.lessonProgramId = lessonProgramId;
		this.teacherId = teacherId;
	}

	public PayloadPojoYD() {
	}

	public void setLessonProgramId(List<Integer> lessonProgramId){
		this.lessonProgramId = lessonProgramId;
	}

	public List<Integer> getLessonProgramId(){
		return lessonProgramId;
	}

	public void setTeacherId(int teacherId){
		this.teacherId = teacherId;
	}

	public int getTeacherId(){
		return teacherId;
	}

	@Override
 	public String toString(){
		return 
			"ResponsePojo{" + 
			"lessonProgramId = '" + lessonProgramId + '\'' + 
			",teacherId = '" + teacherId + '\'' + 
			"}";
		}
}