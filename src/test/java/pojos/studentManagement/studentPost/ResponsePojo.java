package pojos.studentManagement.studentPost;

import java.io.Serializable;

public class ResponsePojo implements Serializable {
	private ObjectPojo object;
	private String message;

	public ResponsePojo() {
	}

	public ResponsePojo(ObjectPojo object, String message) {
		this.object = object;
		this.message = message;
	}

	public void setObject(ObjectPojo object){
		this.object = object;
	}

	public ObjectPojo getObject(){
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
			"ResponsePojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}