import java.util.Scanner;
public class dasgal02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Too ogno uu: ");
        int x = scanner.nextInt();
        String result = (x > 10) ? "Том" : (x > 5) ? "Дунд" : "Жижиг";
System.out.println(result);
        
    }
    
}
