package ar.edu.unlp.objectos.uno.ejercicio14_IntervaloDeTiempo;

import java.time.LocalDate;
import java.time.Period;

public class DateLapseChange extends Dates {
	private LocalDate from;
	private int sizeDays;
	
	public DateLapseChange(LocalDate from, int sizeDays) {
		super();
		this.from = from;
		this.sizeDays =sizeDays;
	}
	public LocalDate getFrom() {
		return from;
	}
	
	public LocalDate getTo() {
		return this.from.plusDays(sizeDays);
	}
	
	public int getSizeDays() {
		return sizeDays;
	}
	
	@Override
	public int sizeDays() {
		LocalDate to=this.from.plusDays(this.sizeDays);
		Period diferencia=Period.between(from,to);
		return diferencia.getDays();
	}
	
	@Override
	public boolean includesDate(LocalDate other) {
		LocalDate to=this.from.plusDays(this.sizeDays);
		return (other.isAfter(this.from)&&other.isBefore(to));
	}
}
