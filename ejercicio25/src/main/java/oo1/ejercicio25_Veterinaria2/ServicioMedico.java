package oo1.ejercicio25_Veterinaria2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class ServicioMedico {
	private Mascota mascota;
	private LocalDate fecha;

	public ServicioMedico(Mascota mascota, LocalDate fecha) {
		super();
		this.mascota = mascota;
		this.fecha = fecha;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double valorPorDomingo() {
		if(fecha.getDayOfWeek()==DayOfWeek.SUNDAY) {
			return 200;
		}
		return 0;
	}

	
	public abstract double calcularCosto();
}
