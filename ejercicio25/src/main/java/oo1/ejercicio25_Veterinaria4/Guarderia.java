package oo1.ejercicio25_Veterinaria4;

import java.time.LocalDate;

public class Guarderia extends Servicio {
	private int cantDias;

	public Guarderia(Mascota mascota, LocalDate fecha, int cantDias) {
		super(mascota, fecha);
		this.cantDias = cantDias;
	}
	
	public double hacerDescuento(double valor) {
		if(getMascota().Uso5Servicios()) {
			return valor-valor*0.1;
		}
		return valor;
	}
	
	@Override
	public double costo() {
		return hacerDescuento(500*cantDias);
	}
}
