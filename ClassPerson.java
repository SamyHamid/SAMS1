
package sams;

import sams.ClassClass;
import sams.ClassAttendanceRecord;
import sams.ClassStudent;
import sams.ClassTeacher;

abstract  class ClassPerson {
    private int ID;
    private String Name;
    
    
   // This is A Constructor to help me build my object
    public ClassPerson(int ID,String Name){
       this.ID=ID;
       this.Name=Name;
   }
      //Setters
    public void setID(int ID){
        this.ID=ID;
    }
        
        public void setName(String Name){
            this.Name=Name;
        }
        //Getters
    public int getID(){
        return ID;
    }
 public String getName(){
     return Name;
 }   
}
