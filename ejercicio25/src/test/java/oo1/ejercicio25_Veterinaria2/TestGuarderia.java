package oo1.ejercicio25_Veterinaria2;

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
		assertEquals(500,guarderia.calcularCosto());
		Mascota mascota=new Mascota("Rufus",LocalDate.of(2020, 06, 12),"Salchicha");
		mascota.crearConsultaMedica(new Medico("Esteban",LocalDate.of(2021, 02,14),200));
		mascota.crearConsultaMedica(new Medico("Esteban",LocalDate.of(2021, 02,14),200));
		mascota.crearConsultaMedica(new Medico("Esteban",LocalDate.of(2021, 02,14),200));
		mascota.crearConsultaMedica(new Medico("Esteban",LocalDate.of(2021, 02,14),200));
		mascota.crearConsultaMedica(new Medico("Esteban",LocalDate.of(2021, 02,14),200));
		guarderia.setMascota(mascota);
		assertEquals(450,guarderia.calcularCosto());
	}
}
