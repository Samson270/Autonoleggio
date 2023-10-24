package com.autonoleggio.accessingdatajpa;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "AUTO")
public class Auto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "Modello")
	private String modello;
	@Column(name = "Targa")
	private String targa;
	@Column(name = "Cilindrata")
	private int cilindrata;
	@Column(name = "Marca")
	private String marca;
	@Column(name = "Prezzo_giornaliero")
	private double prezzoGiornaliero;
	@Column(name = "Potenza")
	private int potenza;
	
	@OneToMany(mappedBy = "prodottoEntity")
	private List<Prenotazione> prenotazioni;
}
