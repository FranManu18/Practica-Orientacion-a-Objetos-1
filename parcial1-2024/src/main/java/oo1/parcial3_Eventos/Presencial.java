package oo1.parcial3_Eventos;

import java.time.LocalDate;
import java.util.List;

public class Presencial extends Evento {
	private List<Sede>sedes;

	public Presencial(String nombre, LocalDate fecha, String tema, double precio, double precioRemera,
			List<Sede> sedes) {
		super(nombre, fecha, tema, precio, precioRemera);
		this.sedes = sedes;
	}

	public List<Sede> getSedes() {
		return sedes;
	}

	public void setSedes(List<Sede> sedes) {
		this.sedes = sedes;
	}
	
	public void agregarSede(Sede sede) {
		sedes.add(sede);
	}
	
	@Override
	public double calcularPrecioDeAsistencia(LocalDate fechaConsulta) {
		double monto=sedes.stream()
				.mapToDouble(sede->sede.precioTotal())
				.sum();
		return super.calcularPrecioDeAsistencia(fechaConsulta)+monto;
	}
}
