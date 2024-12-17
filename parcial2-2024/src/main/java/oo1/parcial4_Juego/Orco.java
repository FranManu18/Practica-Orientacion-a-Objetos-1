package oo1.parcial4_Juego;

public class Orco extends Personaje {

	public Orco(String nombre, Rol rol) {
		super(nombre, 1, 2, rol);
	}
	
	@Override
	public double incremento(int valor,int hora) {
		if(hora<=8 && hora>=20) {
			return valor+valor*0.6;
		}
		return valor;
	}
	
	@Override
	public boolean puedeSubir() {
		return this.getNivel()%3==0;
	}
	
	
}
