package com.autonoleggio.Prenotazione;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface PrenotazioneRepository extends JpaRepository<PrenotazioneEntity, Long>{

}
