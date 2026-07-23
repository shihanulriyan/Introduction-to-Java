import java.util.Scanner;

public class Array_2_Demo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double[] number = new double[5];
        double sum = 0;

        System.out.println("Please Enter Five Number = ");
        for(int i=0; i<number.length; i++)
        {
            number[i] = input.nextDouble();
        }

        for(int i=0; i<number.length; i++)
        {
            sum = sum + number[i];
        }
        System.out.println("Sumation is = " + sum);
        
        double avg = sum / 5;
        System.out.println("Average is : "+avg);
    }
}
