package pojos.studentInfoManagement;

import java.io.Serializable;

public class StudentMeetResponse implements Serializable{

    private ObjectResponse object;
    private String message;
    private String httpStatus;

    public StudentMeetResponse() {
    }

    public StudentMeetResponse(ObjectResponse object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public void setObject(ObjectResponse object){
        this.object = object;
    }

    public ObjectResponse getObject(){
        return object;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void setHttpStatus(String httpStatus){
        this.httpStatus = httpStatus;
    }

    public String getHttpStatus(){
        return httpStatus;
    }

    @Override
    public String toString(){
        return
                "StudentMeetResponse{" +
                        "object = '" + object + '\'' +
                        ",message = '" + message + '\'' +
                        ",httpStatus = '" + httpStatus + '\'' +
                        "}";
    }
}
