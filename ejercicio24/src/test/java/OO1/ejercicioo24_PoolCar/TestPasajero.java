package OO1.ejercicioo24_PoolCar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import OO1.ejercicioo24_PoolCar.Conductor;
import OO1.ejercicioo24_PoolCar.Pasajero;
import OO1.ejercicioo24_PoolCar.Vehiculo;
import OO1.ejercicioo24_PoolCar.Viaje;

public class TestPasajero {
	private Pasajero pasajero;
	private Conductor conductor;
	
	@BeforeEach
	void setUp() {
		pasajero=new Pasajero("Rodolfo",300.5);
		conductor=new Conductor("Francisco",300.5,new Vehiculo(conductor,"descripcion",4,2020,100));
	}
	
	@Test
	public void testAgregarViaje() {
		pasajero.agregarViaje(new Viaje("La plata","Cordoba",400.6,conductor.getAuto(),LocalDate.of(2024, 04, 18),conductor));
		assertEquals(1,pasajero.getViajes().size());
	}
	
	@Test
	public void TestRestarSaldo(){
		pasajero.restarSaldo(100);
		assertEquals(200.5,pasajero.getSaldo());
		pasajero.agregarViaje(new Viaje("La plata","Cordoba",400.6,conductor.getAuto(),LocalDate.of(2024, 04, 18),conductor));
		pasajero.restarSaldo(100);
		assertEquals(600.5,pasajero.getSaldo());
	}
	
	@Test
	public void TestCargarSaldo() {
		pasajero.cargarSaldo(100);
		assertEquals(390.5,pasajero.getSaldo());
		pasajero.agregarViaje(new Viaje("La plata","Cordoba",400.6,conductor.getAuto(),LocalDate.of(2024, 11, 01),conductor));
		pasajero.cargarSaldo(100);
		assertEquals(490.5,pasajero.getSaldo());
	}
}
