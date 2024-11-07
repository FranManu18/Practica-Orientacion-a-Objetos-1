package OO1.ejercicio25_Veterinaria;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Vacunacion extends ServicioMedico{
	private Medico medico;
	private String vacuna;
	private double costo;
	private LocalDate fechaDeVacunacion;
	

	public Vacunacion(Mascota mascota, Medico medico, String vacuna, double costo, LocalDate fechaDeVacunacion) {
		super(mascota);
		this.medico = medico;
		this.vacuna = vacuna;
		this.costo = costo;
		this.fechaDeVacunacion = fechaDeVacunacion;
	}

	public Medico getMedico() {
		return medico;
	}

	public String getVacuna() {
		return vacuna;
	}

	public double getCosto() {
		return costo;
	}
	
	@Override
	public LocalDate getFechaDeInicio() {
		return fechaDeVacunacion;
	}


	@Override
	public double calcularCosto() {
		double costo=medico.getHonorarios()+500+this.costo;
		if(fechaDeVacunacion.getDayOfWeek()==DayOfWeek.SUNDAY) {
			costo+=200;
		}
		return costo;
	}
	
	
}
