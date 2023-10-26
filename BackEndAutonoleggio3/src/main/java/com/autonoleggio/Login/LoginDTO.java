package com.autonoleggio.Login;

import lombok.Data;

@Data
public class LoginDTO {
	String username;
	String password;
	
	public LoginDTO(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public LoginDTO() {
	}
	
	
}
