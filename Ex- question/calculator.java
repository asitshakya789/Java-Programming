import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.println("Enter the operator: ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':System.out.println(number1 + number2);
                
                break;
            case '-':System.out.println(number1-number2);

                 break;  
                 case '*':System.out.println(number1*number2);

                 break;  
                 case '/':System.out.println(number1/number2);

                 break;  
                 case '%':System.out.println(number1%number2);

                 break;  
            default:
            System.out.println("Invalid operator");
                break;
               }       }
}
