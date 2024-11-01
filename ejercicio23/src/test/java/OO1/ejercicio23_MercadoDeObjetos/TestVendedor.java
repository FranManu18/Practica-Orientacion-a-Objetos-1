package OO1.ejercicio23_MercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestVendedor {
	private Vendedor vendedor;
	
	@BeforeEach
	void setUp() {
		vendedor=new Vendedor("Juan","Calle 1");
	}
	
	@Test
	public void testAgregarProducto() {
		assertTrue(vendedor.agregarProducto(new Producto("Electrodomestico",50.3,10)));
		assertEquals(1,vendedor.getProductos().size());

	}
}
