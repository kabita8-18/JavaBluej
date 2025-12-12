
/**
 * Write a description of class Arr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arr
{
    public static void main(String[] args)
    { 
        int[] age; //declare an array
        age= new int[5]; // constructing an array
        
        System.out.println(age.length); // finding the length of array
        
        //Initializing an array
        age[0]=10;
        age[1]=20;
        age[2]=30;
        age[3]=40;
        age[4]=50;
        
        // Accessing an individual element
        System.out.println(age[1]);
        
        
        int[] agr={10,20,30,40,50};
        
        for(int i=0; i< agr.length;)
        {
            System.out.println(args[i]);           
            
        }
        
        for(int i=0; i< agr.length;i++ )
        {
          System.out.println(args[i]);
        }
        
        for(int i= agr.length-1; i>=0; i-- )
        {
            System.out.println(args[i]);
        }
        
        
        // Matrix 2D array
        
        int[][] matrix;// declaring a 2D array
        matrix = new int[2][3]; // constructing a 2D array
        
        matrix[0][0]=10;
        matrix[0][1]=20;
        matrix[1][0]=30;
        matrix[1][1]=40;
        
        // 2D array in one line
        
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
          
        for(int i=0; i< mat.length; i++) 
        {
          for(j=0; j < mat[i].length; j++)
          {
            System.out.println(mat[i][j]);
            
            }
            System.out.println();
        }
        
        
            
        }
        

     }     



