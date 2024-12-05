package oo1.ejercicio25_Veterinaria2;

import java.time.LocalDate;

public abstract class ServicioConMedico extends ServicioMedico {
	private Medico medico;

	public ServicioConMedico(Mascota mascota, LocalDate fecha, Medico medico) {
		super(mascota, fecha);
		this.medico = medico;
	}
	
	
	
	public Medico getMedico() {
		return medico;
	}



	public void setMedico(Medico medico) {
		this.medico = medico;
	}



	@Override
	public double calcularCosto() {
		return medico.getHonorarios()+this.valorPorDomingo();
	}
	
	
}
