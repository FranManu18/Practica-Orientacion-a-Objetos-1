package OO1.parcial2_Veterinaria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestGuarderia {
	private Guarderia guarderia;
	private Mascota mascota;
	
	@BeforeEach
	void setUp() {
		mascota=new Mascota("Rufus",LocalDate.of(2022, 04, 18),"Salchicha");
		guarderia=new Guarderia(mascota,10);
	}
	
	@Test
	public void testCostoGuarderia() {
		assertEquals(500,guarderia.costo());
		mascota.agregarServicio(new Guarderia(mascota,10));
		mascota.agregarServicio(new Guarderia(mascota,10));
		mascota.agregarServicio(new Guarderia(mascota,10));
		mascota.agregarServicio(new Guarderia(mascota,10));
		mascota.agregarServicio(new Guarderia(mascota,10));
		assertEquals(450,guarderia.costo());
	}
}
