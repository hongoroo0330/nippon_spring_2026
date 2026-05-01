import java.util.Scanner;

public class Dasgal11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, count = 0;
        int number;

        while (true) {
            System.out.println("too oruulna uu: ");
            number = scanner.nextInt();
            if (number == 0) {
                break;

            }
            total = number + number;
            count++;

        }
        double averege = total / count;
        System.out.println("niit too: " + count + "niilber: " + total + "dundaj: " + averege);
        scanner.close();

    }
}
