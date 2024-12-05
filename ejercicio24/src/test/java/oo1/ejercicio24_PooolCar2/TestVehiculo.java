package oo1.ejercicio24_PooolCar2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestVehiculo {
	private Vehiculo auto;
	private Conductor conductor;
	
	@BeforeEach
	void setUp() {
		auto=new Vehiculo(new Conductor("Francisco",400,auto),"Auto rojo",4,2020,2000.0);
	}
	
	@Test
	public void TestAgregarAlAuto() {
		assertEquals(1,auto.getPasajeros().size());
		auto.agregarAlAuto(new Pasajero("Pedro",600));
		assertEquals(2,auto.getPasajeros().size());
		
	}
	
	
	@Test
	public void TestHayCapacidad() {
		assertTrue(auto.HayCapacidad());
		auto.agregarAlAuto(new Pasajero("Pedro",600));
		auto.agregarAlAuto(new Pasajero("Juan",600));
		auto.agregarAlAuto(new Pasajero("Roberto",600));
		assertFalse(auto.HayCapacidad());
	}
}
