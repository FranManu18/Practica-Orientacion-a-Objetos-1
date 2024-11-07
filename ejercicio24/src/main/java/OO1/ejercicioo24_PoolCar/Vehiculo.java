package OO1.ejercicioo24_PoolCar;

public class Vehiculo {
	private Conductor dueño;
	private String descripcion;
	private int capacidad;
	private int anioDeFabricacion;
	private double valor;
	
	public Vehiculo(Conductor dueño, String descripcion, int capacidad, int anioDeFabricacion, double valor) {
		this.dueño = dueño;
		this.descripcion = descripcion;
		this.capacidad = capacidad;
		this.anioDeFabricacion = anioDeFabricacion;
		this.valor = valor;
	}

	public Conductor getDueño() {
		return dueño;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getAnioDeFabricacion() {
		return anioDeFabricacion;
	}

	public double getValor() {
		return valor;
	}
	
	
}
