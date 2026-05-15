

public class example01 {
    static int sumR(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumR(n - 1);
    }
    static int sumI(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
    static int sumF(int n) {
        return n * (n + 1) / 2;

    }
    static int powerF(int n) {
        if (n == 1) {
            return 1;
        }
        return n * powerF(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(sumR(100));
        System.out.println(sumI(100));
        System.out.println(sumF(100));
        System.out.println(powerF(3));
        
    }
    
}
