package OO1.ejercicio19_SistemaDeEnvioDePaquetes;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class cliente {
	private String nombre;
	private String direccion;
	private List<envio>envios=new LinkedList<>();
	
	
	public cliente(String nombre, String direccion, List<envio> envios) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.envios = envios;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public List<envio> getEnvios() {
		return envios;
	}
	
	public void agregarEnvio(envio envio) {
		this.envios.add(envio);
	}
	
	public abstract double montoAPagar(LocalDate fechaDeInicio,LocalDate fechaDeFin);
	
}
