package day04.solved;

public class User {
     String name;
     String email;
     String password;
     long phoneNo;
    
     public String getPassword() {
     	return password;
     }

     
    public boolean setPassword(String newPassword) {
    	try {
    		password = newPassword;
    		return true;
    	}
    	catch(Exception e){
    		return false;
    	}
    }
    
    public String getName() {
    	return name;
    }

    public boolean setName(String newName) {
    	try {
    		name = newName;
    		return true;
    	}
    	catch(Exception e){
    		return false;
    	}
    }
    
    public String getEmail() {
    	return email;
    }

    public boolean setEmail(String newEmail) {
    	try {
    		email = newEmail;
    		return true;
    	}
    	catch(Exception e){
    		return false;
    	}
    }
 
    
    public long getPhoneNo() {
    	return phoneNo;
    }

    public boolean setPhoneNo(long newPhoneNo) {
    	try {
    		phoneNo = newPhoneNo;
    		return true;
    	}
    	catch(Exception e){
    		return false;
    	}
    }
    
    
   
  @Override
  public String toString() {
	  String userDetails = "name: " + name + " email:  " + email + " phoneNo: " + phoneNo + " password: " + password;
	  System.out.println(userDetails);
	  return userDetails;
   }
  
}