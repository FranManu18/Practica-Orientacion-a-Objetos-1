package ar.edu.unlp.objectos.uno.figurasYCuerpos;

public class Cuerpo3D {
	private Figura1 caraBasal;
	private double altura;
	
	public Figura1 getCaraBasal() {
		return caraBasal;
	}
	public double getAltura() {
		return altura;
	}
	public void setCaraBasal(Figura1 caraBasal) {
		this.caraBasal = caraBasal;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getVolumen() {
		return this.caraBasal.getArea()*this.altura;
	}
	
	public double getSuperficieExterior() {
		return (2*this.caraBasal.getArea())+(this.caraBasal.getPerimetro()*this.altura);
	}
}
