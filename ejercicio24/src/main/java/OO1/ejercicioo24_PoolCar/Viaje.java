package OO1.ejercicioo24_PoolCar;

import java.time.LocalDate;
import java.util.List;

public class Viaje {
	private String origen;
	private String destino;
	private double costo;
	private Vehiculo vehiculo;
	private LocalDate fecha;
	private List<Usuario>pasajeros;
	private boolean procesado;
	
	public Viaje(String origen, String destino, double costo, Vehiculo vehiculo, LocalDate fecha,Conductor conductor) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.costo = costo;
		this.vehiculo = vehiculo;
		this.fecha = fecha;
		this.pasajeros.add(conductor);
		this.procesado=false;
	}

	public String getOrigen() {
		return origen;
	}

	public String getDestino() {
		return destino;
	}

	public double getCosto() {
		return costo;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public List<Usuario> getPasajeros() {
		return pasajeros;
	}

	public boolean isProcesado() {
		return procesado;
	}
	
	public boolean hayEspacio() {
		int espacio=vehiculo.getCapacidad()-this.getPasajeros().size();
		return espacio>0;
	}
	
	public void añadirPasajero(Pasajero pasajero) {
		pasajeros.add(pasajero);
	}
	
	public void procesarViaje() {
		if(!procesado) {
			double costoDividido=costo/pasajeros.size();
			pasajeros.forEach(pasajero->pasajero.restarSaldo(costoDividido));
		}
		
	}
}
