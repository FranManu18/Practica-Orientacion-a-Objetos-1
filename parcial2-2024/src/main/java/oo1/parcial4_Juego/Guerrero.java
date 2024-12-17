package oo1.parcial4_Juego;

public class Guerrero implements Rol {
	
	@Override
	public int valorBase(Personaje personaje) {
		return (personaje.getFuerza()*2)+personaje.getNivel()+personaje.getInteligencia();
	}
	
	@Override
	public void subirHabilidad(Personaje personaje) {
		personaje.sumarFuerza(personaje.getNivel()/6);;
	}
}
