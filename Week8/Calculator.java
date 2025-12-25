package Week8;


/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    // instance method --> void return type+ no parameters
    public void displayInfo()
    {
        System.out.println("Welcome to calculator app.");
    
    }
    
    //
    
    public void add (int a, int b) // formal parameters
    {
        System.out.println("Sum of two numbers are:"+(a+b));
        
    }

    //return type + no parameters
    
    public int getfixedNum()
    {
      return 10;
    }
    
    //return type + parameters
    
    public int multiply(int a, int b )
    {
        return a*b;
        
    }
    
    
    
}