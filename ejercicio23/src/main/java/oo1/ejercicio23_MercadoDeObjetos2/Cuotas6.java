package oo1.ejercicio23_MercadoDeObjetos2;

public class Cuotas6 implements FormaDePago {
	
	public double calcularCosto(double valor) {
		return valor+valor*0.2;
	}
}
