package MAIN;

/**
 * Write a description of class Main7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main7
{
   public static void main(String[] args)
   {
       //<classname> variable_name= new classname();
       
       book b1=new book();
       book b2=new book();
       
       b1.name="Nobember8 ";
       b1.author="James ";
       b1.price=100;
       System.out.println(b1.name + "," + b1.author + "," +b1.price);
       b2.name="Sky ";
       b2.author="Ram ";
       b2.price=500;
       System.out.println(b2.name + "," + b2.author + "," +b2.price);
       
       
       Rectangles r1 = new Rectangles();
       r1.length=20;
       r1.breadth=10;
    
       System.out.println(r1.length +"," +r1.breadth +",");
       
       
       
       Rectangles r2 = new Rectangles();
       r2.length=40;
       r2.breadth=20;
       
       System.out.println(r2.length +"," +r2.breadth +",");
       
       
       
       Employee e1 = new Employee();
       
       
       e1.employeeID= 234;
       e1.name= "Puja";
       e1.salary= 50000;
       
       System.out.println(e1.employeeID +"," +e1.name +"," +e1.salary +",");
       
       Employee e2 = new Employee();
       
       
       e2.employeeID= 75344;
       e2.name= "Rose";
       e2.salary= 100000;
       
       System.out.println(e2.employeeID +"," +e2.name +"," +e2.salary +",");
       
       
       
       Laptop l1= new Laptop();
       
       l1.brand="hp";
       l1.RAM= "64GB";
       l1.price=350000;
       
       System.out.println(l1.brand +"," +l1.RAM +"," +l1.price +",");
       
       
       Laptop l2= new Laptop();
       
       l2.brand="Dell";
       l2.RAM= "16GB";
       l2.price=200000;
       
       System.out.println(l2.brand +"," +l2.RAM +"," +l2.price +",");
       
       
       Laptop l3= new Laptop();
       
       l3.brand="Acer";
       l3.RAM= "128GB";
       l3.price=300000;
       
       System.out.println(l3.brand +"," +l3.RAM +"," +l3.price +",");
       
       
       Mobile m1=new Mobile();
       
       m1.brand="Iphone";
       m1.price=200000;
       
       System.out.println(m1.brand +"," +m1.price +",");
       
       
       Mobile m2=new Mobile();
       
       m2.brand="Samsung";
       m2.price=300000;
       
       System.out.println(m2.brand +"," +m2.price +",");
       
       
       Mobile m3=new Mobile();
       
       m3.brand="Vivo";
       m3.price=50000;
       
       System.out.println(m3.brand +"," +m3.price +",");
       
       
       
       Result R1=new Result(40,50,60);
       Result R2=new Result(30,50,90);
    
       R1.marks();
       R1.percentage();
    
       R2.marks();
       R2.percentage();
    
       
       
        Bankaccount account1 = new Bankaccount("101", "Alice", 1000.0);
        Bankaccount account2 = new Bankaccount("102", "Bob", 500.0);

    
        account1.deposit(250.0);
        account1.withdraw(100.0);

        account2.deposit(100.0);
        account2.withdraw(700.0);

        System.out.println("\n--- Final Account Status ---");
        
        account1.displayBalance();
        account2.displayBalance();
    }
}