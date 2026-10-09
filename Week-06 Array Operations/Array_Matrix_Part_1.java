import java.util.Scanner;

public class Array_Matrix_Part_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] A = new int[2][3];
        int[][] B = new int[2][3];

        // Getting input for A matrix
        System.out.println("Enter elements for A matrix:");

        for (int row = 0; row < 2; row++) {

            for (int col = 0; col < 3; col++) {

                System.out.printf("A[%d][%d] = ", row, col);
                A[row][col] = input.nextInt();
            }
        }

        // Getting input for B matrix
        System.out.println("\nEnter elements for B matrix:");

        for (int row = 0; row < 2; row++) {

            for (int col = 0; col < 3; col++) {

                System.out.printf("B[%d][%d] = ", row, col);
                B[row][col] = input.nextInt();
            }
        }

        // Printing A matrix
        System.out.println("\nA Matrix:");

        for (int row = 0; row < 2; row++) {

            for (int col = 0; col < 3; col++) {
                System.out.print(A[row][col] + " ");
            }

            System.out.println();
        }

        // Printing B matrix
        System.out.println("\nB Matrix:");

        for (int row = 0; row < 2; row++) {

            for (int col = 0; col < 3; col++) {
                System.out.print(B[row][col] + " ");
            }
            System.out.println();
        }
    }
}