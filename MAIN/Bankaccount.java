package MAIN;


/**
 * Write a description of class Bankaccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bankaccount
{
    // Attributes
    String accountNumber;
    String holderName;
    double balance;

    public Bankaccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    
    public void deposit(double amount) {
        if (amount > 0)
        {
            balance += amount;
            System.out.println(holderName + " deposited: $" + amount);
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println(holderName + " withdrew: $" + amount);
        } else 
        {
            System.out.println("Insufficient funds or invalid amount for " + holderName);
        }
    }

    public void displayBalance()
    {
        System.out.println("Account: " + accountNumber + " | Holder: " + holderName + " | Final Balance: $" + balance);
    }
}