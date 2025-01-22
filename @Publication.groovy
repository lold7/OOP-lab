@startuml
class Publication {
    - String publisher
    - int number_of_page
    - double price
    - String title
    + Publication()
    + Publication(String pub, int num, double price, String title)
    + String pubPrint()
}

class Magazine {
    - String frequence
    + Magazine()
    + Magazine(String pub, int num, double price, String title, String f)
    + String pubPrint(): String
}

class Book {
    - String author
    + Book()
    + Book(String au)
    + Book(String au, String pub, int num, double price, String title)
    + String pubPrint(): String
}

class KidsMagazine {
    - int age
    + KidsMagazine()
    + KidsMagazine(int age)
    + KidsMagazine(int age, String pub, int num, double price, String title)
    + String pubPrint(): String
}

Publication <|-- Magazine
Publication <|-- Book
Publication <|-- KidsMagazine
@enduml

