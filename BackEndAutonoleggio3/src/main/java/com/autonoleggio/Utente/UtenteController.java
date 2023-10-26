package com.autonoleggio.Utente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autonoleggio.Login.LoginDTO;
import com.autonoleggio.Login.LoginMessage;

@RestController
@CrossOrigin
@RequestMapping(path = "/user")
public class UtenteController {
	
	@Autowired
	UtenteService utenteService;
	
	@PostMapping(path="/save")
	public String addUser(@RequestBody UtenteDTO dto) {
		String nome = utenteService.registraUtente(dto);
		return nome;
	}
	
	@GetMapping(path="/count")
    public Long getCountUsers()
    {
        return utenteService.getNumero();
    }
	
	@GetMapping(path="/all")
	public Iterable<UtenteEntity> getAll(){
		return this.utenteService.getAllUsers();
	}
	
	@PostMapping(path="/login")
	public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO){
		LoginMessage loginMessage = utenteService.loginUser(loginDTO);
		return ResponseEntity.ok(loginMessage);
	}
}
