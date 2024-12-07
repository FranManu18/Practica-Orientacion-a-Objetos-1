package oo1.parcial3_Eventos;

import java.time.LocalDate;

public class Virtual extends Evento {
	private double precioEnvio;

	public Virtual(String nombre, LocalDate fecha, String tema, double precio, double precioRemera,
			double precioEnvio) {
		super(nombre, fecha, tema, precio, precioRemera);
		this.precioEnvio = precioEnvio;
	}

	public double getPrecioEnvio() {
		return precioEnvio;
	}

	public void setPrecioEnvio(double precioEnvio) {
		this.precioEnvio = precioEnvio;
	}
	
	@Override
	public double calcularPrecioDeAsistencia(LocalDate fechaConsulta) {
		return super.calcularPrecioDeAsistencia(fechaConsulta)+precioEnvio;
	}
}
