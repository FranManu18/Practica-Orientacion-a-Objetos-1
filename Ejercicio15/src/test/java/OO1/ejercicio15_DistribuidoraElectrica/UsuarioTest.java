package OO1.ejercicio15_DistribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	private Usuario usuario;
	
	@BeforeEach
	void setUp() {
		List<Tarifa>tarifas=new LinkedList();
		tarifas.add(new Tarifa(100.0,10,20.2));
		usuario=new Usuario("Francisco","Calle uno",tarifas);
	}
	
	@Test
	public void TestAgregarTarifa() {
		assertEquals(1,usuario.getTarifas().size());
		usuario.agregarTarifa(new Tarifa(80.2,5,10.4));
		assertEquals(2,usuario.getTarifas().size());
	}
	
	@Test
	public void testFactura() {
		String factura="Usuario: "+usuario.getNombre()+
				" Fecha de Emision: "+LocalDate.now()+" Con una bonificacion de: "+
				usuario.getTarifas().get(usuario.getTarifas().size()-1).getConsumoReactivo()+" y monto final: "+usuario.getTarifas().get(usuario.getTarifas().size()-1).calcularMontoFinal();
		assertEquals(factura,usuario.obtenerFactura());
		System.out.print(usuario.obtenerFactura());
	}
}
