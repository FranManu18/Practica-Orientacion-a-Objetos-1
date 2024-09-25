package ar.edu.unlp.objectos.uno.ejercicio7_RedDeAlumbrado;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
public class Farola {
	private boolean Interruptor;
	private List<Farola>Neighbords;
	
	public Farola() {
		this.Interruptor=false;
		this.Neighbords=new LinkedList();
	}
	
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		this.Neighbords.add(otraFarola);
		otraFarola.Neighbords.add(this);
	}
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors (){
		return this.Neighbords;
	}
	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if(!this.Interruptor) {
			this.Interruptor=true;
			for(Farola far:this.Neighbords) {
				far.turnOn();
			}
		}
	}
	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if(this.Interruptor) {
			this.Interruptor=false;
			for(Farola far:this.Neighbords) {
				far.turnOff();
			}
		}
	}
	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return this.Interruptor;
	}
	
	/*
	* Retorna true si la farola está apagada.
	*/
	public boolean isOff() {
		return (this.Interruptor==false);
	}
	
	
}

