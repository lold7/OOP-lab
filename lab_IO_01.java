import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;


public class lab_IO_01 {
    public static void main(String[] args) {
        String x = "";
        int total = 0;
        int count_ = 0;
        try{
            File score = new File("scores.txt");
            Scanner read = new Scanner(score);
            while (read.hasNextLine()) {
                String num = read.nextLine();
                x += num;
            }
            StringTokenizer token = new StringTokenizer(x," ");
            while (token.hasMoreTokens()) {
                count_ += 1;
                int integerrr = Integer.parseInt(token.nextToken());
                total += integerrr;
                
            }
            read.close();
        }
        catch(FileNotFoundException err){
            System.out.println("Error");
        }
        double average = (double)total/ count_;
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        

    }
}
