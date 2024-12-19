package oo1.parcail3_Eventos2;

import java.time.LocalDate;

public class EventoVirtual extends Evento {
	private double montoEnvio;

	public EventoVirtual(String nombre, LocalDate fecha, String tema, double precioInscripcion, double precioRemera,
			double montoEnvio) {
		super(nombre, fecha, tema, precioInscripcion, precioRemera);
		this.montoEnvio = montoEnvio;
	}

	@Override
	public double precioDeAsistencia(LocalDate consulta) {
		return super.precioDeAsistencia(consulta)+montoEnvio;
	}
	
}
