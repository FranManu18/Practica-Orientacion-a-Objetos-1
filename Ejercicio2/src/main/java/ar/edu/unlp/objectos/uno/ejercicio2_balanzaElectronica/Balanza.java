package ar.edu.unlp.objectos.uno.ejercicio2_balanzaElectronica;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza() {
		this.cantidadDeProductos = cantidadDeProductos;
		this.precioTotal = precioTotal;
		this.pesoTotal = pesoTotal;
	}
	
	public double getPesoTotal() {
		return pesoTotal;
	}
	
	public double getPrecioTotal() {
		return precioTotal;
	}
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	

	public Balanza(int cantidadDeProductos, double precioTotal, double pesoTotal) {
		super();
		this.cantidadDeProductos = cantidadDeProductos;
		this.precioTotal = precioTotal;
		this.pesoTotal = pesoTotal;
	}

	public void ponerEnCero() {
		this.cantidadDeProductos=0;
		this.precioTotal=0;
		this.pesoTotal=0;
	}

	public void agregarProducto(Producto producto) {
		this.precioTotal+=producto.getPrecio();
		this.pesoTotal+=producto.getPeso();
		this.cantidadDeProductos++;
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.cantidadDeProductos,this.precioTotal,this.pesoTotal);
	}
	
	
}
