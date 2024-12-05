package oo1.ejercicio25_Veterinaria2;

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
		assertEquals(1100,vacunacion.calcularCosto());
		vacunacion.setFecha(LocalDate.of(2024, 12, 01));
		assertEquals(1300,vacunacion.calcularCosto());
	}
}
