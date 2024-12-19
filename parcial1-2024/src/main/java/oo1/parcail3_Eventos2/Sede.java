package oo1.parcail3_Eventos2;

public class Sede {
	private String nombre;
	private double precioEstadia;
	private int cantDias;
	
	public Sede(String nombre, double precioEstadia, int cantDias) {
		super();
		this.nombre = nombre;
		this.precioEstadia = precioEstadia;
		this.cantDias = cantDias;
	}
	
	public double precioTotal() {
		return precioEstadia*cantDias;
	}
}
