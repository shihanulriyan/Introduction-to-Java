import java.util.Scanner;

public class RianDemo {
    public static void main(String[] args) {
     
     Scanner input = new Scanner(System.in); 
        
        String name;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Welcome = " + name);
        
        input.close();
    }
}