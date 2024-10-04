package ar.edu.unlp.objectos.uno.ejercicio13_ClientesDeCorreo;
import java.util.LinkedList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre,List<Email>emails) {
		this.nombre = nombre;
		this.emails=emails;//*
	}

	public String getNombre() {
		return nombre;
	}

	public List<Email> getEmails() {
		return emails;
	}
	
	public void agregarEmail(Email email) {
		this.emails.add(email);
	}
	
	public void mover(Email email,Carpeta destino) {
		destino.agregarEmail(email);
	}
	
	public int tamaño() {
		return this.emails.stream()
				.mapToInt(email->email.tamaño())
				.sum();
	}
	
	public Email buscar(String texto) {
		return this.emails.stream()
				.filter(email->email.contiene(texto))
				.findFirst().orElse(null);
	}
}
