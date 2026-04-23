import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mongo: ");
        double a = scanner.nextDouble();
        System.out.println("Huu %: ");
        double b = scanner.nextDouble();
        double c = a * b / 100;
        System.out.println("1 jiliin huu: " + c);
    }
    
}
