package OO1.ejercicio25_Veterinaria;

import java.time.LocalDate;

public abstract class ServicioMedico {
	private Mascota mascota;

	public ServicioMedico(Mascota mascota) {
		super();
		this.mascota = mascota;
	}

	public Mascota getMascota() {
		return mascota;
	}
	
	public abstract LocalDate getFechaDeInicio();
	
	public abstract double calcularCosto();
}
