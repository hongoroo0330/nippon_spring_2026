package mn.icode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SensorTest {
	
	@Test
	public void readValue() {
		TemperatureSensor sensor = new TemperatureSensor(22);
		Assertions.assertEquals(22, sensor.readValue());
	}
	
	@Test
	public void unit () {
		TemperatureSensor sensor = new TemperatureSensor(22);
		Assertions.assertEquals("°C", sensor.unit());
		
	}
	@Test
	public void readValue1() {
		PressureSensor sensor = new PressureSensor(5000);
		Assertions.assertEquals(5000, sensor.readValue1());
	}
	@Test
	public void unit1() {
		PressureSensor sensor = new PressureSensor(5000);
		Assertions.assertEquals("%", sensor.unit());
		
	}

}
