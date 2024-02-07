package pojos.viceDeanManagement.US12;

import java.io.Serializable;

public class ResponseTeacherPojoYD implements Serializable {
	private ObjectPojoYD object;
	private String message;
	private String httpStatus;

	public ResponseTeacherPojoYD() {
	}

	public ResponseTeacherPojoYD(ObjectPojoYD object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(ObjectPojoYD object){
		this.object = object;
	}

	public ObjectPojoYD getObject(){
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
			"ResponseTeacherPojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}