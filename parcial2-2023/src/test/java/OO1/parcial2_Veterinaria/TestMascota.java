package OO1.parcial2_Veterinaria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMascota {
	private Mascota mascota;
	
	@BeforeEach
	void setUp() {
		mascota=new Mascota("Rufus",LocalDate.of(2022, 04, 18),"Salchicha");
	}
	
	@Test
	public void testAgregarServicio() {
		assertEquals(0,mascota.getServicios().size());
		mascota.agregarServicio(new Guarderia(mascota,10));
		assertEquals(1,mascota.getServicios().size());
	}
	
	@Test
	public void testRecaudacion() {
		mascota.agregarServicio(new Vacunacion(new Mascota("Rufus",LocalDate.of(2022, 04, 18),"Salchicha"),new Medico("Francisco",LocalDate.of(2021, 04, 18),40.5),"Rabia",30.2));
		mascota.agregarServicio(new ConsultaMedica(new Mascota("Rufus",LocalDate.of(2022, 04, 18),"Salchicha"),new Medico("Francisco",LocalDate.of(2021, 04, 18),40.5)));
		mascota.agregarServicio(new Guarderia(mascota,10));
		assertEquals(1711.2,mascota.recaudacionDeServicios(LocalDate.now()));
		assertEquals(0,mascota.recaudacionDeServicios(LocalDate.of(2024, 05,21)));
	}
	
}
