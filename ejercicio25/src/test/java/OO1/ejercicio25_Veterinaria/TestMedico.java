package OO1.ejercicio25_Veterinaria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMedico {
	private Medico medico;
	
	@BeforeEach
	void setUp() {
		medico=new Medico("Gerardo",LocalDate.of(2022, 05, 21),20.5);
	}
	
	@Test
	public void testAltaConsulta() {
		Mascota mascota=new Mascota("Rufus",LocalDate.of(2021, 04, 18),"Salchicha");
		ConsultaMedica consulta=medico.DarDeAltaConsulta(mascota);
		assertEquals(mascota,consulta.getMascota());
		assertEquals(medico,consulta.getMedico());
	}
	
	@Test
	public void testAltaVacunacion() {
		Mascota mascota=new Mascota("Rufus",LocalDate.of(2021, 04, 18),"Salchicha");
		Vacunacion vacunacion=medico.DarDeAltaVacunacion(mascota,"Rabia",100.2);
		assertEquals(mascota,vacunacion.getMascota());
		assertEquals(medico,vacunacion.getMedico());
		assertEquals("Rabia",vacunacion.getVacuna());
		assertEquals(100.2,vacunacion.getCosto());
	}
	
	@Test
	public void testAltaGuarderia() {
		Mascota mascota=new Mascota("Rufus",LocalDate.of(2021, 04, 18),"Salchicha");
		Guarderia guarderia=medico.DarDeAltaGuarderia(mascota, 10);
		assertEquals(mascota,guarderia.getMascota());
		assertEquals(10,guarderia.getCantDias());
	}
}
