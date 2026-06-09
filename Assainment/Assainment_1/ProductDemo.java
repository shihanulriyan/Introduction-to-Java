import java.util.Scanner;


public class ProductDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int id;
        String title;
        double price;
        String description;
        String category;

        System.out.println("Enter your id=");
        id = input.nextInt();
        input.nextLine(); 
        System.out.println("ID = " + id);

        System.out.println("Enter your title=");
        title = input.nextLine();
        System.out.println("Title = " + title);

        System.out.println("Enter your price=");
        price = input.nextDouble();
        input.nextLine(); 
        System.out.println("Price = " + price);

        System.out.println("Enter your description=");
        description = input.nextLine();
        System.out.println("Description = " + description);

        System.out.println("Enter your category=");
        category = input.nextLine();
        System.out.println("Category = " + category);

        input.close();
    }
}