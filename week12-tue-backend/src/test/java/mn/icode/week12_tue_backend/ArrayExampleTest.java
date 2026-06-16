
package mn.icode.week12_tue_backend;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArrayExampleTest {
 
	@Test
	void testArrayAdd() {
		ArrayExample a = new ArrayExample();
		
		assertEquals(a.getLength(), 5);
		assertEquals(a.getCurrentIndex(), 0);
		
		a.addNumber(5);
		assertEquals(null, null);
	}
}
