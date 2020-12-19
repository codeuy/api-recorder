package com.mathiasuy.recorder.requests;

public class StartRequest {

	private String nameFile;
	private String url;
	
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

	@Override
	public String toString() {
		return "StartRequest [nameFile=" + nameFile + ", url=" + url + "]";
	}
	
}
