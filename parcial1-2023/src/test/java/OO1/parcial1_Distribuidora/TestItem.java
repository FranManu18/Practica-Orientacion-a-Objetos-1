package OO1.parcial1_Distribuidora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestItem {
	private Item item;
	
	@BeforeEach
	void setUp() {
		item=new Item(new ProductoImportado("Oreo",60.2,"Galletita","USA"),50);
	}
	
	@Test
	public void testCostoItem() {
		assertEquals(3022.642,item.costoItem());
	}
}
