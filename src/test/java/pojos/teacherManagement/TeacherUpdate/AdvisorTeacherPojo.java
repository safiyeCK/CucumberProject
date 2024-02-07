package pojos.teacherManagement.TeacherUpdate;

import java.util.List;
import java.io.Serializable;

public class AdvisorTeacherPojo implements Serializable {
	private int id;
	private List<StudentsPojo> students;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setStudents(List<StudentsPojo> students){
		this.students = students;
	}

	public List<StudentsPojo> getStudents(){
		return students;
	}

	@Override
 	public String toString(){
		return 
			"AdvisorTeacherPojo{" + 
			"id = '" + id + '\'' + 
			",students = '" + students + '\'' + 
			"}";
		}
}