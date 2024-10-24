package OO1.ejercicio19_SistemaDeEnvioDePaquetes;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class personaFisica extends cliente {
	private String nombre;
	private String direccion;
	private int DNI;
	private List<envio>envios=new LinkedList<>();
	
	
	
	public personaFisica(String nombre, String direccion, List<envio> envios,int dNI) {
		super(nombre, direccion, envios);
		nombre = nombre;
		direccion = direccion;
		DNI = dNI;
		envios = envios;
	}

	public int getDNI() {
		return DNI;
	}
	
	public double montoAPagar(LocalDate fechaDeInicio,LocalDate fechaDeFin) {
		List<envio> enviosEntreFechas = this.getEnvios().stream()
		        .filter(envio -> 
		            (envio.getFecha().isEqual(fechaDeInicio) || envio.getFecha().isAfter(fechaDeInicio)) &&
		            (envio.getFecha().isEqual(fechaDeFin) || envio.getFecha().isBefore(fechaDeFin))
		        )
		        .collect(Collectors.toList());

		 double monto= enviosEntreFechas.stream()
		        .mapToDouble(envio->envio.calcularCosto())
		        .sum();
		return monto-monto*0.10;

	}
}
