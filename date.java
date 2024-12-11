import java.util.Date;


public class date {
    public static void main(String[] args) {
        
        for(int i = 0 ; i < 8;i++){
            long count = 10000 *((long)Math.pow(10,i));
            Date date = new Date(count);
            System.out.println(date.toString());
            count = 10000;
        }
        
    }
}