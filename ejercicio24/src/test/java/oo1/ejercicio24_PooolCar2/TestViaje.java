package oo1.ejercicio24_PooolCar2;

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
	void setUp() {
		conductor=new Conductor("Francisco",400,new Vehiculo(conductor,"Auto rojo",4,2020,2000.0));
		viaje=new Viaje("La Plata","Cordoba",800,new Vehiculo(conductor,"Auto rojo",4,2020,2000.0),LocalDate.of(2024, 12, 15));
	}
	
	@Test
	public void TestRegistroPosible() {
		assertTrue(viaje.registroPosible());
		viaje.setFechaDeViaje(LocalDate.of(2024, 12, 6));
		assertFalse(viaje.registroPosible());
	}
	
	@Test
	public void TestAgregarAlViaje() {
		assertEquals(1,viaje.getPasajeros().size());
		viaje.agregarAlViaje(new Pasajero("Pedro",600));
		assertEquals(2,viaje.getPasajeros().size());
	}
	
	@Test
	public void TestProcesarViaje() {
		Pasajero pasajero=new Pasajero("Pedro",600);
		viaje.agregarAlViaje(pasajero);
		viaje.procesarViaje();
		assertEquals(200,pasajero.getSaldo());
		assertEquals(20,conductor.getSaldo());
	}
}
