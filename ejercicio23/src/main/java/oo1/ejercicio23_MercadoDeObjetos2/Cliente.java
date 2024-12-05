
package oo1.ejercicio23_MercadoDeObjetos2;

import java.util.LinkedList;
import java.util.List;

import OO1.ejercicio21_Bag.BagImpl;



public class Cliente {
	private String nombre;
	private String direccion;
	private List<Pedido>pedidos;
	
	public Cliente(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.pedidos=new LinkedList();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public boolean hacerPedido(FormaDePago formaDePago,FormaDeEnvio formaDeEnvio,Producto producto,int cantidad) {
		if(producto.hayUnidades(cantidad)) {
			producto.descontarUnidades(cantidad);
			Pedido pedido=new Pedido(this,formaDePago,formaDeEnvio,producto,cantidad);
			pedidos.add(pedido);
			return true;
		}
		return false;
	}
	
	public BagImpl<String> productoPorCategoria() {
		BagImpl<String> bag=new BagImpl<String>();
		pedidos.forEach(pedido->bag.add(pedido.getProducto().getCategoria()));
		return bag;
	}
		
}
