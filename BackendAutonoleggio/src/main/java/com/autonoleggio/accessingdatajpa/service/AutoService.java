package com.autonoleggio.accessingdatajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autonoleggio.accessingdatajpa.Auto;
import com.autonoleggio.accessingdatajpa.dto.AutoDto;
import com.autonoleggio.accessingdatajpa.repository.AutoRepository;

@Service
public class AutoService {
	
	@Autowired
	private AutoRepository autoRepository;
	
	public Auto create(AutoDto dto) {
		Auto a = new Auto();
		a.setModello(dto.getModello());
		a.setTarga(dto.getTarga());
		a.setCilindrata(dto.getCilindrata());
		a.setMarca(dto.getMarca());
		a.setPrezzoGiornaliero(dto.getPrezzoGiornaliero());
		a.setPotenza(dto.getPotenza());
		return this.autoRepository.save(a);
	}
	
	public List<Auto> getAll(){
		return this.autoRepository.findAll();
	}
}
