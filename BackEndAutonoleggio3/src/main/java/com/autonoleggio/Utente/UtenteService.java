package com.autonoleggio.Utente;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.autonoleggio.Login.LoginDTO;
import com.autonoleggio.Login.LoginMessage;

@Service
public class UtenteService {

	@Autowired
	private UtenteRepository utenteRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public String registraUtente(UtenteDTO dto) {
		UtenteEntity utente = new UtenteEntity(
				dto.getNome(),
				dto.getCognome(),
				dto.getUsername(),
				this.passwordEncoder.encode(dto.getPassword()),
				dto.getNumeroTelefono(),
				dto.getAnniPatente()
				);
				
		this.utenteRepository.save(utente);
		return utente.getNome();
	}

	public LoginMessage loginUser(LoginDTO loginDTO) {
		UtenteEntity utente1 = utenteRepository.findByUsername(loginDTO.getUsername());
		if(utente1 != null) {
			String password = loginDTO.getPassword();
			String encodedPassword = utente1.getPassword();
			Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
			if(isPwdRight) {
				Optional<UtenteEntity> utente = utenteRepository.findByUsernameAndPassword(loginDTO.getUsername(), encodedPassword);
				if(utente.isPresent()) {
					return new LoginMessage("Login Succes",utente.get().getNome() , true);
				} else {
					return new LoginMessage("Login Failed", null , false);
				}
			} else {
				return new LoginMessage("Password Not Match", null, false);
			}
		} else {
			return new LoginMessage("Email Not Exist", null, false);
		}
	}
}
