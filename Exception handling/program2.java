// Java program that demonstrates the use of throw
 import java.util.*;;
class program2 {
    void fun(){
        try {
            throw  new ArithmeticException ("Demo");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("cautch "+e ) ;
            throw e;
        }
    }
	public static void main(String[] args) {
        try {
            // fun();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
