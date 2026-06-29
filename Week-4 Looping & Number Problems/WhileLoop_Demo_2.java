public class WhileLoop_Demo_2 {
    
    public static void main(String[] args) {
        
        int i = 1;
        int sum = 0;

        while (i <= 10) {

            if (i % 2 == 0) {

                sum = sum + i;
                System.out.println("Even Number = " + i);

            }
            i++;
        }
        System.out.println("Sum of Even Numbers = " + sum);
    }
}
