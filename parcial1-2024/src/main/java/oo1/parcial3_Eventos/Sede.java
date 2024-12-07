package oo1.parcial3_Eventos;

public class Sede {
	private String nombre;
	private double precio;
	private int dias;
	public Sede(String nombre, double precio, int dias) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.dias = dias;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	
	public double precioTotal() {
		return precio*dias;
	}
}
