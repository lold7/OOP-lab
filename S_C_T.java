import java.util.Random;
public class S_C_T {
    public static void main(String[] args) {
        Random rand = new Random();

        int rand_num = rand.nextInt(21);

        rand_num +=20;
        double sin = Math.sin(rand_num);
        double cos = Math.cos(rand_num);
        double tan = Math.tan(rand_num);

        System.out.println("The sine of "+rand_num+" is "+sin);
        System.out.println("The cosine of "+rand_num+" is "+cos);
        System.out.println("The tangent of "+rand_num+" is "+tan);
    }
    
}
