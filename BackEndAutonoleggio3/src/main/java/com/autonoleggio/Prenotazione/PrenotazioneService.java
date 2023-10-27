package com.autonoleggio.Prenotazione;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PrenotazioneService {

	@Autowired
	private PrenotazioneRepository prenotazioneRepository;

	public PrenotazioneMessage addBooking(PrenotazioneDTO dto) {
		PrenotazioneEntity tmp = new PrenotazioneEntity(
				dto.getNome(),
				dto.getCognome(),
				dto.getUsername(),
				dto.getTarga(),
				dto.getDataRitiro(),
				dto.getDataRitorno()
				);
		this.prenotazioneRepository.save(tmp);
		return new PrenotazioneMessage("Prenotazione avvenuta con successo", tmp.getPrenotazioneId());
	}

	public List<PrenotazioneEntity> getAllBookings() {
		
		return this.prenotazioneRepository.findAll();
	}

	public String controllaDisponibilita(PeriodoNoleggioDTO dto) {
		if(this.prenotazioneRepository.findByDataRitiroBetween(dto.getDataRitiro(), dto.getDataRitorno()).isPresent() || this.prenotazioneRepository.findByDataRitornoBetween(dto.getDataRitiro(), dto.getDataRitorno()).isPresent()) {
			return "non disponibile";
		} else {
			return "disponibile";
		}
	}
}
