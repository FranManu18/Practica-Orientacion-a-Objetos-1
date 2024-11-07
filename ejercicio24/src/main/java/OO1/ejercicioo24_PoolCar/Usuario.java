package OO1.ejercicioo24_PoolCar;

public abstract class Usuario {
	private String nombre;
	private double saldo;
	
	public Usuario(String nombre, double saldo) {
		this.nombre = nombre;
		this.saldo = saldo;
	}


	public double getSaldo() {
		return saldo;
	}

	public String getNombre() {
		return nombre;
	}
	

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract void restarSaldo(double monto);

	
	public abstract void cargarSaldo(double monto);
}
