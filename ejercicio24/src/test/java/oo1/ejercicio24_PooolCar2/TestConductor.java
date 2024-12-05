package oo1.ejercicio24_PooolCar2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestConductor {
	private Conductor conductor;
	
	@BeforeEach
	void setUp() {
		conductor=new Conductor("Francisco",400,new Vehiculo(conductor,"Auto rojo",4,2020,2000.0));
	}
	
	@Test
	public void TestRestarSaldoConductor() {
		conductor.restarSaldo(200);
		assertEquals(220,conductor.getSaldo());
	}
	
	@Test
	public void TestCargarSaldoConductor() {
		conductor.cargarSaldo(200);
		assertEquals(598,conductor.getSaldo());
		conductor.getAuto().setFabricacion(2010);
		conductor.cargarSaldo(200);
		assertEquals(778,conductor.getSaldo());
	}
}
