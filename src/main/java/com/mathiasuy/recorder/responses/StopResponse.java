package com.mathiasuy.recorder.responses;

public class StopResponse {

	private String nameFile;
	private String message;
	
	public String getNameFile() {
		return nameFile;
	}
	
	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "StopResponse [nameFile=" + nameFile + ", message=" + message + "]";
	}
	
}
