package oo1.ejercicio25_Veterinaria4;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Mascota {
	private String nombre;
	private LocalDate fechaDeNacimiento;
	private String especie;
	private List<Servicio> servicios;
	
	public Mascota(String nombre, LocalDate fechaDeNacimiento, String especie) {
		super();
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.especie = especie;
		this.servicios=new LinkedList();
	}
	
	public ConsultaMedica DarDeAltaConsultaMedica(Medico medico) {
		ConsultaMedica consulta=new ConsultaMedica(this,LocalDate.now(),medico);
		servicios.add(consulta);
		return consulta;
	}
	
	//
	public List<Servicio> getServicios() {
		return servicios;
	}
	
	//
	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}
	
	//
	public String getNombre() {
		return nombre;
	}

	public Vacunacion DarDeAltaVacunacion(Medico medico,String vacuna,double valor) {
		Vacunacion vacunacion=new Vacunacion(this,LocalDate.now(),medico,vacuna,valor);
		servicios.add(vacunacion);
		return vacunacion;
	}
	
	public Guarderia DarDeAltaGuarderia(int cantDias) {
		Guarderia guarderia=new Guarderia(this,LocalDate.now(),cantDias);
		servicios.add(guarderia);
		return guarderia;
	}
	
	public boolean Uso5Servicios() {
		return servicios.size()>=5;
	}
	
	public double montoRecaudado(LocalDate fecha) {
		return servicios.stream()
				.filter(servicio->servicio.getFecha().equals(fecha))
				.mapToDouble(servicio->servicio.costo())
				.sum();
	}
}
