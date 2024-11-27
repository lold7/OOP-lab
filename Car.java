public class Car {
    private String color;
    private int speed;
    private int milage;

    public Car(String col) {
        color = col;
        speed = 0;
        milage = 0;
    }
    
    //method for display
    public String getColor() {
        return color;
    }
    //method for display
    public int getSpeed() {
        return speed;
    }
    //method for display
    public int getSMilage() {
        return milage;
    }




    //for set up value
    public void setSpeed(int sp) {
        speed = sp;
    }
    //for set up value
    public void setMilage(int ml) {
        milage = ml;
    }
}
