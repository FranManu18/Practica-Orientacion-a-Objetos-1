package OO1.ejercicio19_SistemaDeEnvioDePaquetes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testCliente {
	private personaFisica cliente;
	
	@BeforeEach
	void setUp() {
		List<envio>envios=new LinkedList();
		envios.add(new envioInternacional(LocalDate.of(2024, 10, 22),"Argentina","Peru",1000));
		envios.add(new envioLocal(LocalDate.of(2024, 10, 22),"La plata","Gonnet",10,0));
		cliente=new personaFisica("Francisco","Calle 1",envios,46434929);
	}
	
	@Test
	public void testAgregarEnvio() {
		assertEquals(2,cliente.getEnvios().size());
		cliente.agregarEnvio(new envioInterurbano(LocalDate.of(2024, 10, 22),"La plata","Gonnet",10,30));
		assertEquals(3,cliente.getEnvios().size());
	}
	
	//personaFisica
	@Test
	public void calcularCostoPersona() {
		assertEquals(14400,cliente.montoAPagar(LocalDate.of(2024, 10, 17), LocalDate.of(2024, 10, 30)));
	}
	
	//personaFisica
		@Test
	public void calcularCostoCorporativo() {
			List<envio>envios=new LinkedList();
			envios.add(new envioInternacional(LocalDate.of(2024, 10, 22),"Argentina","Peru",1000));
			envios.add(new envioLocal(LocalDate.of(2024, 10, 22),"La plata","Gonnet",10,0));
			cliente cliente=new clienteCorporativo("Francisco","Calle 1",envios,46434929);
			assertEquals(16000,cliente.montoAPagar(LocalDate.of(2024, 10, 17), LocalDate.of(2024, 10, 30)));
	}
}
