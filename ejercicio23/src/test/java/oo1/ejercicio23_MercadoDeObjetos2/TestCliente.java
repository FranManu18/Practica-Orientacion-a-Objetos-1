package oo1.ejercicio23_MercadoDeObjetos2;

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
		cliente=new Cliente("Fernando","Calle uno");
	}
	
	@Test
	public void TestHacerPedido() {
		assertTrue(cliente.hacerPedido(new AlContado(),new RetirarEnSucursal(),new Producto("Heladera","Electrodomestico",5000,10),7));
		assertFalse(cliente.hacerPedido(new AlContado(),new RetirarEnSucursal(),new Producto("Mesa","Mueble",500,10),12));
	}
	
	@Test
	public void TestProductorPorCategoria() {
		cliente.hacerPedido(new AlContado(),new RetirarEnSucursal(),new Producto("Heladera","Electrodomestico",5000,10),7);
		cliente.hacerPedido(new AlContado(),new RetirarEnSucursal(),new Producto("Microondas","Electrodomestico",5000,20),12);
		cliente.hacerPedido(new AlContado(),new RetirarEnSucursal(),new Producto("Mesa","Mueble",500,19),12);
		BagImpl<String>bag=cliente.productoPorCategoria();
		assertEquals(2,bag.size());
		assertEquals(2,bag.occurrencesOf("Electrodomestico"));
		assertEquals(1,bag.occurrencesOf("Mueble"));
	}
}
