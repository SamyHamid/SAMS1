
package sams;
import java.util.Date;
import java.util.Scanner;
import sams.ClassClass;
import sams.ClassPerson;
import sams.ClassAttendanceRecord;
import sams.ClassStudent;

public class ClassTeacher extends ClassPerson {
    private String subject;
    

    public void takeAttendance(String ID, Date date){
        //Method to help a teacher to take the attendance of a student
         System.out.println("Enter the ID of the Student:");
          System.out.println("Enter the date:");
         
    }
    
    public void viewAttendance(String ID,Date date){
        //Method which will help the teacher to view the atendance of a student
        //It will display the ID and date of each student.
    }
}
