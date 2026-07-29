import java.util.Scanner;

public class Array_Maximum{
    
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
        System.out.println("Average is : " + avg);
        
        double max = number[0];
        for (int i = 1; i < 5; i++) {

            if (max < number[i]) {
                max = number[i];
            }
        }
        System.out.println("Maximum is "+ max);
    }
}
