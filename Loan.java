import java.util.Date;


public class Loan {
    private String name;
    private double amount;

    public Loan() {
        this.name = "John Doe";
        this.amount = 0.0;
    }

    public Loan(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class circle{
    private double r;

    public circle(double r){
        this.r = r;
    }
    public double area() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public String toString() {
        return Double.toString(area());
    }
}