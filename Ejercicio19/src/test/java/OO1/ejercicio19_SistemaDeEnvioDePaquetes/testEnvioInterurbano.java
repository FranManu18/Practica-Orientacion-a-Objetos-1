package OO1.ejercicio19_SistemaDeEnvioDePaquetes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testEnvioInterurbano {
	private envioInterurbano envio;
	
	@BeforeEach
	void setUp() {
		envio=new envioInterurbano(LocalDate.of(2024, 10, 22),"La plata","Gonnet",10,30);
	}
	
	@Test
	public void testCalcularCosto() {
		assertEquals(200,envio.calcularCosto());
		envio=new envioInterurbano(LocalDate.of(2024, 10, 22),"La plata","Gonnet",10,200);
		assertEquals(250,envio.calcularCosto());
		envio=new envioInterurbano(LocalDate.of(2024, 10, 22),"La plata","Gonnet",10,600);
		assertEquals(300,envio.calcularCosto());
	}
}
