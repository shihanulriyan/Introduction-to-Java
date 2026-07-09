import java.util.Scanner;

public class Assignment_14{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int m, n, temp, r, sum, totalarmstongNumber = 0;

        System.out.print("Enter start number = ");
        m = input.nextInt();

        System.out.print("Enter end number = ");
        n = input.nextInt();

       System.out.println("Armstrong numbers are : ");

        for(int i = m; i <= n; i++){

            temp = i;
            sum = 0;

            while (temp != 0)
            {
                r = temp % 10;
                sum = sum + r*r*r;
                temp = temp / 10;
            }
            if((i>=0 && i<=9)||(i == sum))
            {
                System.out.println(i+"");
                totalarmstongNumber++;
            }
        }
        System.out.println("Total armstong numbers = " + totalarmstongNumber);
    }
}