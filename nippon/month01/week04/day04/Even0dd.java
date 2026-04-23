import java.util.Scanner;
public class Even0dd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Too: ");
        int a = scanner.nextInt();
        int b = a % 2;
        System.out.println(a + " % 2 = " + b + " (" + (b == 0 ? "Tegsh" : "Sondgoi") + ")");

        
    }
    
}
