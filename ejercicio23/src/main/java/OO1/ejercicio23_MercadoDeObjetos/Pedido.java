package OO1.ejercicio23_MercadoDeObjetos;

public class Pedido {
	private Cliente cliente;
	private FormasDePago formaDePago;
	private FormasDeEnvio formaDeEnvio;
	private Producto producto;
	private int cantidad;
	
	public Pedido(Cliente cliente, FormasDePago formaDePago, FormasDeEnvio formaDeEnvio, Producto producto,
			int cantidad) {
		this.cliente = cliente;
		this.formaDePago = formaDePago;
		this.formaDeEnvio = formaDeEnvio;
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public FormasDePago getFormaDePago() {
		return formaDePago;
	}

	public FormasDeEnvio getFormaDeEnvio() {
		return formaDeEnvio;
	}

	public Producto getProducto() {
		return producto;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	public double getCosto() {
		return formaDePago.precioFinal(producto.getPrecio())+formaDeEnvio.precioAdicional();
	}
}
