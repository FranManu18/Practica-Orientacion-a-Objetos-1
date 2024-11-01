package OO1.ejercicio21_Bag;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class mapaTest {
	private Map<String,Integer> mapa;
	
	@BeforeEach
	void setUp() {
		mapa=new HashMap();
		mapa.put("Lionel Messi", 111);
		mapa.put("Gabriel Batistuta", 56);
		mapa.put("Kun Aguero", 42);
	}
	
	@Test
	public void testRemove() {
		assertEquals(3,mapa.size());
		mapa.remove("Kun Aguero");
		assertEquals(2,mapa.size());
	}
	
	@Test
	public void testReplace() {
		assertEquals(111,mapa.get("Lionel Messi"));
		mapa.replace("Lionel Messi", 112);
		assertEquals(112,mapa.get("Lionel Messi"));
	}
	
	@Test
	public void testRepeat() {
		assertEquals(56,mapa.put("Gabriel Batistuta", 56));
	}
	
	@Test
	public void testIteracion() {
		int valorTotal=mapa.values().stream()
		.mapToInt(valor->valor.intValue())
		.sum();
		assertEquals(209,valorTotal);
	}
}
