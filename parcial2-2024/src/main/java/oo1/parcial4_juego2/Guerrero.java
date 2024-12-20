package oo1.parcial4_juego2;

public class Guerrero implements Rol {
	
	
	public int valorBase(Personaje personaje) {
		return (personaje.getFuerza()*2)+personaje.getInteligencia()+personaje.getNivel();
	}
	
	public void aumentarHabilidad(Personaje personaje) {
		personaje.aumentarFuerza(personaje.getNivel()/6);
	}

}
