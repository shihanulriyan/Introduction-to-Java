public class DataType {
    
    public static void main(String[] args) {
       
        boolean b = true; // Dynamic intialization
        char c = 'a';
        short s = 32677;
        int i = 126587;
        Float f = 10.2f;
        double d = 10.5;

        /* System.out.println("b =" + b);
        System.out.println("c ="+ c);
        System.out.println("s =" + s);
        System.out.println("i=" + i);
        System.out.println("f=" + f);
        System.out.println("d=" + d); */
       
        // data printf
        System.out.printf("boolean b = %b\n", b);
        System.out.printf("character c = %c\n", c);
        System.out.printf("short s = %d\n", s);
        System.out.printf("integer i = %d\n", i);
        System.out.printf("float f = %.2f\n", f);  
        System.out.printf("double d = %.3f\n", d);
        


    }
}
