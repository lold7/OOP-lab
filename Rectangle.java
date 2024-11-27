public class Rectangle {
    private float height;
    private float width;
    
    public Rectangle(float x ,float y ){
        height = x;
        width = y;
    }

    public float area(){
        return height * width;
    }
    public float perimeter(){
        return 2*(width+height);
    }

}
