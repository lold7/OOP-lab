public class Publication{
    private String publisher;
    private int number_of_page;
    private double price;
    private String title;

    public Publication(String pub,int num , double price,String title){
        this.publisher = pub;
        this.number_of_page = num;
        this.price = price;
        this.title = title;
    }
    public Publication(){
        this(null,0,0,null);
    }

    public String pubPrint(){
        return "The " + publisher +" publishs " + title+", " + number_of_page + " Pages "+price+" Baths.";
    }

}

class Magazine extends Publication{
    private String frequence;
    public Magazine(String pub,int num , double price,String title,String f){
        super(pub,num,price,title);
        this.frequence = f;
    }

    public Magazine(){
    }

    @Override
    public String pubPrint(){
        return super.pubPrint() +"\n"+"This megazine is " +frequence+" print";
    }
}

class Book extends Publication{
    private String author;
    public Book(String au,String pub,int num , double price,String title){
        super(pub,num,price,title);
        this.author = au;
    }
    public Book(String au){
        this.author =au;
    }
    public Book(){

    }

    @Override
    public String pubPrint(){
        return super.pubPrint()+"\n"+"This book has written by "+ author +".";
    }
}

class KidsMagazine extends Publication{
    private int age;
    public KidsMagazine(int age,String pub,int num , double price,String title){
        super(pub,num,price,title);
        this.age = age;
    }
    public KidsMagazine(int age){
        this.age = age;
    }
    public KidsMagazine(){
    }


    @Override
    public String pubPrint(){
        return super.pubPrint() + "\n" +"This KidsMagazine reccommeded age is "+ age;
    }

}