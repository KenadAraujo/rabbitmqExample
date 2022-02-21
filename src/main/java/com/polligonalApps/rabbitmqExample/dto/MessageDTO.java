package com.polligonalApps.rabbitmqExample.dto;

public class MessageDTO {

	private String message;

	public MessageDTO() {
		
	}
	
	public MessageDTO(String msg) {
		this.message = msg;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
