package OO1.ejercicio23_MercadoDeObjetos;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestCuotas6 {

	private FormasDePago forma;
	
	@BeforeEach
	void setUp() {
		forma=new Cuotas6();
	}
	
	@Test
	public void testPrecioCuotas() {
		assertEquals(60,forma.precioFinal(50));
	}
}
