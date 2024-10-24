package OO1.ejercicio20_LiquidacionDeHaberes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEmpleado {
	private empleado empleado;
	
	@BeforeEach
	void setUp() {
		List<contrato>contratos=new LinkedList();
		contratos.add(new contratoPorHoras(LocalDate.of(2024, 10,22),LocalDate.of(2025, 5,28),20.4,10));
		contratos.add(new contratoPorHoras(LocalDate.of(2023, 10,22),LocalDate.of(2024, 5,28),20.4,5));
		contratos.add(new contratoDePlanta(LocalDate.of(2023, 10,22),50.2,10,13.5));
		
		empleado=new empleado("Francisco","Manuel",204643492,LocalDate.of(2005, 4, 18),false,contratos);
	}
	
	@Test
	public void TestObtenerAntiguedad() {
		assertEquals(2,empleado.obtenerAntiguedad());
	}
	
	@Test
	public void TestCalcularMonto() {
		assertEquals(204,empleado.calcularMonto());
	}
	
	@Test
	public void testImprimirRecibo() {
		assertEquals("Nombre: Francisco Apellido: Manuel CUIL: 204643492 Antiguedad: 2 años  Fecha: 2024-10-24 Monto a cobrar: 204.0"
				,empleado.imprimirRecibo());
	}
	
}
