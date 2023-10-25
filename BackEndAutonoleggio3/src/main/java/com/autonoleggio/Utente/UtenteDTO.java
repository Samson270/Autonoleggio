package com.autonoleggio.Utente;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UtenteDTO {

	private String nome;
	private String cognome;
	private String username;	
	private String password;	
	private String numeroTelefono;
	private int anniPatente;
	public UtenteDTO(String nome, String cognome, String username, String password, String numeroTelefono, int anniPatente) {
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
		this.numeroTelefono = numeroTelefono;
		this.anniPatente = anniPatente;
	}
	public UtenteDTO() {
	}
	
	
}
