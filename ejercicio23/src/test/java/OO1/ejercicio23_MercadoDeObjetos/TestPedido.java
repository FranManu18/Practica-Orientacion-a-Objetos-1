package OO1.ejercicio23_MercadoDeObjetos;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPedido {
	private Pedido pedido;
	
	@BeforeEach
	void setUp() {
		FormasDePago pago=new Cuotas6();
		FormasDeEnvio envio= new ExpressADomicilio();
		pedido=new Pedido(new Cliente("Francisco","Calle 1"),pago,envio,new Producto("Electrodomestico",50.3,10),1);
	}
	
	@Test
	public void testCosto() {
		assertEquals(110.36,pedido.getCosto());
	}
}
