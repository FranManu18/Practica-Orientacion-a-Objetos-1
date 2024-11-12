package OO1.parcial2_Veterinaria;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;

public class ConsultaMedica extends Servicio {
	private Medico medico;

	public ConsultaMedica(Mascota mascota, Medico medico) {
		super(mascota);
		this.medico = medico;
	}

	public Medico getMedico() {
		return medico;
	}

	@Override
	public double costo() {
		int anios=Period.between(medico.getFechaIngreso(), LocalDate.now()).getYears();
		double suma=medico.getHonorarios()+(100*anios)+300;
		if(this.getFecha().getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			return suma+200;
		}
		return suma;
	}
	
	
}
