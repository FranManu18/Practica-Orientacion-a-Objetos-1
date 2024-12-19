package oo1.ejercicio25_Veterinaria4;

import java.time.LocalDate;

public abstract class ServicioConMedico extends Servicio {
	private Medico medico;

	public ServicioConMedico(Mascota mascota, LocalDate fecha, Medico medico) {
		super(mascota, fecha);
		this.medico = medico;
	}
	
	public Medico getMedico() {
		return medico;
	}


	@Override
	public double costo() {
		return sumarPorDomingo(medico.getHonorarios());
	}
}
