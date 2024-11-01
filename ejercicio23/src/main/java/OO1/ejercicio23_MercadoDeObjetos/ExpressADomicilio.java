package OO1.ejercicio23_MercadoDeObjetos;


public class ExpressADomicilio implements FormasDeEnvio {
	public double precioAdicional() {
		CalculadoraDeDistancia calc=new CalculadoraDeDistancia();
		return calc.distanciaEntre("A", "B")*0.5;
	}
}
