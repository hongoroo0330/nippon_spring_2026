import java.util.Scanner;
public class A3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a tal: ");
        int a = scanner.nextInt();
        System.out.println("b tal: ");
        int b = scanner.nextInt();
        System.out.println("c tal: ");
        int c = scanner.nextInt();
        if (a == b && b == c) {
            System.out.println("Tegsh talt");
            
        }
        else if (a == b || a == c || c == b) {
            System.out.println("Tegsh 2 talt");
            
            
        }
        else {System.out.println("Yrdiin");}
        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("Gurwaljin bish");
            
        }
    
                
            
            
        }
    }
    

