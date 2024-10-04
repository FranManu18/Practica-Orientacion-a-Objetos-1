package ar.edu.unlp.objectos.uno.ejercicio13_ClientesDeCorreo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ClienteDeCorreoTest {
	private ClienteDeCorreo cliente;
	private Email emailA;
	private Email emailB;
	private Email emailC;
	private Email emailD;
	private Carpeta carpetaA;
	private Carpeta carpetaB;
	@BeforeEach
	void setUp() {
		List<Email>emails=new LinkedList();
		List<Archivo>archivos1=new LinkedList<Archivo>();
		archivos1.add(new Archivo("Archivo A"));
		archivos1.add(new Archivo("Archivo B"));
		emails.add(new Email("Email A","Cuerpo del Email A",archivos1));
		List<Archivo>archivos2=new LinkedList<Archivo>();
		archivos2.add(new Archivo("Archivo C"));
		archivos2.add(new Archivo("Archivo D"));
		emails.add(new Email("Email B","Cuerpo del Email B",archivos2));
		Carpeta inbox=new Carpeta("Inbox",emails);
		
		List<Email>emails2=new LinkedList();
		List<Archivo>archivos3=new LinkedList<Archivo>();
		archivos3.add(new Archivo("Archivo E"));
		archivos3.add(new Archivo("Archivo F"));
		emails2.add(new Email("Email C","Cuerpo del Email C",archivos3));
		List<Archivo>archivos4=new LinkedList<Archivo>();
		archivos4.add(new Archivo("Archivo G"));
		archivos4.add(new Archivo("Archivo H"));
		emails2.add(new Email("Email D","Cuerpo del Email D",archivos4));
		
		List<Email>emails3=new LinkedList();
		List<Archivo>archivos5=new LinkedList<Archivo>();
		archivos5.add(new Archivo("Archivo i"));
		archivos5.add(new Archivo("Archivo j"));
		emails3.add(new Email("Email E","Cuerpo del Email E",archivos5));
		List<Archivo>archivos6=new LinkedList<Archivo>();
		archivos6.add(new Archivo("Archivo k"));
		archivos6.add(new Archivo("Archivo l"));
		emails3.add(new Email("Email F","Cuerpo del Email F",archivos6));
		
		List<Carpeta>carpetas=new LinkedList();
		carpetas.add(new Carpeta("Carpeta A",emails2));
		carpetas.add(new Carpeta("Carpeta B",emails3));
		cliente=new ClienteDeCorreo(inbox,carpetas);
			
	}
	
	
	@Test
	public void tesRecibir() {
		assertEquals(2,cliente.getInbox().getEmails().size());
		cliente.recibir(new Email("Email X","Cuerpo del Email x",new LinkedList<Archivo>()));
		assertEquals(3,cliente.getInbox().getEmails().size());
	}
	
	@Test
	public void agregarCarpetaTest() {
		Carpeta carpetaX=new Carpeta("Carpeta X",new LinkedList<Email>());
		assertEquals(2,cliente.getCarpetas().size());
		cliente.agregarCarpeta(carpetaX);
		assertEquals(3,cliente.getCarpetas().size());
	}
	
	@Test
	public void testBuscar() {
		assertEquals("Email A",cliente.buscar("A").getTitulo());
		assertEquals("Email B",cliente.buscar("B").getTitulo());
	}
	
	@Test
	public void testEspacioOcupado() {
		int tamaño=cliente.getInbox().tamaño();
		tamaño+=cliente.getCarpetas().stream().mapToInt(carpeta->carpeta.tamaño()).sum();
		assertEquals(tamaño,cliente.espacioOcupado());
	}
}
