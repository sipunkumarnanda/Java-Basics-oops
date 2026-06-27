
// Class representing a bank account with an initial balance
class BankAccount {

    private double balance;
    private String accountType;

    // Constructor to initialize balance with default account type
    public BankAccount(double balance) {

        // Instead of writing:
        // this.balance = balance;
        // this.accountType = "Savings";

        // we call another constructor of the same class
        // using constructor chaining
        this(balance, "Savings");
    }

    // Main constructor
    public BankAccount(double balance, String accountType) {

        this.balance = balance;
        this.accountType = accountType;
    }


    // Setter method
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter method
    public double getBalance() {

        // Add logic here to verify whether the user is authorized
        // (e.g., bank employee or account holder) before returning balance

        return this.balance;
    }


    // Optional helper method
    public void displayBalance() {
        System.out.println("Balance : " + this.balance);
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        BankAccount person1 = new BankAccount(100);

        person1.displayBalance();

        /*
         * Encapsulation does not allow you to directly access and * modify the data ,
         * by using getter and setter we can access
         * and modify the data.
         * 
         * Attempting to change balance directly (not recommended)
         * Direct access to the balance field breaks encapsulation
         * and may lead to unintended or unsafe modification of data
         *
         * person1.balance = 0.00; // ERROR
         *
         * By making the variable private, we achieve encapsulation
         * and control access using getter and setter methods
         */

        // Direct access is blocked because balance is private
        // person1.balance = 0.00; // Error

        person1.setBalance(500);

        System.out.println("Updated Balance : " + person1.getBalance());
    }
}