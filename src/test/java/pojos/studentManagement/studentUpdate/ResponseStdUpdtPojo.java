package pojos.studentManagement.studentUpdate;

import java.io.Serializable;

public class ResponseStdUpdtPojo implements Serializable {
	private ObjectStdtUpdtPojo object;
	private String message;

	public ResponseStdUpdtPojo() {
	}

	public ResponseStdUpdtPojo(ObjectStdtUpdtPojo object, String message) {
		this.object = object;
		this.message = message;
	}

	public void setObject(ObjectStdtUpdtPojo object){
		this.object = object;
	}

	public ObjectStdtUpdtPojo getObject(){
		return object;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"ResponseStdUpdtPojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}