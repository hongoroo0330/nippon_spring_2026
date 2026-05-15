import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;
public class dasgal03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ongo: ");
        String color = scanner.nextLine();
switch (color) {
    case "red":   System.out.println("Улаан"); break;
    case "green": System.out.println("Ногоон"); break;
    case "blue":  System.out.println("Цэнхэр"); break;
    default:      System.out.println("Бусад");
}
    }
    
}
