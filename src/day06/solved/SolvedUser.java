package day06.solved;

public class SolvedUser {
	    String firstName;
	    String lastName;
	    String email;
	    String password;
	    String phoneNumber;

	    public SolvedUser(String firstName, String lastName, String email, String password, String phoneNumber) {
	        
					// trim and convert names to title case
	        this.firstName = firstName.trim().substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
	        this.lastName = lastName.trim().substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
	        
	        // trim and convert email to lowercase
	        this.email = email.trim().toLowerCase();
	        
	        // password is saved as is
	        this.password = password;
	        
	        // trim phone number
	        this.phoneNumber = phoneNumber.trim();
	    }

	    public String getFullName() {
	        // concat first and last names
	        return this.firstName.concat(" ").concat(this.lastName);
	    }

	    public boolean authenticate(String passwordToCheck) {
	        // check if provided password matches the stored one
	        return this.password.equals(passwordToCheck);
	    }

	    @Override
	    public String toString() {
	        String userDetails = "Name: " + getFullName() + ", Email: " + email + ", Phone Number: " + phoneNumber;
	        System.out.println(userDetails);
	        return userDetails;
	    }
	}


