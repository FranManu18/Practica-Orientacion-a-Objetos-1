package ar.edu.unlp.objectos.uno.ejercicio9_CuentaConGanchos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class CajaDeAhorroTest {
	private CajaDeAhorro cajadeAhorro;
	
	@BeforeEach
	public void setUp() {
		cajadeAhorro=new CajaDeAhorro();
		cajadeAhorro.depositar(1000);//980
	}
	
	@Test
	public void testDepositarConComision() {
		cajadeAhorro.depositar(100);
		assertEquals(1078,cajadeAhorro.getSaldo(),0.01);
	}
	
	@Test
	public void testExtraerFondosSuficientes() {
		boolean pudoExtraer=cajadeAhorro.extraer(100);//980
		assertTrue(pudoExtraer);
		assertEquals(878,cajadeAhorro.getSaldo(),0.01);
	}
	
	@Test
	public void testExtraerFondosInsuficientes() {
		boolean pudoExtraer=cajadeAhorro.extraer(1000);//980
		assertFalse(pudoExtraer);
		assertEquals(980,cajadeAhorro.getSaldo(),0.01);
	}
	
	@Test
	public void testTransferirFondosSuficientes() {
		CajaDeAhorro cuentaDestino=new CajaDeAhorro();
		boolean pudoTransferir=cajadeAhorro.transferirACuenta(100, cuentaDestino);
		
		assertTrue(pudoTransferir);
		assertEquals(878,cajadeAhorro.getSaldo());
		assertEquals(98,cuentaDestino.getSaldo(),0.01);
	}
	
	@Test
	public void testTransferirFondosSuficientesACuentaCorriente() {
		CuentaCorriente cuentaDestino=new CuentaCorriente();
		boolean pudoTransferir=cajadeAhorro.transferirACuenta(100, cuentaDestino);
		
		assertTrue(pudoTransferir);
		assertEquals(878,cajadeAhorro.getSaldo());
		assertEquals(100,cuentaDestino.getSaldo(),0.01);
	}
}
