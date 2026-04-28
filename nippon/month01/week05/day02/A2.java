import java.util.Scanner;
public class A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jil oruulna uu: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0)) {
            System.out.println(year  +  " leap year ");
        
            
        }
            else {System.out.println(year  +  " Not leap year ");}

            
        }
    }

