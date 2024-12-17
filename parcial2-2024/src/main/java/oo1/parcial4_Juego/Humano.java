package oo1.parcial4_Juego;

public class Humano extends Personaje {

	public Humano(String nombre,Rol rol) {
		super(nombre, 2, 1, rol);
	}
	
	@Override
	public double incremento(int valor,int hora) {
		if(hora>=8 && hora<=20) {
			return valor+valor*0.4;
		}
		return valor;
	}
	
	@Override
	public boolean puedeSubir() {
		return this.getNivel()>=7;
	}
	
}

	
