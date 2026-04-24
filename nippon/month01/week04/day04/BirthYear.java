import java.util.Scanner;

public class BirthYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Neree oruulna uu: ");
        String name = scanner.nextLine();
        System.out.println("Nasaa oruulna uu: ");
        int b = scanner.nextInt();
        int c = 2025 - b;
        System.out.println(name  +  ""  +  b  +  "nastai," + c + "ond torson. ");
    }
    
}
