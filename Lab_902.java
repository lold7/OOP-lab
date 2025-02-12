import java.util.*;


public class Lab_902 {
    public static void main(String[] args) {

        int result;
        Random rand = new Random(444);
        Scanner input = new Scanner(System.in);


        int[] num_list = new int[100];

        for(int i = 0 ; i < 100 ; i++){
            num_list[i] = rand.nextInt(200);
        }

        try{
            System.out.print("Please enter index of array(0 - 99): ");
            int num = input.nextInt();


            System.out.println("The value index is: "+num_list[num]);
            System.out.println("End nicely");

        }catch(ArrayIndexOutOfBoundsException x){
            System.out.println("You refer to index that doesn't exist.");
        }finally{
            System.out.println("Continuing Processing...");
        }

    }
}
