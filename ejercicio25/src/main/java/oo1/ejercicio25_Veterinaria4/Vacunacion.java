package oo1.ejercicio25_Veterinaria4;

import java.time.LocalDate;

public class Vacunacion extends ServicioConMedico {
	private String vacuna;
	private double valor;
	
	public Vacunacion(Mascota mascota, LocalDate fecha, Medico medico, String vacuna, double valor) {
		super(mascota, fecha, medico);
		this.vacuna = vacuna;
		this.valor = valor;
	}
	
	@Override
	public double costo() {
		return super.costo()+500+valor;
	}
}
