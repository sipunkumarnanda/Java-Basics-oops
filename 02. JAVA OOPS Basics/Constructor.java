
// Class representing a bank account with an initial balance
class BankAccount {
    double balance;
    String accountType;

    // Constructor to initialize the account balance
    public BankAccount(double _balance) {
        // balance = _balance;
        // accountType = "savings";
        this(_balance, "savings");
    }

    // constructor overloading (taking 2 parameter)
    public BankAccount(double balance, String accType) {
        this.balance = balance;
        this.accountType = accType;
    }

    public void printAccType() {
        System.out.println("Account Type : " + this.accountType);
    }

    public void printBalance() {
        System.out.println("Balance : " + this.balance);
    }
}



// Main 
public class Constructor {
    public static void main(String[] args) {

        // Creating an object of Sum class and calling its protected method
        // (allowed because both classes are in the same package)
        Sum sum = new Sum();
        int result = sum.summ(10, 10);
        System.out.println("sum : " + result);


        // Creating a BankAccount object using constructor
        // and accessing its balance field
        BankAccount accPerson1 = new BankAccount(1000.00);
        accPerson1.printAccType();
        accPerson1.printBalance();

        System.out.println("---------------------------");

        
        // Creating a BankAccount object using constructor with two parameters
        // This will call the constructor that sets both balance and account type
        BankAccount accPerson2 = new BankAccount(500.00, "current");
        accPerson2.printAccType();
        accPerson2.printBalance();
    }
}
