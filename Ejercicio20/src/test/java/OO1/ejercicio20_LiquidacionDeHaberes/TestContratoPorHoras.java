package OO1.ejercicio20_LiquidacionDeHaberes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestContratoPorHoras {
	private contratoPorHoras contrato;
	
	@BeforeEach
	void setUp() {
		contrato=new contratoPorHoras(LocalDate.of(2024, 10,22),LocalDate.of(2025, 5,28),20.4,5);
	}
	
	@Test
	public void testEsVigente() {
		assertTrue(contrato.esVigente());
		contrato=new contratoPorHoras(LocalDate.of(2024, 10,17),LocalDate.of(2024, 10,21),20.4,5);
		assertFalse(contrato.esVigente());
	}
	
	@Test
	public void testObtenerDuracion() {
		assertEquals(7,contrato.ObtenerDuracion());
	}
	
	@Test
	public void testCalcularMonto() {
		assertEquals(102,contrato.calcularMonto());
	}
}
