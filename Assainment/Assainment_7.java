import java.util.Scanner;

public class Assainment_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char english, masters;
        System.out.println("have you completed your masters?( y/n):");
        english = input.next().charAt(0);

        System.out.println("are you fulent in English?( y/n):");
        masters = input.next().charAt(0);

        if(english=='y' &&  masters=='y')
        {
            System.out.println("you are eligible to for the job interview");
        }
        else 
        {
            System.out.println(" you are not eligible to for the job interview");
        }
    }
}