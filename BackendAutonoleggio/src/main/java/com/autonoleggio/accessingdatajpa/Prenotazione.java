package com.autonoleggio.accessingdatajpa;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "PRENOTAZIONI")
public class Prenotazione{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Acquisto_id")
	private Long id;
	
	@ManyToOne
	private Utente utenteEntity;
	@ManyToOne
	private Auto autoEntity;
	
	@Column(name = "data_inizio")
	private LocalDate dataInizio;
	
	@Column(name = "data_fine")
	private LocalDate dataFine;
	
	enum stato{
		nonPagato,
		pagato,
		scaduto
	};
	
	
	
	
	
}
