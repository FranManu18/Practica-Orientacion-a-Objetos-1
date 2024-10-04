package ar.edu.unlp.objectos.uno.ejercicio13_ClientesDeCorreo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CarpetaTest {
	private Carpeta carpeta;
	private int tamaño;
	
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
		carpeta=new Carpeta("Carpeta A",emails);
		tamaño=emails.stream().mapToInt(email->email.tamaño()).sum();
	}
	
	
	@Test
	public void testAgregar() {
		List<Email>emails=new LinkedList();
		Carpeta carpeta=new Carpeta("Carpeta A",emails);
		assertEquals(0,carpeta.getEmails().size());
		List<Archivo>archivos1=new LinkedList<Archivo>();
		Email email=new Email("Email A","Cuerpo del Email A",archivos1);
		carpeta.agregarEmail(email);
		assertEquals(1,carpeta.getEmails().size());
	}
	
	@Test
	public void testMover() {
		List<Email>emails=new LinkedList();
		Carpeta destino=new Carpeta("Destino",emails);
		List<Archivo>archivos1=new LinkedList<Archivo>();
		Email emailA=new Email("Email A","Cuerpo del Email A",archivos1);
		assertEquals(0,destino.getEmails().size());
		carpeta.mover(emailA, destino);
		assertEquals(1,destino.getEmails().size());
	}
	
	@Test
	public void testTamaño() {
		assertEquals(tamaño,carpeta.tamaño());
	}
	
	@Test
	public void testBuscar() {
		Email emailEncontrado=carpeta.buscar("B");
		assertEquals("Email B",emailEncontrado.getTitulo());
		assertEquals("Cuerpo del Email B",emailEncontrado.getCuerpo());
		assertEquals(2,emailEncontrado.adjuntos().size());
	}
}
