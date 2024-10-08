package OO1.ejercicio15_DistribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TarifaTest {
	private Tarifa tarifa;
	
	@BeforeEach
	void setUp() {
		tarifa=new Tarifa(100.0,10,20.2);		
	}
	
	@Test
	public void testConstoDeConsumo() {
		double resultado=tarifa.getConsumoActivo()*tarifa.getCuadroTarifario();
		assertEquals(resultado,tarifa.calcularCostoDeConsumo());
	}
	
	@Test
	public void testFactorEstimado() {
		double resultado=(tarifa.getConsumoActivo()/(Math.sqrt((Math.pow(tarifa.getConsumoActivo(), 2)+Math.pow(tarifa.getConsumoReactivo(), 2)))));
		assertEquals(resultado,tarifa.calcularFactorDePotenciaEstimado());
	}
	
	@Test
	public void testFactorDePotencia() {
		tarifa.calcularFactorDePotencia();
		assertEquals(20,tarifa.getConsumoReactivo());
	}
	
	@Test
	public void testMontoFinal() {
		double resultado=tarifa.getConsumoActivo()-(tarifa.getConsumoActivo()*tarifa.getConsumoReactivo()/100);
		assertEquals(resultado,tarifa.calcularMontoFinal());
	}
}
