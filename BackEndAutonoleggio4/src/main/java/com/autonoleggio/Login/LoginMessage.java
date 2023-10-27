package com.autonoleggio.Login;

import lombok.Data;

@Data
public class LoginMessage {
	String message;
	String name;
	String cognome;
	String username;
	Boolean status;
	
	public LoginMessage() {
	}

	public LoginMessage(String message, String name, String cognome, String username, Boolean status) {
		super();
		this.message = message;
		this.name = name;
		this.cognome = cognome;
		this.username = username;
		this.status = status;
	}	
}
