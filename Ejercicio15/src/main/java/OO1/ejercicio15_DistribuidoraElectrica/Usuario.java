package OO1.ejercicio15_DistribuidoraElectrica;

import java.time.LocalDate;
import java.util.List;

public class Usuario {
	private String nombre;
	private String domicilio;
	private List<Tarifa> tarifas;;
	

	public Usuario(String nombre, String domicilio, List<Tarifa> tarifas) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.tarifas = tarifas;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}
	
	public List<Tarifa> getTarifas(){
		return this.tarifas;
	}
	
	public void agregarTarifa(Tarifa tarifa) {
		tarifas.add(tarifa);
	}
	
	public String obtenerFactura() {
		String factura="Usuario: "+this.nombre+
				" Fecha de Emision: "+LocalDate.now()+" Con una bonificacion de: "+
				this.tarifas.get(this.tarifas.size()-1).getConsumoReactivo()+" y monto final: "+this.tarifas.get(this.tarifas.size()-1).calcularMontoFinal();
		return factura;
	}
	
	
}
