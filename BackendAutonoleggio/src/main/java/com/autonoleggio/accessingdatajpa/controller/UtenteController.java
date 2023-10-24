package com.autonoleggio.accessingdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.autonoleggio.accessingdatajpa.Utente;
import com.autonoleggio.accessingdatajpa.dto.UtenteDto;
import com.autonoleggio.accessingdatajpa.service.UtenteService;

@Controller
@RequestMapping(path = "/user")
public class UtenteController {

	@Autowired
	private UtenteService utenteService;
	
	@PostMapping(path = "/add")
	public @ResponseBody String addNewUser(@RequestBody UtenteDto dto) {
		utenteService.create(dto);
		return "saved";
	}
	
	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Utente> getAllUsers(){
		return this.utenteService.getAll();
	}
}
