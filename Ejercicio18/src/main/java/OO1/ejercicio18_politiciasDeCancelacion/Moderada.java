package OO1.ejercicio18_politiciasDeCancelacion;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements politicaDeCancelacion {
	@Override
	public double calcularReembolso(Reserva reserva,LocalDate fechaDeCancelacion) {
		int diferencia=(int)ChronoUnit.DAYS.between(fechaDeCancelacion, reserva.getFechaInicial());
		if(diferencia>=7) {
			return reserva.valorReserva();
		}else if(diferencia>=2) {
			return reserva.valorReserva()/2;
		}
		return 0;
	}
}
