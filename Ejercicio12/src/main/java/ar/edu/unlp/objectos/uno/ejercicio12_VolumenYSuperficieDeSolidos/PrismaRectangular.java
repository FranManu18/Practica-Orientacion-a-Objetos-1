package ar.edu.unlp.objectos.uno.ejercicio12_VolumenYSuperficieDeSolidos;

public class PrismaRectangular extends Pieza {
	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	public PrismaRectangular(int ladoMayor, int ladoMenor, int altura, String material, String color) {
		super(material,color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}
	public int getLadoMayor() {
		return ladoMayor;
	}
	public int getLadoMenor() {
		return ladoMenor;
	}
	public int getAltura() {
		return altura;
	}
	
	@Override
	public double getVolumen() {
		return (this.ladoMayor*this.ladoMenor*this.altura);
	}
	
	@Override
	public double getSuperficie() {
		return (2*((this.ladoMayor*this.ladoMenor)+(this.ladoMayor*this.altura)+(this.ladoMenor*this.altura)));
	}
	
}
