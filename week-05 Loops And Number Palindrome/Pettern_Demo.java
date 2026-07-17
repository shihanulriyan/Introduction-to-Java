import java.util.Scanner;

public class Pettern_Demo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Plase enter line numbers : ");
        
        int n = input.nextInt();

        for(int row = 1; row<=n;row++)
        {
            for (int col = 1; col <= row; col++)
            {
                System.out.print("" + col);
            }
               System.out.println();
        }
       

    }
}
