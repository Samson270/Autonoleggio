package com.autonoleggio.Prenotazione;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PrenotazioneService {

	@Autowired
	private PrenotazioneRepository prenotazioneRepository;

	public PrenotazioneMessage addBooking(PrenotazioneDTO dto) {
		PrenotazioneEntity tmp = new PrenotazioneEntity(
				dto.getNomeCliente(),
				dto.getCognomeCliente(),
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
		java.util.Optional<PrenotazioneEntity> tmp1 = this.prenotazioneRepository.findByDataRitiroBetween(dto.getDataRitiro(), dto.getDataRitorno());
		java.util.Optional<PrenotazioneEntity> tmp2 = this.prenotazioneRepository.findByDataRitornoBetween(dto.getDataRitiro(), dto.getDataRitorno());
		if(tmp1.isPresent() || tmp2.isPresent()){
			if(tmp1.get().getTarga().equals(dto.getTarga()) || tmp2.get().getTarga().equals(dto.getTarga())){
				return "non disponibile";
			}
			else return "disponibile";
		} else {
			return "disponibile";
		}
	}
}
