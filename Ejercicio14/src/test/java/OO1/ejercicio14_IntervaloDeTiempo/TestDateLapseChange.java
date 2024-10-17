package OO1.ejercicio14_IntervaloDeTiempo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.Period;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDateLapseChange {
	private DateLapseChange dateLapse;
	
	@BeforeEach
	void setUp() {
		LocalDate from=LocalDate.of(2024,4,18);
		dateLapse=new DateLapseChange(from,3);
	}
	
	@Test
	public void testSize() {
		Period diferencia=Period.between(dateLapse.getFrom(), dateLapse.getTo());
		int cantidad=diferencia.getDays();
		assertEquals(cantidad,dateLapse.sizeDays());
	}
	
	@Test
	public void testIncludes() {
		LocalDate date=LocalDate.of(2024, 4, 19);
		assertTrue(dateLapse.includesDate(date));
		date=LocalDate.of(2024, 6, 21);
		assertFalse(dateLapse.includesDate(date));
	}
}
