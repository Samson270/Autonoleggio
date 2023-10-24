package com.autonoleggio.accessingdatajpa.dto;

import java.time.LocalDate;
import java.util.List;

import com.autonoleggio.accessingdatajpa.Prenotazione;

import lombok.Data;


@Data
public class UtenteDto {
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private String cf;
	private String numeroTelefono;
	private int anniPatente;
	private List<Prenotazione> prenotazioni;
}
