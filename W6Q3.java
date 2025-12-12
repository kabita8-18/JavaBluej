import java.util.*;

/**
 * Write a description of class W6Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W6Q3
{
    public static void main(String[] args)
    {
       String[] students= {"Saroj","Sushant","Ujjwal","Rabina","Sandesh"};
       
       System.out.println("Initial Student List");
       for(int i=0;i<students.length; i++)
       {
         System.out.println(students[i]);
         
         System.out.println("Name at index 2:"+ students[2]);
         students[4] ="UpdetedName";
         System.out.println("UpdetedName");
         System.out.println("UpdetedName at index 4:" +students[4]);
         
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter a new name to update at index 3:");
         students[3]=scan.nextLine();
         
         
         System.out.println("Updated students list");
         for(int j=0; j < students.length; j++)
         {
             System.out.println(students[i]);
            }
         
         
         
         {
             
         }
         
         
         
         
         
         
         
         
        }
       
    }
}