import java.util.*;

/**
 * Write a description of class College here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RickshawFare
{  
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter thje distance in KTM");
        double perKm = scr.nextDouble();
        System.out.println("Enter the time taken");
        double perMinute = scr.nextDouble();
        System.out.println("Enter the basefare");
        double basefare = scr.nextDouble();
        
        
        System.out.println("Enter the distance travel");
        double distance= scr.nextDouble();
        System.out.println("Enter the time");
        double time = scr.nextDouble();
        
        
        System.out.println("Is the customer local?(y/n)");
        String islocal= scr.next().toLowerCase();
        System.out.println("Is it night time travel (y/n)");
        String isNight= scr.next().toLowerCase();
        
        
        
    double fare= basefare+(time*perMinute) +(distance*perKm);
    if(islocal.equals("y")&& distance>10)
    {
        
          fare=fare*0.90;
    }
    if(isNight.equals("y")){
            fare=fare*1.20;
            
        }
        System.out.println("\n");
        
        
        
        System.out.println("RickshawFare");
        
        
        System.out.println("--------");
        System.out.println("Final fare; Rs" + String.format("%.2f", fare));
        System.out.println("--------");
        }
}











int number =10;
string result =(number%2==0)? "Even": "Odd" ;
System.out.print(result);