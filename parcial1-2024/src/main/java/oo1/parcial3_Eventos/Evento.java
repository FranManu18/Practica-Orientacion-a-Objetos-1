package oo1.parcial3_Eventos;

import java.time.LocalDate;
import java.time.Period;

public abstract class Evento {
	private String nombre;
	private LocalDate fecha;
	private String tema;
	private double precio;
	private double precioRemera;
	
	public Evento(String nombre, LocalDate fecha, String tema, double precio, double precioRemera) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.tema = tema;
		this.precio = precio;
		this.precioRemera = precioRemera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPrecioRemera() {
		return precioRemera;
	}

	public void setPrecioRemera(double precioRemera) {
		this.precioRemera = precioRemera;
	}
	
	public double calcularPrecioDeAsistencia(LocalDate fechaConsulta) {
		return verificarRecargo(fechaConsulta)+precioRemera;
	}
	
	public double verificarRecargo(LocalDate fechaConsulta) {
		int dias=Period.between(fechaConsulta, fecha).getDays();
		if(dias==0) {
			return precio+precio*0.2;
		}else {
			return precio;
		}
	}
	
	public double montoARecuperar(LocalDate fechaCompra,LocalDate fechaConsulta) {
		int dias=Period.between(fechaCompra, fecha).getDays();
		if(dias>=30) {
			return calcularPrecioDeAsistencia(fechaConsulta)*0.5;
		}else {
			return 0;
		}
	}
}
