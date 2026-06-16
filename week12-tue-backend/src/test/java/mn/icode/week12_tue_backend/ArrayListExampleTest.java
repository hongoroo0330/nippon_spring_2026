package mn.icode.week12_tue_backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ArrayListExampleTest {
	@Test
	public void testArrayList( ) {
		ArrayListExample a = new ArrayListExample();
		assertEquals(a.getListLength(), 0);
		
		a.addFruits();
		
		assertEquals(a.getListLength(), 6);
		
		a.addFruits();
		
		assertEquals(a.getListLength(), 12);
		
		assertEquals(a.getFruitByIndex(0), "Melon");
		assertEquals(a.getFruitByIndex(1), "Melon");
		assertEquals(a.getFruitByIndex(2), "Apple");
		
		assertTrue(a.isFruitExists("Apple"));
		assertFalse(a.isFruitExists("Mango"));
		
		a.changeFruit("Water Melon", 0);
		
		assertTrue(a.isFruitExists("Water Melon"));
		
		a.deleteFruitByIndex(0);
		
		assertEquals(a.getListLength(), 11);
		
	}

}
