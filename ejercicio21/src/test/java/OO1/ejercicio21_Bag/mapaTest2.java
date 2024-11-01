package OO1.ejercicio21_Bag;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class mapaTest2 {
	private Map<Jugador,Integer> mapa;
	private Jugador messi;
	private Jugador batistuta;
	private Jugador aguero;
	
	@BeforeEach
	void setUp() {
		mapa=new HashMap();
		messi = new Jugador("Lionel", "Messi");
        batistuta = new Jugador("Gabriel", "Batistuta");
        aguero = new Jugador("Kun", "Agüero");
		mapa.put(messi, 111);
		mapa.put(batistuta, 56);
		mapa.put(aguero, 42);
	}
	
	@Test
	public void testRemove() {
		assertEquals(3,mapa.size());
		mapa.remove(aguero);
		assertEquals(2,mapa.size());
	}
	
	@Test
	public void testReplace() {
		assertEquals(111,mapa.get(messi));
		mapa.replace(messi, 112);
		assertEquals(112,mapa.get(messi));
	}
	
	@Test
	public void testRepeat() {
			assertEquals(56,mapa.put(batistuta, 56));
	}

	
	@Test
	public void testIteracion() {
		int valorTotal=mapa.values().stream()
		.mapToInt(valor->valor.intValue())
		.sum();
		assertEquals(209,valorTotal);
	}
}
