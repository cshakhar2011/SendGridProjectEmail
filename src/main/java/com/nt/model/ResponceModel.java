package com.nt.model;

public class ResponceModel {

	
	private String message;
	private boolean status;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public ResponceModel(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	public ResponceModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
