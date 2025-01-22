@startuml
class Account {
    - int id
    - double balance
    - double annualInterestRate
    - Date dateCreated
    + Account()
    + Account(int id, double balance)
    + double getAnnualInterestRate()
    + double getBalance()
    + Date getDateCreated()
    + int getId()
    + void setAnnualInterestRate(double annualInterestRate)
    + void setBalance(double balance)
    + void setDateCreated(Date dateCreated)
    + void setId(int id)
    + double getMonthlyInterestRate()
    + double getMonthlyInterest()
    + String withdraws(double w)
    + String deposit(double d)
    + String toString()
}
@enduml
