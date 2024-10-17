package OO1.ejercicio17_alquilerDePropiedades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropiedadTest {
	private Propiedad propiedad;
	
	@BeforeEach
	void setUp() {
		propiedad=new Propiedad("Calle 74","Casa",20.6);
	}
	
	@Test
	public void testCrearReserva() {
		assertTrue(propiedad.crearReserva(LocalDate.of(2024, 4, 1), LocalDate.of(2024, 5, 15)));
		assertEquals(1,propiedad.getReservas().size());
	}
	
	@Test
	public void testConsultarDisponibilidad() {
		propiedad.crearReserva(LocalDate.of(2024, 4, 1), LocalDate.of(2024, 5, 15));
		assertFalse(propiedad.consultarDisponibilidad(LocalDate.of(2024, 3, 29), LocalDate.of(2024, 4, 21)));
		assertTrue(propiedad.consultarDisponibilidad(LocalDate.of(2024, 5, 16), LocalDate.of(2024, 5, 29)));
	}
	
	@Test
	public void testCancelarReserva() {
		propiedad.crearReserva(LocalDate.of(2024, 4, 1), LocalDate.of(2024, 5, 15));
		Reserva reserva=new Reserva(LocalDate.of(2024, 4, 1),LocalDate.of(2024, 5, 15),propiedad);
		Reserva reserva1=new Reserva(LocalDate.of(2024, 3, 1),LocalDate.of(2024, 5, 15),propiedad);
		assertFalse(propiedad.cancelarReserva(reserva1));
		assertTrue(propiedad.cancelarReserva(reserva));
		assertEquals(0,propiedad.getReservas().size());
	}
	
	@Test
	public void testPrecioTotal() {
		propiedad.crearReserva(LocalDate.of(2024, 4, 1), LocalDate.of(2024, 5, 15));
		propiedad.crearReserva(LocalDate.of(2024, 6, 1), LocalDate.of(2024, 7, 15));
		double valor=(45*20.6)*2;
		assertEquals(valor,propiedad.precioTotal(LocalDate.of(2024,3,1), LocalDate.of(2024, 7, 18)));
	}
}
