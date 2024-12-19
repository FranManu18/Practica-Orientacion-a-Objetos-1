package oo1.parcail3_Eventos2;

import java.time.LocalDate;

public class Entrada {
	private Evento evento;
	private boolean seguro;
	private LocalDate fechaDeCompra;
	
	public Entrada(Evento evento, boolean seguro, LocalDate fechaDeCompra) {
		super();
		this.evento = evento;
		this.seguro = seguro;
		this.fechaDeCompra = fechaDeCompra;
	}
	
	public double montoARecuperar() {
		return evento.montoARecuperar(fechaDeCompra, seguro);
	}
	
	public double montoTotal() {
		if(seguro) {		
			return evento.precioDeAsistencia(LocalDate.now())+500;
		}
		return evento.precioDeAsistencia(LocalDate.now());
	}
	
	public boolean entreFechas(LocalDate inicio,LocalDate fin) {
		return inicio.isBefore(fechaDeCompra) && fin.isAfter(fechaDeCompra);
	}
	
	public LocalDate fechaDeEvento() {
		return evento.getFecha();
	}
	
}
