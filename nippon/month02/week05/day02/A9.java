import java.util.Scanner;
public class A9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gerliin ongo (Ulaan/Nogoon/Shar): ");
        String color = scanner.next();
        switch (color) {
            case "Ulaan":
                System.out.println("Zogs");
                break;
            case "Shar":
                System.out.println("Belen bol");
                break;
            case "Nogoon":
                System.out.println("Ywj bolno");
                break;       
        
            default: System.out.println("Buruu ongo");
                
        }
    }
    
}
