package com.masashik.app;

public enum StatusResponse {

	SUCCESS("Success"), ERROR("Error");

	final private String status;
	//TODO: Constructors, getters, setters.
	
	StatusResponse(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
