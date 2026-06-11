package mn.icode;

public interface Sensor {
	static double readValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	String unit();

	default String report() {
		return String.format("Sensor reading: %,1f%", readValue(), unit());
	}

	default boolean isNormal(double min, double max) {
		return readValue() >= min && readValue() <= max;

	}

	double readValue1();
}
