package OO1.ejercicio18_politiciasDeCancelacion;

import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import OO1.ejercicio14_IntervaloDeTiempo.DateLapse;





public class Propiedad {
	private String direccion;
	private String nombre;
	private Double precio;
	private List<Reserva> reservas;
	private politicaDeCancelacion politicaDeCancelacion;

	public Propiedad(String direccion, String nombre, Double precio,politicaDeCancelacion politicaDeCancelacion) {
		super();
		this.direccion = direccion;
		this.nombre = nombre;
		this.precio = precio;
		this.reservas=new LinkedList<>();
		this.politicaDeCancelacion = politicaDeCancelacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}
	

	public politicaDeCancelacion getPoliticaDeCancelacion() {
		return politicaDeCancelacion;
	}

	public void setPoliticaDeCancelacion(politicaDeCancelacion politicaDeCancelacion) {
		this.politicaDeCancelacion = politicaDeCancelacion;
	}

	public boolean consultarDisponibilidad(LocalDate fechaInicial,LocalDate fechaFinal) {
		DateLapse date=new DateLapse(fechaInicial,fechaFinal);
		for(Reserva reserva:reservas) {
			if(new DateLapse(reserva.getFechaInicial(),reserva.getFechaFinal()).overlaps(date)){
				return false;
			}
		}
		return true;		
	}
	
	public boolean crearReserva(LocalDate fechaInicial,LocalDate fechaFinal) {			
			if(consultarDisponibilidad(fechaInicial,fechaFinal)) {
				Reserva x=new Reserva(fechaInicial,fechaFinal,this);
				reservas.add(x);
				return true;
			}
			return false;
	}
	
	public double cancelarReserva(Reserva reserva,LocalDate fechaDeCancelacion) {
	    Reserva reservaBuscada = reservas.stream()
	        .filter(r -> r.getFechaInicial().equals(reserva.getFechaInicial()) 
	                  && r.getFechaFinal().equals(reserva.getFechaFinal())
	                  && r.getPropiedadReservada().getDireccion().equals(reserva.getPropiedadReservada().getDireccion()))
	        .findFirst()
	        .orElse(null);

	    if (reservaBuscada != null) {
	        if (fechaDeCancelacion.isAfter(reservaBuscada.getFechaInicial()) && fechaDeCancelacion.isBefore(reservaBuscada.getFechaFinal())) {
	        	throw new IllegalArgumentException("No se puede cancelar la reserva después de la fecha de inicio.");
	        } else {
	        	double reembolso=this.politicaDeCancelacion.calcularReembolso(reserva, fechaDeCancelacion);
	            reservas.remove(reservaBuscada); 
	            return reembolso;
	        }
	    }
	    throw new IllegalArgumentException("Reserva no encontrada.");
	}
	
	
	public double precioTotal(LocalDate fechaInicial,LocalDate fechaFinal) {
		List<Reserva>reservasSeleccionadas=reservas.stream()
				.filter(reserva -> !fechaFinal.isBefore(reserva.getFechaInicial()) && !fechaInicial.isAfter(reserva.getFechaFinal()))
			    .collect(Collectors.toList());
		return reservasSeleccionadas.stream()
				.mapToDouble(reserva->reserva.valorReserva())
				.sum();
	}
}
