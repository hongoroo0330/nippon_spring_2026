package backend;
public class MathHelper {
    static int sum(int a, int b) {
        return a + b;
    }
    static int product(int a, int b) {
        return a * b;
    }
    static int averege(int a, int b, int c) {
         return (a + b + c)/3;
    }
    static int max(int a, int b) {
        if (a > b);
        return a;
    }
    static int min(int a, int b) {
        if (a > b);
        return b;
    }
    static int absolute(int a) {
        if (a < 0);
        return -a;
        

    }
   public static void main(String[] args) {
    System.out.println(sum(3, 5));
    System.out.println(product(4, 6));
    System.out.println(averege(10, 20, 30));
    System.out.println(max(7, 3));
    System.out.println(min(7, 3));
    System.out.println(absolute(-15));
    
   }
    
}


