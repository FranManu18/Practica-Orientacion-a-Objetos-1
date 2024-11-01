package OO1.ejercicio22_ClientesDeCorreoAct;

import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> archivos;
	
	public Email(String titulo, String cuerpo,List<Archivo>archivos) {
		this.titulo = titulo;
		this.cuerpo=cuerpo;
		this.archivos=archivos;
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
	
	public String queSoy() {
		if(this.tamaño()>=0 && this.tamaño()<=300) {
			return "Pequeño";
		}else if(this.tamaño()>300 && this.tamaño()<=500) {
			return "Mediano";
		}else {
			return "Grande";
		}
	}
}
