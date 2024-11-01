package OO1.ejercicio23_MercadoDeObjetos;

import java.util.LinkedList;
import java.util.List;

import OO1.ejercicio21_Bag.BagImpl;

public class Cliente {
	private String nombre;
	private String direccion;
	private List<Pedido> pedidos;
	
	public Cliente(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.pedidos = new LinkedList();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public boolean agregarPedido(FormasDePago formaDePago,FormasDeEnvio formaDeEnvio,Producto prod,int cant) {
		if(cant<=prod.getUnidades()) {
			prod.setUnidades(prod.getUnidades()-cant);
			Pedido pedido=new Pedido(this,formaDePago,formaDeEnvio,prod,cant);
			pedidos.add(pedido);
			return true;
		}else {
			return false;
		}	
	}
	
	public BagImpl productosPorCategoria() {
		BagImpl bag=new BagImpl();
		pedidos.forEach(pedido->bag.add(pedido.getProducto().getCategoria()));
		return bag;
	}
}
