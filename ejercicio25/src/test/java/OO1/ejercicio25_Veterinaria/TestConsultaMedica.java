package OO1.ejercicio25_Veterinaria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestConsultaMedica {
	private ConsultaMedica consulta;
	
	@BeforeEach
	void setUp() {
		consulta=new ConsultaMedica(new Mascota("Rufus",LocalDate.of(2021, 04, 18),"Salchicha"),new Medico("Gerardo",LocalDate.of(2022, 05, 21),20.5),LocalDate.of(2024, 06, 9));
		
	}
	
	@Test
	public void testCalcularCosto() {
		assertEquals(720.5,consulta.calcularCosto());
	}
}
