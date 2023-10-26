package com.autonoleggio.Prenotazione;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrenotazioneService {

	@Autowired
	private PrenotazioneRepository prenotazioneRepository;

	public long addBooking(PrenotazioneDTO dto) {
		PrenotazioneEntity tmp = new PrenotazioneEntity(
				dto.getNomeCliente(),
				dto.getNomeCliente(),
				dto.getUsername(),
				dto.getTargaMacchina(),
				dto.getDataRitiro(),
				dto.getDataRitorno()
				);
		this.prenotazioneRepository.save(tmp);
		return tmp.getPrenotazioneId();
	}

	public List<PrenotazioneEntity> getAllBookings() {
		
		return this.prenotazioneRepository.findAll();
	}
}
