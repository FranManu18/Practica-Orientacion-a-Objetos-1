package OO1.ejercicio18_politiciasDeCancelacion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.Period;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ReservaTest {
	private Reserva reserva;
	
	@BeforeEach
	void setUp() {
		politicaDeCancelacion politica=new Flexible();
		reserva=new Reserva(LocalDate.of(2024, 4, 1),LocalDate.of(2024, 5, 15),new Propiedad("Calle 73","Casa",20.5,politica));
	}
	
	@Test
	public void testValorResertva() {
		System.out.println(reserva.getCantidadDeNoches());
		double resultado=20.5*45;
		assertEquals(resultado,reserva.valorReserva());
	}
}
