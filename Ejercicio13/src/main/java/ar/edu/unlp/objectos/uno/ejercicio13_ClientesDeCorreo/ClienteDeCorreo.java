package ar.edu.unlp.objectos.uno.ejercicio13_ClientesDeCorreo;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ClienteDeCorreo {
	private Carpeta Inbox;
	private List<Carpeta> carpetas;

	
	public ClienteDeCorreo(Carpeta inbox, List<Carpeta> carpetas) {
		super();
		Inbox = inbox;
		this.carpetas = carpetas;
	}

	public void recibir(Email email) {
		this.Inbox.agregarEmail(email);
	}
	
	public Email buscar(String texto) {
		Email email=this.Inbox.buscar(texto);
		if(email!=null) {
			return email;
		}else {
			 return this.carpetas.stream()
		                .map(carpeta -> carpeta.buscar(texto))  
		                .findFirst().orElse(null);		
		}
	}
	
	public int espacioOcupado() {
		return this.Inbox.tamaño()+this.carpetas.stream()
		.mapToInt(carpeta->carpeta.tamaño())
		.sum();
	}
	
	public List<Carpeta> getCarpetas() {
		return carpetas;
	}
	
	public Carpeta getInbox() {
		return Inbox;
	}
	
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
	
}
