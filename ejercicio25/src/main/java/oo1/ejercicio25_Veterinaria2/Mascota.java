package oo1.ejercicio25_Veterinaria2;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Mascota {
	private String nombre;
	private LocalDate fechaNacimiento;
	private String especie;
	private List<ServicioMedico>servicios;
	
	public Mascota(String nombre, LocalDate fechaNacimiento, String especie) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.especie = especie;
		this.servicios = new LinkedList();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public List<ServicioMedico> getServicios() {
		return servicios;
	}

	public void setServicios(List<ServicioMedico> servicios) {
		this.servicios = servicios;
	}

	public consultaMedica crearConsultaMedica(Medico medico) {
		consultaMedica consulta=new consultaMedica(this,LocalDate.now(),medico);
		servicios.add(consulta);
		return consulta;
	}
	
	public Vacunacion crearVacunacion(Medico medico,String vacuna,double costo) {
		Vacunacion vacunacion=new Vacunacion(this,LocalDate.now(),medico,vacuna,costo);
		servicios.add(vacunacion);
		return vacunacion;
	}
	
	public Guarderia crearGuarderia(int cantDias) {
		Guarderia guarderia=new Guarderia(this,LocalDate.now(),cantDias);
		servicios.add(guarderia);
		return guarderia;
	}
	
	public double recaudacion(LocalDate fecha) {
		return servicios.stream()
				.filter(servicio->servicio.getFecha().equals(fecha))
				.mapToDouble(servicio->servicio.calcularCosto())
				.sum();
	}
}
