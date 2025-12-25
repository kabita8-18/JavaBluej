package MAIN;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    //attributes or properties
    
    String collegeID;
    int age;
    String course;
    
    public Student(String ID, int agr, String course)
    {
        this.collegeID=collegeID; //this.collegeID="NPO1CP4A250188";
        this.age=agr;
        this.course= course;
        
        
        
    }
    
    //behaviour or methods
      
     void study()
    {
        System.out.println(collegeID+"is studying");
        
    }
    
      public void laugh()
      {
          System.out.println(collegeID+"is laughing");
          
      }
      
      
      
        
        
}