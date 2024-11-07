package OO1.ejercicio25_Veterinaria;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Mascota {
	private String nombre;
	private LocalDate fechaDeNacimiento;
	private String especie;
	private List<ServicioMedico>serviciosRecibidos;
	
	public Mascota(String nombre, LocalDate fechaDeNacimiento, String especie) {
		super();
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.especie = especie;
		this.serviciosRecibidos=new LinkedList();
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public String getEspecie() {
		return especie;
	}

	public List<ServicioMedico> getServiciosRecibidos() {
		return serviciosRecibidos;
	}
	
	public void agregarServicio(ServicioMedico servicio) {
		serviciosRecibidos.add(servicio);
	}
	
	public double costoTotalDeServicios(LocalDate fecha) {
		return serviciosRecibidos.stream()
				.filter(servicio->servicio.getFechaDeInicio().equals(fecha))
				.mapToDouble(servicio->servicio.calcularCosto())
				.sum();
	}
}
