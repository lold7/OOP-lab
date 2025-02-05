public class testInterface2 {
    public static void main(String[] args) {
        Geo_Lab8[] objects = { new Square(2), new Square(3), new Square(4.5), new Square(5), new Square(6) };
    
        for (int i = 0; i < objects.length; i++) {
            System.out.println("Area is " + objects[i].getArea());
            if (objects[i] instanceof Colorable)
                ((Colorable) objects[i]).howToColor();
        }
    }
    
}
