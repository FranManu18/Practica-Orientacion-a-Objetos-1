package oo1.ejercicio25_Veterinaria2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestConsultaMedica {
	private consultaMedica consulta;
	
	@BeforeEach
	void setUp() {
		consulta=new consultaMedica(new Mascota("Rufus",LocalDate.of(2020, 06, 12),"Salchicha"),LocalDate.now(),new Medico("Esteban",LocalDate.of(2021, 02,14),200));
	}
	
	
	@Test
	public void TestCostoConsulta() {
		assertEquals(800,consulta.calcularCosto());
		consulta.setFecha(LocalDate.of(2024, 12, 01));
		assertEquals(1000,consulta.calcularCosto());
	}
}
