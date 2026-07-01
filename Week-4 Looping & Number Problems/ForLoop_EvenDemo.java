
import java.util.Scanner;

public class ForLoop_EvenDemo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int m, n;
        System.out.println("Enter Fast Number: ");
        m = input.nextInt();

        System.out.println("Enter Second Number: ");
        n = input.nextInt();

        for(int i=m;i<=n;i++ )
        {
            if(i%2==0)
            {
                sum = sum + i;
                System.out.println(" "+i);
            }
        }
        System.out.println("Enter value of: " + sum);

    }
    
}
