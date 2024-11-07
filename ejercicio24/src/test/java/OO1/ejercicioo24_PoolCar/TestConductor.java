package OO1.ejercicioo24_PoolCar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import OO1.ejercicioo24_PoolCar.Conductor;
import OO1.ejercicioo24_PoolCar.Vehiculo;

public class TestConductor {
	private Conductor conductor;
	
	@BeforeEach
	void setUp() {
		conductor=new Conductor("Francisco",300.5,new Vehiculo(conductor,"descripcion",4,2020,100));
	}
	
	@Test
	public void testRestarSaldo() {
		conductor.restarSaldo(105);
		assertEquals(195,6,conductor.getSaldo());
	}
	
	@Test
	public void TestcargarSaldo() {
		conductor.cargarSaldo(200);
		assertEquals(498.5,conductor.getSaldo());
	}
}
