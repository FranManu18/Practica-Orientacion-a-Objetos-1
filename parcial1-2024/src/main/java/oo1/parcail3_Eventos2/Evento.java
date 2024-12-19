package oo1.parcail3_Eventos2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Evento {
	private String nombre;
	private LocalDate fecha;
	private String tema;
	private double precioInscripcion;
	private double precioRemera;
	
	public Evento(String nombre, LocalDate fecha, String tema, double precioInscripcion, double precioRemera) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.tema = tema;
		this.precioInscripcion = precioInscripcion;
		this.precioRemera = precioRemera;
	}
	
	public double recargo(LocalDate consulta){
		if(consulta.equals(fecha)) {
			return precioInscripcion+precioInscripcion*0.2;
		}
		return precioInscripcion;
	}
	
	public double precioDeAsistencia(LocalDate consulta) {
		return recargo(consulta)+precioRemera;
	}
	
	public double montoARecuperar(LocalDate consulta,boolean reembolso) {
		int diferencia=Period.between(consulta, fecha).getDays();
		if(diferencia>=30) {
			return precioDeAsistencia(LocalDate.now())*0.5+tieneReembolso(LocalDate.now(),reembolso);
		}
		return tieneReembolso(LocalDate.now(),reembolso);
	}
	
	public double tieneReembolso(LocalDate consulta,boolean reembolso) {
		if(reembolso) {
			return precioDeAsistencia(consulta)*0.15;
		}
		return 0;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
}
