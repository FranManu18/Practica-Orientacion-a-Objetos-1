package ar.edu.unlp.objectos.uno.ejercicio2_balanzaElectronica;
import java.time.LocalDate;

public class Ticket {
	
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private double impuesto;
	
	public Ticket( int cantidadDeProductos, double precioTotal, double pesoTotal) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cantidadDeProductos;
		this.precioTotal = precioTotal;
		this.pesoTotal = pesoTotal;
		this.impuesto=this.precioTotal*0.21;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public double getImpuesto() {
		return impuesto;
	}
	
	public double getPesoTotal() {
		return pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	
	
	
	
	
}
