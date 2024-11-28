public class Mycar {
    public static void main(String[] args) {

        Car toyota = new Car("red");
        Car honda = new Car("blue");


        toyota.setSpeed(300);
        toyota.setMilage(1345);

        honda.setMilage(8987);
        honda.setSpeed(300);

        
        System.out.println("Toyota color: " + toyota.getColor() + " speed: " + toyota.getSpeed()+" mileage: "+ toyota.getSMilage());
        System.out.println("Honda color: " + honda.getColor() + " speed: " + honda.getSpeed()+" mileage: "+ honda.getSMilage());
 
 
    }
}
