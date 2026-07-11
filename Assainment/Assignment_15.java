import java.util.Scanner;

public class Assignment_15{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String username, password;

        while (true){

            System.out.print("Username = ");
            username = input.nextLine();

            System.out.print("Password = ");
            password = input.nextLine();

            if (username.equals("Rian") && password.equals("123456")) 
            {
                System.out.println("Welcome to the system");
                break;
            } 
            else   
            {
                System.out.println("Username/Password is incorrect. Please try again!\n");
            }
        }
    }
}