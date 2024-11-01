package OO1.ejercicio22_ClientesDeCorreoAct;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class EmailTest {
private Email email;
	
	@BeforeEach
	void setUp() {
		List<Archivo>archivos=new LinkedList<Archivo>();
		archivos.add(new Archivo("Archivo A"));
		archivos.add(new Archivo("Archivo B"));
		email=new Email("Email A","Cuerpo del Email A",archivos);
	}
	
	
	@Test
	public void testAdjuntar() {
		List<Archivo>archivos=new LinkedList<Archivo>();
		Email mail=new Email("Email B","Cuerpo del email B",archivos);
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
