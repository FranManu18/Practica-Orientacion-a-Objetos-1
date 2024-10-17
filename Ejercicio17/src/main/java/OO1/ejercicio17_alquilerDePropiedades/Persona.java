package OO1.ejercicio17_alquilerDePropiedades;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Persona {
	private String nombre;
	private String direccion;
	private int DNI;
	private List<Propiedad>propiedades;
	
	public Persona(String nombre, String direccion, int DNI) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.DNI = DNI;
		this.propiedades = new LinkedList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getDNI() {
		return DNI;
	}

	public List<Propiedad> getPropiedades() {
		return propiedades;
	}
	
	public void agregarPropiedad(Propiedad propiedad) {
		propiedades.add(propiedad);
	}
	
	public double precioTotal(LocalDate fechaInicial,LocalDate fechaFinal) {
		double valor=propiedades.stream()
				.mapToDouble(propiedad->propiedad.precioTotal(fechaInicial, fechaFinal))
				.sum();
		return valor*0.75;
	}
	
}
