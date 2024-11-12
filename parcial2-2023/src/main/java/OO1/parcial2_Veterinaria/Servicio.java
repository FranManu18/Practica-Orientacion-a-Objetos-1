package OO1.parcial2_Veterinaria;

import java.time.LocalDate;

public abstract class Servicio {
	private LocalDate fecha;
	private Mascota mascota;
	
	public Servicio(Mascota mascota) {
		super();
		this.fecha = LocalDate.now();
		this.mascota = mascota;
	}
	
	
	public LocalDate getFecha() {
		return fecha;
	}



	public Mascota getMascota() {
		return mascota;
	}

	

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public abstract double costo();
}
