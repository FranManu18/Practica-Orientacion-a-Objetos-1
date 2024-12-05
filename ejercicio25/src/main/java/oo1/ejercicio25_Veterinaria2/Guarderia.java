package oo1.ejercicio25_Veterinaria2;

import java.time.LocalDate;

public class Guarderia extends ServicioMedico {
	private int cantDias;


	public Guarderia(Mascota mascota, LocalDate fecha, int cantDias) {
		super(mascota, fecha);
		this.cantDias = cantDias;
	}

	public int getCantDias() {
		return cantDias;
	}

	public void setCantDias(int cantDias) {
		this.cantDias = cantDias;
	}
	
	@Override
	public double calcularCosto() {
		if(super.getMascota().getServicios().size()>=5) {
			return 500-500*0.1;
		}
		return 500;
		
	}
}
