package OOP;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    
    public Stock(String x,String y){
        this.symbol = x;
        this.name = y;
    }
    public void setpreviousClosingPrice(double x){
        this.previousClosingPrice = x;
    }
    public void setcurrentPrice(double y){
        this.currentPrice = y;
    }


    public double getpreviousClosingPrice(){
        return previousClosingPrice;
    }
    public double getcurrentPrice(){
        return currentPrice;
    }    
    

    public double getChangePercent(){
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
        
    }
    public static void main(String[] args) {
        Stock St_ock = new Stock("ORCL", "Oracle Corporation");

        St_ock.setpreviousClosingPrice(34.5);
        St_ock.setcurrentPrice(34.35);


        System.out.println("Previous Closing Price " + St_ock.getpreviousClosingPrice());
        System.out.println("Current Price " + St_ock.getcurrentPrice());
        System.out.println("Price Change " + St_ock.getChangePercent());

    }
}

