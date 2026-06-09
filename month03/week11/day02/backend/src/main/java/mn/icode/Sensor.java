package mn.icode;

public interface Sensor {
	double readValue();

	String unit();

	default String report() {
		return String.format("Sensor reading: %,1f%", readValue(), unit());
	}

	default boolean isNormal(double min, double max) {
		return readValue() >= min && readValue() <= max;

	}
}
