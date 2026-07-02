import java.util.Scanner;

public class Series_1Demo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n, sum = 0;

        System.err.println("Enter the fast Number: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i = i + 1)
        {
            System.err.println(i + " ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("Sumation: " + sum);
    }
}
