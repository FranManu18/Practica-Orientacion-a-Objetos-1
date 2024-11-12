package OO1.parcial1_Distribuidora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestProductoImportado {
	private ProductoImportado producto;
	
	@BeforeEach
	void setUp() {
		producto=new ProductoImportado("Oreo",60.2,"Galletita","USA");
	}
	
	@Test
	public void testImpuestoImportado() {
		assertEquals(12.642,producto.Impuesto(10));
		assertEquals(12.642,producto.Impuesto(60));
		producto=new ProductoImportado("Canarias",60.2,"Yerba","Uruguay");
		assertEquals(12.642,producto.Impuesto(10));
		assertEquals(4.816000000000001,producto.Impuesto(60));
	}
}
