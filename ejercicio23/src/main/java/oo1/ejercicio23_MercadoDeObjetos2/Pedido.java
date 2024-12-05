package oo1.ejercicio23_MercadoDeObjetos2;

public class Pedido {
	private Cliente comprador;
	private FormaDePago formaDePago;
	private FormaDeEnvio formaDeEnvio;
	private Producto producto;
	private int cantidad;
	
	public Pedido(Cliente comprador, FormaDePago formaDePago, FormaDeEnvio formaDeEnvio, Producto producto,
			int cantidad) {
		super();
		this.comprador = comprador;
		this.formaDePago = formaDePago;
		this.formaDeEnvio = formaDeEnvio;
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Cliente getComprador() {
		return comprador;
	}

	public void setComprador(Cliente comprador) {
		this.comprador = comprador;
	}

	public FormaDePago getFormaDePago() {
		return formaDePago;
	}

	public void setFormaDePago(FormaDePago formaDePago) {
		this.formaDePago = formaDePago;
	}

	public FormaDeEnvio getFormaDeEnvio() {
		return formaDeEnvio;
	}

	public void setFormaDeEnvio(FormaDeEnvio formaDeEnvio) {
		this.formaDeEnvio = formaDeEnvio;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double calcularCostoTotal() {
		return formaDePago.calcularCosto(producto.getPrecio())+formaDeEnvio.costoAdicional();
	}
}
