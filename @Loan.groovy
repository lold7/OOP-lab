@startuml
class Loan {
    - String name
    - double amount
    + Loan()
    + Loan(String name, double amount)
    + double getAmount()
    + String getName()
    + void setAmount(double amount)
    + void setName(String name)
}

class circle {
    - double r
    + circle(double r)
    + double area()
    + String toString()
}
@enduml
