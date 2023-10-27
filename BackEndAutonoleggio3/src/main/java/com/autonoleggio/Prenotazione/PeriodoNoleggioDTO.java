package com.autonoleggio.Prenotazione;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PeriodoNoleggioDTO {
		private LocalDate dataRitiro;
		private LocalDate dataRitorno;
		
		public PeriodoNoleggioDTO(LocalDate dataRitiro, LocalDate dataRitorno) {
			this.dataRitiro = dataRitiro;
			this.dataRitorno = dataRitorno;
		}
		
		public PeriodoNoleggioDTO() {
		}
		
}
