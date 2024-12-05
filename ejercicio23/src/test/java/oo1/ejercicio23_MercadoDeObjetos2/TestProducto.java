package oo1.ejercicio23_MercadoDeObjetos2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestProducto {
	private Producto producto;
	
	@BeforeEach
	void setUp() {
		producto=new Producto("Heladera","Electrodomestico",5000,10);
	}
	
	@Test
	public void TestHayUnidades() {
		assertTrue(producto.hayUnidades(5));
		assertFalse(producto.hayUnidades(20));
	}
	
	@Test
	public void TestDescontarUnidades() {
		assertTrue(producto.descontarUnidades(5));
		assertEquals(5,producto.getUnidades());
		assertFalse(producto.descontarUnidades(10));
	}
}
