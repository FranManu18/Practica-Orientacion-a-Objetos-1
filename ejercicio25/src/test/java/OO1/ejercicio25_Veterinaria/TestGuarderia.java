package OO1.ejercicio25_Veterinaria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestGuarderia {
	private Guarderia guarderia;
	
	@BeforeEach
	void setUp() {
		guarderia=new Guarderia(new Mascota("Rufus",LocalDate.of(2021, 04, 18),"Salchicha"),10,LocalDate.of(2024, 06, 9));
	}
	
	@Test
	public void TestCalcularCosto() {
		guarderia.getMascota().agregarServicio(new ConsultaMedica(guarderia.getMascota(),new Medico("Gerardo",LocalDate.of(2022, 05, 21),20.5),LocalDate.of(2024, 05,9)));
		guarderia.getMascota().agregarServicio(new ConsultaMedica(guarderia.getMascota(),new Medico("Gerardo",LocalDate.of(2022, 05, 21),20.5),LocalDate.of(2024, 04,9)));
		guarderia.getMascota().agregarServicio(new ConsultaMedica(guarderia.getMascota(),new Medico("Gerardo",LocalDate.of(2022, 05, 21),20.5),LocalDate.of(2024, 03,9)));
		guarderia.getMascota().agregarServicio(new ConsultaMedica(guarderia.getMascota(),new Medico("Gerardo",LocalDate.of(2022, 05, 21),20.5),LocalDate.of(2024, 02,9)));
		guarderia.getMascota().agregarServicio(new ConsultaMedica(guarderia.getMascota(),new Medico("Gerardo",LocalDate.of(2022, 05, 21),20.5),LocalDate.of(2024, 01,9)));
		assertEquals(450,guarderia.calcularCosto());
	}
}
