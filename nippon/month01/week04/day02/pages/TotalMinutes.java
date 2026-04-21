
import java.util.Scanner;
public class TotalMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tsag: ");
        int a = scanner.nextInt();
        System.out.println("Minut: ");
        int b = scanner.nextInt();
        int c = ((60*a)+b);
        System.out.println("Niit: " + c);
    }
    
}
