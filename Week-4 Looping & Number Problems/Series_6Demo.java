import java.util.Scanner;

public class Series_6Demo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n, result = 1;

        System.out.println("Enter the number = ");
        n = input.nextInt();

        for(int i=1;i<=n;i=i+1)
        {
            System.out.println(i + "X" + i + " ");
            result = result * i;
        }
        System.out.println();
        System.out.println("Result " + result);
    }
}
