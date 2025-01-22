import java.util.ArrayList;
import java.util.Date;

public class TestLoan {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(new Loan());
        list.add("ABC");
        list.add(new Date());
        list.add(new circle(10));

        for(Object i : list){
            System.out.println(i);
        }
    }


}
