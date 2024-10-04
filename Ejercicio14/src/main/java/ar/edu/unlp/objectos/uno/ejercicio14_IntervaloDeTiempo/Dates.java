package ar.edu.unlp.objectos.uno.ejercicio14_IntervaloDeTiempo;

import java.time.LocalDate;

public abstract class Dates {
	private LocalDate from;
	
	public abstract int sizeDays();
	
	public abstract boolean includesDate(LocalDate other);
}
