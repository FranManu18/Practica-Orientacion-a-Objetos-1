package OO1.parcial1_Distribuidora;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Cliente {
	private String nombre;
	private String email;
	private LocalDate fechaDeAlta;
	private List<Pedido> pedidos;
	
	public Cliente(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
		this.fechaDeAlta=LocalDate.now();
		this.pedidos=new LinkedList();
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getFechaDeAlta() {
		return fechaDeAlta;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public Pedido RegistrarPedido() {
		Pedido pedido=new Pedido(this);
		pedidos.add(pedido);
		return pedido;
	}
	
	public double costoDePedidos(LocalDate inicio,LocalDate fin) {
		return pedidos.stream()
				.filter(pedido->pedido.getFecha().isAfter(inicio) && pedido.getFecha().isBefore(fin))
				.mapToDouble(pedido->pedido.costoPedido())
				.sum();
	}
	
}
