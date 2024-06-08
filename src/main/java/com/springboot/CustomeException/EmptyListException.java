package com.springboot.CustomeException;

public class EmptyListException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private String statusCode;
	private String statusMessage;
	public EmptyListException(String statusCode, String statusMessage) {
		super();
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	

}
