package mn.icode.week12_thu_backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Image;
import java.rmi.MarshalledObject;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class HashMapTests {
	
	
	 @Test
	 public void testBasicPutAndGet() {
		 Map<String, Integer> studentGrades = new HashMap<String, Integer>();
		 
		 
		
		 
		 studentGrades.put("Alice", 95);
		 studentGrades.put("Bob", 82);
		 
		 int aliceGrade = studentGrades.get("Alice");
		 
		 assertEquals(95, aliceGrade, "Alice's grade should be 95");
		 assertNull(studentGrades.get("Charlie"), "Charlie's Grade is not included");
	 }
	 @Test
	 public void testCheckExistence( ) {
		 Map<String, String> capitalCities = new HashMap<String, String>();
		 capitalCities.put("France", "Paris");
		 capitalCities.put("Japan", "Tokyo");
		 
		 assertTrue(capitalCities.containsKey("Japan"));
		 assertFalse(capitalCities.containsKey("Germany"));
		 
		 assertTrue(capitalCities.containsValue("Paris"));
		 
	 }
	 @Test
	 public void testRemoveItem( ) {
		 Map<Integer, String> employeeNames = new HashMap<Integer, String>();
		 employeeNames.put(101, "Sarah");
		 employeeNames.put(102, "John");
		 
		 String removeEmployee = employeeNames.remove(101);
		 
		 assertEquals("Sarah", removeEmployee);
		 assertFalse(employeeNames.containsKey(101));
		 assertEquals(1, employeeNames.size());
		 
	 }
	 @Test
	 public void testUpdateExistingValue() {
		 Map<String, Double> productPrices = new HashMap<String, Double>();
		 productPrices.put("Coffee", 3.99);
		 productPrices.put("Tea", 2.49);
		 
		 productPrices.put("Coffee", 4.50);
		 
		 assertEquals(4.50, productPrices.get("Coffe"));
		 assertEquals(2, productPrices.size());
		 
	 }
	 
	 @Test
	 public void testSizeAndClear() {
		 Map<String, Integer> inventory = new HashMap<String, Integer>();
		 inventory.put("Apples", 50);
		 inventory.put("Oranges", 30);
		 inventory.put("Banana", 20);
		 
		 assertEquals(3, inventory.size());
		 assertFalse(inventory.isEmpty());
		 
		 inventory.clear();
		 
		 assertEquals(0, inventory.size());
		 assertTrue(inventory.isEmpty());
	 }
	 
	 @Test
	 public void testLoopingOverValuesToSum() {
		 Map<String, Integer> shoppingCart = new HashMap<String, Integer>();
		 shoppingCart.put("Apple", 2);
		 shoppingCart.put("Bread", 3);
		 shoppingCart.put("Milk", 4);
		 
		 int totalCost = 0;
		 for (int price: shoppingCart.values()) {
			 totalCost += price;
		 }
		 assertEquals(9, totalCost);
	 }
	 @Test
	 public void testloopingOverKeysToFindMatches() {
		 Map<String, String> userRoles = new HashMap<String, String>();
		 userRoles.put("alice_smith", "Admin");
		 userRoles.put("bob_jones", "User");
		 userRoles.put("charlie_smith", "User");
		 
		 int smithCount = 0;
		 
		 for (String username: userRoles.keySet()) {
			 if(username.endsWith("_smith")) {
				 smithCount++;
			 }
		 }
		 assertEquals(2, smithCount);
	 }
	 @Test
	 public void testLoopingOverEntriesToFilterData() {
		 Map<String, Integer> studentScores = new HashMap<String, Integer>();
		 studentScores.put("Nora", 85);
		 studentScores.put("Khishgee", 92);
		 studentScores.put("Myangaa", 78);
		 
		 String topStudent = "";
		 int highestScore = 0;
		 
		 for (Map.Entry<String, Integer> entry: studentScores.entrySet()) {
			 if (entry.getValue() > highestScore) {
				 highestScore = entry.getValue();
				 topStudent = entry.getKey();
			 }
			 
		 }
		 assertEquals("Khishgee", topStudent);
		 assertEquals(92, highestScore);
	 }

}
