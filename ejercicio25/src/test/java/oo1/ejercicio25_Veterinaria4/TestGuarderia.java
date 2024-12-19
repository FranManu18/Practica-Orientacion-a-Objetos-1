package oo1.ejercicio25_Veterinaria4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestGuarderia {
	private Guarderia guarderia;
	
	@BeforeEach
	void setUp() {
		guarderia=new Guarderia(new Mascota("Rufus",LocalDate.of(2020, 06, 12),"Salchicha"),LocalDate.now(),20);
	}
	
	@Test
	public void TestCostoGuarderia() {
		assertEquals(10000,guarderia.costo());
		Mascota mascota=new Mascota("Rufus",LocalDate.of(2020, 06, 12),"Salchicha");
		mascota.DarDeAltaConsultaMedica(new Medico("Esteban",LocalDate.of(2021, 02,14),200));
		mascota.DarDeAltaConsultaMedica(new Medico("Esteban",LocalDate.of(2021, 02,14),200));
		mascota.DarDeAltaConsultaMedica(new Medico("Esteban",LocalDate.of(2021, 02,14),200));
		mascota.DarDeAltaConsultaMedica(new Medico("Esteban",LocalDate.of(2021, 02,14),200));
		mascota.DarDeAltaConsultaMedica(new Medico("Esteban",LocalDate.of(2021, 02,14),200));
		guarderia=new Guarderia(mascota,LocalDate.now(),20);
		assertEquals(9000,guarderia.costo());
	}
}
