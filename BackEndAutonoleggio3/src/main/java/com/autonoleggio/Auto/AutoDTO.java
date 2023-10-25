package com.autonoleggio.Auto;

import lombok.Data;

@Data
public class AutoDTO {
	private String modello;
	private String targa;
	private int cilindrata;
	private String marca;
	private Double prezzoGiornaliero;
	private String potenza;
	
	public AutoDTO(String modello, String targa, int cilindrata, String marca, Double prezzoGiornaliero,
			String potenza) {
		this.modello = modello;
		this.targa = targa;
		this.cilindrata = cilindrata;
		this.marca = marca;
		this.prezzoGiornaliero = prezzoGiornaliero;
		this.potenza = potenza;
	}
	public AutoDTO() {
	}
	
	
}
