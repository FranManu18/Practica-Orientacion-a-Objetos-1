package OO1.ejercicio23_MercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestRetirarEnComercio {
	private FormasDeEnvio forma;
	
	@BeforeEach
	void setUp() {
		forma=new RetirarEnComercio();
	}
	
	@Test
	public void testAdicionalComercio() {
		assertEquals(0,forma.precioAdicional());
	}
}
