
import java.util.Scanner;

public class ForLoop_Demo3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int m, n;
        System.out.print("Enter fast Number: ");
        m = input.nextInt();

        System.out.println("Enter Second Number: ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {

            sum = sum + i;

        }
        System.out.print("Enter value of: " + sum);
        
    }
    
}
