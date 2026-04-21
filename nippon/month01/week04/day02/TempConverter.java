import java.util.Scanner;
public class TempConverter {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Celsius: ");
    int c = scanner.nextInt();
    int F = (c*9/5+32);
    System.out.println("Fahrenheit: " + F);
}    
}
