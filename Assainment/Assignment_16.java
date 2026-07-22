import java.util.Scanner;

public class Assignment_16{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        
        System.out.print("Enter Any Number : ");
        n = input.nextInt();

        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                
                if (col % 2 != 0) 
                    {
                    System.out.print("1 ");
                } else 
                    {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}