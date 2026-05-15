package backend;
public class StringHelper {
    static String reverse(String text) {
        String result = "";
        for (int i = text.length()-1; i >= 0; i--) {
            System.out.println(text.charAt(i));
        }
        
        
        return result;

    }
    static boolean isPalindrome(String text) {
        String result = "";
        for (int i = text.length() -1; i >= 0; i--) {
            result += text.charAt(i);
        }
       
        return result.equals(text);

    }
     static String repeat(String text, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += text;
            
        }
        return result;

        
     }
    public static void main(String[] args) {
        System.out.println(reverse("java"));
        System.out.println(isPalindrome("level"));
        System.out.println(repeat("ha", 4));
        
        
    }
    
}
