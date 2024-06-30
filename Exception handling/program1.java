public class program1 {
    public static void main(String[] args) {
        try {
            int a =10 ;
        int b= 0 ;
        int div = a /b;
        System.out.println(div);
        } catch (ArithmeticException e) {
            System.out.println(e +" WHICH TYPE of exception was occure");
        }
        finally{
            System.out.println("This code run completly fine");
        }
    }
}
