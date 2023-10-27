package com.autonoleggio.Prenotazione;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PeriodoNoleggioDTO {
		private LocalDate dataRitiro;
		private LocalDate dataRitorno;
		private String targa;
		
		public PeriodoNoleggioDTO(LocalDate dataRitiro, LocalDate dataRitorno, String targa) {
			this.dataRitiro = dataRitiro;
			this.dataRitorno = dataRitorno;
			this.targa = targa;
		}
		
		public PeriodoNoleggioDTO() {
		}
		
}
