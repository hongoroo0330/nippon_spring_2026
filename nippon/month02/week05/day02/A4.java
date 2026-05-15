import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kg: ");
        double kg = scanner.nextDouble();
        System.out.println("m: ");
        double m = scanner.nextDouble();
        double BMI = kg / (m * m);
        if (BMI < 18.5) {
            System.out.println("Turanhai");
            
        }
        else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Hewiin");
            
        }
        else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("Iluudel jin");

            
        }
        else if (BMI >= 30) {
            System.out.println("Targalalt");
            
        }

    }
    
}
