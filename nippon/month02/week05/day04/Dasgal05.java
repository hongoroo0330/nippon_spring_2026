import java.util.Scanner;

public class Dasgal05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("suuri too: ");
        int base = scanner.nextInt();
        System.out.println("zereg: ");
        int exp = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= exp; i++) {
         result=base*result;
        }
        System.out.println(base + "^" + exp + "=" + result);
        
        

    }
    
}
