package oo1.ejercicio25_Veterinaria2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMedico {
	private Medico medico;
	
	@BeforeEach
	void setUp() {
		medico=new Medico("Esteban",LocalDate.of(2021, 02,14),200);
	}
	
	@Test
	public void TestAños() {
		assertEquals(3,medico.obtenerAños());
	}
}
