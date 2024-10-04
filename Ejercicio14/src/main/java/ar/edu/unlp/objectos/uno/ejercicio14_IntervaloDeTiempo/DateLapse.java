package ar.edu.unlp.objectos.uno.ejercicio14_IntervaloDeTiempo;

import java.time.LocalDate;
import java.time.Period;

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
		Period diferencia=Period.between(from,to);
		return diferencia.getDays();
	}
	
	@Override
	public boolean includesDate(LocalDate other) {
		return (other.isAfter(this.from)&&other.isBefore(this.to));
	}
}
