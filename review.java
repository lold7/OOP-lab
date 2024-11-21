public class review{
    public static void main(String[] args) {
        int j = 0;
        int result =1;
        for(int i = 0 , k = 1 ; i<30 ;i++,k++ ){
            result = (int) Math.pow(2,i);
            j = j+result;
            System.out.println("day " + k + " deposit "+ result + " total is " +j);
        }
    }
}
//sdsdssds