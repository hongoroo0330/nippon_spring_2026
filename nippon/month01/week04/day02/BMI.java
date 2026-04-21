import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jim: ");
        Double a = scanner.nextDouble();
        System.out.println("Ondor: ");
        Double b = scanner.nextDouble();
        Double c = a / (b*b);
        System.out.println("BMI: " + c);
        
    }
    
}
