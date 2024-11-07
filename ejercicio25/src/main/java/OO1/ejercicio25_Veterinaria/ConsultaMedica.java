package OO1.ejercicio25_Veterinaria;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ConsultaMedica extends ServicioMedico {
	private Medico medico;
	private LocalDate fechaDeAtencion;
	
	public ConsultaMedica(Mascota mascota, Medico medico, LocalDate fechaDeAtencion) {
		super(mascota);
		this.medico = medico;
		this.fechaDeAtencion = fechaDeAtencion;
	}

	public Medico getMedico() {
		return medico;
	}
	
	@Override
	public LocalDate getFechaDeInicio() {
		return fechaDeAtencion;
	}
	
	@Override
	public double calcularCosto() {
		double costo=medico.getHonorarios()+200;
		if(fechaDeAtencion.getDayOfWeek()==DayOfWeek.SUNDAY) {
			costo+=300;
		}
		long antiguedad=(int)ChronoUnit.YEARS.between(medico.getFechaDeIngreso(),LocalDate.now());
		costo+=antiguedad*100;
		return costo;
	}
}
