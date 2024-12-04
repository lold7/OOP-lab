public class Myrectangle {
    public static void main(String[] args) {
        
        Rectangle square = new Rectangle(5,5);
        Rectangle non_square = new Rectangle(8,5);

        float Area_s = square.area();
        float Perimeter_s = square.perimeter();

        float Area_ns = non_square.area();
        float Perimeter_ns = non_square.perimeter();

        System.out.println("square 5 x 5");
        System.out.println("Area: "+ Area_s);
        System.out.println("Perimeter: "+Perimeter_s);
        System.out.println("");
        System.out.println("non_square 8 x 5");
        System.out.println("Area: "+ Area_ns);
        System.out.println("Perimeter: "+Perimeter_ns);

        //ddd


    }   
}
