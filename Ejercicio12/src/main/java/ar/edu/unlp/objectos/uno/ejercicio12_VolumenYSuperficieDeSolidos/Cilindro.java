package ar.edu.unlp.objectos.uno.ejercicio12_VolumenYSuperficieDeSolidos;

public class Cilindro extends Pieza {
	private int radio;
	private int altura;
	
	 public Cilindro(int radio, int altura, String material, String color) {
	        super(material, color); // Llama al constructor de Pieza
	        this.radio = radio;
	        this.altura = altura;
	 }

	public int getRadio() {
		return radio;
	}

	public int getAltura() {
		return altura;
	}
	
	
	
	@Override
	public double getVolumen() {
		return Math.PI*Math.pow(this.radio, 2)*this.altura;
	}
	
	@Override
	public double getSuperficie() {
		return (2*Math.PI*this.radio*this.altura)+(2*Math.PI*Math.pow(this.radio, 2));
	}
}
