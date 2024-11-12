package OO1.parcial1_Distribuidora;

public class ProbarSistema {

	public static void main(String[] args) {
		Distribuidora d=new Distribuidora();
		
		ProductoNacional prod=d.registrarProductoNacional("Manaos", 20.5, "Bebida sabor cola");
		Cliente cliente=d.crearCliente("Juan","Jua@gmail.com");
		Pedido pedido=cliente.RegistrarPedido();
		pedido.agregarItem(prod, 20);

	}

}
