package OO1.ejercicio20_LiquidacionDeHaberes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class contratoPorHoras extends contrato {
	private LocalDate fechaDeFin;
	private double valorHora;
	private int horas;
	public contratoPorHoras(LocalDate fechaDeInicio, LocalDate fechaDeFin, double valorHora, int horas) {
		super(fechaDeInicio);
		this.fechaDeFin = fechaDeFin;
		this.valorHora = valorHora;
		this.horas = horas;
	}
	public LocalDate getFechaDeFin() {
		return fechaDeFin;
	}
	public double getValorHora() {
		return valorHora;
	}
	public int getHoras() {
		return horas;
	}
	
	public boolean esVigente() {
		return this.fechaDeFin.isAfter(LocalDate.now());
	}
	
	@Override
	public int ObtenerDuracion() {
		return (int)ChronoUnit.MONTHS.between(super.getFechaDeInicio(), fechaDeFin);
	}
	
	@Override
	public double calcularMonto() {
		return valorHora*horas;
	}
	
	
}
