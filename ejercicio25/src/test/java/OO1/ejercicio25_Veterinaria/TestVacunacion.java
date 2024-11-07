package OO1.ejercicio25_Veterinaria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestVacunacion {
	private Vacunacion vacunacion;
	
	@BeforeEach
	void setUp() {
		vacunacion=new Vacunacion(new Mascota("Rufus",LocalDate.of(2021, 04, 18),"Salchicha"),new Medico("Gerardo",LocalDate.of(2022, 05, 21),20.5),"Rabia",100.2,LocalDate.of(2024, 06, 9));
	}
	
	@Test
	public void TestCalcularCosto() {
		assertEquals(820.7,vacunacion.calcularCosto());
	}
}
