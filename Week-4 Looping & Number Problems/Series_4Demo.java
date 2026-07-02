import java.util.Scanner;

public class Series_4Demo {
    
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);

        int n, sum = 0;

        System.out.println("Enter the last Number = ");
        n = input.nextInt();

        for(int i=2; i<n;i=i+1)
        {
            System.out.print(i + "X"+ i +" ");
            sum = sum + i*i;
        }
        System.out.println();
        System.out.println("Sumation = " + sum);

    }
}
