package OO1.ejercicio19_SistemaDeEnvioDePaquetes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testEnvioLocal {
	private envioLocal envioLocal;
	
	@BeforeEach
	void setUp() {
		envioLocal=new envioLocal(LocalDate.of(2024, 10, 22),"La plata","Gonnet",10,0);
	}
	
	@Test
	public void testTipoDeEntrega() {
		assertEquals("Estandar",envioLocal.getTipoDeEntrega());
		envioLocal=new envioLocal(LocalDate.of(2024, 10, 22),"La plata","Gonnet",10,1);
		assertEquals("Rapida",envioLocal.getTipoDeEntrega());
		envioLocal=new envioLocal(LocalDate.of(2024, 10, 22),"La plata","Gonnet",10,2);
		assertEquals("Entrega invalida",envioLocal.getTipoDeEntrega());
	}
	
	@Test
	public void testCalcularCosto() {
		assertEquals(1000,envioLocal.calcularCosto());
		envioLocal=new envioLocal(LocalDate.of(2024, 10, 22),"La plata","Gonnet",10,1);
		assertEquals(1500,envioLocal.calcularCosto());
		envioLocal=new envioLocal(LocalDate.of(2024, 10, 22),"La plata","Gonnet",10,2);
		assertEquals(0,envioLocal.calcularCosto());
	}
}
