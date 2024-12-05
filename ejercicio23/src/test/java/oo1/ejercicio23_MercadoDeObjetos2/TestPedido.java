package oo1.ejercicio23_MercadoDeObjetos2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPedido {
	private Pedido pedido;
	
	@BeforeEach
	void setUp() {
		pedido=new Pedido(new Cliente("Fernando","Calle Uno"),new AlContado(),new RetirarEnSucursal(),new Producto("Heladera","Electrodomestico",5000,10),7);
	}
	
	@Test
	public void TestCalcularCostoTotal() {
		assertEquals(8000,pedido.calcularCostoTotal());
		pedido.setFormaDePago(new Cuotas6());
		pedido.setFormaDeEnvio(new ExpressADomicilio());
		assertEquals(6100,pedido.calcularCostoTotal());
	}
}
