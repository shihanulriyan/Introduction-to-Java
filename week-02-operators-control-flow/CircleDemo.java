import java.util.Scanner;
public class CircleDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double raduis,area;

        System.out.print("Enter raduis: ");
        raduis = input.nextDouble();
        
        area = 3.1416 * raduis * raduis;
        System.out.print("Area of Circle " + area);
    }
}