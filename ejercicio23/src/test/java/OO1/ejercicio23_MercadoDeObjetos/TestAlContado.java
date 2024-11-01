package OO1.ejercicio23_MercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAlContado {
	private FormasDePago forma;
	
	@BeforeEach
	void setUp() {
		forma=new AlContado();
	}
	
	@Test
	public void testPrecioContado() {
		assertEquals(20.3,forma.precioFinal(20.3));
	}
}
