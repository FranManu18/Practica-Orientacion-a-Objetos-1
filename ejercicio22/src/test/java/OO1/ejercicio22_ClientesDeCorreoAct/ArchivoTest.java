package OO1.ejercicio22_ClientesDeCorreoAct;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ArchivoTest {
private Archivo archivo;
	
	@BeforeEach
	void setUp() {
		archivo=new Archivo("Archivo A");
	}
	
	@Test
	public void testArchivo() {
		assertEquals("Archivo A",archivo.getNombre());
		assertEquals("Archivo A".length(),archivo.tamaño());
	}
}
