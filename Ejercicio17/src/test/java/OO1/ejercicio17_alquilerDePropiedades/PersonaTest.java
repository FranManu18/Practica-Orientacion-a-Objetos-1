package OO1.ejercicio17_alquilerDePropiedades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	private Persona persona;
	
	@BeforeEach 
	void setUp() {
		persona=new Persona("Francisco","Calle 1",46434929);
	}
	
	@Test
	public void testPrecioTotal() {
		Propiedad propiedad1=new Propiedad("Calle 1","Casa",20.5);
		Propiedad propiedad2=new Propiedad("Calle 122","Trabajo",15.9);
		propiedad1.crearReserva(LocalDate.of(2024, 5, 10), LocalDate.of(2024, 5, 15));
		propiedad1.crearReserva(LocalDate.of(2024, 5, 20), LocalDate.of(2024, 5, 25));
		propiedad2.crearReserva(LocalDate.of(2024, 5, 10), LocalDate.of(2024, 5, 15));
		persona.agregarPropiedad(propiedad1);
		persona.agregarPropiedad(propiedad2);
		assertEquals(256.04999999999995,persona.precioTotal(LocalDate.of(2024, 5, 7), LocalDate.of(2024, 5, 27)));
	}
}
