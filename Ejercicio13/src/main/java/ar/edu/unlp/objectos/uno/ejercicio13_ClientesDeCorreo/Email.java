package ar.edu.unlp.objectos.uno.ejercicio13_ClientesDeCorreo;

import java.util.LinkedList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> archivos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo=cuerpo;
		this.archivos=new LinkedList();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}
	

	public List<Archivo> adjuntos() {
		return archivos;
	}
	
	public void adjuntar(Archivo archivo) {
		archivos.add(archivo);
	}
	
	public int tamaño() {
		int sumaAdjuntos=this.archivos.stream()
				.mapToInt(archivo->archivo.tamaño())
				.sum();
		
		return sumaAdjuntos+this.cuerpo.length()+this.titulo.length();
	}
	
	public boolean contiene(String texto) {
		if(this.titulo.contains(texto)||this.cuerpo.contains(texto)) {
			return true;
		}
		return false;
	}
}
