
import java.util.Scanner;

public class Assainment_11 {
    
    public static void main(String[] args) {

        int i ,n, m, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Any First Number: ");
        i = input.nextInt();

        System.out.println("Enter Any Ending Number: ");
        m = input.nextInt();

        for(n=i;n<=m;n=n+2)
        {
            sum = sum + n;
        }
        System.out.println("Sum to: "+sum);

    }
}
