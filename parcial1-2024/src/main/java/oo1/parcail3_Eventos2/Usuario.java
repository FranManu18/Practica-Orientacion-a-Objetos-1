package oo1.parcail3_Eventos2;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private String nombre;
	private List<Entrada>entradas;
	
	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
		this.entradas = new LinkedList();
	}
	
	public Entrada comprarEntrada(Evento evento,boolean seguro) {
		Entrada entrada=new Entrada(evento,seguro,LocalDate.now());
		entradas.add(entrada);
		return entrada;
	}
	
	public double montoARecuperar(Entrada entrada) {
		return entrada.montoARecuperar();
	}
	
	public double montoDeEntradas(LocalDate inicio,LocalDate fin) {
		return entradas.stream()
				.filter(entrada->entrada.entreFechas(inicio, fin))
				.mapToDouble(entrada->entrada.montoTotal())
				.sum();
	}
	
	public Entrada siguienteEvento() {
		return entradas.stream()
				.sorted((e1,e2)->
				e1.fechaDeEvento().compareTo(e2.fechaDeEvento()))
				.filter(entrada->entrada.fechaDeEvento().isAfter(LocalDate.now()))
				.findFirst().orElse(null);
	}
}
