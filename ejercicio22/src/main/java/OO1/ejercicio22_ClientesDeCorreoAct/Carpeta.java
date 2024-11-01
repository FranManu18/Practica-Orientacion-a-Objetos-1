package OO1.ejercicio22_ClientesDeCorreoAct;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import OO1.ejercicio21_Bag.BagImpl;


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
	
	public int cantMails() {
		BagImpl bag=new BagImpl();
		for(Email email:emails) {
			bag.add(email);
		}
		
		return bag.size();
	}
	
	public BagImpl mailsPorTamaño(){
		BagImpl bag=new BagImpl();
		emails.forEach(email->bag.add(email.queSoy()));
		return bag;
	}
	
}
