public class triangle_903 {
    double side_1;
    double side_2;
    double side_3;

    public triangle_903(double _1,double _2,double _3) throws IllegalTriangleException{
        this.side_1 = _1;
        this.side_2 = _2;
        this.side_3 = _3;
        if(side_1 + side_2 <= side_3 || side_1 + side_3 <= side_2 || side_3 + side_2 <= side_1 ){
            throw new IllegalTriangleException("Illegal triangle",side_1,side_2,side_3);
        }
    }

    public double area(){
        double s = side_1 + side_2+side_3 / 2;
        return Math.sqrt(s * (s - side_1) * (s - side_2) * (s - side_3));
        
    }

    public double perimeter(){
        return side_1 + side_2 + side_3;
    }

    
}
