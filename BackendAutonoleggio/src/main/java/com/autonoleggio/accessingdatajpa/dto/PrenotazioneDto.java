package com.autonoleggio.accessingdatajpa.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PrenotazioneDto {
	private long id_utente;
	private long id_auto;
	private LocalDate dataInizio;
	private LocalDate dataFine;
	private enum stato {pagato, nonPagato, scaduto};
}
