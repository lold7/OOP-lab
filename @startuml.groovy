@startuml
class Shape {
    - String color
    - boolean filled
    + Shape()
    + Shape(String color, boolean filled)
    + boolean isFilled()
    + void setFilled(boolean filled)
    + String toString()
}

class Circle {
    - double radius
    + Circle()
    + Circle(double radius)
    + Circle(double radius, String color, boolean filled)
    + double getArea()
    + double getPerimeter()
    + String toString()
}

class Rectangle {
    - double width
    - double length
    - String color
    - boolean filled
    + Rectangle()
    + Rectangle(double width, double length)
    + Rectangle(double width, double length, String color, boolean filled)
    + double getArea()
    + double getPerimeter()
    + String toString()
}

Shape <|-- Circle
Shape <|-- Rectangle
@enduml
