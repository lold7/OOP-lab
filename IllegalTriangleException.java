public class IllegalTriangleException extends Exception {
    private double side_1,side_2,side_3;
    public IllegalTriangleException(String x ,double I , double II ,double III){
        super(x);
        this.side_1 = I;
        this.side_2 = II;
        this.side_3 = III;
        
    }
    public double getside(int n){
        if(n == 1){
            return side_1;
        }
        else if(n == 2){
            return side_2;
        }
        else if(n == 3){
            return side_3;
        }
        
        return n;

    }
}
