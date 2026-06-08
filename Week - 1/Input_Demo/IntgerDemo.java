
import java.util.Scanner;

public class IntgerDemo {
    public static void main(String[] args) {

        Scanner intput = new Scanner(System.in);
        int number;

        System.out.print("Enter any number: ");
        number = intput.nextInt();

        System.out.print("Number = " + number);
        intput.close();
    }
}
