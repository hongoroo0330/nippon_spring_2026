import java.util.Scanner;

public class CircleArea {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Radius: ");
        Double r = scanner.nextDouble(); 
        System.out.println("Hariu: ");
        Double area = Math.PI * r * r;
        System.out.println(area);
    }
    
}
