package OO1.ejercicio25_Veterinaria;

import java.time.LocalDate;

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

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public double getHonorarios() {
		return honorarios;
	}
	
	public ConsultaMedica DarDeAltaConsulta(Mascota mascota) {
		return new ConsultaMedica(mascota,this,LocalDate.now());
	}
	
	public Vacunacion DarDeAltaVacunacion(Mascota mascota,String vacuna,double costo) {
		return new Vacunacion(mascota,this,vacuna,costo,LocalDate.now());
	}
	
	public Guarderia DarDeAltaGuarderia(Mascota mascota,int CantDias) {
		return new Guarderia(mascota,CantDias,LocalDate.now());
	}
}
