package OO1.ejercicio19_SistemaDeEnvioDePaquetes;

import java.time.LocalDate;

public class envioInternacional extends envio {
	private LocalDate fecha;
	private String origen;
	private String destino;
	private double peso;
	
	public envioInternacional(LocalDate fecha, String origen, String destino, double peso) {
		super(fecha, origen, destino, peso);
	}
	
	@Override
	public double calcularCosto() {
		double costo=5000;
		double peso=super.getPeso();
		if(peso<=1000) {
			costo+=peso*10;
		}else {
			costo+=peso*12;
		}
		return costo;
	}
}
