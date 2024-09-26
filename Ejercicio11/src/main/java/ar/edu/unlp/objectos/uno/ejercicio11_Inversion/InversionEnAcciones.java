package main.java.ar.edu.unlp.objectos.uno.ejercicio11_Inversion;

public class InversionEnAcciones implements Inversion{
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	public InversionEnAcciones(String nombre, int cantidad, double valorUnitario) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public String getNombre() {
		return nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	
	public void agregarCantidad(int cantidad) {
		this.cantidad+=cantidad;
	}
	
	@Override
	public double valorActual() {
		return this.cantidad*this.valorUnitario;
	}
}
