import java.util.Scanner;
public class A6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jiliin orlogo: ");
        Long a = scanner.nextLong();
        Long b;
        if (a <= 10000000) {
            b = a * 10;
            System.out.println("Tatwar" + b/100); 
            
        }
        else if (a >= 10000001 && a <= 50000000) {
            b = a * 15;
            System.out.println("Tatwar" + b/100);
            
        }
        else if (a > 50000001) {
            b = a * 20;
            System.out.println("Tatwar" + b/100);
            
        }
    }
    
}
