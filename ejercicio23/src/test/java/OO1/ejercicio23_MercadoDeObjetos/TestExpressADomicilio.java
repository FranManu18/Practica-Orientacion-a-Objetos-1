package OO1.ejercicio23_MercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestExpressADomicilio {
	private FormasDeEnvio forma;
	
	@BeforeEach
	void setUp() {
		forma=new ExpressADomicilio();
	}
	
	@Test
	public void testAdicionalExpress() {
		assertEquals(50,forma.precioAdicional());
	}
}
