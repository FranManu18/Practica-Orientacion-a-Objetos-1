package oo1.parcial4_juego2;

public class Mago implements Rol {
	

	public int valorBase(Personaje personaje) {
		return (personaje.getNivel()+personaje.getInteligencia())*2;
	}
	
	public void aumentarHabilidad(Personaje personaje) {
		personaje.aumentarInteligencia(3/2*personaje.getNivel());
	}
}
