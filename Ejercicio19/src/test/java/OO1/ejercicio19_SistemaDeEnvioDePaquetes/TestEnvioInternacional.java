package OO1.ejercicio19_SistemaDeEnvioDePaquetes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEnvioInternacional {
	private envioInternacional envio;
	
	@BeforeEach
	void setUp() {
		envio=new envioInternacional(LocalDate.of(2024, 10, 22),"Argentina","Peru",1000);
	}
	
	@Test
	public void testCalcularCosto() {
		assertEquals(15000,envio.calcularCosto());
		envio=new envioInternacional(LocalDate.of(2024, 10, 22),"Argentina","Peru",2000);
		assertEquals(29000,envio.calcularCosto());
	}
}
