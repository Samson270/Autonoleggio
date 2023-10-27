package com.autonoleggio.Auto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AutoDTO {
	private String modello;
	private String targa;
	private int cilindrata;
	private String marca;
	private Double prezzoGiornaliero;
	private int potenza;
	private String url;
	private String imageUrl;
	private String descrizione;
	
	public AutoDTO(String modello, String targa, int cilindrata, String marca, Double prezzoGiornaliero,
			int potenza, String imageUrl, String descrizione) {
		this.modello = modello;
		this.targa = targa;
		this.cilindrata = cilindrata;
		this.marca = marca;
		this.prezzoGiornaliero = prezzoGiornaliero;
		this.potenza = potenza;
		this.imageUrl = imageUrl;
		this.descrizione = descrizione;
	}
	public AutoDTO() {
	}
	
	
}
