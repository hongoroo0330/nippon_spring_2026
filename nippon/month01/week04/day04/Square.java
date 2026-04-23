import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tal: ");
        double a = scanner.nextDouble();
        double b = a * a;
        double c = a * 4;
        double d = a * Math.sqrt(2);
        System.out.println("Talbai: " + b);
        System.out.println("P: " + c);
        System.out.println("diagonal: " +d);
    }
    
}
