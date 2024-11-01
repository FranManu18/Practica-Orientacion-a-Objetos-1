package OO1.ejercicio22_ClientesDeCorreoAct;

public class Archivo {
	private String nombre;

	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	
	public int tamaño() {
		return this.nombre.length();
	}
	
	public String getNombre() {
		return nombre;
	}
}
