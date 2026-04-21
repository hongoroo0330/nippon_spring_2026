import java.util.Scanner;
public class Receipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Baraanii ner: ");
        String name = scanner.nextLine();
        System.out.println("Une: ");
        int a = scanner.nextInt();
        System.out.println("Too: ");
        int b = scanner.nextInt();
        int c = (a*b);
        System.out.println("Niit une: " + c);
    }
    
}
