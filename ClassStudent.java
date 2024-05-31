
package sams;
import java.util.Date;
import java.util.Scanner;
import sams.ClassPerson;
import sams.ClassAttendanceRecord;
import sams.ClassTeacher;
import sams.ClassClass;

public class ClassStudent extends ClassPerson {
    private String Grade;
    private int AttendanceRecord;
    
   // Constructor to help us build objects
    
    public ClassStudent(int ID,String Name,String Grade,int AttendanceRecord){
        this.Grade=Grade;
        this.AttendanceRecord=AttendanceRecord;
     
    }
    
    public void markAttendance( int ID,Date date, boolean isPresent){
        //Method to help a Student to mark his attendance
         System.out.println("If you were present in the class, mark your attendance here:");
          System.out.println("Enter your ID");
          Scanner in=new Scanner(System.in);
          ID=in.nextInt();
           System.out.println("Enter the date:");
            
         
    }
    
    public int getAttendance(){
        
        return AttendanceRecord;
        
        //Method to help a student get his Attendance record.
    }
}
