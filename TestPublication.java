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
