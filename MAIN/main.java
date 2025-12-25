package MAIN;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args)
    {
        // <className> variable_name= new className();
        
        // objects creation
        Student s1= new Student("NP01CP4A250188",22,"Computing");
        
        System.out.println(s1.collegeID);
        System.out.println(s1.age);
        System.out.println(s1.course);
        
        
        Student s2=new Student();
        s2.collegeID="NP01CP4A250188";
        s2.age=25;
        s2.course="Networking";
        s2.laugh();
        
        System.out.println(s2.collegeID);
        System.out.println(s2.age);
        System.out.println(s2.course);
        
        
        
        
        
        
        
public class BankSimulation {
    public static void main(String[] args) {
        // 1. Create two BankAccount objects
        BankAccount account1 = new BankAccount("101", "Alice", 1000.0);
        BankAccount account2 = new BankAccount("102", "Bob", 500.0);

        // 2. Perform deposit and withdrawal operations
        account1.deposit(250.0);
        account1.withdraw(100.0);

        account2.deposit(100.0);
        account2.withdraw(700.0); // This should trigger the insufficient funds check

        System.out.println("\n--- Final Account Status ---");
        
        // 3. Display the final balance of both accounts
        account1.displayBalance();
        account2.displayBalance();
    }
}

        
        
        
        
        
        
        
        
        
        
    }
}