import java.util.Scanner;

public class week_name {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the week: ");
        int day  = sc.nextInt();
        switch (day) {
        case 1:System.out.println("Monday");
        
        break;
        case 2:System.out.println("Tuesday");
        
        break;
        case 3:System.out.println("Wedsneday");
        
        break;
        case 4:System.out.println("thuersday");
        
        break;
        case 5:System.out.println("friday");
        
        break;
        case 6:System.out.println("satursay");
        
        break;
        case 7:System.out.println("sunday");
                
        break;

        default:
        System.out.println("Invalid input");
        break;
        }
    }
}
