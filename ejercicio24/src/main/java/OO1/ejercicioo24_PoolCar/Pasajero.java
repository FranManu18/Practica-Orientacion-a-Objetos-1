package OO1.ejercicioo24_PoolCar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.List;


public class Pasajero extends Usuario{
	private List<Viaje>viajes;
	
	
	
	public Pasajero(String nombre, double saldo) {
		super(nombre, saldo);
		this.viajes = new LinkedList();
	}
	
	public List<Viaje> getViajes() {
		return viajes;
	}

	public void agregarViaje(Viaje viaje) {
		this.viajes.add(viaje);
	}
	
	@Override
	public void restarSaldo(double monto) {
		if(!viajes.isEmpty()) {
			this.setSaldo(this.getSaldo()+500);
		}
		this.setSaldo(this.getSaldo()-monto);
	}

	public boolean RegistrarseEnViaje(Viaje viaje) {
		long diferencia=(int)ChronoUnit.DAYS.between(viaje.getFecha(),LocalDate.now());
		if(viaje.hayEspacio() && diferencia>=2 && getSaldo()>=0) {
			viaje.añadirPasajero(this);
			return true;
		}
		return false;
	}
	
	@Override
	public void cargarSaldo(double monto) {
		boolean realizoViaje=viajes.stream()
		.anyMatch(viaje->(int)ChronoUnit.DAYS.between(LocalDate.now(),viaje.getFecha())<=30);
		if(!realizoViaje) {
			monto=monto-monto*0.10;
		}
		this.setSaldo(this.getSaldo()+monto);
	}
	
}
