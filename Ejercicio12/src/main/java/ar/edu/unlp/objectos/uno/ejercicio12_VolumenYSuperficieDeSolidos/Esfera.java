package ar.edu.unlp.objectos.uno.ejercicio12_VolumenYSuperficieDeSolidos;

public class Esfera extends Pieza {
	private int radio;

	public Esfera(int radio, String material, String color) {
		super(material,color);
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}
	
	@Override
	public double getVolumen() {
		return (4.0/3.0*Math.PI*Math.pow(this.radio, 3));
	}
	
	@Override
	public double getSuperficie() {
		return (4*Math.PI*Math.pow(this.radio, 2));
	}
}
