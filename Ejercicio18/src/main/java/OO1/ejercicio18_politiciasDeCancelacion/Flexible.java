package OO1.ejercicio18_politiciasDeCancelacion;

import java.time.LocalDate;

public class Flexible implements politicaDeCancelacion {
	@Override
	public double calcularReembolso(Reserva reserva,LocalDate fechaDeCancelacion) {
		if(fechaDeCancelacion.isBefore(reserva.getFechaInicial())) {
			return reserva.valorReserva();
		}else {
			return 0;
		}
		
	}
}
