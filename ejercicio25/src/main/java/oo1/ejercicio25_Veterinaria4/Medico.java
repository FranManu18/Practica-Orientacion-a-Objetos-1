package oo1.ejercicio25_Veterinaria4;

import java.time.LocalDate;
import java.time.Period;

public class Medico {
	private String nombre;
	private LocalDate fechaDeIngreso;
	private double honorarios;
	
	public Medico(String nombre, LocalDate fechaDeIngreso, double honorarios) {
		super();
		this.nombre = nombre;
		this.fechaDeIngreso = fechaDeIngreso;
		this.honorarios = honorarios;
	}

	public double getHonorarios() {
		return honorarios;
	}
	
	public int getAntiguedad() {
		return Period.between(fechaDeIngreso, LocalDate.now()).getYears();
	}
}
