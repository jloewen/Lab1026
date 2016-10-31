
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
    private int stuID;
    private double stuGPA;
    private String stuName;
        
    public Student(int id, double gpa, String name)
    {
      stuID = id;
      stuGPA = gpa;
      stuName = name;
    }
    public void setName(String name){
        stuName = name;
    }
    public String getName(){
        return stuName;
    }
    public void setGPA(double gpa){
        stuGPA = gpa;
    }
    public void setID(int id){
        stuID = id;
    }
}
