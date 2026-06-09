package mn.icode;

public class TemperatureSensor implements Sensor {
	private double celsius;

	public TemperatureSensor(double celsius) {
		this.celsius = celsius;
	}

	@Override
	public double readValue() {

		return celsius;
	}

	@Override
	public String unit() {

		return "°C";
	}

}
