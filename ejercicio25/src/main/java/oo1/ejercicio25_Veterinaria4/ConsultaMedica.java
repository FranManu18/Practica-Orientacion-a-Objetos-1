package oo1.ejercicio25_Veterinaria4;

import java.time.LocalDate;

public class ConsultaMedica extends ServicioConMedico {

	public ConsultaMedica(Mascota mascota, LocalDate fecha, Medico medico) {
		super(mascota, fecha, medico);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double costo() {
		return super.costo()+300+getMedico().getAntiguedad()*100;
	}
}
