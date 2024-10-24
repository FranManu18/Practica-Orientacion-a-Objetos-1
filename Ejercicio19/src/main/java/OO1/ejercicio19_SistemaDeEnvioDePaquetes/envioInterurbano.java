package OO1.ejercicio19_SistemaDeEnvioDePaquetes;

import java.time.LocalDate;

public class envioInterurbano extends envio {
	private LocalDate fecha;
	private String origen;
	private String destino;
	private double peso;
	private int distancia;
	public envioInterurbano(LocalDate fecha, String origen, String destino, double peso, int distancia) {
		super(fecha, origen, destino, peso);
		this.distancia = distancia;
	}
	
	@Override
	public double calcularCosto() {
		double peso=super.getPeso();
		if(distancia<100) {
			return peso*20;
		}else if(distancia<=500 && distancia>=100) {
			return peso*25;
		}
		return peso*30;
	}
	
	
}
