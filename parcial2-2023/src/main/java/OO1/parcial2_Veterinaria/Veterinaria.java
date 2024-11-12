package OO1.parcial2_Veterinaria;

import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedList;
import java.util.List;

public class Veterinaria {
	private List<Mascota>mascotas;
	private List<Medico>medicos;
	
	public Veterinaria() {
		this.mascotas=new LinkedList();
		this.medicos=new LinkedList();
	}

	public List<Mascota> getMascotas() {
		return mascotas;
	}

	public List<Medico> getMedicos() {
		return medicos;
	}
	
	public Medico registrarMedico(String nombre,LocalDate fechaDeIngreso,double honorarios) {
		Medico medico=new Medico(nombre,fechaDeIngreso,honorarios);
		medicos.add(medico);
		return medico;
	}
	
	public Mascota registrarMascota(String nombre,LocalDate nacimiento,String especie) {
		Mascota mascota=new Mascota(nombre,nacimiento,especie);
		mascotas.add(mascota);
		return mascota;
	}
	
	public ConsultaMedica registrarConsultaMedica(Medico medico,Mascota mascota) {
		ConsultaMedica consulta=new ConsultaMedica(mascota,medico);
		mascota.agregarServicio(consulta);
		return consulta;
	}
	
	public Vacunacion registrarVacunacion(Medico medico,Mascota mascota,String vacuna,double costo) {
		Vacunacion vacunacion=new Vacunacion(mascota,medico,vacuna,costo);
		mascota.agregarServicio(vacunacion);
		return vacunacion;
	}
	
	public Guarderia registrarGuaraderia(Mascota mascota,int dias) {
		Guarderia guarderia=new Guarderia(mascota,dias);
		mascota.agregarServicio(guarderia);
		return guarderia;
	}
	
	public double recaudacionDeCachorros(LocalDate fecha) {
		return mascotas.stream()
				.filter(mascota->Period.between(mascota.getNacimiento(), LocalDate.now()).getYears()< 2)
				.mapToDouble(mascota->mascota.recaudacionDeServicios(fecha))
				.sum();
	}
	
	
}
