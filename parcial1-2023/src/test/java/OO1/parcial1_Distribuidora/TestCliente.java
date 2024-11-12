package OO1.parcial1_Distribuidora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCliente {
	private Cliente cliente;
	
	@BeforeEach
	void setUp() {
		cliente=new Cliente("Francisco","francisco@gmail.com");
	}
	
	@Test
	public void testRegistrarPedido() {
		assertEquals(0,cliente.getPedidos().size());
		cliente.RegistrarPedido();
		assertEquals(1,cliente.getPedidos().size());
	}
	
	@Test
	public void testCostoDePedidos() {
		Pedido pedido1=cliente.RegistrarPedido();
		pedido1.agregarItem(new ProductoNacional("Manaos",40.5,"Bebida sabor Cola"),4);
		pedido1.agregarItem(new ProductoImportado("Oreo",60.2,"Galletita","USA"), 20);
		
		Pedido pedido2=cliente.RegistrarPedido();
		pedido2.agregarItem(new ProductoNacional("Playadito",15.4,"Yerba"),9);
		
		Pedido pedido3=cliente.RegistrarPedido();
		pedido3.agregarItem(new ProductoNacional("Playadito",15.4,"Yerba"),9);
		pedido3.setFecha(LocalDate.of(2024, 04, 15));
		assertEquals(1520.0370000000003,cliente.costoDePedidos(LocalDate.of(2024, 05, 15), LocalDate.now().plusDays(10)));
	}
}
