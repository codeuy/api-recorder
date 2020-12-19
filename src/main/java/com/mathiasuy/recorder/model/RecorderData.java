package com.mathiasuy.recorder.model;

import com.mathiasuy.recorder.responses.StateResponse;

public class RecorderData {

	private static Integer generalId = 0;
	private Integer id;
	private String nameFile;
	private String url;
	private String message = "";

	public RecorderData() {
		this.id = ++generalId;
	}
	
	public Integer getId() {
		return id;
	}

	public String getNameFile() {
		return nameFile;
	}

	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void appendMessage(String message) {
		this.message = this.message + "\n" +  message;
	}
	
	public StateResponse getState() {
		StateResponse stateResponse = new StateResponse();
		stateResponse.setId(getId());
		stateResponse.setMessage(getMessage());
		stateResponse.setNameFile(getNameFile());
		stateResponse.setState("undefined");
		stateResponse.setTime("unedfined");
		stateResponse.setUrl(getUrl());
		stateResponse.setDateStarted("undefined");
		return stateResponse;
	}
	
	@Override
	public String toString() {
		return "RecorderData [id=" + id + ", nameFile=" + nameFile + ", url=" + url + ", message=" + message + "]";
	}

	public void record() {
		setMessage("The service record was started for: " + toString());
	}

	public void stop() {
		setMessage("The service record was stopped for: " + getId() + " (" + getNameFile() + ")");
	}

}
