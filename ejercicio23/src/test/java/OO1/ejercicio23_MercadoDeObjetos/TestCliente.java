package OO1.ejercicio23_MercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import OO1.ejercicio21_Bag.BagImpl;

public class TestCliente {
	private Cliente cliente;
	
	@BeforeEach
	void setUp() {
		cliente=new Cliente("Francisco","Calle1");
	}
	
	@Test
	public void testAgregarPedido() {
		FormasDePago pago=new Cuotas6();
		FormasDeEnvio envio= new ExpressADomicilio();
		assertTrue(cliente.agregarPedido(pago,envio, new Producto("Electrodomestico",50.3,10),5));
		assertEquals(1,cliente.getPedidos().size());
		assertFalse(cliente.agregarPedido(pago,envio, new Producto("Electrodomestico",50.3,10),20));
	}
	
	@Test
	public void testProductosPorCategoria() {
		FormasDePago pago=new Cuotas6();
		FormasDeEnvio envio= new ExpressADomicilio();
		cliente.agregarPedido(pago,envio, new Producto("Electrodomestico",50.3,10),5);
		cliente.agregarPedido(pago,envio, new Producto("Electrodomestico",40.1,50),8);
		cliente.agregarPedido(pago,envio, new Producto("Entretenimiento",100,7),2);
		BagImpl<String>resultado=cliente.productosPorCategoria();
		assertEquals(2,resultado.occurrencesOf("Electrodomestico"));
		assertEquals(1,resultado.occurrencesOf("Entretenimiento"));
	}
}
