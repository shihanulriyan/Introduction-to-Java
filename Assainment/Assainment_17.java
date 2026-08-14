import java.util.Scanner;

public class Assainment_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] days = new String[7];

        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";

        System.out.print("Enter day number (1-7) : ");
        int day = input.nextInt();

        if (day >= 1 && day <= 7) {
            System.out.println(days[day - 1]);
        } else {
            System.out.println("Invalid day number");
        }

    }
}