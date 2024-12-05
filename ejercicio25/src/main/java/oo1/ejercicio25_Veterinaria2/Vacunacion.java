package oo1.ejercicio25_Veterinaria2;

import java.time.LocalDate;

public class Vacunacion extends ServicioConMedico {
	private String vacuna;
	private double costo;
	

	public Vacunacion(Mascota mascota, LocalDate fecha, Medico medico, String vacuna, double costo) {
		super(mascota, fecha, medico);
		this.vacuna = vacuna;
		this.costo = costo;
	}

	public String getVacuna() {
		return vacuna;
	}

	public void setVacuna(String vacuna) {
		this.vacuna = vacuna;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	@Override
	public double calcularCosto() {
		return super.calcularCosto()+ 500+this.costo; 
	}
}
