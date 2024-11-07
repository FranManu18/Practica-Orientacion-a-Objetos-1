package OO1.ejercicio25_Veterinaria;

import java.time.LocalDate;

public class Guarderia extends ServicioMedico {
	private int CantDias;
	private LocalDate fechaDeInicio;


	public Guarderia(Mascota mascota, int cantDias, LocalDate fechaDeInicio) {
		super(mascota);
		CantDias = cantDias;
		this.fechaDeInicio = fechaDeInicio;
	}

	public int getCantDias() {
		return CantDias;
	}
	
	@Override
	public LocalDate getFechaDeInicio() {
		return this.fechaDeInicio;
	}
	
	@Override
	public double calcularCosto() {
		if(this.getMascota().getServiciosRecibidos().size()>=5) {
			return 500-500*0.1;
		}
		return 500;
	}
}
