import java.util.Scanner;

public class CapitalSmallDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter any letter");
        ch = input.next().charAt(0);

        if(ch>='a' && ch<='z')  // a-z
        {
            System.out.println("Small");
        }
        else if(ch>='A' && ch<='Z') //A-Z
        {
            System.out.println("Capital"); //A-Z
        }
        else {
            System.out.println("Not a letter");
        }
    }   
}
