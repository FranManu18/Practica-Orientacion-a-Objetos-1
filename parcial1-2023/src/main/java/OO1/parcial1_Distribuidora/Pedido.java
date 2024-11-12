package OO1.parcial1_Distribuidora;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Pedido {
	private Cliente cliente;
	private List<Item> items;
	private LocalDate fecha;
	
	public Pedido(Cliente cliente) {
		super();
		this.cliente = cliente;
		this.items = new LinkedList();
		this.fecha = LocalDate.now();
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}



	public List<Item> getItems() {
		return items;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public void agregarItem(Producto producto,int cantidad) {
		items.add(new Item(producto,cantidad));
	}

	public double costoPedido() {
		return items.stream()
				.mapToDouble(item->item.costoItem())
				.sum();
	}
	
}
