import java.util.Scanner;
public class A7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nuuts ug oruulna uu: ");
         String pwd = scanner.next();

        boolean hasUpper = !pwd.equals(pwd.toLowerCase());
        boolean hasDigit = pwd.matches(".*\\d.*");
        int len = pwd.length();
        if (len >= 8 && hasUpper && hasDigit) {
            System.out.println("Huchtei");
            
        }
        else if (len >= 6 && (hasUpper || hasDigit)) {
            System.out.println("Dund");
            
            
        }
        else {
            System.out.println("Sul");
        }
    }
    
}
