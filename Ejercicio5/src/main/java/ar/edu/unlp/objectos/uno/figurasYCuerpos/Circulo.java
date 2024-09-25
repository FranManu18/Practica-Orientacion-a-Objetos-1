package ar.edu.unlp.objectos.uno.figurasYCuerpos;

public class Circulo implements Figura1{
	private double radio;
	private double diametro;
	private double perimetro;
	private double area;
	

	public void setRadio(double radio) {
		this.radio = radio;
		this.setDiametro(radio);
		this.setPerimetro(radio);
		this.setArea(radio);
	}
	
	public double getRadio() {
		return radio;
	}
	
	private void setDiametro(Double valor) {
		this.diametro=valor*2;
	}
	
	public double getDiametro() {
		return diametro;
	}

	private void setPerimetro(double valor) {
		this.perimetro = Math.PI*this.diametro;
	}
	
	public double getPerimetro() {
		return perimetro;
	}
	
	private void setArea(double valor) {
		this.area =  Math.PI*(this.radio*this.radio);
	}
	
	
	public double getArea() {
		return area;
	}

	
}
