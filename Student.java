
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)



/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args)
    {
        // <className> variable_name= new className();
        
        // objects creation
        Student s1=new Student();
        s1.collegeID="NPO1CP4A250188";
        s1.age=22;
        s1.course="Computing";
        
        System.out.println(s1.collegeID);
        System.out.println(s1.age);
        System.out.println(s1.course);
        
        
        Student s2=new Student();
        s2.collegeID="NP01CP4A250188";
        s2.age=25;
        s2.course="Networking";
        s2.laugh();
        
        System.out.println(s2.collegeID);
        System.out.println(s2.age);
        System.out.println(s2.course);
}