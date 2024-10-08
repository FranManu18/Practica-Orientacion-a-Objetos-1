package OO1.ejercicio15_DistribuidoraElectrica;

public class Tarifa {
	private double ConsumoActivo;
	private double ConsumoReactivo;
	private double CuadroTarifario;
	
	public Tarifa(double consumoActivo, double consumoReactivo, double cuadroTarifario) {
		ConsumoActivo = consumoActivo;
		ConsumoReactivo = consumoReactivo;
		CuadroTarifario = cuadroTarifario;
	}

	public double getConsumoActivo() {
		return ConsumoActivo;
	}

	public double getConsumoReactivo() {
		return ConsumoReactivo;
	}

	public double getCuadroTarifario() {
		return CuadroTarifario;
	}
	
	public double calcularCostoDeConsumo() {
		return this.ConsumoActivo*this.CuadroTarifario;
	}
	
	public double calcularFactorDePotenciaEstimado() {
		return (this.ConsumoActivo/(Math.sqrt((Math.pow(ConsumoActivo, 2)+Math.pow(ConsumoReactivo, 2)))));
	}
	
	public void calcularFactorDePotencia() {
		if(this.calcularFactorDePotenciaEstimado()>0.8) {
			this.ConsumoReactivo+=10;
		}
	}
	
	public double calcularMontoFinal() {
		return this.ConsumoActivo-(this.ConsumoActivo*this.ConsumoReactivo/100);
	}
	
}
