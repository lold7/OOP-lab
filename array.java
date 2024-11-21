import java.util.Scanner;
 public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] m  = new double[3][4] ;
        int columindex ;
        for(int i = 0 ; i< m.length ; i++){
            for(int j = 0 ; j < m[i].length ; j++){
                System.out.print("Enter your array colum " + j + ": ");
                m[i][j] = input.nextDouble();
            }
        }
        System.out.print("Enter your array colum index: ");
        columindex = input.nextInt();
        System.out.println("sum of the element of colum "+ columindex + " is "+sumcolum(m,columindex));
    }

    public static double sumcolum(double[][] m ,int columnIndex){
        double result = 0;
        for(int i = 0 ; i< m.length ; i++){
            result += m[i][columnIndex] ;
        }
        return result;
    }
 }
