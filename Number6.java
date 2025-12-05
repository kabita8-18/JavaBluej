import java.util.*;

/**
 * Write a description of class Number6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number6
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Marked Price");
        float mp=scan.nextFloat();
        System.out.println("Enter catagory :(A/B/C/D)");
        char cat=scan.next().charAt(0);
        float sp,discount=0;
        if(cat=='A'){
            discount=60;
        }
        else  if(cat=='B'){
            discount=40;
        }
        else if(cat=='C'){
            discount=10;
            
        }
        else {
            System.out.println("Ïnvalid Category");
            
        }
        sp=mp-(mp+discount/100);
        System.out.println("Selling price is"+sp);
        
    }
}