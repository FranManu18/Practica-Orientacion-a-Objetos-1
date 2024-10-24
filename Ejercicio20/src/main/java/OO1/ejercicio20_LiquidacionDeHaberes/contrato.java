package OO1.ejercicio20_LiquidacionDeHaberes;

import java.time.LocalDate;

public abstract class contrato {
	private LocalDate fechaDeInicio;

	public contrato(LocalDate fechaDeInicio) {
		super();
		this.fechaDeInicio = fechaDeInicio;
	}

	public LocalDate getFechaDeInicio() {
		return fechaDeInicio;
	}
	
	public abstract double calcularMonto();
	
	public abstract int ObtenerDuracion();
	
	public abstract boolean esVigente();
}
