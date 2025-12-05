import java.util.*;

/**
 * Write a description of class W5N9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W5N9
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter a positive integer:");
        int number= input.nextInt();
        
        int reversed = 0;
        
        while (number>0);
        {
        
        int digit=number%10;
        reversed=reversed*10+digit;
        number= number/10;
    }
    
    {
    
        System.out.println("Reversed number:" + reversed);
    }
        
  }
}