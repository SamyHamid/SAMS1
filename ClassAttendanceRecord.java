
package sams;
import java.util.Date;

import sams.ClassPerson;
import sams.ClassStudent;
import sams.ClassTeacher;
public class ClassAttendanceRecord {
    private Date date;
    private boolean isPresent;
    
    
    public Date getDate(){
        return date;
    }
    
    public boolean isPresent(){
        return isPresent;
    }
}
