package oo1.ejercicio24_PooolCar2;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;


public abstract class Usuario {
	private String nombre;
	private double saldo;
	private List<Viaje>viajes;
	
	public Usuario(String nombre, double saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.viajes = new LinkedList();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public List<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}
	
	public boolean saldoEnRojo() {
		if(saldo<0) {
			return true;
		}
		return false;
	}
	
	public void sumarViaje(Viaje viaje) {
		viajes.add(viaje);
	}
	
	public Viaje darDeAltaViaje(String origen,String destino,double costo,Vehiculo auto,LocalDate fecha) {
		Viaje viaje=new Viaje(origen,destino,costo,auto,fecha);
		return viaje;
	}
	
	public abstract void restarSaldo(double valor);
	public abstract void cargarSaldo(double valor);
}
