import java.util.Scanner;
public class TemperatureDemo_2 {
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        double farn,cels;

        System.out.print("Farnheight = ");
        farn = input.nextDouble();

        cels = (5.0 / 9.0) * (farn - 32);
        System.out.print("Celsius: " + cels);
    }
}
