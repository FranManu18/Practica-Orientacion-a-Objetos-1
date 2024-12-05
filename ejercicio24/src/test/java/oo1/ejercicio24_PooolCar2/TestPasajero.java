package oo1.ejercicio24_PooolCar2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPasajero {
	private Pasajero pasajero;
	private Conductor conductor;
	private Viaje viaje;
	
	@BeforeEach
	void setUp() {
		pasajero=new Pasajero("Pedro",600);
		conductor=new Conductor("Francisco",400,new Vehiculo(conductor,"Auto rojo",4,2020,2000.0));
		viaje=new Viaje("La Plata","Cordoba",800,new Vehiculo(conductor,"Auto rojo",4,2020,2000.0),LocalDate.of(2024, 12, 15));
	}
	
	@Test
	public void TestRegistrarEnViaje() {
		assertEquals(1,viaje.getPasajeros().size());
		assertTrue(pasajero.registrarEnViaje(viaje));
		assertEquals(1,pasajero.getViajes().size());
		assertEquals(2,viaje.getPasajeros().size());
		pasajero.setSaldo(-10);
		assertFalse(pasajero.registrarEnViaje(viaje));
		pasajero.setSaldo(600);
		viaje.getAuto().setCapacidad(2);
		assertFalse(pasajero.registrarEnViaje(viaje));
		viaje.getAuto().setCapacidad(4);
		viaje.setFechaDeViaje(LocalDate.of(2024, 12, 05));
		assertFalse(pasajero.registrarEnViaje(viaje));
	}
	
	
	@Test
	public void TestRestarSaldoPasajero() {
		pasajero.restarSaldo(500);
		assertEquals(100,pasajero.getSaldo());
		pasajero.sumarViaje(viaje);
		pasajero.restarSaldo(500);
		assertEquals(100,pasajero.getSaldo());
	}
	
	@Test
	public void TestCargarSaldoPasajero() {
		pasajero.cargarSaldo(200);
		assertEquals(780,pasajero.getSaldo());
		pasajero.sumarViaje(viaje);
		pasajero.cargarSaldo(200);
		assertEquals(980,pasajero.getSaldo());
	}
}
