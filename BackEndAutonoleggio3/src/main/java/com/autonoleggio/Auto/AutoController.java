package com.autonoleggio.Auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping(path = "/auto")
public class AutoController {
	
	@Autowired
	private AutoService autoService;
	
	@PostMapping(path="/add")
	public String addCar(@RequestBody AutoDTO dto) {
		String targa = autoService.aggiungiMacchina(dto);
		return targa;
	}

	@GetMapping(path="/all")
	public Iterable<AutoEntity> getAll(){
		return this.autoService.getAll();
	}
}
