package OO1.parcial1_Distribuidora;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.Comparator;

public class Distribuidora {
	private List<Cliente>clientes;
	private List<Producto>productosRegistrados;

	public Distribuidora() {
		this.clientes = new LinkedList();
		this.productosRegistrados=new LinkedList();
	}

	public List<Cliente> getClientes() {
		return clientes;
	}
		

	public List<Producto> getProductosRegistrados() {
		return productosRegistrados;
	}



	public Cliente crearCliente(String nombre,String email) {
		Cliente cliente=new Cliente(nombre,email);
		clientes.add(cliente);
		return cliente;
	}
	
	public ProductoNacional registrarProductoNacional(String nombre,double costoUnitario,String descripcion) {
		ProductoNacional producto=new ProductoNacional(nombre,costoUnitario,descripcion);
		productosRegistrados.add(producto);
		return producto;
	}
	
	public ProductoImportado registrarProductoImportado(String nombre,double costoUnitario,String descripcion,String pais) {
		ProductoImportado producto=new ProductoImportado(nombre,costoUnitario,descripcion,pais);
		productosRegistrados.add(producto);
		return producto;
	}
	
	public int CantidadSolicitadaDeProducto(Producto producto) {
		return clientes.stream()
				.flatMap(cliente->cliente.getPedidos().stream())
				.collect(Collectors.toList()).stream()
				.flatMap(pedido->pedido.getItems().stream())
				.filter(item->item.getProducto().getNombre().equals(producto.getNombre()))
				.mapToInt(item->item.getCantidad())
				.sum();
				
	}
	
	
	public List<Cliente> getTop5(){
		LocalDate dias=LocalDate.now().minusDays(30);
		return clientes.stream()
	            .sorted((cl1, cl2) -> 
	                Double.compare(cl2.costoDePedidos(dias, LocalDate.now()), 
	                               cl1.costoDePedidos(dias, LocalDate.now())))
	            .limit(5)
	            .collect(Collectors.toList());
	}
}
