public class Example01 {
    static String repeat(String s, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += s;
        }
        return result;
    }
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        System.out.println(repeat("*", 5));
        System.out.println(repeat("+", 15));
        System.out.println(repeat("<>", 10));

        System.out.println(isEven(5));
        System.out.println(isEven(4));
    }
      
    

        
    
   
    
    
    

       
  
}
