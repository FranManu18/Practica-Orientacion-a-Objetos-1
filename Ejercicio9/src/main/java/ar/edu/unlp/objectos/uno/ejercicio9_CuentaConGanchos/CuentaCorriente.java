package ar.edu.unlp.objectos.uno.ejercicio9_CuentaConGanchos;

public class CuentaCorriente extends Cuenta {
	private double limite;
		
	public CuentaCorriente() {
		this.limite = 0;
	}
	

	public double getLimite() {
		return limite;
	}



	public void setLimite(double limite) {
		this.limite = limite;
	}



	@Override
	public boolean puedeExtraer(double monto) {
		return this.getSaldo()-monto>=limite;
	}
	
	@Override
	public boolean extraer(double monto) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		}
		return false;
	}
}
