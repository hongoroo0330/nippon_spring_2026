package mn.icode;

import java.time.temporal.ChronoUnit;

public  class PressureSensor implements Sensor {
	private double hPa;
	public PressureSensor(double hPa) {
		this.hPa = hPa;
	}
	

	@Override 
	 public String unit() {
		return "hPa";
	}


	@Override
	public double readValue1() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	}
	
	

	 
	

}
