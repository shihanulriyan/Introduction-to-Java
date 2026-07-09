import java.util.Scanner;
public class Assignment_13{
   public static void main(String[] args){

    try (Scanner input = new Scanner(System.in)){
      System.out.print("start number: ");
      int m = input.nextInt();

      System.out.print("end number: ");
      int n = input.nextInt();
      
      int totalPalindromeNumber=0;

    
     System.out.println("Total Palindrome numbers : "+totalPalindromeNumber);
    }
  }
}