package OO1.parcial2_Veterinaria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestConsultaMedica {
	private ConsultaMedica consulta;
	
	@BeforeEach
	void setUp() {
		consulta=new ConsultaMedica(new Mascota("Rufus",LocalDate.of(2022, 04, 18),"Salchicha"),new Medico("Francisco",LocalDate.of(2021, 04, 18),40.5));
	}
	
	@Test
	public void testCostoConsulta() {
		assertEquals(640.5,consulta.costo());
		consulta.setFecha(LocalDate.of(2024, 11, 10));
		assertEquals(840.5,consulta.costo());
	}
}
