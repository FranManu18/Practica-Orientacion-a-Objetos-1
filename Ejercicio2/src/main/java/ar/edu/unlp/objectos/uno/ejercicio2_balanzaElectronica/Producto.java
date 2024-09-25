package ar.edu.unlp.objectos.uno.ejercicio2_balanzaElectronica;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public Producto() {
		this.peso = peso;
		this.precioPorKilo = precioPorKilo;
		this.descripcion = descripcion;
	}
	
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
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public double getPrecioPorKilo() {
		return precioPorKilo;
	}
	
}
