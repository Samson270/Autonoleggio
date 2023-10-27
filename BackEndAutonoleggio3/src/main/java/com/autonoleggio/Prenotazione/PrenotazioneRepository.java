package com.autonoleggio.Prenotazione;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface PrenotazioneRepository extends JpaRepository<PrenotazioneEntity, Long>{
	
	Optional<PrenotazioneEntity> findByDataRitiroBetween(LocalDate d1, LocalDate d2);
	
	Optional<PrenotazioneEntity> findByDataRitornoBetween(LocalDate d1, LocalDate d2);
}
