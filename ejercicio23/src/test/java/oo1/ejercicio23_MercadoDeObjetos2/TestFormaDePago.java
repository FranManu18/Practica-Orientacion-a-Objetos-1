package oo1.ejercicio23_MercadoDeObjetos2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFormaDePago {
	private AlContado alcontado;
	private Cuotas6 cuotas;
	
	@BeforeEach
	void setUp() {
		alcontado=new AlContado();
		cuotas=new Cuotas6();
	}
	
	@Test
	public void testCostoContado() {
		assertEquals(200,alcontado.calcularCosto(200));
	}
	
	@Test
	public void testCostoCuotas() {
		assertEquals(240,cuotas.calcularCosto(200));
	}
}
