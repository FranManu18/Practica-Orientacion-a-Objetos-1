package oo1.ejercicio25_Veterinaria4;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class Servicio {
	private Mascota mascota;
	private LocalDate fecha;
	
	public Servicio(Mascota mascota, LocalDate fecha) {
		super();
		this.mascota = mascota;
		this.fecha = fecha;
	}
	
	public Mascota getMascota() {
		return mascota;
	}


	public LocalDate getFecha() {
		return fecha;
	}

	public double sumarPorDomingo(double valor) {
		if(fecha.getDayOfWeek()==DayOfWeek.SUNDAY) {
			return valor+200;
		}
		return valor;
	}
	
	public abstract double costo();
	
}
