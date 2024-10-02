package ar.edu.unlp.objectos.uno.ejercicio13_ClientesDeCorreo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class EmailTest {
	private Email email;
	
	@BeforeEach
	void setUp() {
		email=new Email("Email A","Cuerpo del Email A");
		email.adjuntar(new Archivo("Archivo A"));
		email.adjuntar(new Archivo("Archivo B"));
	}
	
	@Test
	public void testGetters() {
		assertEquals("Email A",email.getTitulo());
		assertEquals("Cuerpo del Email A",email.getCuerpo());
		assertEquals(2,email.adjuntos().size());
	}
	
	@Test
	public void testAdjuntar() {
		Email mail=new Email("Email B","Cuerpo del email B");
		assertEquals(0,mail.adjuntos().size());
		mail.adjuntar(new Archivo("Archivo A"));
		assertEquals(1,mail.adjuntos().size());
	}
	
	@Test
	public void testTamaño() {
		int tamaño="Archivo A".length()+"Archivo B".length()+"Email A".length()+"Cuerpo del Email A".length();
		assertEquals(tamaño,email.tamaño());	
	}
	
	@Test
	public void testContiene() {
		assertTrue(email.contiene("Cuerpo"));
		assertFalse(email.contiene("maail"));
	}
}
