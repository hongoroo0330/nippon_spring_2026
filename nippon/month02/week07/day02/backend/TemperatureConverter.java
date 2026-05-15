package backend;
import java.util.Scanner;

public class TemperatureConverter {
    
    static Double celsiusToFahrenheit(double C) {

        double F = C * 9 / 5 + 32;

        return F;

    }

    static Double celsiusToKelvin(double C) {
        return C + 273.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Celsius оруулна уу; ");
        Double C = scanner.nextDouble();
        System.out.println("--- Хөрвүүлэлт ---");
        System.out.println(" Celsius: " + C);
        System.out.println(" Fahrenheit: " + celsiusToFahrenheit(C));
        System.out.println(" Kelvin: " + celsiusToKelvin(C));

        

    }

}
