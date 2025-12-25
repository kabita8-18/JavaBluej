package Week8;


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
        // Invoking an instance method
        Calculator calc= new Calculator();
        calc.displayInfo(); // void+  no parameters
        calc.add(10,20); // actual parameters
        calc.add(30,40);
        calc.add(50,60);
        
        
        System.out.println(calc.getFixedNumber());
        int fixNum= calc.getFixedNumber();
        
        System.out.println("The fix number is :"+ fixNum);
        
        
        int multi= calc.multiply(10,20);
        System.out.println("The multiplication of first two numbers are:"+multi);
        
        
        
        

    }
}