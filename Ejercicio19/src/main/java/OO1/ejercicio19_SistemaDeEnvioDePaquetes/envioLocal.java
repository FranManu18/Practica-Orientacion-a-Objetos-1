package OO1.ejercicio19_SistemaDeEnvioDePaquetes;

import java.time.LocalDate;

public class envioLocal extends envio {
	private LocalDate fecha;
	private String origen;
	private String destino;
	private double peso;
	private int tipoDeEntrega;
	public envioLocal(LocalDate fecha, String origen, String destino, double peso, int tipoDeEntrega) {
		super(fecha, origen, destino, peso);
		this.tipoDeEntrega = tipoDeEntrega;
	}
	
	public String getTipoDeEntrega() {
		if(this.tipoDeEntrega==0) {
			return "Estandar";
		}else if(this.tipoDeEntrega==1) {
			return "Rapida";
		}
		return "Entrega invalida";
	}
	
	@Override
	public double calcularCosto() {
		double costo=1000;
		if(this.tipoDeEntrega==1) {
			costo+=500;
		}else if(this.getTipoDeEntrega().equals("Entrega invalida")) {
			return 0;
		}
		return costo;
	}
}
