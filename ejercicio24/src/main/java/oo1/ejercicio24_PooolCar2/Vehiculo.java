package oo1.ejercicio24_PooolCar2;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Vehiculo {
	private Conductor dueño;
	private String descripcion;
	private int capacidad;
	private int fabricacion;
	private double valor;
	private List<Usuario>pasajeros;
	
	public Vehiculo(Conductor dueño, String descripcion, int capacidad, int fabricacion, double valor) {
		super();
		this.dueño = dueño;
		this.descripcion = descripcion;
		this.capacidad = capacidad;
		this.fabricacion = fabricacion;
		this.valor = valor;
		pasajeros=new LinkedList();
		pasajeros.add(dueño);
	}

	public Conductor getDueño() {
		return dueño;
	}

	public void setDueño(Conductor dueño) {
		this.dueño = dueño;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getFabricacion() {
		return fabricacion;
	}

	public void setFabricacion(int fabricacion) {
		this.fabricacion = fabricacion;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<Usuario> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(List<Usuario> pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	public boolean HayCapacidad() {
		if(pasajeros.size()==capacidad) {
			return false;
		}
		return true;
	}
	
	public void agregarAlAuto(Pasajero pasajero) {
		pasajeros.add(pasajero);
	}
	
	
}
