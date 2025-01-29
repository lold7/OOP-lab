public class MainLibrary {
    public static void main(String[] args) {
        LibraryItem[] item = new LibraryItem[3];
        
        for(int i = 0 ; i < item.length; i++ ){
            switch (i) {
                case 0 : item[i] = new Book("B001234", "The Hitchhiker's Guide to the Galaxy"); 
                    
                    break;
                case 1 : item[i] = new Audiobook("A009876", "Moby Dick"); 
                    
                    break;
                case 2 : item[i] = new DVD("D005432", "The Shawshank Redemption"); 
                    
                    break;
            

            }
        }
        for(LibraryItem i : item){
            System.out.println("Barcode: " + i.getBarcode() +", Title: " + i.getTitle() +", Loan Period: " + i.getLoanPeriod() + " days");
        }
    }
}
