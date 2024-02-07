package pojos.viceDeanManagement;

import java.io.Serializable;

public class ContactApiResponsepojo implements Serializable {
	private ContactApiObjectpojo object;
	private String message;
	private String httpStatus;

	public ContactApiResponsepojo() {
	}

	public ContactApiResponsepojo(ContactApiObjectpojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(ContactApiObjectpojo object){
		this.object = object;
	}

	public ContactApiObjectpojo getObject(){
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
			"ContactApiResponsepojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}