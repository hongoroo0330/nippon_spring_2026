import java.util.Scanner;

public class Dasgal09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("1-10 iin hoorond too oruulna uu: ");
        num = scanner.nextInt();
        while (true) {
            if (num >= 1 && num <= 10) {
                System.out.println("zow too");
                break;
                
            }
            else {
                System.out.println("buruu too dahin oruulna uu");
                  num = scanner.nextInt();
            }
            
       
            
        }
    }
    
}
