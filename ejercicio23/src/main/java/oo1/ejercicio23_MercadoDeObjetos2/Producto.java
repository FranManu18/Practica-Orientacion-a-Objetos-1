package oo1.ejercicio23_MercadoDeObjetos2;

public class Producto {
	private String nombre;
	private String categoria;
	private double precio;
	private int unidades;
	
	public Producto(String nombre, String categoria, double precio, int unidades) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.unidades = unidades;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
	public boolean hayUnidades(int cantidad) {
		if((unidades-cantidad)>=0) {
			return true;
		}
		return false;
	}
	
	public boolean descontarUnidades(int cantidad) {
		if(hayUnidades(cantidad)) {
			unidades=unidades-cantidad;
			return true;
		}
		return false;
	}
}
