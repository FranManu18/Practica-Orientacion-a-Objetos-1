package OO1.ejercicio19_SistemaDeEnvioDePaquetes;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class clienteCorporativo extends cliente {
	private String nombre;
	private String direccion;
	private int CUIL;
	private List<envio>envios;
	

	public clienteCorporativo(String nombre, String direccion, List<envio> envios, int cUIL) {
		super(nombre, direccion, envios);
		nombre = nombre;
		direccion = direccion;
		CUIL = cUIL;
		envios = envios;
	}



	public int getCUIL() {
		return CUIL;
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
		 return monto;
	}
	
	
}
