package OO1.ejercicio23_MercadoDeObjetos;

public class Producto {
	private String categoria;
	private double precio;
	private int unidades;
	
	public Producto(String categoria, double precio, int unidades) {
		this.categoria = categoria;
		this.precio = precio;
		this.unidades = unidades;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public String getCategoria() {
		return categoria;
	}

	public double getPrecio() {
		return precio;
	}
	
	
}
