import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        System.out.println("1-r too: ");
        a += scanner.nextDouble();
        System.out.println("2-r too: ");
        a += scanner.nextDouble();
        System.out.println("3-r too: ");
        a += scanner.nextDouble();
        System.out.println("4-r too: ");
        a += scanner.nextDouble();
        System.out.println("5-r too: ");
        a += scanner.nextDouble();
        double b = a / 5;
        System.out.println("Dundaj: " + b);

    }
    
}
