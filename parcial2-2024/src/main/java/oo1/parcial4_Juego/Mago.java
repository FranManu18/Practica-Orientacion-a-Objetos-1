package oo1.parcial4_Juego;

public class Mago implements Rol {
	
	@Override
	public int valorBase(Personaje personaje) {
		return (personaje.getInteligencia()+personaje.getNivel())*2;
	}
	
	@Override
	public void subirHabilidad(Personaje personaje) {
		personaje.sumarInteligencia((3/2)*personaje.getNivel());
	}
}
