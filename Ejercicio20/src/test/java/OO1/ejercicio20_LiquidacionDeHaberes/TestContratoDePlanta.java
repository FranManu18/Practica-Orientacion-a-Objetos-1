package OO1.ejercicio20_LiquidacionDeHaberes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestContratoDePlanta {
	private contratoDePlanta contrato;
	
	@BeforeEach
	void setUp() {
		contrato=new contratoDePlanta(LocalDate.of(2023, 10,22),50.2,10,13.5);
	}
	
	@Test
	public void testObtenerDuracion() {
		assertEquals(12,contrato.ObtenerDuracion());
	}
	
	@Test
	public void testCalcularMonto() {
		assertEquals(73.7,contrato.calcularMonto());
	}
}
