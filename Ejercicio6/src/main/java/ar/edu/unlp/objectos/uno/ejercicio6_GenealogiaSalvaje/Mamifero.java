package ar.edu.unlp.objectos.uno.ejercicio6_GenealogiaSalvaje;

public class Mamifero {
	private String Identificador;
	private String Especie;
	private Mamifero Padre;
	private Mamifero Madre;
	private Mamifero AbueloMaterno;
	private Mamifero AbueloPaterno;
	private Mamifero AbuelaMaterna;
	private Mamifero AbuelaPaterna;
	
	
	public Mamifero(String identificador) {
		Identificador = identificador;
	}
	
	public Mamifero() {
		Identificador = "desconocido";
	}
	
	public String getIdentificador() {
		return Identificador;
	}
	public String getEspecie() {
		return Especie;
	}
	public Mamifero getPadre() {
		return Padre;
	}
	public Mamifero getMadre() {
		return Madre;
	}
	public Mamifero getAbueloMaterno() {
		if (this.Madre != null) {
	        return this.Madre.getPadre();  
	    }
	    return null;
	}
	public Mamifero getAbueloPaterno() {
		if (this.Padre != null) {
	        return this.Padre.getPadre();  
	    }
	    return null;
	}
	public Mamifero getAbuelaMaterna() {
		if (this.Madre != null) {
	        return this.Madre.getMadre();  
	    }
	    return null;
	}
	public Mamifero getAbuelaPaterna() {
		if (this.Padre != null) {
	        return this.Padre.getMadre();  
	    }
	    return null;
	}
	public void setIdentificador(String identificador) {
		Identificador = identificador;
	}
	public void setEspecie(String especie) {
		Especie = especie;
	}
	public void setPadre(Mamifero padre) {
		Padre = padre;
	}
	public void setMadre(Mamifero madre) {
		Madre = madre;
	}
		
	public boolean tieneComoAncestroA(Mamifero unMamifero ) {
		if(this.Padre!=null && this.BuscarAncestro(this.Padre,unMamifero)) {
			return true;
		}
		if(this.Madre!=null && this.BuscarAncestro(this.Madre,unMamifero)) {
			return true;
		}
		return false;
	}
	
	private boolean BuscarAncestro(Mamifero actual, Mamifero unMamifero) {
		if(actual.equals(unMamifero)) {
			return true;
		}
		if(actual.getPadre()!=null && actual.BuscarAncestro(actual.getPadre(), unMamifero)) {
			return true;
		}
		
		if(actual.getMadre()!=null && actual.BuscarAncestro(actual.getMadre(), unMamifero)) {
			return true;
		}
		return false;
	}
	
	
}
