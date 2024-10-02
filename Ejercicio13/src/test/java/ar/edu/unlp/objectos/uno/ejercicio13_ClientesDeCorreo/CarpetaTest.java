package ar.edu.unlp.objectos.uno.ejercicio13_ClientesDeCorreo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CarpetaTest {
	private Carpeta carpeta;
	private Email emailA;
	private Email emailB;
	
	@BeforeEach
	void setUp() {
		carpeta=new Carpeta("Carpeta A");
		emailA=new Email("Email A","Cuerpo del Email A");
		emailA.adjuntar(new Archivo("Archivo A"));
		emailA.adjuntar(new Archivo("Archivo B"));
		emailB=new Email("Email B","Cuerpo del Email B");
		emailB.adjuntar(new Archivo("Archivo C"));
		emailB.adjuntar(new Archivo("Archivo D"));
		carpeta.agregarEmail(emailA);//*
		carpeta.agregarEmail(emailB);
	}
	
	@Test
	public void testGetters() {
		assertEquals("Carpeta A",carpeta.getNombre());
		assertEquals(2,carpeta.getEmails().size());
	}
	
	@Test
	public void testAgregar() {
		Carpeta carpeta=new Carpeta("Carpeta A");
		assertEquals(0,carpeta.getEmails().size());
		Email emailA=new Email("Email A","Cuerpo del Email A");
		carpeta.agregarEmail(emailA);
		assertEquals(1,carpeta.getEmails().size());
	}
	
	@Test
	public void testMover() {
		Carpeta destino=new Carpeta("Destino");
		Email emailA=new Email("Email A","Cuerpo del Email A");
		assertEquals(0,destino.getEmails().size());
		carpeta.mover(emailA, destino);
		assertEquals(1,destino.getEmails().size());
	}
	
	@Test
	public void testTamaño() {
		int tamaño=emailA.tamaño()+emailB.tamaño();
		assertEquals(tamaño,carpeta.tamaño());
	}
	
	@Test
	public void testBuscar() {
		Email emailEncontrado=carpeta.buscar("B");
		assertEquals(emailEncontrado.getTitulo(),emailB.getTitulo());
		assertEquals(emailEncontrado.getCuerpo(),emailB.getCuerpo());
		assertEquals(emailEncontrado.adjuntos().size(),emailB.adjuntos().size());
	}
}
