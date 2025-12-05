import java.util.*;

/**
 * Write a description of class Number10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number10
{
    public static void main(String[] args)
   {
     Scanner scan=new Scanner(System.in);
        System.out.println("Enter your annual income(NPR):");
        double income = scan.nextDouble();
        double tax=0;
        
        if(income<=500000)
        {
            tax=income*0.01;
        }
        else if (income<=700000)
        {
            tax=500000*0.01+(income-500000)*0.01;
            
        }
        else if(income<=1000000)
        {
            tax=500000*0.01+200000*0.01+(income-700000)*0.20;
            
        }
        else if (income<=2000000)
        {
            tax=500000*0.01+200000*0.010+300000*0.20+(income-1000000)*0.30;
            
        }
        else if (income<=5000000)
        {
            tax=500000*0.01+200000*0.10+300000*0.20+1000000*0.30;
            
        }
        
        
        
    }
}