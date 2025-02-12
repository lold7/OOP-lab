public class lab_903 {
    public static void main(String[] args) {
    
        try{
            triangle_903 t1 = new triangle_903(1.5,2 , 3);
            System.out.println("Perimeter for t1: "+ t1.perimeter());
            System.out.println("Area for t1: "+t1.area());


            triangle_903 t2 = new triangle_903(1,2 , 3);
        }catch(IllegalTriangleException x){
            System.out.println(x.getMessage());
            System.out.println(x.getside(1));
            System.out.println(x.getside(2));
            System.out.println(x.getside(3));
            
        }
    }
}
