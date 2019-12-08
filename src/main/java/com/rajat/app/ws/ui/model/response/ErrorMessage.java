package com.rajat.app.ws.ui.model.response;

public enum ErrorMessage {
	MISSING_REQUIRED_FIELD("Missing require field please check documentation"),
	RECORD_ALREADY_EXISTS("Record is already exist please change email id");
	
	private String errorMessage;
	
	 ErrorMessage(String errorMessage) {
		// TODO Auto-generated constructor stub
		 this.errorMessage = errorMessage;	 
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	 
	 

}
