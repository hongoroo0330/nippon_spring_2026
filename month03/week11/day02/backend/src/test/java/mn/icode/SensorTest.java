package mn.icode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SensorTest {
	
	@Test
	public void readValue () {
		TemperatureSensor sensor = new TemperatureSensor(22);
		Assertions.assertEquals(22, sensor.readValue());
	}
	
	@Test
	public void unit () {
		TemperatureSensor sensor = new TemperatureSensor(22);
		Assertions.assertEquals("°C", sensor.unit());
		
	}

}
