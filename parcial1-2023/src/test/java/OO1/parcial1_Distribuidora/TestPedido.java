package OO1.parcial1_Distribuidora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPedido {
	private Pedido pedido;
	
	@BeforeEach
	void setUp() {
		pedido=new Pedido(new Cliente("Francisco","Francisco@gmail.com"));
	}
	
	@Test
	public void testAgregarItem() {
		assertEquals(0,pedido.getItems().size());
		pedido.agregarItem(new ProductoNacional("Manaos",40.5,"Bebida sabor Cola"), 20);
		assertEquals(1,pedido.getItems().size());
	}
	
	@Test
	public void testCostoPedido() {
		pedido.agregarItem(new ProductoNacional("Manaos",40.5,"Bebida sabor Cola"),4);
		pedido.agregarItem(new ProductoImportado("Oreo",60.2,"Galletita","USA"), 20);
		assertEquals(1380.6670000000001,pedido.costoPedido());
	}
}
