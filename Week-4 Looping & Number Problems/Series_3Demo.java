import java.util.Scanner;

public class Series_3Demo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double n, sum = 0;

        System.out.println("Enter the last Number = ");
        n = input.nextDouble();

        for(double i=1.5;i<=n;i=i+1)
        {
            System.out.println(i + " ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("Sumation = " + sum);
    }
}
