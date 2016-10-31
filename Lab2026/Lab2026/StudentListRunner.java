
/**
 * Lab 1026
 * 
 * Jameson Loewen
 * 10/28/16
 */
import java.util.Scanner;
public class StudentListRunner
{
      public static void main(String[] args){
        
        Scanner scr = new Scanner(System.in);
        int ansNum = 0;
        String ans = "y";
        int stuIndex = 0;
        StudentList studList = new StudentList();
        while(ansNum != 3 || !ans.equals("quit")){
            System.out.println("Type a number to choose from the options below:"); 
            System.out.println("1. Add Student to List");
            System.out.println("2. Print Student List");
            System.out.println("3. Quit Program");
            ansNum = scr.nextInt();
            if(ansNum == 1){
                if(stuIndex < 3){
                    studList.addStu(stuIndex);
                    stuIndex++;
                }
            } else if(ansNum == 2){

            }else if(ansNum == 3){
                ans = "quit";
            }
            if (ansNum != 3){
                System.out.println("Press 1 to complete another action or press 3 to quit"); 
                ansNum = scr.nextInt();
                if(ansNum == 3){
                    ans = "quit";
                }else System.out.println("\n" + "**************");
            }
        }
        
    }
}

