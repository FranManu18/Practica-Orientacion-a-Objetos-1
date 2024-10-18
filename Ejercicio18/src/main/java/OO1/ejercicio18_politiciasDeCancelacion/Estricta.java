package OO1.ejercicio18_politiciasDeCancelacion;

import java.time.LocalDate;

public class Estricta implements politicaDeCancelacion {
	@Override
	public double calcularReembolso(Reserva reserva,LocalDate fechaDeCancelacion) {
		return 0;
	}
}
