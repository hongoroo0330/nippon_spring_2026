import java.util.Scanner;
public class A8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Niit dun: ");
        int total = scanner.nextInt();
        long b;
        if (total < 100000) {
            System.out.println("hongololt baihgui");

            
        }
        else if (total >= 100000 && total <= 499999) {
            b = total * 5;
            System.out.println("Hongololt: " + b/100);
            
            
        }
        else if (total >= 500000 && total <= 999999) {
            b = total * 10;
            System.out.println("Hongololt: " + b/100);
            
        }
        else if (total >= 1000000) {
            b = total * 15;
            System.out.println("Hongololt: " + b/100);
            
        }
    }
    
}
