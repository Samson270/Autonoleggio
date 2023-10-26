package com.autonoleggio.Utente;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "utenti")
public class UtenteEntity {
	@Id
	@Column(name="id_utente")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int utenteId;
	
	@Column(name="nome")
	String nome;
	
	@Column(name="cognome")
	String cognome;
	
	@Column(name="username")
	String username;
	
	@Column(name="password")
	String password;
	
	@Column(name="numeroTelefono")
	String numeroTelefono;
	
	@Column(name="anniPatente")
	int anniPatente;

	public UtenteEntity(String nome, String cognome, String username, String password,
			String numeroTelefono, int anniPatente) {
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
		this.numeroTelefono = numeroTelefono;
		this.anniPatente = anniPatente;
	}

	public UtenteEntity() {
	}
	
	
}
