package ar.edu.unlp.objectos.uno.ejercicio4_balanzaMejorada;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private List<Producto>productos;
	
	public Balanza() {
		this.productos=new ArrayList<Producto>();
	}
	
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	

	public void ponerEnCero() {
		this.productos.clear();
	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public double getPesoTotal() {
		return this.productos.stream()
				.mapToDouble(producto->producto.getPeso())
				.sum();
	}
	
	public double getPrecioTotal() {
		return this.productos.stream()
				.mapToDouble(producto->producto.getPrecio())
				.sum();
	}
	public Ticket emitirTicket() {
		return new Ticket(this.getProductos());
	}
	
	public List<Producto> getProductos(){
		return this.productos;
	}
}
