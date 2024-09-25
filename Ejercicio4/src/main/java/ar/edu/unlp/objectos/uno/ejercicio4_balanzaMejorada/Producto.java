package ar.edu.unlp.objectos.uno.ejercicio4_balanzaMejorada;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getPrecio() {
		return this.precioPorKilo * this.peso;
	}
	
	
	public double getPeso() {
		return peso;
	}
	
	public double getPrecioPorKilo() {
		return precioPorKilo;
	}
	
}
