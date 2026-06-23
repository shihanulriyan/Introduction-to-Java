import java.util.Scanner;

// Assignment 3: installment amount calculate korar program
public class Assainment3{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // variable declare
        String productName;
        double productPrice;
        int numberOfInstallment;
        double installmentPerMonth;

        // input newa
        System.out.print("Enter product name: ");
        productName = input.nextLine();

        System.out.print("Enter product price: ");
        productPrice = input.nextDouble();

        System.out.print("Enter number of installment: ");
        numberOfInstallment = input.nextInt();

        // calculation
        installmentPerMonth = productPrice / numberOfInstallment;

        // output print
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice + " euros");
        System.out.println("Number of installment: " + numberOfInstallment);
        System.out.println("Monthly installment Amount: " + installmentPerMonth + " euros");

        input.close();
    }
}