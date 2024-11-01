package OO1.ejercicio23_MercadoDeObjetos;

import java.util.LinkedList;
import java.util.List;

public class Vendedor {
	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	public Vendedor(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos=new LinkedList();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public List<Producto> getProductos() {
		return productos;
	}
	
	public boolean agregarProducto(Producto prod) {
		productos.add(prod);
		return true;
	}
	
}
