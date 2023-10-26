package com.autonoleggio.Login;

import lombok.Data;

@Data
public class LoginMessage {
	String message;
	String name;
	Boolean status;
	public LoginMessage(String message,String name, Boolean status) {
		this.message = message;
		this.name = name;
		this.status = status;
	}
	public LoginMessage() {
	}	
}
