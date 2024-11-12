package OO1.parcial2_Veterinaria;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Vacunacion extends Servicio {
	private Medico medico;
	private String vacuna;
	private double costoVacuna;
	
	public Vacunacion(Mascota mascota, Medico medico, String vacuna, double costoVacuna) {
		super(mascota);
		this.medico = medico;
		this.vacuna = vacuna;
		this.costoVacuna = costoVacuna;
	}

	public Medico getMedico() {
		return medico;
	}

	public String getVacuna() {
		return vacuna;
	}

	public double getCostoVacuna() {
		return costoVacuna;
	}
	
	@Override
	public double costo() {
		double suma=medico.getHonorarios()+500+costoVacuna;
		if(this.getFecha().getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			return suma+200;
		}
		return suma;
	}
}
