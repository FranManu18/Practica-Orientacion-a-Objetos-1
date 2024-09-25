package ar.edu.unlp.objectos.uno.figurasYCuerpos;

public class Cuadrado implements Figura1 {
	private double lado;
	private double perimetro;
	private double area;

	public void setLado(double lado) {
		this.lado = lado;
		this.setPerimetro(lado);
		this.setArea(lado);
	}
	
	public double getLado() {
		return lado;
	}

	private void setPerimetro(double valor) {
		this.perimetro = valor*4;
	}
	
	public double getPerimetro() {
		return perimetro;
	}

	private void setArea(double valor) {
		this.area = valor*valor;
	}
	
	public double getArea() {
		return area;
	}


	
	
}
