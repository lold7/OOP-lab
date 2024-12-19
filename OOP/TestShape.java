package OOP;
// Test class
public class TestShape {
    public static void main(String[] args) {
    // Test Shape
    Shape shape1 = new Shape();
    System.out.println();
    System.out.println(shape1);
    Shape shape2 = new Shape("red", true);
    System.out.println(shape2);
    // Test Circle
    Circle circle1 = new Circle();
    System.out.println(circle1);
    Circle circle2 = new Circle(2.5);
    System.out.println(circle2);
    System.out.println("Area: " + circle2.getArea());
    System.out.println("Perimeter: " + circle2.getPerimeter());
    Circle circle3 = new Circle(3.0, "blue", true);
    System.out.println(circle3);
    // Test Rectangle
    Rectangle rectangle1 = new Rectangle();
    System.out.println(rectangle1);
    Rectangle rectangle2 = new Rectangle(4.0, 5.0);
    System.out.println(rectangle2);
    System.out.println("Area: " + rectangle2.getArea());
    System.out.println("Perimeter: " + rectangle2.getPerimeter());
    Rectangle rectangle3 = new Rectangle(6.0, 7.0, "green", true);
    System.out.println(rectangle3);
    }
    }
    