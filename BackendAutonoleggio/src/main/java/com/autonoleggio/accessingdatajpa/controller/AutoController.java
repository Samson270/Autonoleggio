package com.autonoleggio.accessingdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.autonoleggio.accessingdatajpa.Auto;
import com.autonoleggio.accessingdatajpa.dto.AutoDto;
import com.autonoleggio.accessingdatajpa.service.AutoService;

@Controller
@RequestMapping(path = "/auto")
public class AutoController {
	
	@Autowired
	private AutoService autoService;
	
	@PostMapping(path = "/add")
	public @ResponseBody String addNewAuto (@RequestBody AutoDto dto) {
		autoService.create(dto);
		return "Saved";
	}
	
	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Auto> getAllCars(){
		return this.autoService.getAll();
	}
	
}
