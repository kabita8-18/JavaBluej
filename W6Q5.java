import java.util.*;

/**
 * Write a description of class W6Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W6Q5
{
    public static void main(String[] args)
    {
     String[] districts={"Morang","Kathmandu","Kaski","Sindhuli"};
     System.out.print("initial districts list");
     
     for (int i = 0; i < districts.length; i++) {
            System.out.println((i + 1) + ". " + districts[i]);
        }

    
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of districts to add: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] newDistricts = new String[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter district name" + (i + 1) + ": ");

        newDistricts[i] = sc.nextLine();
        }

        
        System.out.println("\nUpdated District List:");
        
    
        for (int i = 0; i < districts.length; i++) {
            System.out.println((i + 1) + ". "+ districts[i]);
        }


        for (int i = 0; i < newDistricts.length; i++) {
            System.out.println((districts.length + i + 1) + ". " + newDistricts[i]);

    }
}
}
