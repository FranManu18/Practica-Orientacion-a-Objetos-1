package ar.edu.unlp.objectos.uno.ejercicio13_ClientesDeCorreo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
		cliente=new ClienteDeCorreo();
		emailA=new Email("Email A","Cuerpo del Email A");
		emailA.adjuntar(new Archivo("Archivo A"));
		emailA.adjuntar(new Archivo("Archivo B"));
		cliente.recibir(emailA);
		
		emailB=new Email("Email B","Cuerpo del Email B");
		emailB.adjuntar(new Archivo("Archivo C"));
		emailB.adjuntar(new Archivo("Archivo D"));		
		emailC=new Email("Email C","Cuerpo del Email C");
		emailC.adjuntar(new Archivo("Archivo E"));
		emailC.adjuntar(new Archivo("Archivo F"));
		
		carpetaA=new Carpeta("Carpeta A");
		carpetaA.agregarEmail(emailB);
		carpetaA.agregarEmail(emailC);
		
		emailD=new Email("Email D","Cuerpo del Email D");
		emailD.adjuntar(new Archivo("Archivo G"));
		emailD.adjuntar(new Archivo("Archivo H"));
		
		carpetaB=new Carpeta("Carpeta B");
		carpetaB.agregarEmail(emailD);
		
		cliente.agregarCarpeta(carpetaA);
		cliente.agregarCarpeta(carpetaB);	
	}
	
	@Test
	public void testGetters() {
		assertEquals(2,cliente.getCarpetas().size());
		assertEquals(1,cliente.getInbox().getEmails().size());
	}
	
	@Test
	public void tesRecibir() {
		Email emailX=new Email("Email X","Cuerpo del Email X");
		assertEquals(1,cliente.getInbox().getEmails().size());
		cliente.recibir(emailX);
		assertEquals(2,cliente.getInbox().getEmails().size());
	}
	
	@Test
	public void agregarCarpetaTest() {
		Carpeta carpetaX=new Carpeta("Carpeta X");
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
