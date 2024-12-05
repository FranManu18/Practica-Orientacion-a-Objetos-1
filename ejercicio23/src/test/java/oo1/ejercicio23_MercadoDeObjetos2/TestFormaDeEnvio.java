package oo1.ejercicio23_MercadoDeObjetos2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFormaDeEnvio {
	private RetirarEnComercio comercio;
	private RetirarEnSucursal sucursal;
	private ExpressADomicilio domicilio;
	
	@BeforeEach
	void setUp() {
		comercio=new RetirarEnComercio();
		sucursal=new RetirarEnSucursal();
		domicilio=new ExpressADomicilio();
	}
	
	@Test
	public void testAdicionalComercio() {
		assertEquals(0,comercio.costoAdicional());
	}
	
	@Test
	public void testAdicionalSucursal() {
		assertEquals(3000,sucursal.costoAdicional());
	}
	
	@Test
	public void testAdicionalDomicilio() {
		assertEquals(100,domicilio.costoAdicional());
	}
}
