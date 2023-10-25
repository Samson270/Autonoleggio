package com.autonoleggio.Auto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "auto")
public class AutoEntity {
	
	@Id
	@Column(name="id_auto")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int utenteId;
	
	@Column(name="modello")
	private String modello;
	
	@Column(name="targa")
	private String targa;
	
	@Column(name="cilindrata")
	private int cilindrata;
	
	@Column(name="marca")
	private String marca;
	
	@Column(name="prezzoGiornaliero")
	private Double prezzoGiornaliero;
	
	@Column(name="potenza")
	private String potenza;

	public AutoEntity(String modello, String targa, int cilindrata, String marca, Double prezzoGiornaliero,
			String potenza) {
		this.modello = modello;
		this.targa = targa;
		this.cilindrata = cilindrata;
		this.marca = marca;
		this.prezzoGiornaliero = prezzoGiornaliero;
		this.potenza = potenza;
	}

	public AutoEntity() {
	}
	
	
}
