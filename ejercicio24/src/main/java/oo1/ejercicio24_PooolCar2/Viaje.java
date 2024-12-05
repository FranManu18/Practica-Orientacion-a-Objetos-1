package oo1.ejercicio24_PooolCar2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.List;

public class Viaje {
	private String origen;
	private String destino;
	private double costoTotal;
	private Vehiculo auto;
	private LocalDate fechaDeViaje;
	private List<Usuario>pasajeros;
	
	public Viaje(String origen, String destino, double costoTotal, Vehiculo auto, LocalDate fechaDeViaje) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.costoTotal = costoTotal;
		this.auto = auto;
		this.fechaDeViaje = fechaDeViaje;
		pasajeros=new LinkedList();
		pasajeros.add(auto.getDueño());
		auto.getDueño().sumarViaje(this);
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getCostoTotal() {
		return costoTotal;
	}

	public void setCostoTotal(double costoTotal) {
		this.costoTotal = costoTotal;
	}

	public Vehiculo getAuto() {
		return auto;
	}

	public void setAuto(Vehiculo auto) {
		this.auto = auto;
	}

	public LocalDate getFechaDeViaje() {
		return fechaDeViaje;
	}

	public void setFechaDeViaje(LocalDate fechaDeViaje) {
		this.fechaDeViaje = fechaDeViaje;
	}
	
	
	public List<Usuario> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(List<Usuario> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public boolean registroPosible() {
		long diferencia=(int)ChronoUnit.DAYS.between(LocalDate.now(),fechaDeViaje);
		if(diferencia<=2) {
			return false;
		}
		return true;
	}
	
	public void agregarAlViaje(Pasajero pasajero) {
		pasajeros.add(pasajero);
		auto.agregarAlAuto(pasajero);
	}
	
	public void procesarViaje() {
		double div=costoTotal/pasajeros.size();
		pasajeros.forEach(pasajero->pasajero.restarSaldo(div));
	}
}
