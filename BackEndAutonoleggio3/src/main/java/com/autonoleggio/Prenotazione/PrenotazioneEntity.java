package com.autonoleggio.Prenotazione;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PrenotazioneEntity {
	
	@Id
	@Column(name="id_prenotazione")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int prenotazioneId;
	
	@Column(name="nomeCliente")
	private String nomeCliente;
	
	@Column(name="cognomeCliente")
	private String cognomeCliente;
	
	@Column(name="username")
	private String username;
	
	@Column(name="targaMacchina")
	private String targaMacchina;
	
	@Column(name="dataRitiro")
	private LocalDate dataRitiro;
	
	@Column(name="dataRitorno")
	private LocalDate dataRitorno;

	public PrenotazioneEntity(String nomeCliente, String cognomeCliente, String username, String targaMacchina, LocalDate dataRitiro,
			LocalDate dataRitorno) {
		this.nomeCliente = nomeCliente;
		this.cognomeCliente = cognomeCliente;
		this.username = username;
		this.targaMacchina = targaMacchina;
		this.dataRitiro = dataRitiro;
		this.dataRitorno = dataRitorno;
	}

	public PrenotazioneEntity() {
	}
	
	
}
