package OO1.ejercicio14_IntervaloDeTiempo;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateLapse extends Dates {
	private LocalDate from;
	private LocalDate to;
	public DateLapse(LocalDate from, LocalDate to) {
		super();
		this.from = from;
		this.to = to;
	}
	public LocalDate getFrom() {
		return from;
	}
	public LocalDate getTo() {
		return to;
	}
	
	@Override
	public int sizeDays() {
		return (int)ChronoUnit.DAYS.between(from, to);
	}
	
	@Override
	public boolean includesDate(LocalDate other) {
		return (other.isAfter(this.from)&&other.isBefore(this.to));
	}
	
	@Override
	public boolean overlaps(DateLapse anotherDateLapse) {
		return anotherDateLapse.getTo().isAfter(from) && anotherDateLapse.getTo().isBefore(to);
	}
}
