import java.util.Scanner;

public class Assignment_13{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int m, n, temp, r, sum, totalPalindromeNumber = 0;

        System.out.print("Enter start number = ");
        m = input.nextInt();

        System.out.print("Enter end number = ");
        n = input.nextInt();

        System.out.println("Palindrome numbers are : ");

        for(int i = m; i <= n; i++){

            temp = i;
            sum = 0;

            while (temp != 0)
            {
                r = temp % 10;
                sum = sum * 10 + r;
                temp = temp / 10;
            }
            if (i == sum)
            {
                System.out.println(i);
                totalPalindromeNumber++;
            }
        }
        System.out.println("Total Palindrome numbers = " + totalPalindromeNumber);
    }
}
