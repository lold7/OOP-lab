import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account(int id,double balance){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public Account(){
        this.id = 0;
        this.balance = 0.0;
        this.annualInterestRate = 0.0;
        this.dateCreated = new Date(); 
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public double getBalance() {
        return balance;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public int getId() {
        return id;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12 / 100;
    }
    public double getMonthlyInterest(){
        return balance * getAnnualInterestRate();
    }
    
    public String withdraws(double w){
        if (w > balance){
            return "Insufficient funds.";
        }
        else{
            balance = balance - w;
            return String.format("Balance remain: %.2f", balance);
        } 
    }
    public String deposit(double d){
        balance += d;
        return String.format("New balance is %.2f", balance);
    }
    
    @Override
    public String toString() {
        return String.format("Account ID: %d, Balance: %.2f, Annual Interest Rate: %.2f%%, Date Created: %s",
                id, balance, annualInterestRate, dateCreated) ;
    }
}
