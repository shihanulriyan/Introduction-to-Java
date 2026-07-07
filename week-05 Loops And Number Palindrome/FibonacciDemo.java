
import java.util.Scanner;

public class FibonacciDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter any number = ");
        n = input.nextInt();

        int first = 0;
        int second = 1;
        int fibo;
        
        System.out.println(first);
        System.out.println(second);

        for(int i=3;i<=n;i++)
        {
            fibo = first + second;
            System.out.println(fibo);
            first = second;
            second = fibo;
        }
        System.out.println();
    }
}
