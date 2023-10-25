package com.autonoleggio.Auto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autonoleggio.Utente.UtenteEntity;

@Service
public class AutoService {
	
	@Autowired
	private AutoRepository autoRepository;

	public String aggiungiMacchina(AutoDTO dto) {
		AutoEntity auto = new AutoEntity(
				dto.getModello(),
				dto.getTarga(),
				dto.getCilindrata(),
				dto.getMarca(),
				dto.getPrezzoGiornaliero(),
				dto.getPotenza()
				);
				
		this.autoRepository.save(auto);
		return auto.getTarga();
	}

	public List<AutoEntity> getAll() {
		return this.autoRepository.findAll();
	}
	
	
}
