package oo1.ejercicio25_Veterinaria2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMascota {
	private Mascota mascota;
	
	@BeforeEach
	void setUp() {
		mascota=new Mascota("Rufus",LocalDate.of(2020, 06, 12),"Salchicha");
	}
	
	@Test
	public void TestNuevaConsulta() {
		consultaMedica consulta=mascota.crearConsultaMedica(new Medico("Esteban",LocalDate.of(2021, 02,14),200));
		assertEquals(1,mascota.getServicios().size());
		assertEquals(mascota.getNombre(),consulta.getMascota().getNombre());
	}
	
	@Test
	public void TestNuevaVacunacion() {
		Vacunacion vacunacion=mascota.crearVacunacion(new Medico("Esteban",LocalDate.of(2021, 02,14),200),"Rabia",400);
		assertEquals(1,mascota.getServicios().size());
		assertEquals(mascota.getNombre(),vacunacion.getMascota().getNombre());
	}
	
	@Test
	public void TestNuevaGuarderia() {
		Guarderia guarderia=mascota.crearGuarderia(20);
		assertEquals(1,mascota.getServicios().size());
		assertEquals(mascota.getNombre(),guarderia.getMascota().getNombre());
	}
	
	@Test
	public void TestRecaudacion() {
		List<ServicioMedico>servicios=new LinkedList();
		servicios.add(new consultaMedica(mascota,LocalDate.of(2024, 10, 18),new Medico("Esteban",LocalDate.of(2021, 02,14),200)));
		servicios.add(new Vacunacion(mascota,LocalDate.of(2024, 10, 18),new Medico("Esteban",LocalDate.of(2021, 02,14),200),"Rabia",400));
		servicios.add(new Guarderia(mascota,LocalDate.of(2024, 10, 18),20));
		mascota.setServicios(servicios);
		assertEquals(2400,mascota.recaudacion(LocalDate.of(2024, 10, 18)));
	}
}
