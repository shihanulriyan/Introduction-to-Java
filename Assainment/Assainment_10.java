import java.util.Scanner;

public class Assainment_10 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int i = 1;
        int n;
        int result = 1;

        System.out.print("Enter any number: ");
        n = input.nextInt();
        for(i = 1; i <= n; i++) {
            
            result = result * i;
        }
        System.out.println("Fectorial " + result);
    
    }
}
