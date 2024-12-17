package oo1.parcial4_Juego;

import java.util.List;

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


	public void cambiarRol(Rol rol) {
		this.rol=rol;
	}
	
	public abstract double incremento(int valor,int hora);
	
	public double poderDeAtaque(int hora) {
		return incremento(rol.valorBase(this),hora);
	}
	
	public abstract boolean puedeSubir();
	
	public void subirNivel() {
		if(puedeSubir()) {
			nivel++;
			rol.subirHabilidad(this);
		}
	}
	
	public void sumarInteligencia(int valor) {
		inteligencia+=valor;
	}
	
	public void sumarFuerza(int valor) {
		fuerza+=valor;
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
		return p.getNivel()==nivel && p.poderDeAtaque(12)<5;
	}
	
	public boolean distintoNivel(Personaje p) {
		return (Math.abs(p.getNivel()-getNivel()))<=2;
	}
	
	public Personaje BuscarOponente(List<Personaje>oponentes) {
		return oponentes.stream()
				.filter(personaje->mismoNivel(personaje) || distintoNivel(personaje))
				.findFirst().orElse(null);
	}
}
