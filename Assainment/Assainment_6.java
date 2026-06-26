import java.util.Scanner;

public class Assainment_6 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Do you love java?");
        ch = input.next().charAt(0);

        if(ch=='y' || ch=='Y')
        {
            System.out.println("you are a java lover");
        }
        else if(ch=='n' || ch=='N')
        {
            System.out.println("you are not a java lover");
        }
    }
}
