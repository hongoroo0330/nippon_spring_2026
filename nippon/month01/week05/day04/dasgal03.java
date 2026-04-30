import java.util.Scanner;

public class dasgal03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n toog oruulna uu: ");
        int n = scanner.nextInt();
        int b = 1;
        for (int i = 1;i <= n; i++) {
            b = b * i;
        }
        System.out.println(n + "! =" + b);
    }
    
}
