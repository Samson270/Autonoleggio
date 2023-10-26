package com.autonoleggio.Utente;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface UtenteRepository extends JpaRepository<UtenteEntity, Long>{

	UtenteEntity findByUsername(String username);

	Optional<UtenteEntity> findByUsernameAndPassword(String username, String password);
	
}
