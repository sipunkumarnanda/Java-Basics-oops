
// Abstract class (cannot be instantiated)
abstract class BankAccount {

    double balance;

    // Abstract methods (no body, must be implemented by child classes)
    abstract void addMoney(double amount);
    abstract void canUserWithdrawMoney(double amount);

    // Concrete method (common logic for all accounts)
    void updateBalance(double _balance){
        balance = _balance;
    }

    // Getter method
    public double getBalance(){
        return balance;
    }
}

// Child class (Savings Account)
class SavingsAccount extends BankAccount {

    // Constructor to initialize balance
    public SavingsAccount(double balance){
        this.balance = balance;
    }

    // Implementing abstract method
    public void addMoney(double amount){
        // Using parent methods to update balance
        super.updateBalance(super.getBalance() + amount);
    }

    // Implementing abstract method
    public void canUserWithdrawMoney(double amount){
        if(amount <= balance){
            System.out.println("Can withdraw");
        }else{
            System.out.println("Can not withdraw");
        }
    }
}

// Child class (Current Account)
class CurrentAccount extends BankAccount {

    double minimumLimit = 1000.00;

    public CurrentAccount(double balance){
        this.balance = balance;
    }

    public void addMoney(double amount){
        super.updateBalance(super.getBalance() + amount);
    }

    public void canUserWithdrawMoney(double amount){
        if(amount >= minimumLimit && amount <= balance){
            System.out.println("can withdraw");
        }else{
            System.out.println("can not withdraw");
        }
    }
}

public class Abstraction {
    public static void main(String[] args) {

        SavingsAccount person1 = new SavingsAccount(100.00);
        System.out.println("Balance: " + person1.getBalance());
        person1.addMoney(50);
        System.out.println("Updated Balance: " + person1.getBalance());
        person1.canUserWithdrawMoney(1000);

        System.out.println("---------------------------");


        CurrentAccount person2 = new CurrentAccount(1000);
        System.out.println("Balance: " + person2.getBalance());
        person2.addMoney(50);
        System.out.println("Updated Balance: " + person2.getBalance());
        person2.canUserWithdrawMoney(1000);
    }
}