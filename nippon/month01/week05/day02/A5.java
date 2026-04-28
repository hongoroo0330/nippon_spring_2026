import java.util.Scanner;
public class A5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sar oruulna uu (1-12): ");
        int month = scanner.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Owol");    
                break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Hawar");
                    break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Zun");
                        break;
                       case 9:
                       case 10:
                       case 11:
                        System.out.println("Namar"); 
                        break;                  
        
            default: System.out.println("Buruu sar");
                
        }

    }
    
}
