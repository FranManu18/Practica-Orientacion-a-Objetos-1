package oo1.parcial4_juego2;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Personaje {
	private String nombre;
	private int nivel;
	private int inteligencia;
	private int fuerza;
	private Rol rol;
	
	public Personaje(String nombre, int inteligencia, int fuerza, Rol rol) {
		super();
		this.nombre = nombre;
		this.inteligencia = inteligencia;
		this.fuerza = fuerza;
		this.rol = rol;
		this.nivel=1;
	}
	
	
	
	public int getNivel() {
		return nivel;
	}



	public int getInteligencia() {
		return inteligencia;
	}



	public int getFuerza() {
		return fuerza;
	}



	public abstract double incremento(int hora,int valor);
	
	public double poderDeAtaque(int hora) {
		return incremento(hora,rol.valorBase(this));
	}
	
	public void cambiarRol(Rol rolNuevo) {
		rol=rolNuevo;
	}
	
	public abstract boolean puedeSubir();
	
	public void aumentarInteligencia(int valor) {
		inteligencia+=valor;
	}
	
	public void aumentarFuerza(int valor) {
		fuerza+=valor;
	}
	
	public void subirNivel() {
		if(puedeSubir()) {
			rol.aumentarHabilidad(this);
		}
	}
	
	public void enfrentar(Personaje p,int hora) {
		if(poderDeAtaque(hora)>p.poderDeAtaque(hora)) {
			subirNivel();
		}else if(poderDeAtaque(hora)<p.poderDeAtaque(hora)) {
			p.subirNivel();
		}else {
			subirNivel();
			p.subirNivel();
		}
	}
	
	public boolean mismoNivel(Personaje p) {
		return (nivel==p.getNivel())&& p.poderDeAtaque(12)<5;
	}
	
	public boolean distintoNivel(Personaje p) {
		return (p.getNivel()-getNivel())<=2;
	}
	
	public List<Personaje> buscarOponentes(List<Personaje>oponentes) {
		return oponentes.stream()
				.filter(personaje->mismoNivel(personaje) || distintoNivel(personaje))
				.collect(Collectors.toList());
	}
}
