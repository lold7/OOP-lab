import java.io.*;
import java.util.*;




public class lab_IO_02 {
    public static void main(String[] args) {
        
        write();
        read();
        
    }
    public static void write(){
        Random r = new Random();
        try{
            FileWriter w = new FileWriter("RWdata.txt");

            for(int i = 1; i<=100; i++){
                w.write(r.nextInt(101)+ " ");
            }
            w.close();
            
            
        }catch(IOException err){
            System.out.println("Error");
        }
    }
    public static void read(){
        String p = "";
        try{
            File read = new File("RWdata.txt");
            Scanner readfile = new Scanner(read);
            while (readfile.hasNextLine()) {
                String txt = readfile.nextLine();
                p += txt;
            }
            readfile.close();

        }catch(FileNotFoundException err){
            System.out.println("Error");
        }

        System.out.println(p);
    }
}
