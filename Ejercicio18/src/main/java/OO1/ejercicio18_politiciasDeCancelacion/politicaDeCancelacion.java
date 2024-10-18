package OO1.ejercicio18_politiciasDeCancelacion;

import java.time.LocalDate;

public interface politicaDeCancelacion {
	public double calcularReembolso(Reserva reserva,LocalDate fechaDeCancelacion);
}
