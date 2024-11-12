package OO1.parcial2_Veterinaria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestVacunacion {
	private Vacunacion vacunacion;
	
	@BeforeEach
	void setUp() {
		vacunacion=new Vacunacion(new Mascota("Rufus",LocalDate.of(2022, 04, 18),"Salchicha"),new Medico("Francisco",LocalDate.of(2021, 04, 18),40.5),"Rabia",30.2);
	}
	
	@Test
	public void testCostoVacunacion() {
		assertEquals(570.7,vacunacion.costo());
		vacunacion.setFecha(LocalDate.of(2024, 11, 10));
		assertEquals(770.7,vacunacion.costo());
	}
}
