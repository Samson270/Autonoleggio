package com.autonoleggio.accessingdatajpa.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AutoDto {
	private String modello;
	private String targa;
	private int cilindrata;
	private String marca;
	private double prezzoGiornaliero;
	private int potenza;
}
