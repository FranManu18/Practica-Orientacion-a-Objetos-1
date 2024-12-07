package oo1.parcial3_Eventos;

import java.time.LocalDate;

public class Entrada {
	private Usuario dueño;
	private Evento evento;
	private boolean seguro;
	private LocalDate fechaDeCompra;
	
	public Entrada(Usuario dueño, Evento evento, boolean seguro, LocalDate fechaDeCompra) {
		super();
		this.dueño = dueño;
		this.evento = evento;
		this.seguro = seguro;
		this.fechaDeCompra = fechaDeCompra;
	}

	public Usuario getDueño() {
		return dueño;
	}

	public void setDueño(Usuario dueño) {
		this.dueño = dueño;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}

	public LocalDate getFechaDeCompra() {
		return fechaDeCompra;
	}

	public void setFechaDeCompra(LocalDate fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}
	
	public double precioAsistencia() {
		return evento.calcularPrecioDeAsistencia(LocalDate.now());
	}
	
	public double calcularMontoARecuperar() {
		double monto=evento.montoARecuperar(fechaDeCompra, LocalDate.now());
		if(seguro) {
			return monto+precioAsistencia()*0.15;
		}else {
			return monto;
		}
	}
	
	public boolean entreFechas(LocalDate inicio,LocalDate fin) {
		return inicio.isBefore(fechaDeCompra) && fin.isAfter(fechaDeCompra);
	}
}
