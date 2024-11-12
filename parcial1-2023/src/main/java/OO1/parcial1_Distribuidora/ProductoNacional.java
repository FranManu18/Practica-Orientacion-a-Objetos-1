package OO1.parcial1_Distribuidora;

public class ProductoNacional extends Producto {
		
	
	public ProductoNacional(String nombre, double costoUnitario, String descripcion) {
		super(nombre, costoUnitario, descripcion);
	}

	@Override
	public double Impuesto(int unidades) {
		if(unidades<=10) {
			return this.getCostoUnitario()*0.05;
		}else {
			return 0;
		}
	}
}
