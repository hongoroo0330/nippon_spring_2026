import java.util.Scanner;
public class TriangleArea {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Suuri: ");
    int a = scanner.nextInt();
    System.out.println("Ondor: ");
    int b = scanner.nextInt();
    int area = (a * b)/2;
    System.out.println("Gurwaljnii talbai: " + area);
    scanner.close();
  }

 }

