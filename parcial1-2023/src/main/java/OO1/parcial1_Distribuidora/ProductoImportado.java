package OO1.parcial1_Distribuidora;

public class ProductoImportado extends Producto {
	private String pais;

	public ProductoImportado(String nombre, double costoUnitario, String descripcion, String pais) {
		super(nombre, costoUnitario, descripcion);
		this.pais = pais;
	}

	public String getPais() {
		return pais;
	}
	
	@Override
	public double Impuesto(int unidades) {
		if(esMercosur() && unidades>50) {
			return this.getCostoUnitario() * 0.08;
		}else {
			return this.getCostoUnitario() * 0.21;
		}
	}
	
	private boolean esMercosur() {
		return pais.equals("Brasil") || pais.equals("Paraguay") || pais.equals("Uruguay");
	}
}
