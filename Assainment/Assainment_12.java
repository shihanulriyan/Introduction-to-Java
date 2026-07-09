import java.util.Scanner;

public class Assainment_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Which Fibonacci number do you want to see? ");
        int n = input.nextInt();

        int first = 0;
        int second = 1;
        int fibo = 0;

        if (n == 0) {
            System.out.println("Fibonacci number is: " + first);
        } 
        else if (n == 1) {
            System.out.println("Fibonacci number is: " + second);
        } 
        else {
            for (int i = 2; i <= n; i++) {
                fibo = first + second;
                first = second;
                second = fibo;
            }

            System.out.println("Fibonacci number is: " + fibo);
        }

        input.close();
    }
}