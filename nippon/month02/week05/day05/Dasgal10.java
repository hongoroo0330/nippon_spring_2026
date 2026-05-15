import java.util.Scanner;

public class Dasgal10 {
    public static void main(String[] args) {
        int secret = 42;
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Too taana uu: ");
        int guess = -1;
        while (guess != secret  ) {
           
            guess = scanner.nextInt();
            attempts++;

            if (guess > secret) {
                System.out.println("Baga too oruulna uu: ");
                
            }
            else if (guess < secret) {
                System.out.println("Ih too oruulna uu: ");
                
            }
            else System.out.println(" zow taalaa " + attempts + " oroldlogo " + " Hiilee ");
            
            
        }
    }
    
}
