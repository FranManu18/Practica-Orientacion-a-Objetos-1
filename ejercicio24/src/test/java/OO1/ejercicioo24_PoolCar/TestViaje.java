package OO1.ejercicioo24_PoolCar;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestViaje {
	private Viaje viaje;
	private Conductor conductor;
	
	
	@BeforeEach
	void SetUp() {
		conductor=new Conductor("Francisco",300.5,new Vehiculo(conductor,"descripcion",4,2020,100));
		viaje=new Viaje("La plata","Cordoba",400.6,conductor.getAuto(),LocalDate.of(2024, 11, 01),conductor);
	}
	
	@Test
	public void TestAñadirPasajero() {
		viaje.añadirPasajero(new Pasajero("Rodolfo",300.5));
		assertEquals(2,viaje.getPasajeros().size());
	}
	
	@Test
	public void TestHayEspacio() {
		assertTrue(viaje.hayEspacio());
		viaje.añadirPasajero(new Pasajero("Juan",300.5));
		viaje.añadirPasajero(new Pasajero("Rodolfo",300.5));
		viaje.añadirPasajero(new Pasajero("Pedro",300.5));
		assertFalse(viaje.hayEspacio());
	}
	
}
