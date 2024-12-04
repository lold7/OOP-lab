import java.util.Vector;
import java.util.Random;
public class tast {
    public static void main(String[] args) {
        Random rand = new Random();
        Vector v = new Vector<>(10);
        //1. initialize vector with 10 random values type interger
        for (int i = 0; i<=10 ;i++){
            v.addElement(rand.nextInt((1000)));
        }

        if (tastt(v,30)){
            System.out.println("We found it!");
        }
         else{
            System.out.println("found it");
        }   
        //serch the givine value using the linear search method

        //temiate the program properly, when the search end
        display(v);        
    }//end main
    
    

    public static boolean tastt(Vector<Integer> v , int x){
        for (int i = 0; i <v.size(); i++){
            if (v.elementAt(i) == x){
                return true;
            }
        }    
        return false;
    
                

    }//end tast
    public static void display(Vector<Integer> v){
        System.out.print ("Here are the values: ");
        for (int i = 0; i<v.size() ; i++){
            System.out.print(i + " ");
        }
    }
    
}//end class tast
