package OO1.parcial1_Distribuidora;

public class Item {
	private Producto producto;
	private Integer cantidad;
	public Item(Producto producto, Integer cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	
	public double costoItem() {
		return producto.getCostoUnitario()*cantidad+producto.Impuesto(cantidad);
	}
}
