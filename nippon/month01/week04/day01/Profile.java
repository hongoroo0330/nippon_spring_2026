import java.util.Scanner;

public class Profile {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Name: ");
    String name = scanner.nextLine();
    System.out.println("Age: ");
    int Age = scanner.nextInt();
    System.out.println("City: ");
    String City = scanner.next();
    System.out.println("=============================");
    System.out.println("NAME: " + name);
    System.out.println("AGE: " + Age);
    System.out.println("CITY: " + City);
    System.out.println("=============================");
    }
    
}
