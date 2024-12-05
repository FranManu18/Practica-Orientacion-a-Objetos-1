package oo1.ejercicio25_Veterinaria2;

import java.time.LocalDate;

public class consultaMedica extends ServicioConMedico {




	public consultaMedica(Mascota mascota, LocalDate fecha, Medico medico) {
		super(mascota, fecha, medico);
	}
	
	@Override
	public double calcularCosto(){
		return super.calcularCosto()+300+this.getMedico().obtenerAños()*100;
	}

}
