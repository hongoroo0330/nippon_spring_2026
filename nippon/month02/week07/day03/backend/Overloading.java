public class Overloading {
    static void show(int n) {
      System.out.println(" int: " + n);    
    }
    static void show(double n) {
        System.out.println("double:" + n);
    }
    static void show(String s) {
        System.out.println("String:" + s);
    }
    static void show(int a, int b) {
        System.out.println("two ints:" + a + " , " + b);
    }
   static void print(String s) {
    System.out.println((s));
   }
   static void print(int n) {
    System.out.println((n));
   }
    
    public static void main(String[] args) {
        show(42);
        show(3.14);
        show("hello");
        show(1, 2);
        show((double)5);
        print(3);
        
        
    }
  

    }
    
        
    

