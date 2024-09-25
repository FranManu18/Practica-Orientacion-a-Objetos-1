package ar.edu.unlp.objectos.uno.ejercicio3_Presupuesto;

public class Item {
	private String detalle;
	private Integer cantidad;
	private double costoUnitario;
	
	public Item(String detalle, Integer cantidad, double costoUnitario) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}


	public double getCostoUnitario() {
		return costoUnitario;
	}
	
	

	
	public double costo() {
		return this.costoUnitario*this.cantidad;
	}
}
