package com.autonoleggio.Prenotazione;

import java.time.LocalDate;

import lombok.Data;


@Data
public class PrenotazioneDTO {
	private String nomeCliente;
	private String cognomeCliente;
	private String username;
	private String targaMacchina;
	private LocalDate dataRitiro;
	private LocalDate dataRitorno;
	
	
	public PrenotazioneDTO(String nomeCliente, String cognomeCliente, String username, String targaMacchina,
			LocalDate dataRitiro, LocalDate dataRitorno) {
		this.nomeCliente = nomeCliente;
		this.cognomeCliente = cognomeCliente;
		this.username = username;
		this.targaMacchina = targaMacchina;
		this.dataRitiro = dataRitiro;
		this.dataRitorno = dataRitorno;
	}
	public PrenotazioneDTO() {
	}
	
	
}
