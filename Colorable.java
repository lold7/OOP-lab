public interface Colorable {

    
    public abstract void howToColor();
}

class Square extends Geo_Lab8 implements Colorable {

    private double side;

    public Square(){
        this.side = 0;
    }
    public Square(double s){
        this.side = s;
    }
    public void setSide(double side){
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    @Override
    public void howToColor(){
        System.out.println("Color all four sides.");
    }

    @Override
    public double getArea() {
        return side*side;
    }
    @Override
    public double getPerimeter() {
        return side*4;
    }

}
