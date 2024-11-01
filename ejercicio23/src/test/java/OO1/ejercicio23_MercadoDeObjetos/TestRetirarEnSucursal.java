package OO1.ejercicio23_MercadoDeObjetos;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestRetirarEnSucursal {
private FormasDeEnvio forma;
	
	@BeforeEach
	void setUp() {
		forma=new RetirarEnSucursal();
	}
	
	@Test
	public void testAdicionalSucursal() {
		assertEquals(3000.0,forma.precioAdicional());
	}
}
