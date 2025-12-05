
/**
 * Write a description of class Scenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scenario
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char choice='y';
        while(choice=='y')
        {
         System.out.print("Enter deposit amount(minimum Rs.1000):");
         double P =scan.nextDouble();
         if (P<1000)
         { 
             System.out.println("Minimum deposit is Rs.1000\n");
             
             System.out.println("Enter annual interest rate in 8%-12%");
             
             double annualRate= scan.netxDouble();
             if(annualRate<8 or annualRate>12)
             {
                 System.out.println("Rate must be between 8% and 12%");
             }
             
             
        
        }
    }
}