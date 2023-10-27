package com.autonoleggio.Prenotazione;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(path="/prenotazione")
public class PrenotazioneController {
	
	@Autowired
	private PrenotazioneService prenotazioneService;
	
	@PostMapping(path="/add")
	public ResponseEntity<?> addBooking(@RequestBody PrenotazioneDTO dto) {
		PrenotazioneMessage prenotazioneMessage = this.prenotazioneService.addBooking(dto);
		return ResponseEntity.ok(prenotazioneMessage);
	}
	
	@GetMapping(path="/all")
	public Iterable<PrenotazioneEntity> getAll(){
		return this.prenotazioneService.getAllBookings();
	}
	
	@PostMapping(path="/disp")
	public String check(@RequestBody PeriodoNoleggioDTO dto) {
		return this.prenotazioneService.controllaDisponibilita(dto);
	}
}
