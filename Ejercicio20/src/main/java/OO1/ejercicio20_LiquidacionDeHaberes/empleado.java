package OO1.ejercicio20_LiquidacionDeHaberes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

public class empleado {
	private String nombre;
	private String apellido;
	private int CUIL;
	private LocalDate fechaDeNacimiento;
	private boolean tieneHijosACargo;
	private List<contrato>contratos;
	public empleado(String nombre, String apellido, int cUIL, LocalDate fechaDeNacimiento, boolean tieneHijosACargo,
			List<contrato> contratos) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		CUIL = cUIL;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.tieneHijosACargo = tieneHijosACargo;
		this.contratos = contratos;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getCUIL() {
		return CUIL;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public boolean isTieneHijosACargo() {
		return tieneHijosACargo;
	}
	public List<contrato> getContratos() {
		return contratos;
	}
	
	public int obtenerAntiguedad() {
		int duracionContratos=contratos.stream()
				.mapToInt(contrato->contrato.ObtenerDuracion())
				.sum();
		return (int)ChronoUnit.MONTHS.between(LocalDate.of(0, 1, 1), LocalDate.of(0, 1, 1).plusMonths(duracionContratos))/12;
	}
	
	public double calcularMonto() {
		contrato vigente=contratos.stream()
				.filter(contrato->contrato.esVigente())
				.findFirst().orElse(null);
		
		double suma=vigente.calcularMonto();
		
		int antiguedad=this.obtenerAntiguedad();
		if(antiguedad<5) {
			return suma;
		}else if(antiguedad>=5 && antiguedad<10) {
			return suma+suma*0.30;
		}else if(antiguedad>=10 &&antiguedad<15) {
			return suma+suma*0.50;
		}else if(antiguedad>=15 &&antiguedad<20) {
			return suma+suma*0.70;
		}
		return suma*2;
	}
	
	public String imprimirRecibo() {
		String recibo="Nombre: "+this.nombre+" Apellido: "+this.apellido
				+" CUIL: "+this.CUIL+" Antiguedad: "+this.obtenerAntiguedad()+ " años "+ 
				" Fecha: "+LocalDate.now()+" Monto a cobrar: "+this.calcularMonto();
		return recibo;
	}
	
}
