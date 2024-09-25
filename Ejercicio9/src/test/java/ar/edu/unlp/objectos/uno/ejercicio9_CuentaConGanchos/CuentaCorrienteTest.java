package ar.edu.unlp.objectos.uno.ejercicio9_CuentaConGanchos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class CuentaCorrienteTest {
	private CuentaCorriente cuentaCorriente;
	
	@BeforeEach
	public void setUp() {
		cuentaCorriente=new CuentaCorriente();
		cuentaCorriente.depositar(1000);
		cuentaCorriente.setLimite(-100);
	}
	
	@Test
	public void testExtraerFondosSuficientes() {
		boolean pudoExtraer=cuentaCorriente.extraer(1001);
		assertTrue(pudoExtraer);
		assertEquals(-1,cuentaCorriente.getSaldo(),0.01);
	}
	
	@Test
	public void testExtraerFondosInsuficientes() {
		boolean pudoExtraer=cuentaCorriente.extraer(1200);
		assertFalse(pudoExtraer);
		assertEquals(1000,cuentaCorriente.getSaldo(),0.01);
	}
}
