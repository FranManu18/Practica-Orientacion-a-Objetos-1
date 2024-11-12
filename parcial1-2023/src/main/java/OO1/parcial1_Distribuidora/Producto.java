package OO1.parcial1_Distribuidora;

public abstract class Producto {
	private String nombre;
	private double costoUnitario;
	private String descripcion;
	
	public Producto(String nombre, double costoUnitario, String descripcion) {
		this.nombre = nombre;
		this.costoUnitario = costoUnitario;
		this.descripcion = descripcion;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public double getCostoUnitario() {
		return costoUnitario;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public abstract double Impuesto(int unidades);
}
