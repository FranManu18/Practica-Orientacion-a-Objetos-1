package oo1.ejercicio24_PooolCar2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;


public class Conductor extends Usuario {
	private Vehiculo auto;

	public Conductor(String nombre, double saldo, Vehiculo auto) {
		super(nombre, saldo);
		this.auto = auto;
	}

	public Vehiculo getAuto() {
		return auto;
	}

	public void setAuto(Vehiculo auto) {
		this.auto = auto;
	}
	
	@Override
	public void restarSaldo(double valor) {
		valor=valor-auto.getValor()*0.01;
		super.setSaldo(getSaldo()-valor);
	}
	
	@Override
	public void cargarSaldo(double valor) {
		int antiguedad=LocalDate.now().getYear()-auto.getFabricacion();
		if(antiguedad<5) {
			valor=valor-valor*0.01;
			super.setSaldo(getSaldo()+valor);
		}else {
			valor=valor-valor*0.1;
			super.setSaldo(getSaldo()+valor);
		}
	}
}
