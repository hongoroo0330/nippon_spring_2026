public class Exercises {
    static void greet(String name) {
        System.out.println("Sain uu, " + name + "!");
    }
    static int max(int a, int b) {
        if (a > b) return a;
        return b;
    }
    static Boolean isEven(int n) {
        return n % 2 == 0;
    }
    static Double circleArea(int r) {
        return Math.PI * (r * r);
    }
    static int double_(int n) {
        return n * 2;
    }
    static String shout(String s) {
        return s.toUpperCase() + "!";
    }
    static boolean isBig(int n) {
        return n > 100;
    }
    static void stamp(String label, int value) {
        System.out.println(label + " = " + value);
    }
    static void greetUser(String name, int age) {
        System.out.println(" Saina uu " + name + " Ta " + age + " nastai baina ");
    }
    static double celsiusToFahrenheit(double c) {
        return  c * 9/5 + 32;
    }
    static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 400 == 0 || year % 100 == 1;
        
    }
    public static void main(String[] args) {
       greet("Hongoroo");
       System.out.println(max(3, 4));

       System.out.println(isEven(5));

       System.out.println(circleArea(5));

       System.out.println(double_(7));
       System.out.println(double_(double_(3)));

       System.out.println(shout("Saina uu"));
       System.out.println(isBig(50));
       System.out.println(isBig(200));

      stamp("Dun", double_(45));
      greetUser("Hongoroo", 25);
      System.out.println(celsiusToFahrenheit(0));
      System.out.println(celsiusToFahrenheit(100));

      System.out.println(isLeapYear(2024));
      System.out.println(isLeapYear(1900));
      System.out.println(isLeapYear(2000));
    }
    
    
}
