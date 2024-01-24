package day04.practice;

public class Student {
     String studentName;
     byte studentAge;
     int studentRollNo;
     char studentGender;
     float studentPercentage;
     double studentHeight;
     boolean isStudent;
   
     //Name
     public boolean setStudentName(String newStudentName) {
    	 try {
    		 studentName = newStudentName;
    		 return true;
     	}
     	catch(Exception e){
     		return false;
     	}
     }
     
     public String getStudentName() {
     	return studentName;
     }
     
     //Age
     public boolean setStudentAge(byte newStudentAge) {
    	 try {
    		 studentAge = newStudentAge;
    		 return true;
     	}
     	catch(Exception e){
     		return false;
     	}
     }
     
     public byte getStudentAge() {
     	return studentAge;
     }
 
     //RollNo
     public boolean setStudentRollNo(int newStudentRollNo) {
    	 try {
    		 studentRollNo = newStudentRollNo;
    		 return true;
     	}
     	catch(Exception e){
     		return false;
     	}
     }
     
     public int getStudentRollNo() {
     	return studentRollNo;
     }
     
     //Gender
     public boolean setStudentGender(char newStudentGender) {
    	 try {
    		 studentGender = newStudentGender;
    		 return true;
     	}
     	catch(Exception e){
     		return false;
     	}
     }
     
     public char getStudentGender() {
     	return studentGender;
     }
     
     //Percent
     public boolean setStudentPercentage(float newStudentPercentage) {
    	 try {
    		 studentPercentage = newStudentPercentage;
    		 return true;
     	}
     	catch(Exception e){
     		return false;
     	}
     }
     
     public float getStudentPercentage() {
     	return studentPercentage;
     }
     
     //Height
     public boolean setStudentHeight(double newStudentHeight) {
    	 try {
    		 studentHeight = newStudentHeight;
    		 return true;
     	}
     	catch(Exception e){
     		return false;
     	}
     }
     
     public double getStudentHeight() {
     	return studentHeight;
     }
     
     public boolean setisStudent(boolean newIsStudent) {
 	    try {
 	        isStudent = newIsStudent;
 	        return true;
 	    } catch (Exception e) {
 	        return false;
 	    }
 	}

 	public boolean newIsStudent() {
 	    return isStudent;
 	}

     @Override
     public String toString() {
   	  String userDetails = "Student name: " + studentName + " Student Age:  " + studentAge + " Student RollNo: " + studentRollNo + " Student Gender: " + studentGender + " Student Percentage: " + studentPercentage +" Student Height: " + studentHeight + " isStudent: " + isStudent;
 	  System.out.println(userDetails);
   	  return userDetails;
      }
}
