import java.util.*;

/**
 * Write a description of class W5N8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W5N8
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        
        int number = scan.nextInt();
        System.out.println("\nMultiplication table of "+ number+":");
        System.out.println("---------");
        for(int i=1; i<=10; i++)
        {
            System.out.println(number+"*"+i+"="+(number*i));
            
        }
        
        
        
    }
}