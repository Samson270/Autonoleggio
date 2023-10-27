package com.autonoleggio.Prenotazione;

import java.time.LocalDate;

import lombok.Data;


@Data
public class PrenotazioneDTO {
	private String nome;
	private String cognome;
	private String username;
	private String targa;
	private LocalDate dataRitiro;
	private LocalDate dataRitorno;
	
	
	public PrenotazioneDTO(String nome, String cognome, String username, String targa,
			LocalDate dataRitiro, LocalDate dataRitorno) {
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.targa = targa;
		this.dataRitiro = dataRitiro;
		this.dataRitorno = dataRitorno;
	}
	public PrenotazioneDTO() {
	}
	
	
}
