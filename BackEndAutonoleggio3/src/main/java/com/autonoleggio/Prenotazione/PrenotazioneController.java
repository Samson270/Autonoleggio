package com.autonoleggio.Prenotazione;

import org.springframework.beans.factory.annotation.Autowired;
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
	public long addBooking(@RequestBody PrenotazioneDTO dto) {
		return this.prenotazioneService.addBooking(dto);
	}
	
	@GetMapping(path="/all")
	public Iterable<PrenotazioneEntity> getAll(){
		return this.prenotazioneService.getAllBookings();
	}
}
