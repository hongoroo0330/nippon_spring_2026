import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Onoo oruulna uu: ");
        int score = scanner.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");

        } else if (score >= 70) {
            System.out.println("C");

        } else if (score >= 60) {
            System.out.println("D");

        } else if (score <= 59) {
            System.out.println("F");

        } else {
            System.out.println("Buruu onoo");
        }
    }

}
