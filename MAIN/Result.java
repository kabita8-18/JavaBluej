package MAIN;


/**
 * Write a description of class Result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Result
{
    //attributes or properties
    
    float subject1;
    float subject2;
    float subject3;
    
    public Result(float subject11,float subject22,float subject33)
    {
         this.subject1=subject11;
         this.subject2=subject22;
         this.subject3=subject33;
    }
    
    public void marks()
    {
        System.out.println("Total marks:"+(subject1+subject2+subject3));
    }
    
    public void percentage()
    {
        System.out.println("Percentage:"+((subject1+subject2+subject3))/3);
    }

    
}