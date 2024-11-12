package OO1.parcial2_Veterinaria;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Mascota {
	private String nombre;
	private LocalDate nacimiento;
	private String especie;
	private List<Servicio>servicios;
	public Mascota(String nombre, LocalDate nacimiento, String especie) {
		super();
		this.nombre = nombre;
		this.nacimiento = nacimiento;
		this.especie = especie;
		this.servicios=new LinkedList();
	}
	public String getNombre() {
		return nombre;
	}
	public LocalDate getNacimiento() {
		return nacimiento;
	}
	public String getEspecie() {
		return especie;
	}
	public List<Servicio> getServicios() {
		return servicios;
	}

	public void agregarServicio(Servicio servicio) {
		servicios.add(servicio);
	}
	
	public double recaudacionDeServicios(LocalDate fecha) {
		return servicios.stream()
				.filter(servicio->servicio.getFecha().equals(fecha))
				.mapToDouble(servicio->servicio.costo())
				.sum();
	}
}
