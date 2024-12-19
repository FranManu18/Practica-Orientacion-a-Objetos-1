package oo1.ejercicio25_Veterinaria4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestVacunacion {
	private Vacunacion vacunacion;
	
	@BeforeEach
	void setUp() {
		vacunacion=new Vacunacion(new Mascota("Rufus",LocalDate.of(2020, 06, 12),"Salchicha"),LocalDate.now(),new Medico("Esteban",LocalDate.of(2021, 02,14),200),"Rabia",400);
	}
	
	
	@Test
	public void TestCostoVacunacion() {
		assertEquals(1100,vacunacion.costo());
		vacunacion=new Vacunacion(new Mascota("Rufus",LocalDate.of(2020, 06, 12),"Salchicha"),LocalDate.of(2024, 12, 1),new Medico("Esteban",LocalDate.of(2021, 02,14),200),"Rabia",400);
		assertEquals(1300,vacunacion.costo());
	}
}
