import java.util.Scanner;
public class dasgal01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a too: ");
        int a = scanner.nextInt();
        System.out.println("b too: ");
        int b = scanner.nextInt();
        if (a % b ==1) {System.out.println("uldegdel 1");}
        else if (a % b == 0) {System.out.println("huwaagdana");}
        else {System.out.println("uldegdel: " + (a % b));}
    }
    
    
}
