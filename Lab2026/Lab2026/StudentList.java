
/**
 * Write a description of class StudList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StudentList
{
    private Student[] students;

    public StudentList()
    {
        students = new Student[3];
    }

    public void addStu(int stuIndex){
        System.out.println("\n" +"*Adding new student*");
        Scanner scr = new Scanner(System.in);
        int id = 0;
        double gpa = 0.0;
        String name = "";
        System.out.println("\n" +"Enter student name:");
        name = scr.nextLine();
        System.out.println("\n" +"Enter student ID number:");
        id = scr.nextInt();
        System.out.println("\n" +"Enter student GPA:");
        gpa = scr.nextDouble();
        String clearBuffer = scr. nextLine();
        students[stuIndex] = new Student(id, gpa, name);
    }
    
    
}

