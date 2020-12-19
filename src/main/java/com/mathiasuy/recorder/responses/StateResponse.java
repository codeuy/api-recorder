package com.mathiasuy.recorder.responses;

public class StateResponse {

	private Integer id;
	private String nameFile;
	private String url;
	private String message;
	private String state;
	private String dateStarted;
	private String time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDateStarted() {
		return dateStarted;
	}

	public void setDateStarted(String dateStarted) {
		this.dateStarted = dateStarted;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "StateResponse [id=" + id + ", nameFile=" + nameFile + ", url=" + url + ", message=" + message
				+ ", state=" + state + ", dateStarted=" + dateStarted + ", time=" + time + "]";
	}

}
