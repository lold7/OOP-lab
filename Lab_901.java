import java.util.*;
import java.util.InputMismatchException;

public class Lab_901  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean bool = true;
        int result;

        while(bool){
            try{
            System.out.print("Enter an integer: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            result = num1 + num2;
            System.out.println("The number entered: "+ result);
            break;

            }catch(InputMismatchException x){
                System.out.print("Try again.");
                System.out.println("Incurrect input: an integer is required");
                input.nextLine();
            }
        }

        
        
    }
    
}
