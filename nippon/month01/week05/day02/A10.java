import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Too oruulna uu: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("sorog too");
            
        }
        else if (n > 0) {
            System.out.println("Eyreg too");
        
            
        }
        else {System.out.println("Teg");
            
        }
        if (n % 2 == 0) {
            System.out.println("Tegsh");
            
        }
        else if (n % 2 == 1) {
            System.out.println("Sondgoi");
            
        }
        if (n % 5 == 0) {
            System.out.println("5-d huwaagdana");
            
            
        }
        else {System.out.println("5-d huwaagdahgui");}
        if (n <= 9 && n >= -9) {
            System.out.println("neg orontoi");
            
                
            }
            else if (n <= 99 && n >= 10 || n <= -10 && n >= -99) {
                System.out.println("2 orontoi");
            
                
            }
            else if (n >= 100 && n <= 999 || n >= -999 && n <= -100) {
                System.out.println("3 orontoi");
                
            }
            
        }
    }
    

