package oo1.parcial3_Eventos;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private String nombre;
	private List<Entrada>entradas;
	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
		this.entradas=new LinkedList();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Entrada> getEntradas() {
		return entradas;
	}
	public void setEntradas(List<Entrada> entradas) {
		this.entradas = entradas;
	}
	
	public void agregarEntrada(Entrada entrada) {
		entradas.add(entrada);
	}
	
	public double precioDeAsistencia(Evento evento,LocalDate fecha) {
		return evento.calcularPrecioDeAsistencia(fecha);
	}
	
	public Entrada comprarEntrada(Evento evento,boolean seguro) {
		Entrada entrada=new Entrada(this,evento,seguro,LocalDate.now());
		agregarEntrada(entrada);
		return entrada;
	}
	
	public double montoARecuperar(Entrada entrada) {
		return entrada.calcularMontoARecuperar();
	}
	
	public double entradaEnUnPeriodo(LocalDate inicio,LocalDate fin) {
		return entradas.stream()
				.filter(entrada->entrada.entreFechas(inicio, fin))
				.mapToDouble(entrada->entrada.precioAsistencia())
				.sum();
	}
	
	public Entrada retornarEntrada() {
		return entradas.stream()
				.sorted((e1,e2)->
				e1.getFechaDeCompra().compareTo(e2.getFechaDeCompra()))
				.filter(entrada->entrada.getFechaDeCompra().isAfter(LocalDate.now()))
				.findFirst().orElse(null);
	}
}
