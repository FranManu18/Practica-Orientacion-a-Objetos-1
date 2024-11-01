package OO1.ejercicio23_MercadoDeObjetos;

public class Cuotas6 implements FormasDePago {
	@Override
	public double precioFinal(double precio) {
		return precio+precio*0.20;
	}
}
