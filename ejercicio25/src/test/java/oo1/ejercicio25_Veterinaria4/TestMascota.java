package oo1.ejercicio25_Veterinaria4;

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
		ConsultaMedica consulta=mascota.DarDeAltaConsultaMedica(new Medico("Esteban",LocalDate.of(2021, 02,14),200));
		assertEquals(1,mascota.getServicios().size());
		assertEquals(mascota.getNombre(),consulta.getMascota().getNombre());
	}
	
	@Test
	public void TestNuevaVacunacion() {
		Vacunacion vacunacion=mascota.DarDeAltaVacunacion(new Medico("Esteban",LocalDate.of(2021, 02,14),200),"Rabia",400);
		assertEquals(1,mascota.getServicios().size());
		assertEquals(mascota.getNombre(),vacunacion.getMascota().getNombre());
	}
	
	@Test
	public void TestNuevaGuarderia() {
		Guarderia guarderia=mascota.DarDeAltaGuarderia(20);
		assertEquals(1,mascota.getServicios().size());
		assertEquals(mascota.getNombre(),guarderia.getMascota().getNombre());
	}
	
	@Test
	public void TestRecaudacion() {
		List<Servicio>servicios=new LinkedList();
		servicios.add(new ConsultaMedica(mascota,LocalDate.of(2024, 10, 18),new Medico("Esteban",LocalDate.of(2021, 02,14),200)));
		servicios.add(new Vacunacion(mascota,LocalDate.of(2024, 10, 18),new Medico("Esteban",LocalDate.of(2021, 02,14),200),"Rabia",400));
		servicios.add(new Guarderia(mascota,LocalDate.of(2024, 10, 18),20));
		mascota.setServicios(servicios);
		assertEquals(11900,mascota.montoRecaudado(LocalDate.of(2024, 10, 18)));
	}
}
