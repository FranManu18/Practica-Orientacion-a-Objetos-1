package main.java.ar.edu.unlp.objectos.uno.ejercicio11_Inversion;

import java.time.LocalDate;

public class PlazoFijo implements Inversion {
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		super();
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}

	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}

	public void setPorcentajeDeInteresDiario(double porcentajeDeInteresDiario) {
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}

	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}

	public double getMontoDepositado() {
		return montoDepositado;
	}
	                                    
	public void agregarMonto(double monto) {
		this.montoDepositado+=monto;
	}
	
	@Override
	public double valorActual() {
		LocalDate fechaActual=LocalDate.now();
		long diasTranscurridos= java.time.temporal.ChronoUnit.DAYS.between(fechaDeConstitucion, fechaActual);
		double interesAcumulado=montoDepositado * (this.porcentajeDeInteresDiario/100)*diasTranscurridos;
		return this.montoDepositado + interesAcumulado; 
	}
}
