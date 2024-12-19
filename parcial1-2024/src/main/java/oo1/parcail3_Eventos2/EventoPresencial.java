package oo1.parcail3_Eventos2;

import java.time.LocalDate;
import java.util.List;

public class EventoPresencial extends Evento {
	private List<Sede>sedes;

	public EventoPresencial(String nombre, LocalDate fecha, String tema, double precioInscripcion, double precioRemera,
			List<Sede> sedes) {
		super(nombre, fecha, tema, precioInscripcion, precioRemera);
		this.sedes = sedes;
	}
	
	public void agregarSede(Sede sede) {
		sedes.add(sede);
	}
	
	public double totalDeEstadias() {
		return sedes.stream()
				.mapToDouble(sede->sede.precioTotal())
				.sum();
	}
	
	@Override
	public double precioDeAsistencia(LocalDate consulta) {
		return super.precioDeAsistencia(consulta)+totalDeEstadias();
	}
}
