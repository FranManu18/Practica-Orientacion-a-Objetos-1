package ar.edu.unlp.objectos.uno.ejercicio12_VolumenYSuperficieDeSolidos;

import java.util.List;
import java.util.stream.Collectors;

public class ReporteDeConstruccion {
	private List<Pieza>piezas;

	public ReporteDeConstruccion(List<Pieza> piezas) {
		super();
		this.piezas = piezas;
	}

	public List<Pieza> getPiezas() {
		return piezas;
	}
	
	public void agregarPieza(Pieza pieza) {
		piezas.add(pieza);
	}
	
	public double volumenDeMaterial(String material) {
		List<Pieza>piezasDeMaterial=this.piezas.stream()
				.filter(pieza->pieza.getMaterial()==material)
				.collect(Collectors.toList());
		
		return piezasDeMaterial.stream()
				.mapToDouble(pieza->pieza.getVolumen())
				.sum();
		
	}
	
	public double getSuperficieDeColor(String unNombreDeColor) {
		List<Pieza>piezasDeColor=this.piezas.stream()
				.filter(pieza->pieza.getColor()==unNombreDeColor)
				.collect(Collectors.toList());
		
		return piezasDeColor.stream()
				.mapToDouble(pieza->pieza.getSuperficie())
				.sum();
	}
	
	
}
