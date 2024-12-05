package oo1.ejercicio24_PooolCar2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;



public class Pasajero extends Usuario {

	public Pasajero(String nombre, double saldo) {
		super(nombre, saldo);
	}
	
	public boolean registrarEnViaje(Viaje viaje) {
		if(viaje.getAuto().HayCapacidad() && viaje.registroPosible() && !super.saldoEnRojo()) {
			viaje.agregarAlViaje(this);
			super.sumarViaje(viaje);
			return true;
		}
		return false;
	}
	
	@Override
	public void restarSaldo(double valor) {
		if(!super.getViajes().isEmpty()) {
			super.setSaldo(super.getSaldo()-(valor-500));
		}else {
			super.setSaldo(super.getSaldo()-valor);
		}
	}
	
	@Override
	public void cargarSaldo(double valor) {
		boolean hizoUnViaje=super.getViajes().stream()
				.anyMatch(viaje->(int)ChronoUnit.DAYS.between(viaje.getFechaDeViaje(), LocalDate.now())<=30);
		if(!hizoUnViaje) {
			valor=valor-valor*0.1;
			super.setSaldo(getSaldo()+valor);
		}else {
			super.setSaldo(getSaldo()+valor);
		}
	}
}
