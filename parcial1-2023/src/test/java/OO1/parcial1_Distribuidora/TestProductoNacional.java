package OO1.parcial1_Distribuidora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestProductoNacional {
	private ProductoNacional producto;
	
	@BeforeEach
	void setUp() {
		producto=new ProductoNacional("Manaos",40.5,"Bebida sabor Cola");
	}
	
	@Test
	public void TestImpuestoNacional() {
		assertEquals(2.025,producto.Impuesto(7));
		assertEquals(0,producto.Impuesto(15));
	}
}
