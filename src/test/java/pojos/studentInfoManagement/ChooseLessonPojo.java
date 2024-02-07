package pojos.studentInfoManagement;

import java.util.List;
import java.io.Serializable;

public class ChooseLessonPojo implements Serializable{

    private List<Integer> lessonProgramId;

    public ChooseLessonPojo() {
    }

    public ChooseLessonPojo(List<Integer> lessonProgramId) {
        this.lessonProgramId = lessonProgramId;
    }

    public void setLessonProgramId(List<Integer> lessonProgramId){
        this.lessonProgramId = lessonProgramId;
    }

    public List<Integer> getLessonProgramId(){
        return lessonProgramId;
    }

    @Override
    public String toString(){
        return
                "ChooseLessonPojo{" +
                        "lessonProgramId = '" + lessonProgramId + '\'' +
                        "}";
    }


}
