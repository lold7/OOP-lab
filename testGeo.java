public class testGeo {
    public static void main(String[] args) {
        Triangle obj = new Triangle(5,6,7,"red",true);
            
        double area = obj.getArea();
        double perimeter = obj.getPerimeter();

        System.out.println("The area is " + area);
        System.out.println("The perimeter is "+ perimeter);
        System.out.println(obj);
    }
}
