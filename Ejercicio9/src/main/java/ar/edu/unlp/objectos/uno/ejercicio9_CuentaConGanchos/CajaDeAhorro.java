package ar.edu.unlp.objectos.uno.ejercicio9_CuentaConGanchos;

public class CajaDeAhorro extends Cuenta {
	 @Override
	    public boolean puedeExtraer(double monto) {
	        double montoTotal = monto + (monto * 0.02);
	        return this.getSaldo() >= montoTotal;
	    }

	    @Override
	    public boolean extraer(double monto) {
	        if (this.puedeExtraer(monto)) {
	            double montoTotal = monto + (monto * 0.02);
	            this.extraerSinControlar(montoTotal);
	            return true;
	        }
	        return false;
	    }

	    @Override
	    public void depositar(double monto) {
	        double montoTotal = monto - (monto * 0.02);
	        System.out.println("Resultado"+monto*0.02);
	        super.depositar(montoTotal);
	    }

	    @Override
	    public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
	        if (this.puedeExtraer(monto)) {
	        	double montoTotal = monto + (monto * 0.02);
	            this.extraerSinControlar(montoTotal);
	            cuentaDestino.depositar(monto);
	            return true;
	        }
	        return false;
	    }
}
