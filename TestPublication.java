public class TestPublication {
    public static void main(String[] args) {
        Publication[] pub = new Publication[10];
        // Polymorphism in pub1
        pub[0] = new Magazine("Marvel Comic", 30, 3.00, "Spiderman", "monthly");
        System.out.println(pub[0].pubPrint());
        System.out.println();

        pub[1] = new Magazine();
        System.out.println(pub[1].pubPrint());
        System.out.println();

        pub[2] = new Magazine("DC Comic", 30, 3.00, "Aquaman", "weekly");
        System.out.println(pub[2].pubPrint());
        System.out.println();

        // Polymorphism in pub4
        pub[3] = new Book();
        System.out.println(pub[3].pubPrint());
        System.out.println();

        pub[4] = new Book("J.R.R Tolkein");
        System.out.println(pub[4].pubPrint());
        System.out.println();

        pub[5] = new Book("J.R.R Tolkein", "London Book", 300, 150.50, "Hobbit");
        System.out.println(pub[5].pubPrint());
        System.out.println();

        pub[6] = new Book("G. Martin", "Newyork Pub", 400, 100.30, "Song of Soda and Wine");
        System.out.println(pub[6].pubPrint());
        System.out.println();

        // Polymorphism in pub8
        pub[7] = new KidsMagazine();
        System.out.println(pub[7].pubPrint());
        System.out.println();

        pub[8] = new KidsMagazine(13);
        System.out.println(pub[8].pubPrint());
        System.out.println();

        pub[9] = new KidsMagazine(15, "The Parents", 100, 120, "Kids Gangster");
        System.out.println(pub[9].pubPrint());
        System.out.println();

    }

}

class Publication{
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