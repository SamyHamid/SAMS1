
package sams;


import sams.ClassPerson;
import sams.ClassAttendanceRecord;
import sams.ClassStudent;
import sams.ClassTeacher;
import java.util.Scanner;

/*importation of the different classes and subclasses*/
public class SAMS {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       System.out.println("Welcome to the University Attendance Management System!");
        System.out.println("Please kindly select 1 or 2");
         System.out.println("1.I am Teacher");
          System.out.println("2.I am a Student");
          int choice;
          
         choice=in.nextInt();
        
         if (choice==1){
             
             System.out.println("As a teacher, what do you want to do?");
             System.out.println("1. I want to take Attendance");
             System.out.println("2. I want to view Attendance");
           
             
         int choiceTeacher=in.nextInt(); // To store the choice of the teacher
        
         if (choiceTeacher==1){
             
             takeAttendance(String ID, Date date);
            
       
             // The Teacher will set the ID of the Student and the date when he came
         }
         else if(choiceTeacher==2){
             viewAttendance(String ID, Date date);
             // This method will display the ID and date of students who attended.
         }
         else{ // In case, the teacher inputs nor 1 neither 2.
              System.out.println("Wrong Choice");
             
         }
         
         
         }
         
         // If he is not a teacher but a student:
         else if (choice==2){
              System.out.println("As a Student, what do you want to do?");
             System.out.println("1. I want to Mark My Attendance");
             System.out.println("2. I want to get My Attendance");
             
              int choiceStudent=in.nextInt();  //To store the choice of the student
              
              if(choiceStudent==1){
                  markAttendance(Date date, boolean isPresent);
                  //This method will help the student mark his attendance
              }
              else if(choiceStudent==2){
                  getAttendance();
                  //This method will help the student get his attendance
              }
              else{ //In case, the Student inputs nor 1 neither 2.
                  System.out.println("Wrong Choice");
              }
             
         }
         
         
         else{
             System.out.println("You have entered a wrong number");
         }
       
    }
    
}
