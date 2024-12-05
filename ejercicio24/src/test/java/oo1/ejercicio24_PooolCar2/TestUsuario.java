package oo1.ejercicio24_PooolCar2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestUsuario {
	private Conductor conductor;
	
	@BeforeEach
	void setUp() {
		conductor=new Conductor("Francisco",400,new Vehiculo(conductor,"Auto rojo",4,2020,2000.0));
	}
	
	@Test
	public void TestSaldoRojo() {
		assertFalse(conductor.saldoEnRojo());
		conductor.setSaldo(-10);
		assertTrue(conductor.saldoEnRojo());
	}
	
	@Test
	public void TestAgregarViaje() {
		assertEquals(0,conductor.getViajes().size());
		Viaje viaje=new Viaje("La Plata","Cordoba",800,new Vehiculo(conductor,"Auto rojo",4,2020,2000.0),LocalDate.of(2024, 12, 10));
		assertEquals(1,conductor.getViajes().size());
		conductor.sumarViaje(viaje);
		assertEquals(2,conductor.getViajes().size());
	}
	
	@Test
	public void TestAltaViaje() {
		Viaje viaje=conductor.darDeAltaViaje("La Plata","Cordoba",800,new Vehiculo(conductor,"Auto rojo",4,2020,2000.0),LocalDate.of(2024, 12, 10));
		assertEquals(1,viaje.getPasajeros().size());
		assertEquals("La Plata",viaje.getOrigen());
		assertEquals("Cordoba",viaje.getDestino());
	}
}
