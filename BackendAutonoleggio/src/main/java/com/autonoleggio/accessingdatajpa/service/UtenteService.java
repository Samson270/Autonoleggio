package com.autonoleggio.accessingdatajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autonoleggio.accessingdatajpa.Utente;
import com.autonoleggio.accessingdatajpa.dto.UtenteDto;
import com.autonoleggio.accessingdatajpa.repository.UtenteRepository;

@Service
public class UtenteService {

	
	@Autowired
	private UtenteRepository utenteRepository;
	
	public Utente create(UtenteDto dto) {
		Utente u = new Utente();
		u.setNome(dto.getNome());
		u.setCognome(dto.getCognome());
		u.setCf(dto.getCf());
		u.setEmail(dto.getEmail());
		u.setPassword(dto.getPassword());
		u.setNumeroTelefono(dto.getNumeroTelefono());
		u.setAnniPatente(dto.getAnniPatente());
		return this.utenteRepository.save(u);
	}
	
	public List<Utente> getAll(){
		return this.utenteRepository.findAll();
	}
}
