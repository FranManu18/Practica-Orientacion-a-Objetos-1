package OO1.ejercicioo24_PoolCar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Conductor extends Usuario {
	private Vehiculo auto;

	public Conductor(String nombre, double saldo, Vehiculo auto) {
		super(nombre, saldo);
		this.auto = auto;
	}

	public Vehiculo getAuto() {
		return auto;
	}
	
	@Override
	public void restarSaldo(double monto) {
		monto=monto-this.auto.getValor()*0.001;
		this.setSaldo(this.getSaldo()-monto);
	}
	
	@Override
	public void cargarSaldo(double monto) {
		int diferencia=LocalDate.now().getYear()-this.auto.getAnioDeFabricacion();
		if(diferencia<5) {
			monto=monto-monto*0.01;
		}else {
			monto=monto-monto*0.1;
		}
		this.setSaldo(this.getSaldo()+monto);
	}
}
