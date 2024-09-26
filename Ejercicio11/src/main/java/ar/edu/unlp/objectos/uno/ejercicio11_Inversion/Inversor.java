package main.java.ar.edu.unlp.objectos.uno.ejercicio11_Inversion;
import java.util.List;
public class Inversor {
	private String nombre;
	private List<Inversion>inversiones;
	public Inversor(String nombre, List<Inversion> inversiones) {
		super();
		this.nombre = nombre;
		this.inversiones = inversiones;
	}
	public String getNombre() {
		return nombre;
	}
	public List<Inversion> getInversiones() {
		return inversiones;
	}
	
	public void newInversion(Inversion inversion) {
		inversiones.add(inversion);
	}
	
	public double valorCuenta() {
		return inversiones.stream()
				.mapToDouble(inversion->inversion.valorActual())
				.sum();
	}
}
