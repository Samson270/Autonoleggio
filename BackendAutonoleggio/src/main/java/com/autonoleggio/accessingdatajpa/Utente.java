package com.autonoleggio.accessingdatajpa;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "CLIENTI")
public class Utente{
	
	@Column(name = "Nome")
	private String nome;
	@Column(name = "Cognome")
	private String cognome;
	@Column(name = "CodiceFiscale")
	private String cf;
	@Column(name = "Email")
	private String email;
	@Column(name = "Password")
	private String password;
	@Column(name = "NumeroTelefono")
	private String numeroTelefono;
	@Column(name = "anniPatente")
	private int anniPatente;
	
	@OneToMany(mappedBy = "utenteEntity")
	private List<Prenotazione> prenotazioni;
	
	public Utente() {}
	
	public Utente(String nome, String cognome, String cf, LocalDate dataRegistrazione) {
		
		this.cf = cf;
		prenotazioni = new LinkedList<Prenotazione>();
	}



	
}