package OO1.ejercicio16_FilteredSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class evenNumberTest {
	private Set<Integer> set;
	
	@BeforeEach
	void setUp() {
		set=new evenNumberSet();
	}
	
	@Test
	public void testAdd() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            set.add(1);
        });
        assertEquals("Solo se permiten números pares", exception.getMessage());
		assertTrue(set.add(2));
		assertFalse(set.add(2));
	}
	
	@Test
	public void testSize() {
		set.add(2);
		assertEquals(1,set.size());
	}
	
	@Test
	public void testIsEmpty() {
		assertTrue(set.isEmpty());
		set.add(2);
		assertFalse(set.isEmpty());
	}
	
	@Test
	public void testContains() {
		set.add(2);
		assertTrue(set.contains(2));
		assertFalse(set.contains(4));
	}
	
	@Test
	public void testRemove() {
		set.add(2);
		assertTrue(set.remove(2));
		assertFalse(set.remove(4));
	}
	
	@Test
	public void testContainsAll() {
		set.add(2);
		set.add(4);
		 List<Integer> testList1 = Arrays.asList(2, 4);
		 assertTrue(set.containsAll(testList1));		 
	}
	
	@Test
	public void testaddAll() {
		 List<Integer> testList1 = Arrays.asList(2, 4);
		 assertTrue(set.addAll(testList1));	
		 assertTrue(set.contains(2));
		 assertTrue(set.contains(4));
	}
	
	@Test
	public void testremoveAll() {
		set.add(2);
		set.add(4);
		set.add(6);
		List<Integer> testList1 = Arrays.asList(2, 4);
		assertTrue(set.removeAll(testList1));	
		assertFalse(set.contains(2));
		assertFalse(set.contains(4));
		assertTrue(set.contains(6));
	}
	
	@Test
	public void testClear() {
		set.add(2);
		set.clear();
		assertEquals(0,set.size());
	}
}
