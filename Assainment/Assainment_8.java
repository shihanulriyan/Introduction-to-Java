
import java.util.Scanner;

public class Assainment_8 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int digit;

        System.out.print(" call center: ");
        digit = input.nextINT();

        switch(digit)
            case 1:
                System.out.println("language is Bengali");
                break;
            case 2:
                System.out.println("language is Hindi");
                break;
            case 3:
                System.out.println("language is Urdu");
                break;
            default:
                System.out.println(" language is English");
            
    }
}
