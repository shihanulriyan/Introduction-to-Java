import java.util.Scanner;

public class Assainment2{
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        // Variable declare
        int id;
        String title;
        double price;
        String description;
        String category;

        System.out.print("Enter Product ID :");
        id = input.nextInt();
        input.nextLine(); // buffer clear

        System.out.print("Enter Product Title :");
        title = input.nextLine();

        System.out.print("Enter Product Price :");
        price = input.nextDouble();
        input.nextLine(); // buffer clear

        System.out.print("Enter Description :");
        description = input.nextLine();

        System.out.print("Enter Category :");
        category = input.nextLine();

        System.out.println("ID          : "+ id);
        System.out.println("Title       : "+ title);
        System.out.println("Price       : "+ price + "BDT");
        System.out.println("Description : "+ description);
        System.out.println("Category    : "+ category);
    }
}