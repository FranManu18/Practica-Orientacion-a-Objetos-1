package OO1.ejercicio14_IntervaloDeTiempo;

import java.time.LocalDate;

public abstract class Dates {
	private LocalDate from;
	private LocalDate to;
	
	public abstract int sizeDays();
	
	public abstract boolean includesDate(LocalDate other);
	
	public abstract boolean overlaps(DateLapse anotherDateLapse);
}
