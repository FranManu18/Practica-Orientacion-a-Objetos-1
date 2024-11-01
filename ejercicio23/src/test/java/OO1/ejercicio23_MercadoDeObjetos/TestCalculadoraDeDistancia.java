package OO1.ejercicio23_MercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculadoraDeDistancia {
private CalculadoraDeDistancia calc;
	
	@BeforeEach
	void setUp() {
		calc=new CalculadoraDeDistancia();
	}
	
	@Test
	public void testDistanciaEntre() {
		assertEquals(100,calc.distanciaEntre("A", "B"));
	}
}
