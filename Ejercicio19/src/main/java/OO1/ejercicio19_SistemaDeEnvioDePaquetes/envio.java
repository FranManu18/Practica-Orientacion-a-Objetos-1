package OO1.ejercicio19_SistemaDeEnvioDePaquetes;

import java.time.LocalDate;

public abstract class envio {
	private LocalDate fecha;
	private String origen;
	private String destino;
	private double peso;
	
	public envio(LocalDate fecha, String origen, String destino, double peso) {
		super();
		this.fecha = fecha;
		this.origen = origen;
		this.destino = destino;
		this.peso = peso;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getOrigen() {
		return origen;
	}

	public String getDestino() {
		return destino;
	}

	public double getPeso() {
		return peso;
	}
	
	public abstract double calcularCosto();
}
