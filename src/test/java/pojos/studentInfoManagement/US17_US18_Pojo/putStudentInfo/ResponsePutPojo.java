package pojos.studentInfoManagement.US17_US18_Pojo.putStudentInfo;

import java.io.Serializable;

public class ResponsePutPojo implements Serializable {
	private ObjectPutPojo object;
	private String message;
	private String httpStatus;

	public ResponsePutPojo() {
	}

	public ResponsePutPojo(ObjectPutPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(ObjectPutPojo object){
		this.object = object;
	}

	public ObjectPutPojo getObject(){
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
			"ResponsePutPojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}