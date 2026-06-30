
import java.util.Scanner;

public class Assainment_11 {
    
    public static void main(String[] args) {

        int start, end, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Any starting Number: ");
        start = input.nextInt();

        System.out.println("Enter Any Ending Number: ");
        end = input.nextInt();

        if (start % 2 == 0) {
            start++;
        }
        for (int i = start; i <= end; i=i+2)
        {
            sum = sum + i;
        }
        System.out.println("Sum to: "+sum);

    }
}
