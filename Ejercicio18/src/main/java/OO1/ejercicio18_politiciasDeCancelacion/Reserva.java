package OO1.ejercicio18_politiciasDeCancelacion;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Reserva {
	private LocalDate fechaInicial;
	private LocalDate fechaFinal;
	private int cantidadDeNoches;
	private Propiedad propiedadReservada;
	
	public Reserva(LocalDate fechaInicial, LocalDate fechaFinal, Propiedad propiedadReservada) {
		super();
		this.fechaInicial = fechaInicial;
		this.fechaFinal = fechaFinal;
		this.cantidadDeNoches = (int)ChronoUnit.DAYS.between(fechaInicial, fechaFinal)+1;
		this.propiedadReservada = propiedadReservada;
	}

	public LocalDate getFechaInicial() {
		return fechaInicial;
	}

	public LocalDate getFechaFinal() {
		return fechaFinal;
	}

	public int getCantidadDeNoches() {
		return cantidadDeNoches;
	}

	public Propiedad getPropiedadReservada() {
		return propiedadReservada;
	}
	
	public double valorReserva() {
		return this.cantidadDeNoches*propiedadReservada.getPrecio();
	}
	
	
}
