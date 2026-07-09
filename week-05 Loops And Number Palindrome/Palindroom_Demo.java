
import java.util.Scanner;

public class Palindroom_Demo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num, sum = 0, temp, r;
        
        System.out.println("Enter any number = ");
        num = input.nextInt();

        temp = num;
        while(temp!=0)
        {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        if(temp==sum)
        {
            System.out.println("Palindroom number!");
        }
        else
        {
            System.out.println("Not Palindroom number!");
        }
    }
}
