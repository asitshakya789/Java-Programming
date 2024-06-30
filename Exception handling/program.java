import java.util.*;
public class program {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int i = sc.nextInt();
        try {
            int a =10 ;
        int b= 0 ;
        int div = a /b;
        System.out.println(div);
        } catch (ArithmeticException e) {
            System.out.println(e+"exception");
        }

    }
}