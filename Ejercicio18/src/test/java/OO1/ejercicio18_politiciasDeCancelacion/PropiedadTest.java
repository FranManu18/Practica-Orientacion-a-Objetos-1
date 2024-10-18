package OO1.ejercicio18_politiciasDeCancelacion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropiedadTest {
	private Propiedad propiedad;
	
	@BeforeEach
	void setUp() {
		politicaDeCancelacion politica=new Flexible();
		propiedad=new Propiedad("Calle 74","Casa",20.6,politica);
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
	public void testPoliticas() {

	    propiedad.crearReserva(LocalDate.of(2024, 10, 20), LocalDate.of(2024, 10, 30));
	    Reserva reserva = new Reserva(LocalDate.of(2024, 10, 20), LocalDate.of(2024, 10, 30), propiedad);
	    assertEquals(226.6, propiedad.cancelarReserva(reserva, LocalDate.of(2024, 10, 15)), 0.01); // Cancelar antes del inicio

	    politicaDeCancelacion politica = new Moderada();
	    propiedad.setPoliticaDeCancelacion(politica);
	    propiedad.crearReserva(LocalDate.of(2024, 10, 26), LocalDate.of(2024, 10, 30));
	    reserva = new Reserva(LocalDate.of(2024, 10, 26), LocalDate.of(2024, 10, 30), propiedad);
	    assertEquals(103.0, propiedad.cancelarReserva(reserva, LocalDate.of(2024, 10, 19)), 0.01); // Cancelación una semana antes

	  
	    assertEquals(113.3, propiedad.cancelarReserva(reserva, LocalDate.of(2024, 10, 24)), 0.01);

	    politica = new Estricta();
	    propiedad.setPoliticaDeCancelacion(politica);
	    propiedad.crearReserva(LocalDate.of(2024, 10, 20), LocalDate.of(2024, 10, 30));
	    reserva = new Reserva(LocalDate.of(2024, 10, 20), LocalDate.of(2024, 10, 30), propiedad);
	    assertEquals(0.0, propiedad.cancelarReserva(reserva, LocalDate.of(2024, 10, 10)), 0.01); // Sin reembolso con política estricta
	}
	
	@Test
	public void testCancelarReserva() {
	    propiedad.crearReserva(LocalDate.of(2024, 10, 20), LocalDate.of(2024, 10, 30));
	    Reserva reserva = new Reserva(LocalDate.of(2024, 10, 20), LocalDate.of(2024, 10, 30), propiedad);
	    Reserva reserva1 = new Reserva(LocalDate.of(2024, 3, 1), LocalDate.of(2024, 5, 15), propiedad);

	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	        propiedad.cancelarReserva(reserva1, LocalDate.of(2024, 2, 25));
	    });
	    assertEquals("Reserva no encontrada.", exception.getMessage());

	    
	    assertEquals(226.6, propiedad.cancelarReserva(reserva, LocalDate.of(2024, 10, 15)), 0.01);
	    assertEquals(0, propiedad.getReservas().size());
	}
	
	@Test
	public void testPrecioTotal() {
		propiedad.crearReserva(LocalDate.of(2024, 4, 1), LocalDate.of(2024, 5, 15));
		propiedad.crearReserva(LocalDate.of(2024, 6, 1), LocalDate.of(2024, 7, 15));
		double valor=(45*20.6)*2;
		assertEquals(valor,propiedad.precioTotal(LocalDate.of(2024,3,1), LocalDate.of(2024, 7, 18)));
	}
}
