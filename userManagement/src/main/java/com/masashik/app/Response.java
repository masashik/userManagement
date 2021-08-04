package com.masashik.app;

import com.google.gson.JsonElement;

public class Response {

	private StatusResponse status;
	private String message;
	private JsonElement data;

	public Response(StatusResponse status) {
	}

	public Response(StatusResponse status, String message) {
	}

	public Response(StatusResponse status, JsonElement data) {
	}

	//Getter and Setters
}
