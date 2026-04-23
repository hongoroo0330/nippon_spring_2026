import java.util.Scanner;
public class tosol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-р барааны нэр: ");
        String name1 = scanner.nextLine();
        System.out.println("1-р барааны үнэ: ");
        int price1 = scanner.nextInt();
        System.out.println("1-р барааны тоо: ");
        int too1 = scanner.nextInt();

        System.out.println("2-р барааны нэр: ");
        String name2 = scanner.next();
        System.out.println("2-р барааны үнэ: ");
        int price2 = scanner.nextInt();
        System.out.println("2-р барааны тоо: ");
        int too2 = scanner.nextInt();

        System.out.println("3-р барааны нэр: ");
        String name3 = scanner.next();
        System.out.println("3-р барааны үнэ: ");
        int price3 = scanner.nextInt();
        System.out.println("3-р барааны тоо: ");
        int too3 = scanner.nextInt();

        int total1 = price1 * too1;
        int total2 = price2 * too2;
        int total3 = price3 * too3;
        int a = total1 + total2 + total3;
        double b = a / 0.1 / 100;
        double c = b + a;

        System.out.println("=== ДЭЛГҮҮР ===");
        System.out.println("==============================");
        System.out.println(name1 + " x " + too1 + " = " + total1 + " ₮ ");
        System.out.println(name2 + " x " + too2 + " = " + total2 + " ₮ ");
        System.out.println(name3 + " x " + too3 + " = " + total3 + " ₮ ");
        System.out.println("------------------------------");
        System.out.println(" Нийт дүн " + " = " + a);
        System.out.println(" НӨАТ (10%) " + " = " + b);
        System.out.println(" Нийт (НӨАТ-тай) " + " = " + c);
        System.out.println(" ==============================");



    }
    
}
