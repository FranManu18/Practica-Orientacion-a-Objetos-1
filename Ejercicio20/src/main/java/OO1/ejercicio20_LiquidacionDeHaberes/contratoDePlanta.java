package OO1.ejercicio20_LiquidacionDeHaberes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class contratoDePlanta extends contrato {
	private double sueldoMensual;
	private double montoPorConyugue;
	private double montoPorHijos;
	
	public contratoDePlanta(LocalDate fechaDeInicio, double sueldoMensual, double montoPorConyugue,double montoPorHijos) {
		super(fechaDeInicio);
		this.sueldoMensual = sueldoMensual;
		this.montoPorConyugue = montoPorConyugue;
		this.montoPorHijos = montoPorHijos;
	}

	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public double getMontoPorConyugue() {
		return montoPorConyugue;
	}

	public double getMontoPorHijos() {
		return montoPorHijos;
	}
	
	@Override
	public int ObtenerDuracion() {
		return (int)ChronoUnit.MONTHS.between(super.getFechaDeInicio(), LocalDate.now());
	}
	
	@Override
	public double calcularMonto() {
		return sueldoMensual+montoPorConyugue+montoPorHijos;
	}
	
	@Override
	public boolean esVigente() {
		return true;
	}
}
