package OO1.ejercicio25_Veterinaria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMascota {
	private Mascota mascota;
	
	@BeforeEach
	void setUp() {
		mascota=new Mascota("Rufus",LocalDate.of(2021, 04, 18),"Salchicha");
	}
	
	@Test
	public void TestAgregarServicio() {
		mascota.agregarServicio(new ConsultaMedica(mascota,new Medico("Gerardo",LocalDate.of(2022, 05, 21),20.5),LocalDate.of(2024, 05,9)));
		assertEquals(1,mascota.getServiciosRecibidos().size());
	}
	
	@Test
	public void TestCostoTotal() {
		mascota.agregarServicio(new ConsultaMedica(mascota,new Medico("Gerardo",LocalDate.of(2022, 05, 21),20.5),LocalDate.of(2024, 06,9)));
		mascota.agregarServicio(new ConsultaMedica(mascota,new Medico("Gerardo",LocalDate.of(2022, 05, 21),20.5),LocalDate.of(2024, 04,9)));
		mascota.agregarServicio(new Guarderia(mascota,10,LocalDate.of(2024, 06, 9)));
		assertEquals(1220.5,mascota.costoTotalDeServicios(LocalDate.of(2024, 06, 9)));
	}
	
}
