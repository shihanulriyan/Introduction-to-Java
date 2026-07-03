import java.util.Scanner;

public class PrimeDemo_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any positive integer = ");
        int num = input.nextInt();
        boolean isPrime = true;

        if (num < 2) 
            {
            isPrime = false;
        } else 
            {
            for (int i = 2; i < num; i++) 
                {
                if (num % i == 0) 
                    {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime ? "Prime Number" : "Not Prime");
    }
}